package com.mall.evaluation.application.service;

import com.mall.evaluation.application.command.CreateEvaluateStoreCommand;
import com.mall.evaluation.application.command.QueryEvaluateStoreCommand;
import com.mall.evaluation.application.dto.EvaluateStoreResponse;
import com.mall.evaluation.application.port.out.EvaluateStoreRepository;
import com.mall.evaluation.common.exception.BusinessException;
import com.mall.evaluation.common.enums.Resp;
import com.mall.evaluation.domain.model.EvaluateStore;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 店铺评价服务实现
 */
@Slf4j
@Service
@Transactional
public class EvaluateStoreService {

    private final EvaluateStoreRepository evaluateStoreRepository;

    public EvaluateStoreService(EvaluateStoreRepository evaluateStoreRepository) {
        this.evaluateStoreRepository = evaluateStoreRepository;
    }

    @Override
    public EvaluateStoreResponse createEvaluateStore(CreateEvaluateStoreCommand command) {
        // 创建店铺评价领域对象
        EvaluateStore evaluateStore = new EvaluateStore();
        evaluateStore.setStoreId(command.getStoreId());
        evaluateStore.setUserId(command.getUserId());
        evaluateStore.setOrderId(command.getOrderId());
        evaluateStore.setContent(command.getContent());
        evaluateStore.setGrade(command.getGrade());
        evaluateStore.setDeliveryScore(command.getDeliveryScore());
        evaluateStore.setServiceScore(command.getServiceScore());
        evaluateStore.setDescScore(command.getDescScore());
        evaluateStore.setCreateTime(LocalDateTime.now());
        evaluateStore.setUpdateTime(LocalDateTime.now());

        // 保存到仓储
        EvaluateStore savedEvaluateStore = evaluateStoreRepository.save(evaluateStore);

        // 转换为响应对象
        return convertToResponse(savedEvaluateStore);
    }

    @Override
    public List<EvaluateStoreResponse> queryEvaluateStore(QueryEvaluateStoreCommand command) {
        List<EvaluateStore> evaluateStoreList;

        if (command.getStoreId() != null) {
            evaluateStoreList = evaluateStoreRepository.findByStoreId(command.getStoreId());
        } else if (command.getUserId() != null) {
            evaluateStoreList = evaluateStoreRepository.findByUserId(command.getUserId());
        } else {
            throw new BusinessException(Resp.EVALUATE_STORE_QUERY_PARAM_ERROR);
        }

        return evaluateStoreList.stream()
                .map(this::convertToResponse)
                .collect(Collectors.toList());
    }

    @Override
    public EvaluateStoreResponse getEvaluateStoreById(Long evaluateId) {
        EvaluateStore evaluateStore = evaluateStoreRepository.findById(evaluateId)
                .orElseThrow(() -> new BusinessException(Resp.EVALUATE_STORE_NOT_FOUND));

        return convertToResponse(evaluateStore);
    }

    /**
     * 转换为响应对象
     */
    private EvaluateStoreResponse convertToResponse(EvaluateStore evaluateStore) {
        EvaluateStoreResponse response = new EvaluateStoreResponse();
        response.setEvaluateId(evaluateStore.getEvaluateId());
        response.setStoreId(evaluateStore.getStoreId());
        response.setUserId(evaluateStore.getUserId());
        response.setOrderId(evaluateStore.getOrderId());
        response.setContent(evaluateStore.getContent());
        response.setGrade(evaluateStore.getGrade());
        response.setDeliveryScore(evaluateStore.getDeliveryScore());
        response.setServiceScore(evaluateStore.getServiceScore());
        response.setDescScore(evaluateStore.getDescScore());
        response.setReplyContent(evaluateStore.getReplyContent());
        response.setReplyTime(evaluateStore.getReplyTime());
        response.setCreateTime(evaluateStore.getCreateTime());
        response.setUpdateTime(evaluateStore.getUpdateTime());
        return response;
    }
}