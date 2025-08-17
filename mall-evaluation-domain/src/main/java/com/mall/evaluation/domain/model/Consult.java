package com.mall.evaluation.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * 咨询领域实体
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Consult {
    
    /**
     * 咨询ID
     */
    private Long consultId;
    
    /**
     * 添加时间
     */
    private LocalDateTime addTime;
    
    /**
     * 头像
     */
    private String avatar;
    
    /**
     * 分类ID
     */
    private Integer classId;
    
    /**
     * 分类名称
     */
    private String className;
    
    /**
     * 商品ID
     */
    private Integer commonId;
    
    /**
     * 咨询内容
     */
    private String consultContent;
    
    /**
     * 咨询回复
     */
    private String consultReply;
    
    /**
     * 咨询回复状态
     */
    private Integer consultReplyState;
    
    /**
     * 会员ID
     */
    private Integer memberId;
    
    /**
     * 会员名称
     */
    private String memberName;
    
    /**
     * 阅读状态
     */
    private Integer readState;
    
    /**
     * 回复时间
     */
    private LocalDateTime replyTime;
    
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