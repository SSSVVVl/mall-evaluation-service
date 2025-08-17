package com.mall.evaluation.adapter.out.persistence.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * 咨询持久化实体
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("consult")
public class ConsultJpaEntity {
    
    @TableId(type = IdType.AUTO)
    private Long consultId;
    
    private LocalDateTime addTime;
    
    private String avatar;
    
    private Integer classId;
    
    private String className;
    
    private Integer commonId;
    
    private String consultContent;
    
    private String consultReply;
    
    private Integer consultReplyState;
    
    private Integer memberId;
    
    private String memberName;
    
    private Integer readState;
    
    private LocalDateTime replyTime;
    
    private Integer storeId;
    
    private String storeName;
    
    private LocalDateTime createdAt;
    
    private Long createdBy;
    
    private LocalDateTime updatedAt;
    
    private Long updatedBy;
    
    private Boolean isDeleted;
}