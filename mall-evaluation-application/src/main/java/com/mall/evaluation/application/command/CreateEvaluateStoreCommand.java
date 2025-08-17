package com.mall.evaluation.application.command;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * 创建店铺评价命令
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateEvaluateStoreCommand {

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
     * 评价等级(1-5星)
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
}