package com.mall.evaluation.application.command;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 创建商品评价命令
 * 
 * @author mall
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateGoodsEvaluationCommand {
    
    /**
     * 商品ID
     */
    private Integer goodsId;
    
    /**
     * 商品名称
     */
    private String goodsName;
    
    /**
     * 商品图片
     */
    private String goodsImage;
    
    /**
     * 商品规格
     */
    private String goodsFullSpecs;
    
    /**
     * 评价内容
     */
    private String content;
    
    /**
     * 评分
     */
    private Integer scores;
    
    /**
     * 评价图片
     */
    private String images;
    
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
     * 店铺ID
     */
    private Integer storeId;
    
    /**
     * 店铺名称
     */
    private String storeName;
    
    /**
     * 商品通用ID
     */
    private Integer commonId;
}