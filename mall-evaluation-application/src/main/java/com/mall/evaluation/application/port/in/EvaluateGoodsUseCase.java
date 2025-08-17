package com.mall.evaluation.application.port.in;

import com.mall.evaluation.application.command.CreateEvaluateGoodsCommand;
import com.mall.evaluation.application.command.QueryEvaluateGoodsCommand;
import com.mall.evaluation.application.dto.EvaluateGoodsResponse;

import java.util.List;

/**
 * 商品评价用例接口
 */
public interface EvaluateGoodsUseCase {

    /**
     * 创建商品评价
     *
     * @param command 创建商品评价命令
     * @return 商品评价响应
     */
    EvaluateGoodsResponse createEvaluateGoods(CreateEvaluateGoodsCommand command);

    /**
     * 查询商品评价列表
     *
     * @param command 查询商品评价命令
     * @return 商品评价列表
     */
    List<EvaluateGoodsResponse> queryEvaluateGoods(QueryEvaluateGoodsCommand command);

    /**
     * 根据ID查询商品评价
     *
     * @param evaluateId 评价ID
     * @return 商品评价响应
     */
    EvaluateGoodsResponse getEvaluateGoodsById(Long evaluateId);
}