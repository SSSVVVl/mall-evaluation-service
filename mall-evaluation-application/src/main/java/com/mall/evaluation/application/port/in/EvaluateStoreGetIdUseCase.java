package com.mall.evaluation.application.port.in;

import com.mall.evaluation.application.dto.EvaluateStoreResponse;

public interface EvaluateStoreGetIdUseCase {
    /**
     * 根据ID查询店铺评价
     *
     * @param evaluateId 评价ID
     * @return 店铺评价响应
     */
    EvaluateStoreResponse getEvaluateStoreById(Long evaluateId);
}
