package com.kb.star.dto.approval.demand;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class ApprovalBasicRequestDto {
    private String 화면경로;
    private String 화면URL;
    private String 결재일련번호;
    private String 결재요청자직원번호;
    private String 결재요청자명;
    private String 결재요청제목;
    private String 결재요청내용;
    private String 최종결재처리구분; //처리상태구분
    private String 예약적용여부;
    private String 예약적용일시;

}
