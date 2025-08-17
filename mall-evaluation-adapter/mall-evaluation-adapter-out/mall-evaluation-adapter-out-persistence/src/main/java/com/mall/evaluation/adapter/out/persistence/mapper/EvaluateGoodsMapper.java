package com.mall.evaluation.adapter.out.persistence.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mall.evaluation.domain.entity.EvaluateGoods;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价 Mapper 接口
 */
@Mapper
public interface EvaluateGoodsMapper extends BaseMapper<EvaluateGoods> {
}