package com.mall.evaluation.adapter.in.web.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 回复咨询请求
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "回复咨询请求")
public class ReplyConsultRequest {

    @NotBlank(message = "回复内容不能为空")
    @Size(max = 500, message = "回复内容不能超过500字符")
    @Schema(description = "回复内容", example = "该商品有红色、蓝色、绿色三种颜色可选")
    private String replyContent;
}