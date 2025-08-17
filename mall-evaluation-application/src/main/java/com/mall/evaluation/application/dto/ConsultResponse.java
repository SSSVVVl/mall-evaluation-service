package com.mall.evaluation.application.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * 咨询响应
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ConsultResponse {

    /**
     * 咨询ID
     */
    private Long consultId;

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
     * 是否匿名
     */
    private Integer isAnonymous;

    /**
     * 回复内容
     */
    private String replyContent;

    /**
     * 回复时间
     */
    private LocalDateTime replyTime;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;
}