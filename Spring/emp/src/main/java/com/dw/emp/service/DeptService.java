package com.dw.emp.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dw.emp.mapper.DeptMapper;
import com.dw.emp.vo.DeptVO;
import com.dw.emp.vo.EmpVO;
import com.github.pagehelper.PageHelper;

@Service
public class DeptService {

	@Autowired
	DeptMapper deptMapper;
	
	// 전체 부서 목록 보여주기
	public List<Map<String, Object>> getDept(int page){
		int pageSize = 10; // 한 페이지에 보여줄 게시물 수
		PageHelper.startPage(page, pageSize);
		return deptMapper.selectDept();
	}
	
	// 부서 등록
	public int insertDept(DeptVO vo) {
		return deptMapper.insertDept(vo);
	}
	
	// 특정부서 조회
	public DeptVO getDeptByDeptno(int deptno) {
		return deptMapper.selectDeptByDeptno(deptno);
	}
	
	// 특정부서 수정
	public int setDeptByDeptno(DeptVO vo) {		
		return deptMapper.updateDept(vo);
	}
	
	// 특정부서 삭제
	public int deleteDept(int deptno) {
		return deptMapper.deleteDept(deptno);
	}
}
