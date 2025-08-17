package com.mall.evaluation.adapter.out.persistence.repository;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.mall.evaluation.adapter.out.persistence.mapper.EvaluateGoodsMapper;
import com.mall.evaluation.application.port.out.EvaluateGoodsRepository;
import com.mall.evaluation.domain.entity.EvaluateGoods;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * 商品评价仓储实现
 */
@Slf4j
@Repository
public class EvaluateGoodsRepositoryImpl implements EvaluateGoodsRepository {

    private final EvaluateGoodsMapper evaluateGoodsMapper;

    public EvaluateGoodsRepositoryImpl(EvaluateGoodsMapper evaluateGoodsMapper) {
        this.evaluateGoodsMapper = evaluateGoodsMapper;
    }

    @Override
    public EvaluateGoods save(EvaluateGoods evaluateGoods) {
        if (evaluateGoods.getEvaluateId() == null) {
            evaluateGoodsMapper.insert(evaluateGoods);
        } else {
            evaluateGoodsMapper.updateById(evaluateGoods);
        }
        return evaluateGoods;
    }

    @Override
    public Optional<EvaluateGoods> findById(Long evaluateId) {
        EvaluateGoods evaluateGoods = evaluateGoodsMapper.selectById(evaluateId);
        return Optional.ofNullable(evaluateGoods);
    }

    @Override
    public List<EvaluateGoods> findByGoodsId(Long goodsId) {
        LambdaQueryWrapper<EvaluateGoods> wrapper = Wrappers.lambdaQueryWrapper();
        wrapper.eq(EvaluateGoods::getGoodsId, goodsId)
                .orderByDesc(EvaluateGoods::getCreateTime);
        return evaluateGoodsMapper.selectList(wrapper);
    }

    @Override
    public List<EvaluateGoods> findByUserId(Long userId) {
        LambdaQueryWrapper<EvaluateGoods> wrapper = Wrappers.lambdaQueryWrapper();
        wrapper.eq(EvaluateGoods::getUserId, userId)
                .orderByDesc(EvaluateGoods::getCreateTime);
        return evaluateGoodsMapper.selectList(wrapper);
    }

    @Override
    public List<EvaluateGoods> findByStoreId(Long storeId) {
        LambdaQueryWrapper<EvaluateGoods> wrapper = Wrappers.lambdaQueryWrapper();
        wrapper.eq(EvaluateGoods::getStoreId, storeId)
                .orderByDesc(EvaluateGoods::getCreateTime);
        return evaluateGoodsMapper.selectList(wrapper);
    }

    @Override
    public List<EvaluateGoods> findByGrade(Integer grade) {
        LambdaQueryWrapper<EvaluateGoods> wrapper = Wrappers.lambdaQueryWrapper();
        wrapper.eq(EvaluateGoods::getGrade, grade)
                .orderByDesc(EvaluateGoods::getCreateTime);
        return evaluateGoodsMapper.selectList(wrapper);
    }

    @Override
    public List<EvaluateGoods> findByConditions(Long goodsId, Long userId, Long storeId, Integer grade) {
        LambdaQueryWrapper<EvaluateGoods> wrapper = Wrappers.lambdaQueryWrapper();
        
        if (goodsId != null) {
            wrapper.eq(EvaluateGoods::getGoodsId, goodsId);
        }
        if (userId != null) {
            wrapper.eq(EvaluateGoods::getUserId, userId);
        }
        if (storeId != null) {
            wrapper.eq(EvaluateGoods::getStoreId, storeId);
        }
        if (grade != null) {
            wrapper.eq(EvaluateGoods::getGrade, grade);
        }
        
        wrapper.orderByDesc(EvaluateGoods::getCreateTime);
        return evaluateGoodsMapper.selectList(wrapper);
    }

    @Override
    public void deleteById(Long evaluateId) {
        evaluateGoodsMapper.deleteById(evaluateId);
    }
}