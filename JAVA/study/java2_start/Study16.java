package java2_start;

import java.util.Scanner;

public class study16 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int score;
		System.out.print("1~100�� ������ ���� �Է�:");
		score = sc.nextInt();
		if(score < 101 && score >=90) {	System.out.println("90���̻�! 100����");}
		else if(score < 90 && score >= 80) { System.out.println("80���̻� 90�̸�");}
		else if(score < 80 && score >= 70) { System.out.println("70���̻� 80�̸�");}
		else {	System.out.println("70�� �̸��Դϴ�");}
	}

}
