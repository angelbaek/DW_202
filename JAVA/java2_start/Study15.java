package java2_start;

import java.util.Scanner;

public class study15 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int grade;
		System.out.print("중학생학년을 입력하세요: ");
		grade = sc.nextInt();
		if(grade == 1)   { System.out.print("당신은 1학년입니다.");}
		else if(grade == 2)   { System.out.print("당신은 2학년입니다.");}
		else if(grade == 3)   { System.out.print("당신은 3학년입니다.");}
		else if(grade == 4)   { System.out.print("당신은 4학년입니다.");}
		else { System.out.print("1~4 사이의 값만 입력하시오.");}
	}
}