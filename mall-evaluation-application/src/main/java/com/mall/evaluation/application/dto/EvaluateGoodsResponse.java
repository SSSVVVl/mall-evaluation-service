package com.mall.evaluation.application.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 商品评价响应
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EvaluateGoodsResponse {

    /**
     * 评价ID
     */
    private Long evaluateId;

    /**
     * 商品ID
     */
    private Long goodsId;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 店铺ID
     */
    private Long storeId;

    /**
     * 订单ID
     */
    private Long orderId;

    /**
     * 评价内容
     */
    private String content;

    /**
     * 评价图片
     */
    private String pics;

    /**
     * 评价等级
     */
    private Integer grade;

    /**
     * 是否匿名
     */
    private Integer isAnonymous;

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