package com.mall.evaluation.application.service;

import com.mall.evaluation.application.command.CreateEvaluateStoreCommand;
import com.mall.evaluation.application.dto.EvaluateStoreResponse;
import com.mall.evaluation.application.port.in.EvaluateStoreCreateUseCase;
import org.springframework.stereotype.Service;

// 单一职责原则
@Service
public class EvaluateStoreCreateService implements EvaluateStoreCreateUseCase {

    /**
     *
     * @param command 创建店铺评价命令
     * @return
     */
    @Override
    public EvaluateStoreResponse createEvaluateStore(CreateEvaluateStoreCommand command) {
        return null;
    }
}
