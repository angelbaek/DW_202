package com.dw.emp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dw.emp.mapper.EmpMapper;
import com.dw.emp.vo.EmpVO;
import com.github.pagehelper.PageHelper;

// @Service : 비즈니스 계층 (비즈니스(= 고객 요구사항)을 여기서 구현하겠다.)
// 서비스 == 비즈니스
@Service
public class EmpService {
	
	@Autowired
	private EmpMapper mapper;
	
	public List<EmpVO> getEmpList(int deptno){		
		/* 
		 * 1. 사원들 comm 인상(급여 기준으로) 후 사원조회
		 * 2. 가장 보너스를 많이 받은사람 delete하기
		 * 
		 */ 
		int rows = mapper.updateCommByDeptno(deptno); // update
		if( rows > 0 ) { // 업데이트가 완료된다면
			
			List<EmpVO> list = mapper.selectEmpByDeptno(deptno); // select
			//가장 급여가 높은사람 empno 찾아 내기			
			int sal = 0; // 급여
			List<Integer> empNoList = new ArrayList<Integer>(); // 사원번호가 담길 list
			
			for(EmpVO vo : list) {
				if(sal <= vo.getSal()) {
					sal = vo.getSal();
					empNoList.add(vo.getEmpno()); // 급여 많이 받는 사원 list에 추가
				}
			}
			for(int empno : empNoList) {
				System.out.println("가장 급여를 많이 받는 사원번호 => "+empno);
				System.out.println("위 사원의 급여 => "+sal);
				/*
				 * mapper.deleteEmp(empno); // 사원 삭제
				 */			
				}
			list = mapper.selectEmpByDeptno(deptno); // 삭제후 데이터 재조회
			return list;

		}
		// 조회
		return null; // rows가 0이면 null처리		
	}
	
	// 전체 사원 조회
//	public List<EmpVO> getEmpList(){
//		//필요에 따라 고객 요구사항이 들어오면 여기서 로직을 구현하면 됩니다.
//		return mapper.selectEmp();
//	}
	
	// 통계 쿼리 조회
	public Map<String, Object> getEmpStatistics(){
		return mapper.selectEmpStatistics();
	}
	
	// 사원 등록
	public int setEmp(EmpVO vo) {	
		//이미 가입된 사원번호인지 체크하기
		int empno = vo.getEmpno(); // 1. 사원번호를 불러온다.
		int check = mapper.selectCountByEmpno(empno);
		if (check > 0) { // 만약에 check가 1이면 이미 가입된 사원
			return 0;
		}
		return mapper.insertEmp(vo);
	}
	
	// 전체사원 조회(join)
	public List<Map<String, Object>> getEmpAll(int page){
		int pageSize = 10; // 한 페이지에 보여줄 게시물 수
		PageHelper.startPage(page, pageSize);
		return mapper.selectAllEmp();
	}
	
	// 특정사원 조회
	public EmpVO getEmpByEmpno(int empno) {
		return mapper.selectEmpByEmpno(empno);
	}
	
	// 특정사원 수정
	public int setUpdateEmp(EmpVO vo) {
		return mapper.updateEmp(vo);
	}
	
	// 사원 삭제
	public int deleteEmp(int empno) {
		return mapper.deleteEmp(empno);
	}
	
	// 회원 탈퇴
	public int updateIsUse(int empno) {
		return mapper.updateIsUse(empno);
	}
}