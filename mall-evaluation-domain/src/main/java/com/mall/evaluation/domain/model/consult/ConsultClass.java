package com.mall.evaluation.domain.model.consult;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * 咨询分类领域实体
 * 
 * @author mall
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
    
    /**
     * 创建咨询分类
     */
    public static ConsultClass create(String className, Integer classSort, String introduce) {
        ConsultClass consultClass = new ConsultClass();
        consultClass.setClassName(className);
        consultClass.setClassSort(classSort);
        consultClass.setIntroduce(introduce);
        consultClass.setIsDeleted(false);
        consultClass.setCreatedAt(LocalDateTime.now());
        consultClass.setUpdatedAt(LocalDateTime.now());
        return consultClass;
    }
    
    /**
     * 更新分类信息
     */
    public void update(String className, Integer classSort, String introduce) {
        this.className = className;
        this.classSort = classSort;
        this.introduce = introduce;
        this.updatedAt = LocalDateTime.now();
    }
}