package java2_start;

import java.util.Scanner;

public class study11 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//ex
		Scanner sc = new Scanner(System.in);
		int kor, eng, mat, tot, avg;
		
		System.out.print("����:"); kor = sc.nextInt();
		System.out.print("����:"); eng = sc.nextInt();
		System.out.print("����:"); mat = sc.nextInt();
		tot = kor + eng + mat;
		avg = tot / 3;
		System.out.print("���� : " + tot + " / " + "��� : " + avg);
	}
}