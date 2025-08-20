package com.mall.evaluation.application.service;

import com.mall.evaluation.application.command.QueryEvaluateStoreCommand;
import com.mall.evaluation.application.dto.EvaluateStoreResponse;
import com.mall.evaluation.application.port.in.EvaluateStoreQueryUseCase;
import org.springframework.stereotype.Service;

import java.util.List;

// 单一职责原则
/**
 * 商店评价查询
 * @author wanhui
 */
@Service
public class EvaluateStoreQueryService implements EvaluateStoreQueryUseCase {

    /**
     *
     * @param command 查询店铺评价命令
     * @return
     */
    @Override
    public List<EvaluateStoreResponse> queryEvaluateStore(QueryEvaluateStoreCommand command) {
        return List.of();
    }
}
