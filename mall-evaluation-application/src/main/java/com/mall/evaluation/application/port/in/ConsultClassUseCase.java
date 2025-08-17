package com.mall.evaluation.application.port.in;

import com.mall.evaluation.application.command.CreateConsultClassCommand;
import com.mall.evaluation.application.dto.ConsultClassResponse;

import java.util.List;

/**
 * 咨询分类用例接口
 */
public interface ConsultClassUseCase {

    /**
     * 创建咨询分类
     *
     * @param command 创建咨询分类命令
     * @return 咨询分类响应
     */
    ConsultClassResponse createConsultClass(CreateConsultClassCommand command);

    /**
     * 查询所有咨询分类
     *
     * @return 咨询分类列表
     */
    List<ConsultClassResponse> getAllConsultClass();

    /**
     * 根据ID查询咨询分类
     *
     * @param classId 分类ID
     * @return 咨询分类响应
     */
    ConsultClassResponse getConsultClassById(Long classId);
}