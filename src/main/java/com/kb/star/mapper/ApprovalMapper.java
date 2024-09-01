package com.kb.star.mapper;


import com.kb.star.dto.approval.ApprovalRequestDto;
import com.kb.star.dto.approval.demand.ApprovalBasicRequestDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;


@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ApprovalMapper {

    @Mapping(source = "처리상태구분", target = "최종결재처리구분")
    ApprovalBasicRequestDto toAprvalBasic(ApprovalRequestDto dto);

}

