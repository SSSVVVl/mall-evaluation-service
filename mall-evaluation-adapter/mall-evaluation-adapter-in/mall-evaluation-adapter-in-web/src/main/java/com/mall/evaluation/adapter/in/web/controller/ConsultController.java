package com.mall.evaluation.adapter.in.web.controller;

import com.mall.evaluation.adapter.in.web.dto.CreateConsultRequest;
import com.mall.evaluation.adapter.in.web.dto.QueryConsultRequest;
import com.mall.evaluation.adapter.in.web.dto.ReplyConsultRequest;
import com.mall.evaluation.application.command.CreateConsultCommand;
import com.mall.evaluation.application.command.QueryConsultCommand;
import com.mall.evaluation.application.dto.ConsultResponse;
import com.mall.evaluation.application.port.in.ConsultCreateUseCase;
import com.mall.evaluation.application.port.in.ConsultGetIdUseCase;
import com.mall.evaluation.application.port.in.ConsultQueryUseCase;
import com.mall.evaluation.application.port.in.ConsultReplyUseCase;
import com.mall.evaluation.common.Result;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 咨询控制器
 */
@Slf4j
@RestController
@RequestMapping("/api/evaluation/consult")
@Tag(name = "咨询管理", description = "商品咨询相关接口")
public class ConsultController {

    private final ConsultCreateUseCase consultCreateUseCase;
    private final ConsultQueryUseCase consultQueryUseCase;
    private final ConsultGetIdUseCase consultGetIdUseCase;
    private final ConsultReplyUseCase consultReplyUseCase;

    public ConsultController(ConsultCreateUseCase consultCreateUseCase,ConsultQueryUseCase consultQueryUseCase,ConsultGetIdUseCase consultGetIdUseCase,ConsultReplyUseCase consultReplyUseCase) {
        this.consultCreateUseCase = consultCreateUseCase;
        this.consultQueryUseCase = consultQueryUseCase;
        this.consultGetIdUseCase = consultGetIdUseCase;
        this.consultReplyUseCase = consultReplyUseCase;
    }

    @PostMapping
    @Operation(summary = "创建咨询", description = "用户对商品进行咨询")
    public Result<ConsultResponse> createConsult(
            @Validated @RequestBody CreateConsultRequest request) {
        
        CreateConsultCommand command = new CreateConsultCommand(
                request.getGoodsId(),
                request.getUserId(),
                request.getClassId(),
                request.getContent(),
                request.getIsAnonymous()
        );

        ConsultResponse response = consultCreateUseCase.createConsult(command);
        return Result.success(response);
    }

    @GetMapping
    @Operation(summary = "查询咨询列表", description = "根据条件查询咨询列表")
    public Result<List<ConsultResponse>> queryConsult(
            @Validated QueryConsultRequest request) {
        
        QueryConsultCommand command = new QueryConsultCommand(
                request.getGoodsId(),
                request.getUserId(),
                request.getClassId(),
                request.getPageNum(),
                request.getPageSize()
        );

        List<ConsultResponse> responses = consultQueryUseCase.queryConsult(command);
        return Result.success(responses);
    }

    @GetMapping("/{consultId}")
    @Operation(summary = "根据ID查询咨询", description = "根据咨询ID查询咨询详情")
    public Result<ConsultResponse> getConsultById(
            @Parameter(description = "咨询ID") @PathVariable Long consultId) {
        
        ConsultResponse response = consultGetIdUseCase.getConsultById(consultId);
        return Result.success(response);
    }

    @PutMapping("/{consultId}/reply")
    @Operation(summary = "回复咨询", description = "商家回复用户咨询")
    public Result<ConsultResponse> replyConsult(
            @Parameter(description = "咨询ID") @PathVariable Long consultId,
            @Validated @RequestBody ReplyConsultRequest request) {
        
        ConsultResponse response = consultReplyUseCase.replyConsult(consultId, request.getReplyContent());
        return Result.success(response);
    }
}