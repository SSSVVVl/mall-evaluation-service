package com.mall.evaluation.adapter.out.persistence.repository;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.mall.evaluation.adapter.out.persistence.mapper.ConsultMapper;
import com.mall.evaluation.application.port.out.ConsultRepository;
import com.mall.evaluation.domain.entity.Consult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * 咨询仓储实现
 */
@Slf4j
@Repository
public class ConsultRepositoryImpl implements ConsultRepository {

    private final ConsultMapper consultMapper;

    public ConsultRepositoryImpl(ConsultMapper consultMapper) {
        this.consultMapper = consultMapper;
    }

    @Override
    public Consult save(Consult consult) {
        if (consult.getConsultId() == null) {
            consultMapper.insert(consult);
        } else {
            consultMapper.updateById(consult);
        }
        return consult;
    }

    @Override
    public Optional<Consult> findById(Long consultId) {
        Consult consult = consultMapper.selectById(consultId);
        return Optional.ofNullable(consult);
    }

    @Override
    public List<Consult> findByGoodsId(Long goodsId) {
        LambdaQueryWrapper<Consult> wrapper = Wrappers.lambdaQueryWrapper();
        wrapper.eq(Consult::getGoodsId, goodsId)
                .orderByDesc(Consult::getCreateTime);
        return consultMapper.selectList(wrapper);
    }

    @Override
    public List<Consult> findByUserId(Long userId) {
        LambdaQueryWrapper<Consult> wrapper = Wrappers.lambdaQueryWrapper();
        wrapper.eq(Consult::getUserId, userId)
                .orderByDesc(Consult::getCreateTime);
        return consultMapper.selectList(wrapper);
    }

    @Override
    public List<Consult> findByClassId(Long classId) {
        LambdaQueryWrapper<Consult> wrapper = Wrappers.lambdaQueryWrapper();
        wrapper.eq(Consult::getClassId, classId)
                .orderByDesc(Consult::getCreateTime);
        return consultMapper.selectList(wrapper);
    }

    @Override
    public List<Consult> findByConditions(Long goodsId, Long userId, Long classId) {
        LambdaQueryWrapper<Consult> wrapper = Wrappers.lambdaQueryWrapper();
        
        if (goodsId != null) {
            wrapper.eq(Consult::getGoodsId, goodsId);
        }
        if (userId != null) {
            wrapper.eq(Consult::getUserId, userId);
        }
        if (classId != null) {
            wrapper.eq(Consult::getClassId, classId);
        }
        
        wrapper.orderByDesc(Consult::getCreateTime);
        return consultMapper.selectList(wrapper);
    }

    @Override
    public void deleteById(Long consultId) {
        consultMapper.deleteById(consultId);
    }
}