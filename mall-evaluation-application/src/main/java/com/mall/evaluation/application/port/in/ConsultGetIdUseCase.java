package com.mall.evaluation.application.port.in;

import com.mall.evaluation.application.dto.ConsultResponse;
/**
 * 此用例是用来 获取咨询内容的ID
 * @author wanhui
 */
public interface ConsultGetIdUseCase {
    /**
     * 根据ID查询咨询
     *
     * @param consultId 咨询ID
     * @return 咨询响应
     */
    ConsultResponse getConsultById(Long consultId);
}
