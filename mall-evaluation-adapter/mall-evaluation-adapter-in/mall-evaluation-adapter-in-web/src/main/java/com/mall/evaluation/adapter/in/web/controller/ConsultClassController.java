package com.mall.evaluation.adapter.in.web.controller;

import com.mall.evaluation.adapter.in.web.dto.CreateConsultClassRequest;
import com.mall.evaluation.application.command.CreateConsultClassCommand;
import com.mall.evaluation.application.dto.ConsultClassResponse;
import com.mall.evaluation.application.port.in.ConsultClassUseCase;
import com.mall.evaluation.common.Result;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 咨询分类控制器
 */
@Slf4j
@RestController
@RequestMapping("/api/evaluation/consult-class")
@Tag(name = "咨询分类管理", description = "咨询分类相关接口")
public class ConsultClassController {

    private final ConsultClassUseCase consultClassUseCase;

    public ConsultClassController(ConsultClassUseCase consultClassUseCase) {
        this.consultClassUseCase = consultClassUseCase;
    }

    @PostMapping
    @Operation(summary = "创建咨询分类", description = "创建新的咨询分类")
    public Result<ConsultClassResponse> createConsultClass(
            @Validated @RequestBody CreateConsultClassRequest request) {
        
        CreateConsultClassCommand command = new CreateConsultClassCommand(
                request.getClassName(),
                request.getClassDesc(),
                request.getSort(),
                request.getStatus()
        );

        ConsultClassResponse response = consultClassUseCase.createConsultClass(command);
        return Result.success(response);
    }

    @GetMapping
    @Operation(summary = "查询所有咨询分类", description = "获取所有咨询分类列表")
    public Result<List<ConsultClassResponse>> getAllConsultClass() {
        List<ConsultClassResponse> responses = consultClassUseCase.getAllConsultClass();
        return Result.success(responses);
    }

    @GetMapping("/{classId}")
    @Operation(summary = "根据ID查询咨询分类", description = "根据分类ID查询咨询分类详情")
    public Result<ConsultClassResponse> getConsultClassById(
            @Parameter(description = "分类ID") @PathVariable Long classId) {
        
        ConsultClassResponse response = consultClassUseCase.getConsultClassById(classId);
        return Result.success(response);
    }
}