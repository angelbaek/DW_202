CREATE TABLE IF NOT EXISTS DEPT (
    DEPTNO DECIMAL(2),
    DNAME VARCHAR(14),
    LOC VARCHAR(13),
    CONSTRAINT PK_DEPT PRIMARY KEY (DEPTNO) 
);

CREATE TABLE IF NOT EXISTS EMP (
    EMPNO DECIMAL(4),
    ENAME VARCHAR(10),
    JOB VARCHAR(9),
    MGR DECIMAL(4),
    HIREDATE DATE,
    SAL DECIMAL(7,2),
    COMM DECIMAL(7,2),
    DEPTNO DECIMAL(2),
    IS_USE tinyint(1) DEFAULT NULL,
    CONSTRAINT PK_EMP PRIMARY KEY (EMPNO),
    CONSTRAINT FK_DEPTNO FOREIGN KEY (DEPTNO) REFERENCES DEPT(DEPTNO)
);

CREATE TABLE IF NOT EXISTS SALGRADE ( 
    GRADE TINYINT,
    LOSAL SMALLINT,
    HISAL SMALLINT 
);

CREATE TABLE IF NOT EXISTS emp_logs(
	log_id bigint(20) AUTO_INCREMENT PRIMARY KEY comment '로그 번호',
	ip varchar(50) comment '사용자 아이피',
	url varchar(100) comment '접속 경로',
	http_method varchar(10) comment 'http method',
	CREATE_at datetime comment '접속 시간'
);