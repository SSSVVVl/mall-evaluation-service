package com.mall.evaluation.application.service;

import com.mall.evaluation.application.command.QueryConsultCommand;
import com.mall.evaluation.application.dto.ConsultResponse;
import com.mall.evaluation.application.port.in.ConsultQueryUseCase;
import org.springframework.stereotype.Service;

import java.util.List;

// 单一职责原则
/**
 * 咨询查询方法
 * @author wanhui
 */
@Service
public class ConsultQueryService implements ConsultQueryUseCase {

    /**
     *
     * @param command 查询咨询命令
     * @return
     */
    @Override
    public List<ConsultResponse> queryConsult(QueryConsultCommand command) {
        return List.of();
    }
}
