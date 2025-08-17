package com.mall.evaluation.adapter.in.web.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * 创建店铺评价请求
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "创建店铺评价请求")
public class CreateEvaluateStoreRequest {

    @NotNull(message = "店铺ID不能为空")
    @Schema(description = "店铺ID", example = "1")
    private Long storeId;

    @NotNull(message = "用户ID不能为空")
    @Schema(description = "用户ID", example = "1")
    private Long userId;

    @NotNull(message = "订单ID不能为空")
    @Schema(description = "订单ID", example = "1")
    private Long orderId;

    @NotBlank(message = "评价内容不能为空")
    @Size(max = 500, message = "评价内容不能超过500字符")
    @Schema(description = "评价内容", example = "店铺服务很好，发货很快")
    private String content;

    @NotNull(message = "评价等级不能为空")
    @Min(value = 1, message = "评价等级最小为1")
    @Max(value = 5, message = "评价等级最大为5")
    @Schema(description = "评价等级(1-5星)", example = "5")
    private Integer grade;

    @DecimalMin(value = "0.0", message = "物流评分不能小于0")
    @DecimalMax(value = "5.0", message = "物流评分不能大于5")
    @Schema(description = "物流评分", example = "4.5")
    private BigDecimal deliveryScore;

    @DecimalMin(value = "0.0", message = "服务评分不能小于0")
    @DecimalMax(value = "5.0", message = "服务评分不能大于5")
    @Schema(description = "服务评分", example = "4.8")
    private BigDecimal serviceScore;

    @DecimalMin(value = "0.0", message = "商品描述评分不能小于0")
    @DecimalMax(value = "5.0", message = "商品描述评分不能大于5")
    @Schema(description = "商品描述评分", example = "4.7")
    private BigDecimal descScore;
}