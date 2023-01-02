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
	public int getLogId() {
		return logId;
	}
	public void setLogId(int logId) {
		this.logId = logId;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getHttpMethod() {
		return httpMethod;
	}
	public void setHttpMethod(String httpMethod) {
		this.httpMethod = httpMethod;
	}
	public String getCreateAt() {
		return createAt;
	}
	public void setCreateAt(String createAt) {
		this.createAt = createAt;
	}
}
