package com.mall.evaluation.adapter.in.web.handlers;

import com.mall.evaluation.common.Result;
import com.mall.evaluation.common.enums.Resp;
import com.mall.evaluation.common.exception.BusinessException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.stream.Collectors;

/**
 * 全局异常处理器
 */
@Slf4j
@RestControllerAdvice
public class CommonExceptionHandler {
    
    /**
     * 处理业务异常
     */
    @ExceptionHandler(BusinessException.class)
    public Result<Object> handleBusinessException(BusinessException e) {
        Resp resp = e.getResp();
        if (resp == null) {
            log.info("业务异常（无枚举）：{}", e.getMessage());
            return Result.fail(Result.HTTP_OK, "EVAL99000", e.getMessage(), null);
        }
        
        log.info("业务异常：{}", resp.getMessage());
        return Result.fail(Result.HTTP_OK, resp.getCode(), resp.getMessage(), null);
    }
    
    /**
     * 处理参数校验异常
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Result<Object> handleValidationException(MethodArgumentNotValidException e) {
        String message = e.getBindingResult().getFieldErrors().stream()
                .map(FieldError::getDefaultMessage)
                .collect(Collectors.joining(", "));
        log.warn("参数校验失败：{}", message);
        return Result.fail(Result.HTTP_BAD_REQUEST, Resp.INVALID_PARAM.getCode(), message, null);
    }
    
    /**
     * 处理绑定异常
     */
    @ExceptionHandler(BindException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Result<Object> handleBindException(BindException e) {
        String message = e.getBindingResult().getFieldErrors().stream()
                .map(FieldError::getDefaultMessage)
                .collect(Collectors.joining(", "));
        log.warn("参数绑定失败：{}", message);
        return Result.fail(Result.HTTP_BAD_REQUEST, Resp.INVALID_PARAM.getCode(), message, null);
    }
    
    /**
     * 处理通用异常
     */
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public Result<Object> handleException(Exception e) {
        log.error("系统异常", e);
        return Result.fail(Result.HTTP_INTERNAL_ERROR, Resp.FAIL.getCode(), "系统内部错误", null);
    }
}