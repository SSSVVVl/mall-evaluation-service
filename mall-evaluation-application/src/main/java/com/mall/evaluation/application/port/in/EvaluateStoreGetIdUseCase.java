package com.mall.evaluation.application.port.in;

import com.mall.evaluation.application.dto.EvaluateStoreResponse;
/**
 * 此用例是用来 创建商店评价的ID
 * @author wanhui
 */
public interface EvaluateStoreGetIdUseCase {
    /**
     * 根据ID查询店铺评价
     *
     * @param evaluateId 评价ID
     * @return 店铺评价响应
     */
    EvaluateStoreResponse getEvaluateStoreById(Long evaluateId);
}
