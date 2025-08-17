package com.mall.evaluation.adapter.out.persistence.repository;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.mall.evaluation.adapter.out.persistence.mapper.ConsultClassMapper;
import com.mall.evaluation.application.port.out.ConsultClassRepository;
import com.mall.evaluation.domain.entity.ConsultClass;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * 咨询分类仓储实现
 */
@Slf4j
@Repository
public class ConsultClassRepositoryImpl implements ConsultClassRepository {

    private final ConsultClassMapper consultClassMapper;

    public ConsultClassRepositoryImpl(ConsultClassMapper consultClassMapper) {
        this.consultClassMapper = consultClassMapper;
    }

    @Override
    public ConsultClass save(ConsultClass consultClass) {
        if (consultClass.getClassId() == null) {
            consultClassMapper.insert(consultClass);
        } else {
            consultClassMapper.updateById(consultClass);
        }
        return consultClass;
    }

    @Override
    public Optional<ConsultClass> findById(Long classId) {
        ConsultClass consultClass = consultClassMapper.selectById(classId);
        return Optional.ofNullable(consultClass);
    }

    @Override
    public List<ConsultClass> findAll() {
        LambdaQueryWrapper<ConsultClass> wrapper = Wrappers.lambdaQueryWrapper();
        wrapper.orderByAsc(ConsultClass::getSort);
        return consultClassMapper.selectList(wrapper);
    }

    @Override
    public List<ConsultClass> findByStatus(Integer status) {
        LambdaQueryWrapper<ConsultClass> wrapper = Wrappers.lambdaQueryWrapper();
        wrapper.eq(ConsultClass::getStatus, status)
                .orderByAsc(ConsultClass::getSort);
        return consultClassMapper.selectList(wrapper);
    }

    @Override
    public void deleteById(Long classId) {
        consultClassMapper.deleteById(classId);
    }
}