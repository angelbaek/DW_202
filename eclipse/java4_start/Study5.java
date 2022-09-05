package java4_start;

import java.util.Scanner;

public class Study5 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int score=0, tot=0;
		for(int a=0; a<5; a++)
		{
			System.out.print(a+1+"번학생점수(1~100):"); 
			score=sc.nextInt();
			tot=tot+score;
		}
		System.out.println("총점수는="+tot);
	}
}