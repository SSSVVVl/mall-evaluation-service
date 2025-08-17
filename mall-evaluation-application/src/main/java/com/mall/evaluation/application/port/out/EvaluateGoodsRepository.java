package com.mall.evaluation.application.port.out;

import com.mall.evaluation.domain.model.EvaluateGoods;

import java.util.List;
import java.util.Optional;

/**
 * 商品评价仓储端口
 */
public interface EvaluateGoodsRepository {

    /**
     * 保存商品评价
     *
     * @param evaluateGoods 商品评价
     * @return 保存后的商品评价
     */
    EvaluateGoods save(EvaluateGoods evaluateGoods);

    /**
     * 根据ID查询商品评价
     *
     * @param evaluateId 评价ID
     * @return 商品评价
     */
    Optional<EvaluateGoods> findById(Long evaluateId);

    /**
     * 根据商品ID查询评价列表
     *
     * @param goodsId 商品ID
     * @return 评价列表
     */
    List<EvaluateGoods> findByGoodsId(Long goodsId);

    /**
     * 根据用户ID查询评价列表
     *
     * @param userId 用户ID
     * @return 评价列表
     */
    List<EvaluateGoods> findByUserId(Long userId);

    /**
     * 根据店铺ID查询评价列表
     *
     * @param storeId 店铺ID
     * @return 评价列表
     */
    List<EvaluateGoods> findByStoreId(Long storeId);
}