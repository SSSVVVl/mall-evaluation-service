package com.mall.evaluation.application.service;

import com.mall.evaluation.application.command.CreateConsultClassCommand;
import com.mall.evaluation.application.dto.ConsultClassResponse;
import com.mall.evaluation.application.port.in.ConsultClassCreateUseCase;
import org.springframework.stereotype.Service;

// 单一职责原则
/**
 * 咨询分类创建方法
 * @author wanhui
 */
@Service
public class ConsultClassCreateService implements ConsultClassCreateUseCase {

    /**
     *
     * @param command 创建咨询分类命令
     * @return
     */
    @Override
    public ConsultClassResponse createConsultClass(CreateConsultClassCommand command) {
        return null;
    }
}
