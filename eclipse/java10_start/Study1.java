package java10_start;

import java.util.Scanner;

public class Study1 {

	public static void main(String[] args) {
		Account ac = new Account();

	}

}
class Account
{
	Scanner sc = new Scanner(System.in);
	int p=100; // �� ����
	String acount[] = new String[p]; // ���¹�ȣ
	String pw[] = new String[p]; // ���
	String name[] = new String[p]; // �̸�
	int won[] = new int[p];  // �ܾ�
	int i=0; //ī��Ʈ
	
	void create()
	{
		System.out.print("\n�̸�:"); name[i] = sc.next();
		System.out.print("���¹�ȣ:"); acount[i] = sc.next();
		System.out.print("��й�ȣ:"); pw[i] = sc.next();
		System.out.println("\n���°� �����Ǿ����ϴ�"); i++;
	}
	
	void search()
	{
		System.out.print("��ȸ�Ͻ� ���¹�ȣ�� �Է��ϼ���:"); String acc = sc.next();
		for(int c=0; c<i; c++)
		{
			if(acc.equals(acount[c]))
			{
				System.out.print("��й�ȣ�� �Է��ϼ���:"); String pww = sc.next();
				if(pww.equals(pw[c]))
				{
					System.out.print("\n��ȸ �Ͻ� ������ �ܾ���:"+won[c]+"�� �Դϴ�.\n"); break;
				}
			}
		}
	}
	
	void input()
	{
		System.out.print("�Ա��Ͻ� ���¹�ȣ�� �Է��ϼ���:"); String ac = sc.next();
		for(int d=0; d<i; d++)
		{
			if(ac.equals(acount[d]))
			{
				System.out.print("�Ա��Ͻ� �ݾ��� �Է��ϼ���:"); int iw = sc.nextInt(); won[d] = won[d]+iw;
				System.out.print("\n"+iw+"�� �Ա� �Ϸ�\n"); break;
			}
		}
	}
	
	void output()
	{
		System.out.print("����Ͻ� ���¹�ȣ�� �Է��ϼ���:"); String ac = sc.next();
		for(int e=0; e<i; e++)
		{	
			if(ac.equals(acount[e]))
			{
				System.out.print("��й�ȣ�� �Է��ϼ���:"); String inpw = sc.next();
				if(inpw.equals(pw[e]))
				{
					System.out.print("����Ͻ� �ݾ��� �Է��ϼ���:"); int ow = sc.nextInt(); won[e] = won[e]-ow;
					System.out.print("\n"+ow+"�� ��� �Ϸ�\n"); break;
				}
			}
		}		
	}
	
	Account()
	{
		while(true)
		{
			System.out.println("\n1.���»���");
			System.out.println("2.������ȸ");
			System.out.println("3.�Ա��ϱ�");
			System.out.println("4.����ϱ�");
			System.out.println("5.���α׷� ����\n");
			System.out.print("����:"); int select = sc.nextInt();
			if(select == 1)
			{
				create();
			}
			else if(select == 2)
			{
				search();
			}
			else if(select == 3)
			{
				input();
			}
			else if(select == 4)
			{
				output();
			}
			else if(select == 5)
			{
				System.out.println("\n���α׷� ����\n"); break;
			}
			else
			{
				System.out.println("\n'1~5'�� �Է��ϼ���.");
			}
		}
	}
}