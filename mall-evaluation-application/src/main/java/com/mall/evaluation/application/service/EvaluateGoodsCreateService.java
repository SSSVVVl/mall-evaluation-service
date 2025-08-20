package com.mall.evaluation.application.service;

import com.mall.evaluation.application.command.CreateEvaluateGoodsCommand;
import com.mall.evaluation.application.dto.EvaluateGoodsResponse;
import com.mall.evaluation.application.port.in.EvaluateGoodsCreateUseCase;
import org.springframework.stereotype.Service;

// 单一职责原则
/**
 * 商品评价
 * @author wanhui
 */
@Service
public class EvaluateGoodsCreateService implements EvaluateGoodsCreateUseCase {

    /**
     *
     * @param command 创建商品评价命令
     * @return
     */
    @Override
    public EvaluateGoodsResponse createEvaluateGoods(CreateEvaluateGoodsCommand command) {
        return null;
    }
}
