package com.mall.evaluation.application.service;

import com.mall.evaluation.application.dto.ConsultResponse;
import com.mall.evaluation.application.port.in.ConsultGetIdUseCase;
import org.springframework.stereotype.Service;

// 单一职责原则
/**
 * 获取咨询ID
 * @author wanhui
 */
@Service
public class ConsultGetIdService implements ConsultGetIdUseCase {

    /**
     *
     * @param consultId 咨询ID
     * @return
     */
    @Override
    public ConsultResponse getConsultById(Long consultId) {
        return null;
    }
}
