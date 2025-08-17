package com.mall.evaluation.application.command;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 查询咨询命令
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class QueryConsultCommand {

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
     * 页码
     */
    private Integer pageNum = 1;

    /**
     * 页大小
     */
    private Integer pageSize = 10;
}