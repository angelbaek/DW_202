package com.dw.emp.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dw.emp.service.LogsService;
import com.dw.emp.vo.LogsVO;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("api/v1")
@CrossOrigin
public class LogsController {

	@Autowired
	LogsService logsService;
	
	/*
	 * @GetMapping("logs") public List<LogsVO> callLogs(){ return
	 * logsService.getAllLogs(); }
	 */
	
	/** 로그정보 전체 조회 */
	@GetMapping("logs")
	public PageInfo<Map<String, Object>> callAllEmp(@RequestParam int page){
		
		List<Map<String, Object>> list = logsService.getAllLogs(page);
		int navigatePages = 5; // 한블록에 보여줄 페이지 수( ex 네이버 웹툰은 1블록에 10페이지 )				
		
		return new PageInfo<Map<String, Object>>(list, navigatePages);
	}
	
	/** 로그정보 상세 조회 */
	@GetMapping("logs/{logId}")
	public LogsVO callLogs(@PathVariable int logId) {
		return logsService.getLogs(logId);
	}
}
