package com.mall.evaluation.application.command;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 创建咨询分类命令
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateConsultClassCommand {

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
     * 状态(0:禁用 1:启用)
     */
    private Integer status;
}