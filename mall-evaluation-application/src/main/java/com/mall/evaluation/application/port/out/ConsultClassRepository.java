package com.mall.evaluation.application.port.out;

import com.mall.evaluation.domain.model.ConsultClass;

import java.util.List;
import java.util.Optional;

/**
 * 咨询分类仓储端口
 */
public interface ConsultClassRepository {

    /**
     * 保存咨询分类
     *
     * @param consultClass 咨询分类
     * @return 保存后的咨询分类
     */
    ConsultClass save(ConsultClass consultClass);

    /**
     * 根据ID查询咨询分类
     *
     * @param classId 分类ID
     * @return 咨询分类
     */
    Optional<ConsultClass> findById(Long classId);

    /**
     * 查询所有咨询分类
     *
     * @return 咨询分类列表
     */
    List<ConsultClass> findAll();

    /**
     * 根据分类名称查询
     *
     * @param className 分类名称
     * @return 咨询分类
     */
    Optional<ConsultClass> findByClassName(String className);
}