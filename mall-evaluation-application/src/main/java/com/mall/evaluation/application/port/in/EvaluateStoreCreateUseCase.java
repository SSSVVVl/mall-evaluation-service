package com.mall.evaluation.application.port.in;

import com.mall.evaluation.application.command.CreateEvaluateStoreCommand;
import com.mall.evaluation.application.dto.EvaluateStoreResponse;

public interface EvaluateStoreCreateUseCase {
    /**
     * 创建店铺评价
     *
     * @param command 创建店铺评价命令
     * @return 店铺评价响应
     */
    EvaluateStoreResponse createEvaluateStore(CreateEvaluateStoreCommand command);
}
