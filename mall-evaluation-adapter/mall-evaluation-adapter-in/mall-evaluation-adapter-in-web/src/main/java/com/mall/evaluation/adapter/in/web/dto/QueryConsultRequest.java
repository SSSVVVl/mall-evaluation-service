package com.mall.evaluation.adapter.in.web.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 查询咨询请求
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "查询咨询请求")
public class QueryConsultRequest {

    @Schema(description = "商品ID", example = "1")
    private Long goodsId;

    @Schema(description = "用户ID", example = "1")
    private Long userId;

    @Schema(description = "咨询分类ID", example = "1")
    private Long classId;

    @Schema(description = "页码", example = "1")
    private Integer pageNum = 1;

    @Schema(description = "页大小", example = "10")
    private Integer pageSize = 10;
}