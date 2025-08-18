package com.mall.evaluation.application.port.in;

import com.mall.evaluation.application.dto.ConsultResponse;
/**
 * 此用例是用来 显示回复咨询的内容和获取回复ID
 * @author wanhui
 */
public interface ConsultReplyUseCase {
    /**
     * 回复咨询
     *
     * @param consultId 咨询ID
     * @param reply 回复内容
     * @return 咨询响应
     */
    ConsultResponse replyConsult(Long consultId, String reply);
}
