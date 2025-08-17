package com.mall.evaluation.application.command;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 创建咨询命令
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateConsultCommand {

    /**
     * 商品ID
     */
    private Long goodsId;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 咨询分类ID
     */
    private Long classId;

    /**
     * 咨询内容
     */
    private String content;

    /**
     * 是否匿名(0:否 1:是)
     */
    private Integer isAnonymous;
}