package com.dw.emp.vo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LogsVO {
	
	private int logId; // 로그 고유번호
	private String ip; // 접속 아이피
	private String url; // 접속 경로
	private String httpMethod; // http 메소드
	private String createAt; // 접속 날짜
}
