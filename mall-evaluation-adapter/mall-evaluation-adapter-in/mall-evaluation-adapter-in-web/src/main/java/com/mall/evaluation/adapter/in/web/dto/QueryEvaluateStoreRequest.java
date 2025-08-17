package com.mall.evaluation.adapter.in.web.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 查询店铺评价请求
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "查询店铺评价请求")
public class QueryEvaluateStoreRequest {

    @Schema(description = "店铺ID", example = "1")
    private Long storeId;

    @Schema(description = "用户ID", example = "1")
    private Long userId;

    @Schema(description = "评价等级", example = "5")
    private Integer grade;

    @Schema(description = "页码", example = "1")
    private Integer pageNum = 1;

    @Schema(description = "页大小", example = "10")
    private Integer pageSize = 10;
}