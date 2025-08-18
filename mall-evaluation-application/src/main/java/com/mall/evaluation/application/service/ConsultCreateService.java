package com.mall.evaluation.application.service;

import com.mall.evaluation.application.command.CreateConsultCommand;
import com.mall.evaluation.application.dto.ConsultResponse;
import com.mall.evaluation.application.port.in.ConsultCreateUseCase;
import org.springframework.stereotype.Service;

// 单一职责
@Service
public class ConsultCreateService implements ConsultCreateUseCase {
    @Override
    public ConsultResponse createConsult(CreateConsultCommand command) {
        return null;
    }
}
