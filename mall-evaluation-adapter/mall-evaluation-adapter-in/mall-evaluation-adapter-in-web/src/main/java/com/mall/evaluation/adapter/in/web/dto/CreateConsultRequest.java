package com.mall.evaluation.adapter.in.web.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 创建咨询请求
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "创建咨询请求")
public class CreateConsultRequest {

    @NotNull(message = "商品ID不能为空")
    @Schema(description = "商品ID", example = "1")
    private Long goodsId;

    @NotNull(message = "用户ID不能为空")
    @Schema(description = "用户ID", example = "1")
    private Long userId;

    @NotNull(message = "咨询分类ID不能为空")
    @Schema(description = "咨询分类ID", example = "1")
    private Long classId;

    @NotBlank(message = "咨询内容不能为空")
    @Size(max = 500, message = "咨询内容不能超过500字符")
    @Schema(description = "咨询内容", example = "请问这个商品有什么颜色？")
    private String content;

    @Schema(description = "是否匿名(0:否 1:是)", example = "0")
    private Integer isAnonymous = 0;
}