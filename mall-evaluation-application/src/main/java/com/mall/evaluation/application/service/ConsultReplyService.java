package com.mall.evaluation.application.service;

import com.mall.evaluation.application.dto.ConsultResponse;
import com.mall.evaluation.application.port.in.ConsultReplyUseCase;
import org.springframework.stereotype.Service;

// 单一职责原则
/**
 * 咨询回复
 * @author wanhui
 */
@Service
public class ConsultReplyService implements ConsultReplyUseCase {

    /**
     *
     * @param consultId 咨询ID
     * @param reply 回复内容
     * @return
     */
    @Override
    public ConsultResponse replyConsult(Long consultId, String reply) {
        return null;
    }
}
