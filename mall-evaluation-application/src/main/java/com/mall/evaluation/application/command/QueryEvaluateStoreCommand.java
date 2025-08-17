package com.mall.evaluation.application.command;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 查询店铺评价命令
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class QueryEvaluateStoreCommand {

    /**
     * 店铺ID
     */
    private Long storeId;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 评价等级
     */
    private Integer grade;

    /**
     * 页码
     */
    private Integer pageNum = 1;

    /**
     * 页大小
     */
    private Integer pageSize = 10;
}