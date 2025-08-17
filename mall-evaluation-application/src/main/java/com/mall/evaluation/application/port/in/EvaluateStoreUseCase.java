package com.mall.evaluation.application.port.in;

import com.mall.evaluation.application.command.CreateEvaluateStoreCommand;
import com.mall.evaluation.application.command.QueryEvaluateStoreCommand;
import com.mall.evaluation.application.dto.EvaluateStoreResponse;

import java.util.List;

/**
 * 店铺评价用例接口
 */
public interface EvaluateStoreUseCase {

    /**
     * 创建店铺评价
     *
     * @param command 创建店铺评价命令
     * @return 店铺评价响应
     */
    EvaluateStoreResponse createEvaluateStore(CreateEvaluateStoreCommand command);

    /**
     * 查询店铺评价列表
     *
     * @param command 查询店铺评价命令
     * @return 店铺评价列表
     */
    List<EvaluateStoreResponse> queryEvaluateStore(QueryEvaluateStoreCommand command);

    /**
     * 根据ID查询店铺评价
     *
     * @param evaluateId 评价ID
     * @return 店铺评价响应
     */
    EvaluateStoreResponse getEvaluateStoreById(Long evaluateId);
}