package java2_start;

import java.util.Scanner;

public class study15 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int grade;
		System.out.print("���л��г��� �Է��ϼ���: ");
		grade = sc.nextInt();
		if(grade == 1)   { System.out.print("����� 1�г��Դϴ�.");}
		else if(grade == 2)   { System.out.print("����� 2�г��Դϴ�.");}
		else if(grade == 3)   { System.out.print("����� 3�г��Դϴ�.");}
		else if(grade == 4)   { System.out.print("����� 4�г��Դϴ�.");}
		else { System.out.print("1~4 ������ ���� �Է��Ͻÿ�.");}
	}
}