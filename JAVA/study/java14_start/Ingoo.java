package java14_start;

import java.util.Scanner;

public class Ingoo 
{
	public static void main(String[] args) 
	{
		Daejeon d = new Daejeon();
	}
}
class Daejeon
{
	Scanner sc = new Scanner(System.in);
	int seo, jung, dong, you, dae, tot;
	Daejeon()
	{
		System.out.println("\n<�����α��������α׷�>\n");
		while(true)
		{
			System.out.println("1.�α��Է�");
			System.out.println("2.�α�����");
			System.out.println("3.����");
			System.out.print("����:"); int sel = sc.nextInt();
			if(sel == 1)
			{
				System.out.print("\n����(����:��):"); seo = sc.nextInt();
				System.out.print("�߱�(����:��):"); jung = sc.nextInt();
				System.out.print("����(����:��):"); dong = sc.nextInt();
				System.out.print("������(����:��):"); you = sc.nextInt();
				System.out.print("�����(����:��):"); dae = sc.nextInt();
				tot=seo+jung+dong+you+dae;
			}
			if(sel == 2)
			{
				System.out.println("\n�������α� :"+tot+"����");
				System.out.println("����"+seo+"��/"+"�߱�"+jung+"��/"+"����"+dong+"��/"+"������"+you+"��/"+"�����"+dae+"��");
			}
			if(sel == 3)
			{
				break;
			}
		}
	}
}