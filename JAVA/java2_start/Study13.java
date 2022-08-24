package java2_start;

import java.util.Scanner;

public class study13 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int age;
		System.out.print("당신의 나이는 : "); age = sc.nextInt();
		if(age >= 18)
		{
			System.out.println("성인입니다!");
		}
		if(age <= 17)
		{
			System.out.println("성인이 아닙니다!");
		}
	}
}