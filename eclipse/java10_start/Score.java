package java10_start;

import java.util.Scanner;

public class Score {
	Scanner sc = new Scanner(System.in);
	int kor,eng, mat;
	
	void input() {
		System.out.print("국어:"); kor = sc.nextInt();
		System.out.print("영어:"); eng = sc.nextInt();
		System.out.print("수학:"); mat = sc.nextInt();		
	}

}
