package com.mall.evaluation.application.port.in;

import com.mall.evaluation.application.dto.ConsultResponse;

public interface ConsultGetIdUseCase {
    /**
     * 根据ID查询咨询
     *
     * @param consultId 咨询ID
     * @return 咨询响应
     */
    ConsultResponse getConsultById(Long consultId);
}
