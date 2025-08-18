package com.mall.evaluation.application.port.in;

import com.mall.evaluation.application.command.CreateEvaluateGoodsCommand;
import com.mall.evaluation.application.dto.EvaluateGoodsResponse;
/**
 * 此用例是用来 创建商品评价的内容
 * @author wanhui
 */
public interface EvaluateGoodsCreateUseCase {
    /**
     * 创建商品评价
     *
     * @param command 创建商品评价命令
     * @return 商品评价响应
     */
    EvaluateGoodsResponse createEvaluateGoods(CreateEvaluateGoodsCommand command);
}
