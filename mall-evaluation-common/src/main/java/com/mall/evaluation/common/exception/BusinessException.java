package com.mall.evaluation.common.exception;

import com.mall.evaluation.common.enums.Resp;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 业务异常类
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class BusinessException extends RuntimeException {
    private Resp resp;

    public BusinessException(String message) {
        super(message);
    }

    public BusinessException(Resp resp) {
        super(resp.getMessage());
        this.resp = resp;
    }
}