package com.mall.evaluation.application.service;

import com.mall.evaluation.application.dto.EvaluateStoreResponse;
import com.mall.evaluation.application.port.in.EvaluateStoreGetIdUseCase;
import org.springframework.stereotype.Service;

// 单一职责原则
/**
 * 商店评价获取ID方法
 * @author wanhui
 */
@Service
public class EvaluateStoreGetIdService implements EvaluateStoreGetIdUseCase {

    /**
     *
     * @param evaluateId 评价ID
     * @return
     */
    @Override
    public EvaluateStoreResponse getEvaluateStoreById(Long evaluateId) {
        return null;
    }
}
