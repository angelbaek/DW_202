package com.dw.emp.conf;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.dw.emp.mapper.LogsMapper;
import com.dw.emp.vo.LogsVO;

@Component
public class InterCepter implements HandlerInterceptor{

	@Autowired
	private LogsMapper logsMapper;
	
	private final Logger logger = LoggerFactory.getLogger(InterCepter.class);
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		/*
		 * 이제 System.out.println은 그만!
		 * logger를 이용해서 기록을 남기자.
		 * logger를 이용하면 원하는 레벨에 맞게 출력이 가능하다.
		 * 레벨 ? (디버깅 모드, 경고 모드, 출력 모드)
		 * logger.debug("디버그 전용 메시지");
		 * logger.warn("경고 메시지");
		 */
		
		logger.info("================================================================preHandle");
		String requestUrl = request.getRequestURI(); // 접속 URL 호출
		String httpMethod = request.getMethod(); // HTTP 메소드 호출
		String userIp = request.getHeader("X-Forwarded-For");
		
		if(userIp==null) userIp = request.getRemoteAddr();
		
		logger.info("요청 URL : "+requestUrl);
		logger.info("요청 HTTP Method : "+httpMethod);
		logger.info("사용자 IP : "+userIp);
		
		LogsVO logsVO = new LogsVO();
		
		logsVO.setHttpMethod(httpMethod);
		logsVO.setIp(userIp);
		logsVO.setUrl(requestUrl);
		
		logsMapper.insertLogs(logsVO); // 접속 로그 insert!
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {		
		
	}

}
