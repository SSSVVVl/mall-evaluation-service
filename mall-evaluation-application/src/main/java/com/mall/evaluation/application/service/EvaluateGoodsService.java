package com.mall.evaluation.application.service;

import com.mall.evaluation.application.command.CreateEvaluateGoodsCommand;
import com.mall.evaluation.application.command.QueryEvaluateGoodsCommand;
import com.mall.evaluation.application.dto.EvaluateGoodsResponse;
import com.mall.evaluation.application.port.in.EvaluateGoodsUseCase;
import com.mall.evaluation.application.port.out.EvaluateGoodsRepository;
import com.mall.evaluation.common.exception.BusinessException;
import com.mall.evaluation.common.enums.Resp;
import com.mall.evaluation.domain.model.EvaluateGoods;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 商品评价服务实现
 */
@Slf4j
@Service
@Transactional
public class EvaluateGoodsService implements EvaluateGoodsUseCase {

    private final EvaluateGoodsRepository evaluateGoodsRepository;

    public EvaluateGoodsService(EvaluateGoodsRepository evaluateGoodsRepository) {
        this.evaluateGoodsRepository = evaluateGoodsRepository;
    }

    @Override
    public EvaluateGoodsResponse createEvaluateGoods(CreateEvaluateGoodsCommand command) {
        // 创建商品评价领域对象
        EvaluateGoods evaluateGoods = new EvaluateGoods();
        evaluateGoods.setGoodsId(command.getGoodsId());
        evaluateGoods.setUserId(command.getUserId());
        evaluateGoods.setStoreId(command.getStoreId());
        evaluateGoods.setOrderId(command.getOrderId());
        evaluateGoods.setContent(command.getContent());
        evaluateGoods.setPics(command.getPics());
        evaluateGoods.setGrade(command.getGrade());
        evaluateGoods.setIsAnonymous(command.getIsAnonymous());
        evaluateGoods.setDeliveryScore(command.getDeliveryScore());
        evaluateGoods.setServiceScore(command.getServiceScore());
        evaluateGoods.setDescScore(command.getDescScore());
        evaluateGoods.setCreateTime(LocalDateTime.now());
        evaluateGoods.setUpdateTime(LocalDateTime.now());

        // 保存到仓储
        EvaluateGoods savedEvaluateGoods = evaluateGoodsRepository.save(evaluateGoods);

        // 转换为响应对象
        return convertToResponse(savedEvaluateGoods);
    }

    @Override
    public List<EvaluateGoodsResponse> queryEvaluateGoods(QueryEvaluateGoodsCommand command) {
        List<EvaluateGoods> evaluateGoodsList;

        if (command.getGoodsId() != null) {
            evaluateGoodsList = evaluateGoodsRepository.findByGoodsId(command.getGoodsId());
        } else if (command.getUserId() != null) {
            evaluateGoodsList = evaluateGoodsRepository.findByUserId(command.getUserId());
        } else if (command.getStoreId() != null) {
            evaluateGoodsList = evaluateGoodsRepository.findByStoreId(command.getStoreId());
        } else {
            throw new BusinessException(Resp.EVALUATE_GOODS_QUERY_PARAM_ERROR);
        }

        return evaluateGoodsList.stream()
                .map(this::convertToResponse)
                .collect(Collectors.toList());
    }

    @Override
    public EvaluateGoodsResponse getEvaluateGoodsById(Long evaluateId) {
        EvaluateGoods evaluateGoods = evaluateGoodsRepository.findById(evaluateId)
                .orElseThrow(() -> new BusinessException(Resp.EVALUATE_GOODS_NOT_FOUND));

        return convertToResponse(evaluateGoods);
    }

    /**
     * 转换为响应对象
     */
    private EvaluateGoodsResponse convertToResponse(EvaluateGoods evaluateGoods) {
        EvaluateGoodsResponse response = new EvaluateGoodsResponse();
        response.setEvaluateId(evaluateGoods.getEvaluateId());
        response.setGoodsId(evaluateGoods.getGoodsId());
        response.setUserId(evaluateGoods.getUserId());
        response.setStoreId(evaluateGoods.getStoreId());
        response.setOrderId(evaluateGoods.getOrderId());
        response.setContent(evaluateGoods.getContent());
        response.setPics(evaluateGoods.getPics());
        response.setGrade(evaluateGoods.getGrade());
        response.setIsAnonymous(evaluateGoods.getIsAnonymous());
        response.setDeliveryScore(evaluateGoods.getDeliveryScore());
        response.setServiceScore(evaluateGoods.getServiceScore());
        response.setDescScore(evaluateGoods.getDescScore());
        response.setReplyContent(evaluateGoods.getReplyContent());
        response.setReplyTime(evaluateGoods.getReplyTime());
        response.setCreateTime(evaluateGoods.getCreateTime());
        response.setUpdateTime(evaluateGoods.getUpdateTime());
        return response;
    }
}