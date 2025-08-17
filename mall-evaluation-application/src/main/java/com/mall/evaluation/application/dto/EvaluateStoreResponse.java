package com.mall.evaluation.application.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 店铺评价响应
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EvaluateStoreResponse {

    /**
     * 评价ID
     */
    private Long evaluateId;

    /**
     * 店铺ID
     */
    private Long storeId;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 订单ID
     */
    private Long orderId;

    /**
     * 评价内容
     */
    private String content;

    /**
     * 评价等级
     */
    private Integer grade;

    /**
     * 物流评分
     */
    private BigDecimal deliveryScore;

    /**
     * 服务评分
     */
    private BigDecimal serviceScore;

    /**
     * 商品描述评分
     */
    private BigDecimal descScore;

    /**
     * 商家回复
     */
    private String replyContent;

    /**
     * 回复时间
     */
    private LocalDateTime replyTime;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;
}