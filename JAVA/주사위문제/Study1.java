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
	int i; //ȸ��
	public void run()
	{
		System.out.print("�� ���� ���ϱ�:"); int my = sc.nextInt(); //�� �ֻ���
		System.out.println("\n����!!!\n");
		while(true)
		{
			try
			{
				sleep(1000);
				int dice = (int)(Math.random()*6+1); //���� �ֻ���
				System.out.println(i+1+"ȸ �õ�!!��ǻ�ͼ�:"+dice); i++;
				if(my == dice)
				{
					System.out.println("\n��÷!\n"); break;
				}
				else
				{
					System.out.println("\nŻ��!!\n");
				}
			}
			catch(InterruptedException ie)
			{
					
			}
		}
	}
}

//System.out.println("0.0 ~ 1.0 ������ ���� 1�� �߻� : " + Math.random());
//System.out.println("0 ~ 10 ������ ���� 1�� �߻� : " + (int)((Math.random()*10000)%10));
//System.out.println("0 ~ 100 ������ ���� 1�� �߻� : " + (int)(Math.random()*100));