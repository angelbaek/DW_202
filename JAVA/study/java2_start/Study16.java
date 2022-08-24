package java2_start;

import java.util.Scanner;

public class study16 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int score;
		System.out.print("1~100점 사이의 수를 입력:");
		score = sc.nextInt();
		if(score < 101 && score >=90) {	System.out.println("90점이상! 100이하");}
		else if(score < 90 && score >= 80) { System.out.println("80점이상 90미만");}
		else if(score < 80 && score >= 70) { System.out.println("70점이상 80미만");}
		else {	System.out.println("70점 미만입니다");}
	}

}
