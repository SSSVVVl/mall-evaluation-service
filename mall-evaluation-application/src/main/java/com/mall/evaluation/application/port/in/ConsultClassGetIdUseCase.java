package com.mall.evaluation.application.port.in;

import com.mall.evaluation.application.dto.ConsultClassResponse;
/**
 * 此用例是用来 获取咨询大类的ID
 * @author wanhui
 */
public interface ConsultClassGetIdUseCase {
    /**
     * 根据ID查询咨询分类
     *
     * @param classId 分类ID
     * @return 咨询分类响应
     */
    ConsultClassResponse getConsultClassById(Long classId);
}
