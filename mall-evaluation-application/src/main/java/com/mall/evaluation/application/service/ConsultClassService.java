package com.mall.evaluation.application.service;

import com.mall.evaluation.application.command.CreateConsultClassCommand;
import com.mall.evaluation.application.dto.ConsultClassResponse;
import com.mall.evaluation.application.port.out.ConsultClassRepository;
import com.mall.evaluation.common.exception.BusinessException;
import com.mall.evaluation.common.enums.Resp;
import com.mall.evaluation.domain.model.ConsultClass;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 咨询分类服务实现
 */
@Slf4j
@Service
@Transactional
public class ConsultClassService {

    private final ConsultClassRepository consultClassRepository;

    public ConsultClassService(ConsultClassRepository consultClassRepository) {
        this.consultClassRepository = consultClassRepository;
    }

    @Override
    public ConsultClassResponse createConsultClass(CreateConsultClassCommand command) {
        // 检查分类名称是否已存在
        if (consultClassRepository.findByClassName(command.getClassName()).isPresent()) {
            throw new BusinessException(Resp.CONSULT_CLASS_NAME_EXISTS);
        }

        // 创建咨询分类领域对象
        ConsultClass consultClass = new ConsultClass();
        consultClass.setClassName(command.getClassName());
        consultClass.setClassDesc(command.getClassDesc());
        consultClass.setSort(command.getSort());
        consultClass.setStatus(command.getStatus());
        consultClass.setCreateTime(LocalDateTime.now());
        consultClass.setUpdateTime(LocalDateTime.now());

        // 保存到仓储
        ConsultClass savedConsultClass = consultClassRepository.save(consultClass);

        // 转换为响应对象
        return convertToResponse(savedConsultClass);
    }

    @Override
    public List<ConsultClassResponse> getAllConsultClass() {
        List<ConsultClass> consultClassList = consultClassRepository.findAll();

        return consultClassList.stream()
                .map(this::convertToResponse)
                .collect(Collectors.toList());
    }

    @Override
    public ConsultClassResponse getConsultClassById(Long classId) {
        ConsultClass consultClass = consultClassRepository.findById(classId)
                .orElseThrow(() -> new BusinessException(Resp.CONSULT_CLASS_NOT_FOUND));

        return convertToResponse(consultClass);
    }

    /**
     * 转换为响应对象
     */
    private ConsultClassResponse convertToResponse(ConsultClass consultClass) {
        ConsultClassResponse response = new ConsultClassResponse();
        response.setClassId(consultClass.getClassId());
        response.setClassName(consultClass.getClassName());
        response.setClassDesc(consultClass.getClassDesc());
        response.setSort(consultClass.getSort());
        response.setStatus(consultClass.getStatus());
        response.setCreateTime(consultClass.getCreateTime());
        response.setUpdateTime(consultClass.getUpdateTime());
        return response;
    }
}