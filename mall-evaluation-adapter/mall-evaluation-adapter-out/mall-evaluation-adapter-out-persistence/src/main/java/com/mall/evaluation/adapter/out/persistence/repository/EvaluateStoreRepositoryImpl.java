package com.mall.evaluation.adapter.out.persistence.repository;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.mall.evaluation.adapter.out.persistence.mapper.EvaluateStoreMapper;
import com.mall.evaluation.application.port.out.EvaluateStoreRepository;
import com.mall.evaluation.domain.entity.EvaluateStore;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * 店铺评价仓储实现
 */
@Slf4j
@Repository
public class EvaluateStoreRepositoryImpl implements EvaluateStoreRepository {

    private final EvaluateStoreMapper evaluateStoreMapper;

    public EvaluateStoreRepositoryImpl(EvaluateStoreMapper evaluateStoreMapper) {
        this.evaluateStoreMapper = evaluateStoreMapper;
    }

    @Override
    public EvaluateStore save(EvaluateStore evaluateStore) {
        if (evaluateStore.getEvaluateId() == null) {
            evaluateStoreMapper.insert(evaluateStore);
        } else {
            evaluateStoreMapper.updateById(evaluateStore);
        }
        return evaluateStore;
    }

    @Override
    public Optional<EvaluateStore> findById(Long evaluateId) {
        EvaluateStore evaluateStore = evaluateStoreMapper.selectById(evaluateId);
        return Optional.ofNullable(evaluateStore);
    }

    @Override
    public List<EvaluateStore> findByStoreId(Long storeId) {
        LambdaQueryWrapper<EvaluateStore> wrapper = Wrappers.lambdaQueryWrapper();
        wrapper.eq(EvaluateStore::getStoreId, storeId)
                .orderByDesc(EvaluateStore::getCreateTime);
        return evaluateStoreMapper.selectList(wrapper);
    }

    @Override
    public List<EvaluateStore> findByUserId(Long userId) {
        LambdaQueryWrapper<EvaluateStore> wrapper = Wrappers.lambdaQueryWrapper();
        wrapper.eq(EvaluateStore::getUserId, userId)
                .orderByDesc(EvaluateStore::getCreateTime);
        return evaluateStoreMapper.selectList(wrapper);
    }

    @Override
    public List<EvaluateStore> findByGrade(Integer grade) {
        LambdaQueryWrapper<EvaluateStore> wrapper = Wrappers.lambdaQueryWrapper();
        wrapper.eq(EvaluateStore::getGrade, grade)
                .orderByDesc(EvaluateStore::getCreateTime);
        return evaluateStoreMapper.selectList(wrapper);
    }

    @Override
    public List<EvaluateStore> findByConditions(Long storeId, Long userId, Integer grade) {
        LambdaQueryWrapper<EvaluateStore> wrapper = Wrappers.lambdaQueryWrapper();
        
        if (storeId != null) {
            wrapper.eq(EvaluateStore::getStoreId, storeId);
        }
        if (userId != null) {
            wrapper.eq(EvaluateStore::getUserId, userId);
        }
        if (grade != null) {
            wrapper.eq(EvaluateStore::getGrade, grade);
        }
        
        wrapper.orderByDesc(EvaluateStore::getCreateTime);
        return evaluateStoreMapper.selectList(wrapper);
    }

    @Override
    public void deleteById(Long evaluateId) {
        evaluateStoreMapper.deleteById(evaluateId);
    }
}