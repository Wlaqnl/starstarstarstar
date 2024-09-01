package com.kb.star.controller;

import com.kb.star.dto.approval.ApprovalRequestDto;
import com.kb.star.dto.approval.demand.ApprovalBasicRequestDto;
import com.kb.star.mapper.ApprovalMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/approval")
public class ApproveController {
    @Autowired
    private ApprovalMapper approvalMapper;

    @PostMapping("/demand")
    public void demandApprove(@RequestBody ApprovalRequestDto requestDto){
        System.out.println("결재 요청");
        ApprovalBasicRequestDto approvalBasicRequestDto = approvalMapper.toAprvalBasic(requestDto);
        System.out.println("approvalBasicRequestDto : " + approvalBasicRequestDto);
        System.out.println("get화면경로 : " + approvalBasicRequestDto.get화면경로());
        System.out.println("get화면URL : " + approvalBasicRequestDto.get화면URL());
        System.out.println("get결재일련번호 : " + approvalBasicRequestDto.get결재일련번호());
        System.out.println("get결재요청자직원번호 : " + approvalBasicRequestDto.get결재요청자직원번호());
        System.out.println("get결재요청자명 : " + approvalBasicRequestDto.get결재요청자명());
        System.out.println("get결재요청제목 : " + approvalBasicRequestDto.get결재요청제목());
        System.out.println("get결재요청내용 : " + approvalBasicRequestDto.get결재요청내용());
        System.out.println("get최종결재처리구분 : " + approvalBasicRequestDto.get최종결재처리구분());
        System.out.println("get예약적용여부 : " + approvalBasicRequestDto.get예약적용여부());
        System.out.println("get예약적용일시 : " + approvalBasicRequestDto.get예약적용일시());
    }

}
