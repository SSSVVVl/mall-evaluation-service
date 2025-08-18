package com.mall.evaluation.application.port.in;

import com.mall.evaluation.application.command.CreateConsultClassCommand;
import com.mall.evaluation.application.dto.ConsultClassResponse;

public interface ConsultClassCreateUseCase {
    /**
     * 创建咨询分类
     *
     * @param command 创建咨询分类命令
     * @return 咨询分类响应
     */
    ConsultClassResponse createConsultClass(CreateConsultClassCommand command);
}
