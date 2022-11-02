package com.dw.emp.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**conf : 설정 관련된 클래스
  *@Configuration : Spring에게 해당 클래스는 설정하고 관련된 클래스야! 
  */
@Configuration
public class WebConfig implements WebMvcConfigurer{
	
	@Autowired
	private InterCepter interCepter;

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(interCepter); // 우리가 만든 InterCepter 클래스 Spring에 등록
	}
	
	
}
