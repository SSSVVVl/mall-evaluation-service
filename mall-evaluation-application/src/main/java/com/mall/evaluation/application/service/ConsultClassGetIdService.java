package com.mall.evaluation.application.service;

import com.mall.evaluation.application.dto.ConsultClassResponse;
import com.mall.evaluation.application.port.in.ConsultClassGetIdUseCase;
import org.springframework.stereotype.Service;

// 单一职责
@Service
public class ConsultClassGetIdService implements ConsultClassGetIdUseCase {
    @Override
    public ConsultClassResponse getConsultClassById(Long classId) {
        return null;
    }
}
