package com.mall.evaluation.adapter.in.web.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 创建咨询分类请求
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "创建咨询分类请求")
public class CreateConsultClassRequest {

    @NotBlank(message = "分类名称不能为空")
    @Size(max = 50, message = "分类名称不能超过50字符")
    @Schema(description = "分类名称", example = "商品规格")
    private String className;

    @Size(max = 200, message = "分类描述不能超过200字符")
    @Schema(description = "分类描述", example = "关于商品规格的咨询")
    private String classDesc;

    @NotNull(message = "排序不能为空")
    @Schema(description = "排序", example = "1")
    private Integer sort;

    @NotNull(message = "状态不能为空")
    @Schema(description = "状态(0:禁用 1:启用)", example = "1")
    private Integer status;
}