package com.mall.evaluation.application.service;

import com.mall.evaluation.application.dto.EvaluateGoodsResponse;
import com.mall.evaluation.application.port.in.EvaluateGoodsGetIdUseCase;
import org.springframework.stereotype.Service;

// 单一职责原则
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
