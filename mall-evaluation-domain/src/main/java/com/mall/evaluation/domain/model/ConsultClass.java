package com.mall.evaluation.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * 咨询分类领域实体
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ConsultClass {
    
    /**
     * 分类ID
     */
    private Long classId;
    
    /**
     * 分类名称
     */
    private String className;
    
    /**
     * 分类排序
     */
    private Integer classSort;
    
    /**
     * 介绍
     */
    private String introduce;
    
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