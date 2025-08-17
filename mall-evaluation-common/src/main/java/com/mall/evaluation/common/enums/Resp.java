package com.mall.evaluation.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 响应状态码枚举
 * 格式：EVAL + 5位数字，总长度9位
 * 00000-00999: 通用状态码
 * 01000-01999: 商品评价相关
 * 02000-02999: 店铺评价相关
 * 03000-03999: 咨询相关
 * 04000-04999: 咨询分类相关
 * 99000-99999: 系统错误相关
 */
@Getter
@AllArgsConstructor
public enum Resp {
    // 通用状态码
    SUCCESS("EVAL00000", "success"),
    FAIL("EVAL99999", "fail"),
    BAD_REQUEST("EVAL00400", "请求错误"),
    INVALID_PARAM("EVAL00401", "非法参数"),
    JSON_FORMAT_ERROR("EVAL00402", "JSON格式错误"),
    UNAUTHORIZED("EVAL00403", "未授权"),
    PERMISSION_DENIED("EVAL00404", "权限被拒绝"),
    
    // 商品评价相关
    GOODS_EVALUATE_NOT_FOUND("EVAL01000", "商品评价不存在"),
    GOODS_EVALUATE_CREATE_FAILED("EVAL01001", "商品评价创建失败"),
    GOODS_EVALUATE_UPDATE_FAILED("EVAL01002", "商品评价更新失败"),
    GOODS_EVALUATE_DELETE_FAILED("EVAL01003", "商品评价删除失败"),
    GOODS_EVALUATE_ALREADY_EXISTS("EVAL01004", "商品评价已存在"),
    GOODS_EVALUATE_CONTENT_EMPTY("EVAL01005", "评价内容不能为空"),
    GOODS_EVALUATE_SCORE_INVALID("EVAL01006", "评价分数无效"),
    GOODS_EVALUATE_IMAGE_UPLOAD_FAILED("EVAL01007", "评价图片上传失败"),
    GOODS_EVALUATE_REPLY_FAILED("EVAL01008", "评价回复失败"),
    
    // 店铺评价相关
    STORE_EVALUATE_NOT_FOUND("EVAL02000", "店铺评价不存在"),
    STORE_EVALUATE_CREATE_FAILED("EVAL02001", "店铺评价创建失败"),
    STORE_EVALUATE_UPDATE_FAILED("EVAL02002", "店铺评价更新失败"),
    STORE_EVALUATE_DELETE_FAILED("EVAL02003", "店铺评价删除失败"),
    STORE_EVALUATE_ALREADY_EXISTS("EVAL02004", "店铺评价已存在"),
    STORE_EVALUATE_SCORE_INVALID("EVAL02005", "店铺评价分数无效"),
    
    // 咨询相关
    CONSULT_NOT_FOUND("EVAL03000", "咨询不存在"),
    CONSULT_CREATE_FAILED("EVAL03001", "咨询创建失败"),
    CONSULT_UPDATE_FAILED("EVAL03002", "咨询更新失败"),
    CONSULT_DELETE_FAILED("EVAL03003", "咨询删除失败"),
    CONSULT_CONTENT_EMPTY("EVAL03004", "咨询内容不能为空"),
    CONSULT_REPLY_FAILED("EVAL03005", "咨询回复失败"),
    CONSULT_ALREADY_REPLIED("EVAL03006", "咨询已回复"),
    
    // 咨询分类相关
    CONSULT_CLASS_NOT_FOUND("EVAL04000", "咨询分类不存在"),
    CONSULT_CLASS_CREATE_FAILED("EVAL04001", "咨询分类创建失败"),
    CONSULT_CLASS_UPDATE_FAILED("EVAL04002", "咨询分类更新失败"),
    CONSULT_CLASS_DELETE_FAILED("EVAL04003", "咨询分类删除失败"),
    CONSULT_CLASS_NAME_EXISTS("EVAL04004", "咨询分类名称已存在"),
    CONSULT_CLASS_HAS_CONSULTS("EVAL04005", "咨询分类下存在咨询记录，无法删除");
    
    private final String code;
    private final String message;
}