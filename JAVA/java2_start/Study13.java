package java2_start;

import java.util.Scanner;

public class study13 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int age;
		System.out.print("����� ���̴� : "); age = sc.nextInt();
		if(age >= 18)
		{
			System.out.println("�����Դϴ�!");
		}
		if(age <= 17)
		{
			System.out.println("������ �ƴմϴ�!");
		}
	}
}