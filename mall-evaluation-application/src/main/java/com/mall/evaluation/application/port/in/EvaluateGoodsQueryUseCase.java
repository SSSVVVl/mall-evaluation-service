package com.mall.evaluation.application.port.in;

import com.mall.evaluation.application.command.QueryEvaluateGoodsCommand;
import com.mall.evaluation.application.dto.EvaluateGoodsResponse;

import java.util.List;
/**
 * 此用例是用来 显示商品评价的内容列表
 * @author wanhui
 */
public interface EvaluateGoodsQueryUseCase {
    /**
     * 查询商品评价列表
     *
     * @param command 查询商品评价命令
     * @return 商品评价列表
     */
    List<EvaluateGoodsResponse> queryEvaluateGoods(QueryEvaluateGoodsCommand command);
}
