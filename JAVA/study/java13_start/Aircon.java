package java13_start;
import java.util.Scanner;
public class Aircon 
{
	public static void main(String[] args) 
	{
		Air air = new Air();
		air.start();
	}
}
class Air extends Thread
{
	Scanner sc = new Scanner(System.in);
	int nowTp=30; //����µ�
	int setTp=25; //�����µ�
	public void run()
	{
		while(true)
		{
			System.out.println("\n[����µ�:"+nowTp+"��"+"/�����µ�:"+setTp+"��]\n");
			System.out.println("1.������ ����");
			System.out.println("2.�µ�����");
			System.out.println("3.����");
			System.out.print("����:"); int select = sc.nextInt();
			if(select == 1)
			{
				System.out.println("\n�������� �����˴ϴ�.\n");
				while(true)
				{
					int a = (int)(Math.random()*2); nowTp -= a; //�µ�������
					System.out.println("[����µ�:"+nowTp+"��/�����µ�:"+setTp+"��]");
					try {sleep(1000);} 
					catch (InterruptedException e) {e.printStackTrace();}
					if(nowTp==setTp)
					{
						System.out.println("\n�����µ��� ����!"); break;
					}
				}	
			}
			else if(select == 2)
			{
				System.out.println("\n[���缳���µ�:"+setTp+"]\n");
				System.out.print("�µ�����:"); setTp = sc.nextInt();
			}
			else if(select == 3){System.out.println("\n-���α׷� ����-\n");break;}
		}	
	}
}