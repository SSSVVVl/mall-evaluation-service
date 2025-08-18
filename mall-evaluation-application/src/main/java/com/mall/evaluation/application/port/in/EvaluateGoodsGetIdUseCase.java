package com.mall.evaluation.application.port.in;

import com.mall.evaluation.application.dto.EvaluateGoodsResponse;
/**
 * 此用例是用来 获取商品评价的ID
 * @author wanhui
 */
public interface EvaluateGoodsGetIdUseCase {
    /**
     * 根据ID查询商品评价
     *
     * @param evaluateId 评价ID
     * @return 商品评价响应
     */
    EvaluateGoodsResponse getEvaluateGoodsById(Long evaluateId);
}
