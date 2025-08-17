package com.mall.evaluation.application.command;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 查询商品评价命令
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class QueryEvaluateGoodsCommand {

    /**
     * 商品ID
     */
    private Long goodsId;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 店铺ID
     */
    private Long storeId;

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