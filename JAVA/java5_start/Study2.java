package java5_start;

import java.util.Scanner;

public class Study2 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int kor=0,eng=0,mat=0,tot=0,avg=0;
		while(true)
		{
			System.out.println("1.점수입력");
			System.out.println("2.점수출력");
			System.out.println("3.종료");
			System.out.print("선택:"); int select = sc.nextInt();
			if(select==1)
			{
				System.out.print("국어점수입력:");	kor=sc.nextInt();
				System.out.print("영어점수입력:"); 	eng=sc.nextInt();
				System.out.print("수학점수입력:");	mat=sc.nextInt();
				tot=kor+eng+mat; avg=tot/3;
			}
							
			else if(select==2)
			{	
				System.out.println("총점:"+tot+"/평균:"+avg);
			}
			
			else
			{
				break;
			}
		}
	}
}