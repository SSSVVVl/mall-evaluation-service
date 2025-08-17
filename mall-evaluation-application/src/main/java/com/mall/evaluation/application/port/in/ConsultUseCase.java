package com.mall.evaluation.application.port.in;

import com.mall.evaluation.application.command.CreateConsultCommand;
import com.mall.evaluation.application.command.QueryConsultCommand;
import com.mall.evaluation.application.dto.ConsultResponse;

import java.util.List;

/**
 * 咨询用例接口
 */
public interface ConsultUseCase {

    /**
     * 创建咨询
     *
     * @param command 创建咨询命令
     * @return 咨询响应
     */
    ConsultResponse createConsult(CreateConsultCommand command);

    /**
     * 查询咨询列表
     *
     * @param command 查询咨询命令
     * @return 咨询列表
     */
    List<ConsultResponse> queryConsult(QueryConsultCommand command);

    /**
     * 根据ID查询咨询
     *
     * @param consultId 咨询ID
     * @return 咨询响应
     */
    ConsultResponse getConsultById(Long consultId);

    /**
     * 回复咨询
     *
     * @param consultId 咨询ID
     * @param reply 回复内容
     * @return 咨询响应
     */
    ConsultResponse replyConsult(Long consultId, String reply);
}