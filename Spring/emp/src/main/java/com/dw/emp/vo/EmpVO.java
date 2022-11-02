package com.dw.emp.vo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

// VO (Value Object) == DTO (Data transfer Object)
// lombok을 이용해서 Getter Setter 설정
@Getter
@Setter
public class EmpVO {

	private int empno; // 사원번호
	private String ename; // 사원이름
	private String job; // 사원직책
	private int mgr; // 사원 사수번호
	private String hiredate; // 입사날짜
	private int sal; // 급여
	private int comm; // 보너스
	private int deptno; // 부서번호	
		
}