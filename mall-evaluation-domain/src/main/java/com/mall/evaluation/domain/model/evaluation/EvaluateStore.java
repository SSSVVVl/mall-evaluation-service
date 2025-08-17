package com.mall.evaluation.domain.model.evaluation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * 店铺评价领域实体
 * 
 * @author mall
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EvaluateStore {
    
    /**
     * 评价ID
     */
    private Long evaluateId;
    
    /**
     * 发货评分
     */
    private Integer deliveryCredit;
    
    /**
     * 描述评分
     */
    private Integer descriptionCredit;
    
    /**
     * 评价时间
     */
    private LocalDateTime evaluateTime;
    
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
    
    /**
     * 服务评分
     */
    private Integer serviceCredit;
    
    /**
     * 店铺ID
     */
    private Integer storeId;
    
    /**
     * 店铺名称
     */
    private String storeName;
    
    /**
     * 创建时间
     */
    private LocalDateTime createdAt;
    
    /**
     * 创建人
     */
    private Long createdBy;
    
    /**
     * 更新时间
     */
    private LocalDateTime updatedAt;
    
    /**
     * 更新人
     */
    private Long updatedBy;
    
    /**
     * 是否删除
     */
    private Boolean isDeleted;
    
    /**
     * 创建店铺评价
     */
    public static EvaluateStore create(Integer storeId, String storeName, Integer memberId, 
                                     String memberName, Integer deliveryCredit, Integer descriptionCredit,
                                     Integer serviceCredit, Integer ordersId, Long ordersSn) {
        EvaluateStore evaluation = new EvaluateStore();
        evaluation.setStoreId(storeId);
        evaluation.setStoreName(storeName);
        evaluation.setMemberId(memberId);
        evaluation.setMemberName(memberName);
        evaluation.setDeliveryCredit(deliveryCredit);
        evaluation.setDescriptionCredit(descriptionCredit);
        evaluation.setServiceCredit(serviceCredit);
        evaluation.setOrdersId(ordersId);
        evaluation.setOrdersSn(ordersSn);
        evaluation.setEvaluateTime(LocalDateTime.now());
        evaluation.setIsDeleted(false);
        evaluation.setCreatedAt(LocalDateTime.now());
        evaluation.setUpdatedAt(LocalDateTime.now());
        return evaluation;
    }
    
    /**
     * 计算综合评分
     */
    public Double getOverallRating() {
        if (deliveryCredit == null || descriptionCredit == null || serviceCredit == null) {
            return 0.0;
        }
        return (deliveryCredit + descriptionCredit + serviceCredit) / 3.0;
    }
}