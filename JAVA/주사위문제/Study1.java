package java12_start;

import java.util.Scanner;

public class Study1 
{
	public static void main(String[] args) 
	{
		Dice d = new Dice();
		d.start();
	}
}
class Dice extends Thread
{
	Scanner sc = new Scanner(System.in);
	int i; //회차
	public void run()
	{
		System.out.print("내 숫자 정하기:"); int my = sc.nextInt(); //내 주사위
		System.out.println("\n시작!!!\n");
		while(true)
		{
			try
			{
				sleep(1000);
				int dice = (int)(Math.random()*6+1); //컴터 주사위
				System.out.println(i+1+"회 시도!!컴퓨터수:"+dice); i++;
				if(my == dice)
				{
					System.out.println("\n당첨!\n"); break;
				}
				else
				{
					System.out.println("\n탈락!!\n");
				}
			}
			catch(InterruptedException ie)
			{
					
			}
		}
	}
}

//System.out.println("0.0 ~ 1.0 사이의 난수 1개 발생 : " + Math.random());
//System.out.println("0 ~ 10 사이의 난수 1개 발생 : " + (int)((Math.random()*10000)%10));
//System.out.println("0 ~ 100 사이의 난수 1개 발생 : " + (int)(Math.random()*100));