package com.mall.evaluation.application.service;


import com.mall.evaluation.application.dto.ConsultClassResponse;
import com.mall.evaluation.application.port.in.ConsultClassGetAllUseCase;
import org.springframework.stereotype.Service;

import java.util.List;

// 单一职责
/**
 * 咨询分类获取所有ID
 * @author wanhui
 */
@Service
public class ConsultClassGetAllService implements ConsultClassGetAllUseCase {

    /**
     *
     * @return
     */
    @Override
    public List<ConsultClassResponse> getAllConsultClass() {
        return List.of();
    }
}
