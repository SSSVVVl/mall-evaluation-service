package com.mall.evaluation.application.service;

import com.mall.evaluation.application.command.CreateConsultClassCommand;
import com.mall.evaluation.application.dto.ConsultClassResponse;
import com.mall.evaluation.application.port.in.ConsultClassCreateUseCase;
import org.springframework.stereotype.Service;

// 单一职责原则
@Service
public class ConsultClassCreateService implements ConsultClassCreateUseCase {

    @Override
    public ConsultClassResponse createConsultClass(CreateConsultClassCommand command) {
        return null;
    }
}
