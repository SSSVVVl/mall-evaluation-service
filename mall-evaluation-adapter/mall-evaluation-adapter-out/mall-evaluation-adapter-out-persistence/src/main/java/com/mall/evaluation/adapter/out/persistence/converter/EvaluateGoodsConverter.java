package com.mall.evaluation.adapter.out.persistence.converter;

import com.mall.evaluation.adapter.out.persistence.entity.EvaluateGoodsJpaEntity;
import com.mall.evaluation.domain.model.evaluation.EvaluateGoods;
import org.springframework.stereotype.Component;

/**
 * 商品评价转换器
 * 
 * @author mall
 */
@Component
public class EvaluateGoodsConverter {
    
    public EvaluateGoodsJpaEntity toJpaEntity(EvaluateGoods domain) {
        if (domain == null) {
            return null;
        }
        
        EvaluateGoodsJpaEntity entity = new EvaluateGoodsJpaEntity();
        entity.setEvaluateId(domain.getEvaluateId());
        entity.setCommonId(domain.getCommonId());
        entity.setContent(domain.getContent());
        entity.setContentAgain(domain.getContentAgain());
        entity.setEvaluateNum(domain.getEvaluateNum());
        entity.setEvaluateTime(domain.getEvaluateTime());
        entity.setEvaluateTimeAgain(domain.getEvaluateTimeAgain());
        entity.setExplainContent(domain.getExplainContent());
        entity.setExplainContentAgain(domain.getExplainContentAgain());
        entity.setGoodsFullSpecs(domain.getGoodsFullSpecs());
        entity.setGoodsId(domain.getGoodsId());
        entity.setGoodsImage(domain.getGoodsImage());
        entity.setGoodsName(domain.getGoodsName());
        entity.setHasImage(domain.getHasImage());
        entity.setImages(domain.getImages());
        entity.setImagesAgain(domain.getImagesAgain());
        entity.setMemberId(domain.getMemberId());
        entity.setMemberName(domain.getMemberName());
        entity.setOrdersId(domain.getOrdersId());
        entity.setOrdersSn(domain.getOrdersSn());
        entity.setOrdersType(domain.getOrdersType());
        entity.setScores(domain.getScores());
        entity.setStoreId(domain.getStoreId());
        entity.setStoreName(domain.getStoreName());
        entity.setCreatedAt(domain.getCreatedAt());
        entity.setCreatedBy(domain.getCreatedBy());
        entity.setUpdatedAt(domain.getUpdatedAt());
        entity.setUpdatedBy(domain.getUpdatedBy());
        entity.setIsDeleted(domain.getIsDeleted());
        
        return entity;
    }
    
    public EvaluateGoods toDomainModel(EvaluateGoodsJpaEntity entity) {
        if (entity == null) {
            return null;
        }
        
        EvaluateGoods domain = new EvaluateGoods();
        domain.setEvaluateId(entity.getEvaluateId());
        domain.setCommonId(entity.getCommonId());
        domain.setContent(entity.