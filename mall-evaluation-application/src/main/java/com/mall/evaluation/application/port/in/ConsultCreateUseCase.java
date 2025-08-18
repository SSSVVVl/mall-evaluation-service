package com.mall.evaluation.application.port.in;

import com.mall.evaluation.application.command.CreateConsultCommand;
import com.mall.evaluation.application.dto.ConsultResponse;

public interface ConsultCreateUseCase {
    /**
     * 创建咨询
     *
     * @param command 创建咨询命令
     * @return 咨询响应
     */
    ConsultResponse createConsult(CreateConsultCommand command);
}
