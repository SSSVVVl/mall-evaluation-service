package com.mall.evaluation.application.service;

import com.mall.evaluation.application.command.CreateConsultCommand;
import com.mall.evaluation.application.dto.ConsultResponse;
import com.mall.evaluation.application.port.in.ConsultCreateUseCase;
import org.springframework.stereotype.Service;

// 单一职责原则
/**
 * 创建咨询
 * @author wanhui
 */
@Service
public class ConsultCreateService implements ConsultCreateUseCase {

    /**
     *
     * @param command 创建咨询命令
     * @return
     */
    @Override
    public ConsultResponse createConsult(CreateConsultCommand command) {
        return null;
    }
}
