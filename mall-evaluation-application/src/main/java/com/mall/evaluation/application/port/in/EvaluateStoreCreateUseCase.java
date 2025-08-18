package com.mall.evaluation.application.port.in;

import com.mall.evaluation.application.command.CreateEvaluateStoreCommand;
import com.mall.evaluation.application.dto.EvaluateStoreResponse;
/**
 * 此用例是用来 创建商店评价的内容
 * @author wanhui
 */
public interface EvaluateStoreCreateUseCase {
    /**
     * 创建店铺评价
     *
     * @param command 创建店铺评价命令
     * @return 店铺评价响应
     */
    EvaluateStoreResponse createEvaluateStore(CreateEvaluateStoreCommand command);
}
