package com.mall.evaluation.domain.model.consult;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * 咨询领域实体
 * 
 * @author mall
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
    
    /**
     * 创建咨询
     */
    public static Consult create(Integer commonId, String consultContent, Integer classId, 
                               String className, Integer memberId, String memberName,
                               Integer storeId, String storeName) {
        Consult consult = new Consult();
        consult.setCommonId(commonId);
        consult.setConsultContent(consultContent);
        consult.setClassId(classId);
        consult.setClassName(className);
        consult.setMemberId(memberId);
        consult.setMemberName(memberName);
        consult.setStoreId(storeId);
        consult.setStoreName(storeName);
        consult.setAddTime(LocalDateTime.now());
        consult.setConsultReplyState(0); // 0-未回复
        consult.setReadState(0); // 0-未读
        consult.setIsDeleted(false);
        consult.setCreatedAt(LocalDateTime.now());
        consult.setUpdatedAt(LocalDateTime.now());
        return consult;
    }
    
    /**
     * 回复咨询
     */
    public void reply(String replyContent) {
        this.consultReply = replyContent;
        this.consultReplyState = 1; // 1-已回复
        this.replyTime = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }
    
    /**
     * 标记为已读
     */
    public void markAsRead() {
        this.readState = 1; // 1-已读
        this.updatedAt = LocalDateTime.now();
    }
}