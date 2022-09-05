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
		
		System.out.print("±¹¾î:"); kor = sc.nextInt();
		System.out.print("¿µ¾î:"); eng = sc.nextInt();
		System.out.print("¼öÇÐ:"); mat = sc.nextInt();
		tot = kor + eng + mat;
		avg = tot / 3;
		System.out.print("ÃÑÁ¡ : " + tot + " / " + "Æò±Õ : " + avg);
	}
}