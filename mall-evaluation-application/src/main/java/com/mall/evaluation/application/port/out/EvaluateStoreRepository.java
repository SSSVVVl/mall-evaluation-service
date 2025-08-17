package com.mall.evaluation.application.port.out;

import com.mall.evaluation.domain.model.EvaluateStore;

import java.util.List;
import java.util.Optional;

/**
 * 店铺评价仓储端口
 */
public interface EvaluateStoreRepository {

    /**
     * 保存店铺评价
     *
     * @param evaluateStore 店铺评价
     * @return 保存后的店铺评价
     */
    EvaluateStore save(EvaluateStore evaluateStore);

    /**
     * 根据ID查询店铺评价
     *
     * @param evaluateId 评价ID
     * @return 店铺评价
     */
    Optional<EvaluateStore> findById(Long evaluateId);

    /**
     * 根据店铺ID查询评价列表
     *
     * @param storeId 店铺ID
     * @return 评价列表
     */
    List<EvaluateStore> findByStoreId(Long storeId);

    /**
     * 根据用户ID查询评价列表
     *
     * @param userId 用户ID
     * @return 评价列表
     */
    List<EvaluateStore> findByUserId(Long userId);
}