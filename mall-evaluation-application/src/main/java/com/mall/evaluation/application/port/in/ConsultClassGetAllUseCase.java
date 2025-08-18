package com.mall.evaluation.application.port.in;

import com.mall.evaluation.application.dto.ConsultClassResponse;

import java.util.List;

/**
 * 此用例是用来 获取所有的咨询大类
 * @author wanhui
 */
public interface ConsultClassGetAllUseCase {
    /**
     * 查询所有咨询分类
     *
     * @return 咨询分类列表
     */
    List<ConsultClassResponse> getAllConsultClass();
}
