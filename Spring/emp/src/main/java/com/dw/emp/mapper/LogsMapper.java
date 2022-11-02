package com.dw.emp.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.dw.emp.vo.LogsVO;

@Mapper
public interface LogsMapper {
	
	public int insertLogs(LogsVO vo); //로그 추가
	
//	public List<LogsVO> selectLogs(); //로그 조회
	
	public List<Map<String, Object>> selectLogs();
	
	public LogsVO selectLogsByLogId(int logId); // 로그 상세정보
}
