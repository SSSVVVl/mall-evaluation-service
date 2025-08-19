package com.mall.evaluation.application.service;

import com.mall.evaluation.application.command.QueryEvaluateGoodsCommand;
import com.mall.evaluation.application.dto.EvaluateGoodsResponse;
import com.mall.evaluation.application.port.in.EvaluateGoodsQueryUseCase;
import org.springframework.stereotype.Service;

import java.util.List;

// 单一职责原则
@Service
public class EvaluateGoodsQueryService implements EvaluateGoodsQueryUseCase {

    /**
     *
     * @param command 查询商品评价命令
     * @return
     */
    @Override
    public List<EvaluateGoodsResponse> queryEvaluateGoods(QueryEvaluateGoodsCommand command) {
        return List.of();
    }
}
