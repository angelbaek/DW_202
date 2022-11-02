package com.dw.emp.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.dw.emp.vo.EmpVO;

// Mapper == DAO (Data Access Object)
@Mapper
public interface EmpMapper {
	
	// 부서번호로 조회
	public List<EmpVO> selectEmpByDeptno(int deptno);
	
	// 급여 인상
	public int updateCommByDeptno(int deptno);
	
	// 사원 삭제
	public int deleteEmp(int empno);
	
	// 통계 쿼리 조회
	public Map<String, Object> selectEmpStatistics();
	
	// 사원 추가
	public int insertEmp(EmpVO vo);
	
	// 전체사원 조회(join)
	public List<Map<String, Object>> selectAllEmp();
	
	// 특정사원 조회
	public EmpVO selectEmpByEmpno(int empno);
	
	// 특정사원 수정
	public int updateEmp(EmpVO vo);
	
	// 회원탈퇴
	public int updateIsUse(int empno);
	
	// 이미 가입된 사원인지 체크
	public int selectCountByEmpno(int empno);

}