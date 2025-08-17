package com.mall.evaluation.application.port.out;

import com.mall.evaluation.domain.model.Consult;

import java.util.List;
import java.util.Optional;

/**
 * 咨询仓储端口
 */
public interface ConsultRepository {

    /**
     * 保存咨询
     *
     * @param consult 咨询
     * @return 保存后的咨询
     */
    Consult save(Consult consult);

    /**
     * 根据ID查询咨询
     *
     * @param consultId 咨询ID
     * @return 咨询
     */
    Optional<Consult> findById(Long consultId);

    /**
     * 根据商品ID查询咨询列表
     *
     * @param goodsId 商品ID
     * @return 咨询列表
     */
    List<Consult> findByGoodsId(Long goodsId);

    /**
     * 根据用户ID查询咨询列表
     *
     * @param userId 用户ID
     * @return 咨询列表
     */
    List<Consult> findByUserId(Long userId);

    /**
     * 根据分类ID查询咨询列表
     *
     * @param classId 分类ID
     * @return 咨询列表
     */
    List<Consult> findByClassId(Long classId);
}