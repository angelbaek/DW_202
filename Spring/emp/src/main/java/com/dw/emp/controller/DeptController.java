package com.dw.emp.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dw.emp.service.DeptService;
import com.dw.emp.vo.DeptVO;
import com.dw.emp.vo.EmpVO;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin
public class DeptController {
	
	@Autowired
	DeptService deptService;
	
	// 부서목록 전체 조회
	@GetMapping("dept")
	public PageInfo<Map<String, Object>> callDept(@RequestParam int page){
		List<Map<String, Object>> list = deptService.getDept(page);
		int navigatePages = 5; // 한블록에 보여줄 페이지 수( ex 네이버 웹툰은 1블록에 10페이지 )
		return new PageInfo<Map<String, Object>>(list, navigatePages);
	}
	
	// 사원 등록
	@PostMapping("dept")
	public int callDept(@RequestBody DeptVO vo) {				
		return deptService.insertDept(vo);
	}
	
	// 특정 부서 조회
	@GetMapping("dept/deptno/{deptno}")
	public DeptVO callDeptByDeptno(@PathVariable int deptno) {
		return deptService.getDeptByDeptno(deptno);
	}
	
	// 특정 부서 수정
	@PatchMapping("dept")
	public int callDeptUpdateByDeptno(@RequestBody DeptVO vo) {
		return deptService.setDeptByDeptno(vo);
	}
	
	// 특정 부서 삭제
	@DeleteMapping("dept/{deptno}")
	public int deleteDept(@PathVariable int deptno) {
		return deptService.deleteDept(deptno);
	}

}
