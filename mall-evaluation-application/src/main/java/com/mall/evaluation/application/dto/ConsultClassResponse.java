package com.mall.evaluation.application.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * 咨询分类响应
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ConsultClassResponse {

    /**
     * 分类ID
     */
    private Long classId;

    /**
     * 分类名称
     */
    private String className;

    /**
     * 分类描述
     */
    private String classDesc;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;
}