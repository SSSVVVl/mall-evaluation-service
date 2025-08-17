package com.mall.evaluation.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * 商品评价领域实体
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EvaluateGoods {
    
    /**
     * 评价ID
     */
    private Long evaluateId;
    
    /**
     * 商品ID
     */
    private Integer commonId;
    
    /**
     * 评价内容
     */
    private String content;
    
    /**
     * 追评内容
     */
    private String contentAgain;
    
    /**
     * 评价数量
     */
    private Integer evaluateNum;
    
    /**
     * 评价时间
     */
    private LocalDateTime evaluateTime;
    
    /**
     * 追评时间
     */
    private LocalDateTime evaluateTimeAgain;
    
    /**
     * 解释内容
     */
    private String explainContent;
    
    /**
     * 追评解释内容
     */
    private String explainContentAgain;
    
    /**
     * 商品完整规格
     */
    private String goodsFullSpecs;
    
    /**
     * 商品ID
     */
    private Integer goodsId;
    
    /**
     * 商品图片
     */
    private String goodsImage;
    
    /**
     * 商品名称
     */
    private String goodsName;
    
    /**
     * 是否有图片
     */
    private Integer hasImage;
    
    /**
     * 评价图片
     */
    private String images;
    
    /**
     * 追评图片
     */
    private String imagesAgain;
    
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
     * 评分
     */
    private Integer scores;
    
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
}