package java2_start;

import java.util.Scanner;

public class study10 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//ex
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = sc.next();
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();
		System.out.print("Ű�� �Է��ϼ��� : ");
		double height = sc.nextDouble();
		System.out.println("�̸��� : " + name);
		System.out.println("���̴� : " + age + "��");
		System.out.println("Ű�� : " + height + "cm");
	}
}