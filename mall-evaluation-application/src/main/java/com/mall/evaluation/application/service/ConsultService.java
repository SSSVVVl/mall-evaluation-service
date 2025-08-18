package com.mall.evaluation.application.service;

import com.mall.evaluation.application.command.CreateConsultCommand;
import com.mall.evaluation.application.command.QueryConsultCommand;
import com.mall.evaluation.application.dto.ConsultResponse;
import com.mall.evaluation.application.port.out.ConsultRepository;
import com.mall.evaluation.common.exception.BusinessException;
import com.mall.evaluation.common.enums.Resp;
import com.mall.evaluation.domain.model.Consult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 咨询服务实现
 */
@Slf4j
@Service
@Transactional
public class ConsultService {

    private final ConsultRepository consultRepository;

    public ConsultService(ConsultRepository consultRepository) {
        this.consultRepository = consultRepository;
    }

    @Override
    public ConsultResponse createConsult(CreateConsultCommand command) {
        // 创建咨询领域对象
        Consult consult = new Consult();
        consult.setGoodsId(command.getGoodsId());
        consult.setUserId(command.getUserId());
        consult.setClassId(command.getClassId());
        consult.setContent(command.getContent());
        consult.setIsAnonymous(command.getIsAnonymous());
        consult.setStatus(0); // 默认待回复
        consult.setCreateTime(LocalDateTime.now());
        consult.setUpdateTime(LocalDateTime.now());

        // 保存到仓储
        Consult savedConsult = consultRepository.save(consult);

        // 转换为响应对象
        return convertToResponse(savedConsult);
    }

    @Override
    public List<ConsultResponse> queryConsult(QueryConsultCommand command) {
        List<Consult> consultList;

        if (command.getGoodsId() != null) {
            consultList = consultRepository.findByGoodsId(command.getGoodsId());
        } else if (command.getUserId() != null) {
            consultList = consultRepository.findByUserId(command.getUserId());
        } else if (command.getClassId() != null) {
            consultList = consultRepository.findByClassId(command.getClassId());
        } else {
            throw new BusinessException(Resp.CONSULT_QUERY_PARAM_ERROR);
        }

        return consultList.stream()
                .map(this::convertToResponse)
                .collect(Collectors.toList());
    }

    @Override
    public ConsultResponse getConsultById(Long consultId) {
        Consult consult = consultRepository.findById(consultId)
                .orElseThrow(() -> new BusinessException(Resp.CONSULT_NOT_FOUND));

        return convertToResponse(consult);
    }

    @Override
    public ConsultResponse replyConsult(Long consultId, String reply) {
        Consult consult = consultRepository.findById(consultId)
                .orElseThrow(() -> new BusinessException(Resp.CONSULT_NOT_FOUND));

        // 设置回复内容
        consult.setReplyContent(reply);
        consult.setReplyTime(LocalDateTime.now());
        consult.setStatus(1); // 已回复
        consult.setUpdateTime(LocalDateTime.now());

        // 保存更新
        Consult updatedConsult = consultRepository.save(consult);

        return convertToResponse(updatedConsult);
    }

    /**
     * 转换为响应对象
     */
    private ConsultResponse convertToResponse(Consult consult) {
        ConsultResponse response = new ConsultResponse();
        response.setConsultId(consult.getConsultId());
        response.setGoodsId(consult.getGoodsId());
        response.setUserId(consult.getUserId());
        response.setClassId(consult.getClassId());
        response.setContent(consult.getContent());
        response.setIsAnonymous(consult.getIsAnonymous());
        response.setReplyContent(consult.getReplyContent());
        response.setReplyTime(consult.getReplyTime());
        response.setStatus(consult.getStatus());
        response.setCreateTime(consult.getCreateTime());
        response.setUpdateTime(consult.getUpdateTime());
        return response;
    }
}