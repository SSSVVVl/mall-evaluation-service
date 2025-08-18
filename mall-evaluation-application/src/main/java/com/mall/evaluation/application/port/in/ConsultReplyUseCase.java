package com.mall.evaluation.application.port.in;

import com.mall.evaluation.application.dto.ConsultResponse;

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
