package com.mall.evaluation.adapter.out.persistence.converter;

import com.mall.evaluation.adapter.out.persistence.entity.ConsultJpaEntity;
import com.mall.evaluation.domain.model.Consult;
import org.springframework.stereotype.Component;

/**
 * 咨询转换器
 */
@Component
public class ConsultConverter {
    
    public ConsultJpaEntity toEntity(Consult consult) {
        if (consult == null) {
            return null;
        }
        
        ConsultJpaEntity entity = new ConsultJpaEntity();
        entity.setConsultId(consult.getConsultId());
        entity.setAddTime(consult.getAddTime());
        entity.setAvatar(consult.getAvatar());
        entity.setClassId(consult.getClassId());
        entity.setClassName(consult.getClassName());
        entity.setCommonId(consult.getCommonId());
        entity.setConsultContent(consult.getConsultContent());
        entity.setConsultReply(consult.getConsultReply());
        entity.setConsultReplyState(consult.getConsultReplyState());
        entity.setMemberId(consult.getMemberId());
        entity.setMemberName(consult.getMemberName());
        entity.setReadState(consult.getReadState());
        entity.setReplyTime(consult.getReplyTime());
        entity.setStoreId(consult.getStoreId());
        entity.setStoreName(consult.getStoreName());
        entity.setCreatedAt(consult.getCreatedAt());
        entity.setCreatedBy(consult.getCreatedBy());
        entity.setUpdatedAt(consult.getUpdatedAt());
        entity.setUpdatedBy(consult.getUpdatedBy());
        entity.setIsDeleted(consult.getIsDeleted());
        
        return entity;
    }
    
    public Consult toDomain(ConsultJpaEntity entity) {
        if (entity == null) {
            return null;
        }
        
        Consult consult = new Consult();
        consult.setConsultId(entity.getConsultId());
        consult.setAddTime(entity.getAddTime());
        consult.setAvatar(entity.getAvatar());
        consult.setClassId(entity.getClassId());
        consult.setClassName(entity.getClassName());
        consult.setCommonId(entity.getCommonId());
        consult.setConsultContent(entity.getConsultContent());
        consult.setConsultReply(entity.getConsultReply());
        consult.setConsultReplyState(entity.getConsultReplyState());
        consult.setMemberId(entity.getMemberId());
        consult.setMemberName(entity.getMemberName());
        consult.setReadState(entity.getReadState());
        consult.setReplyTime(entity.getReplyTime());
        consult.setStoreId(entity.getStoreId());
        consult.setStoreName(entity.getStoreName());
        consult.setCreatedAt(entity.getCreatedAt());
        consult.setCreatedBy(entity.getCreatedBy());
        consult.setUpdatedAt(entity.getUpdatedAt());
        consult.setUpdatedBy(entity.getUpdatedBy());
        consult.setIsDeleted(entity.getIsDeleted());
        
        return consult;
    }
}