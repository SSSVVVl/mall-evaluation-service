package com.mall.evaluation.adapter.in.web.controller;

import com.mall.evaluation.adapter.in.web.dto.CreateEvaluateStoreRequest;
import com.mall.evaluation.adapter.in.web.dto.QueryEvaluateStoreRequest;
import com.mall.evaluation.application.command.CreateEvaluateStoreCommand;
import com.mall.evaluation.application.command.QueryEvaluateStoreCommand;
import com.mall.evaluation.application.dto.EvaluateStoreResponse;
import com.mall.evaluation.common.Result;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 店铺评价控制器
 */
@Slf4j
@RestController
@RequestMapping("/api/evaluation/store")
@Tag(name = "店铺评价管理", description = "店铺评价相关接口")
public class EvaluateStoreController {

    private final EvaluateStoreUseCase evaluateStoreUseCase;

    public EvaluateStoreController(EvaluateStoreUseCase evaluateStoreUseCase) {
        this.evaluateStoreUseCase = evaluateStoreUseCase;
    }

    @PostMapping
    @Operation(summary = "创建店铺评价", description = "用户对店铺进行评价")
    public Result<EvaluateStoreResponse> createEvaluateStore(
            @Validated @RequestBody CreateEvaluateStoreRequest request) {
        
        CreateEvaluateStoreCommand command = new CreateEvaluateStoreCommand(
                request.getStoreId(),
                request.getUserId(),
                request.getOrderId(),
                request.getContent(),
                request.getGrade(),
                request.getDeliveryScore(),
                request.getServiceScore(),
                request.getDescScore()
        );

        EvaluateStoreResponse response = evaluateStoreUseCase.createEvaluateStore(command);
        return Result.success(response);
    }

    @GetMapping
    @Operation(summary = "查询店铺评价列表", description = "根据条件查询店铺评价列表")
    public Result<List<EvaluateStoreResponse>> queryEvaluateStore(
            @Validated QueryEvaluateStoreRequest request) {
        
        QueryEvaluateStoreCommand command = new QueryEvaluateStoreCommand(
                request.getStoreId(),
                request.getUserId(),
                request.getGrade(),
                request.getPageNum(),
                request.getPageSize()
        );

        List<EvaluateStoreResponse> responses = evaluateStoreUseCase.queryEvaluateStore(command);
        return Result.success(responses);
    }

    @GetMapping("/{evaluateId}")
    @Operation(summary = "根据ID查询店铺评价", description = "根据评价ID查询店铺评价详情")
    public Result<EvaluateStoreResponse> getEvaluateStoreById(
            @Parameter(description = "评价ID") @PathVariable Long evaluateId) {
        
        EvaluateStoreResponse response = evaluateStoreUseCase.getEvaluateStoreById(evaluateId);
        return Result.success(response);
    }
}