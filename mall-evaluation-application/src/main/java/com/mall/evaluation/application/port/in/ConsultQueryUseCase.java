package com.mall.evaluation.application.port.in;

import com.mall.evaluation.application.command.QueryConsultCommand;
import com.mall.evaluation.application.dto.ConsultResponse;

import java.util.List;
/**
 * 此用例是用来 获取咨询内容的列表
 * @author wanhui
 */
public interface ConsultQueryUseCase {
    /**
     * 查询咨询列表
     *
     * @param command 查询咨询命令
     * @return 咨询列表
     */
    List<ConsultResponse> queryConsult(QueryConsultCommand command);
}
