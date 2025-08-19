package com.mall.evaluation.application.service;

import com.mall.evaluation.application.dto.EvaluateGoodsResponse;
import com.mall.evaluation.application.port.in.EvaluateGoodsGetIdUseCase;
import org.springframework.stereotype.Service;

// 单一职责原则
/**
 * 商品评价获取ID方法
 * @author wanhui
 */
@Service
public class EvaluateGoodsGetIdService implements EvaluateGoodsGetIdUseCase {

    /**
     *
     * @param evaluateId 评价ID
     * @return
     */
    @Override
    public EvaluateGoodsResponse getEvaluateGoodsById(Long evaluateId) {
        return null;
    }
}
