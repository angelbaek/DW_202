package com.dw.emp.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.dw.emp.vo.DeptVO;
import com.dw.emp.vo.EmpVO;

@Mapper
public interface DeptMapper {
	
	// 부서 목록 전체조회
	public List<Map<String, Object>> selectDept();
	
	// 부서 추가
	public int insertDept(DeptVO vo);
	
	// 특정부서 조회
	public DeptVO selectDeptByDeptno(int deptno);
	
	// 특정부서 수정
	public int updateDept(DeptVO vo);
	
	// 특정부서 삭제
	public int deleteDept(int deptno);
}
