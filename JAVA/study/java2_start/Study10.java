package java2_start;

import java.util.Scanner;

public class study10 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//ex
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.next();
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		System.out.print("키를 입력하세요 : ");
		double height = sc.nextDouble();
		System.out.println("이름은 : " + name);
		System.out.println("나이는 : " + age + "세");
		System.out.println("키는 : " + height + "cm");
	}
}