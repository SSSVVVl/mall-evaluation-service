package com.mall.evaluation.adapter.out.persistence.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * 商品评价JPA实体
 * 
 * @author mall
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("evaluate_goods")
public class EvaluateGoodsJpaEntity {
    
    @TableId(value = "evaluate_id", type = IdType.AUTO)
    private Long evaluateId;
    
    @TableField("common_id")
    private Integer commonId;
    
    @TableField("content")
    private String content;
    
    @TableField("content_again")
    private String contentAgain;
    
    @TableField("evaluate_num")
    private Integer evaluateNum;
    
    @TableField("evaluate_time")
    private LocalDateTime evaluateTime;
    
    @TableField("evaluate_time_again")
    private LocalDateTime evaluateTimeAgain;
    
    @TableField("explain_content")
    private String explainContent;
    
    @TableField("explain_content_again")
    private String explainContentAgain;
    
    @TableField("goods_full_specs")
    private String goodsFullSpecs;
    
    @TableField("goods_id")
    private Integer goodsId;
    
    @TableField("goods_image")
    private String goodsImage;
    
    @TableField("goods_name")
    private String goodsName;
    
    @TableField("has_image")
    private Integer hasImage;
    
    @TableField("images")
    private String images;
    
    @TableField("images_again")
    private String imagesAgain;
    
    @TableField("member_id")
    private Integer memberId;
    
    @TableField("member_name")
    private String memberName;
    
    @TableField("orders_id")
    private Integer ordersId;
    
    @TableField("orders_sn")
    private Long ordersSn;
    
    @TableField("orders_type")
    private Integer ordersType;
    
    @TableField("scores")
    private Integer scores;
    
    @TableField("store_id")
    private Integer storeId;
    
    @TableField("store_name")
    private String storeName;
    
    @TableField(value = "created_at", fill = FieldFill.INSERT)
    private LocalDateTime createdAt;
    
    @TableField(value = "created_by", fill = FieldFill.INSERT)
    private Long createdBy;
    
    @TableField(value = "updated_at", fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updatedAt;
    
    @TableField(value = "updated_by", fill = FieldFill.INSERT_UPDATE)
    private Long updatedBy;
    
    @TableField("is_deleted")
    @TableLogic
    private Boolean isDeleted;
}