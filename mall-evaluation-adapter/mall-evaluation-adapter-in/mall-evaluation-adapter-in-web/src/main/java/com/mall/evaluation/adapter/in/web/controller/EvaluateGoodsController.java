package com.mall.evaluation.adapter.in.web.controller;

import com.mall.evaluation.adapter.in.web.dto.CreateEvaluateGoodsRequest;
import com.mall.evaluation.adapter.in.web.dto.QueryEvaluateGoodsRequest;
import com.mall.evaluation.application.command.CreateEvaluateGoodsCommand;
import com.mall.evaluation.application.command.QueryEvaluateGoodsCommand;
import com.mall.evaluation.application.dto.EvaluateGoodsResponse;
import com.mall.evaluation.application.port.in.EvaluateGoodsCreateUseCase;
import com.mall.evaluation.application.port.in.EvaluateGoodsGetIdUseCase;
import com.mall.evaluation.application.port.in.EvaluateGoodsQueryUseCase;
import com.mall.evaluation.common.Result;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 商品评价控制器
 * @author wanhui
 */
@Slf4j
@RestController
@RequestMapping("/api/evaluation/goods")
@Tag(name = "商品评价管理", description = "商品评价相关接口")
public class EvaluateGoodsController {

    private final EvaluateGoodsCreateUseCase evaluateGoodsCreateUseCase;
    private final EvaluateGoodsQueryUseCase evaluateGoodsQueryUseCase;
    private final EvaluateGoodsGetIdUseCase evaluateGoodsGetIdUseCase;

    public EvaluateGoodsController(EvaluateGoodsCreateUseCase evaluateGoodsCreateUseCase,EvaluateGoodsQueryUseCase evaluateGoodsQueryUseCase,EvaluateGoodsGetIdUseCase evaluateGoodsGetIdUseCase) {
        this.evaluateGoodsCreateUseCase = evaluateGoodsCreateUseCase;
        this.evaluateGoodsQueryUseCase = evaluateGoodsQueryUseCase;
        this.evaluateGoodsGetIdUseCase = evaluateGoodsGetIdUseCase;
    }

    @PostMapping
    @Operation(summary = "创建商品评价", description = "用户对商品进行评价")
    public Result<EvaluateGoodsResponse> createEvaluateGoods(
            @Validated @RequestBody CreateEvaluateGoodsRequest request) {
        
        CreateEvaluateGoodsCommand command = new CreateEvaluateGoodsCommand(
                request.getGoodsId(),
                request.getUserId(),
                request.getStoreId(),
                request.getOrderId(),
                request.getContent(),
                request.getPics(),
                request.getGrade(),
                request.getIsAnonymous(),
                request.getDeliveryScore(),
                request.getServiceScore(),
                request.getDescScore()
        );

        EvaluateGoodsResponse response = evaluateGoodsCreateUseCase.createEvaluateGoods(command);
        return Result.success(response);
    }

    @GetMapping
    @Operation(summary = "查询商品评价列表", description = "根据条件查询商品评价列表")
    public Result<List<EvaluateGoodsResponse>> queryEvaluateGoods(
            @Validated QueryEvaluateGoodsRequest request) {
        
        QueryEvaluateGoodsCommand command = new QueryEvaluateGoodsCommand(
                request.getGoodsId(),
                request.getUserId(),
                request.getStoreId(),
                request.getGrade(),
                request.getPageNum(),
                request.getPageSize()
        );

        List<EvaluateGoodsResponse> responses = evaluateGoodsQueryUseCase.queryEvaluateGoods(command);
        return Result.success(responses);
    }

    @GetMapping("/{evaluateId}")
    @Operation(summary = "根据ID查询商品评价", description = "根据评价ID查询商品评价详情")
    public Result<EvaluateGoodsResponse> getEvaluateGoodsById(
            @Parameter(description = "评价ID") @PathVariable Long evaluateId) {
        
        EvaluateGoodsResponse response = evaluateGoodsGetIdUseCase.getEvaluateGoodsById(evaluateId);
        return Result.success(response);
    }
}