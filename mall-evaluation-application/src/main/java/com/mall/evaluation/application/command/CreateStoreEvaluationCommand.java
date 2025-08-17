package com.mall.evaluation.application.command;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 创建店铺评价命令
 * 
 * @author mall
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateStoreEvaluationCommand {
    
    /**
     * 店铺ID
     */
    private Integer storeId;
    
    /**
     * 店铺名称
     */
    private String storeName;
    
    /**
     * 发货评分
     */
    private Integer deliveryCredit;
    
    /**
     * 描述评分
     */
    private Integer descriptionCredit;
    
    /**
     * 服务评分
     */
    private Integer serviceCredit;
    
    /**
     * 会员ID
     */
    private Integer memberId;
    
    /**
     * 会员名称
     */
    private String memberName;
    
    /**
     * 订单ID
     */
    private Integer ordersId;
    
    /**
     * 订单编号
     */
    private Long ordersSn;
    
    /**
     * 订单类型
     */
    private Integer ordersType;
}