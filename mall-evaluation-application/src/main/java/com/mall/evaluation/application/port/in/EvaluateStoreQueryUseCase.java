package com.mall.evaluation.application.port.in;

import com.mall.evaluation.application.command.QueryEvaluateStoreCommand;
import com.mall.evaluation.application.dto.EvaluateStoreResponse;

import java.util.List;
/**
 * 此用例是用来 显示商店评价的内容列表
 * @author wanhui
 */
public interface EvaluateStoreQueryUseCase {
    /**
     * 查询店铺评价列表
     *
     * @param command 查询店铺评价命令
     * @return 店铺评价列表
     */
    List<EvaluateStoreResponse> queryEvaluateStore(QueryEvaluateStoreCommand command);
}
