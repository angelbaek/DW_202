package java5_start;

import java.util.Scanner;

public class Study1 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("1.구구단출력");
			System.out.println("2.별표찍기");
			System.out.println("3.종료");
			System.out.print("선택:"); int cho = sc.nextInt();
			if(cho==1)
			{
				for(int a=2; a <10 ; a++)
				{
					for(int b=1 ; b <= a ; b++)
					{
						System.out.println(a+"X"+b+"="+a*b);
					}
					System.out.println();
				}
			}
			else if(cho==2)
			{
				for(int a=0; a <5 ; a++)
				{
					for(int b=5 ; b > a ; b--)
					{
						System.out.print("*");
					}
					System.out.println();
				}
			}
			else
			{
				break;
			}
			
		}
	}
}