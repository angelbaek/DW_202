package java10_start;
import java.util.Scanner;
public class Study3 
{
	public static void main(String[] args) 
	{
		Aclass a = new Aclass();
		Bclass b = new Bclass();
	}
}
class Aclass
{
	Scanner sc = new Scanner(System.in);
	int person=30;
	String[] name = new String[person];
	int[] kor = new int[person];
	int[] eng = new int[person];
	int[] mat = new int[person];
	int[] soc = new int[person];
	int[] sci = new int[person];
	int[] tot = new int[person];
	int[] avg = new int[person];
	int ct;
	Aclass()
	{
		while(true)
		{
			System.out.println("\n1.�����Է�");
			System.out.println("2.�������");
			System.out.println("3.����");
			System.out.print("����:"); int cho = sc.nextInt();
			if(cho == 1)
			{
				input();
			}
			else if(cho == 2)
			{
				output();
			}
			else if(cho == 3)
			{
				System.out.println("\n���α׷� ����.\n"); break;
			}
		}
	}
	void input()
	{
		System.out.print("\n�̸�:"); name[ct] = sc.next();
		System.out.print("����:"); kor[ct] = sc.nextInt();
		System.out.print("����:"); eng[ct] = sc.nextInt();
		System.out.print("����:"); mat[ct] = sc.nextInt();
		System.out.print("��ȸ:"); soc[ct] = sc.nextInt();
		System.out.print("����:"); sci[ct] = sc.nextInt(); 
		tot[ct] = kor[ct]+eng[ct]+mat[ct]+soc[ct]+sci[ct];
		avg[ct] = tot[ct]/5;
		ct++;
	}
	void output()
	{
		for(int i=0; i<ct; i++)
		{
			System.out.println("\n"+(i+1)+"�� �л� �̸�:"+name[i]);
			System.out.println("����:"+kor[i]+"��");
			System.out.println("����:"+eng[i]+"��");
			System.out.println("����:"+mat[i]+"��");
			System.out.println("��ȸ:"+soc[i]+"��");
			System.out.println("����:"+sci[i]+"��");
			System.out.println("����:"+tot[i]+"��"+"  / ���:"+avg[i]+"��");
		}
	}
}
class Bclass
{
	Scanner sc = new Scanner(System.in);
	int person=30;
	String[] name = new String[person];
	int[] kor = new int[person];
	int[] eng = new int[person];
	int[] mat = new int[person];
	int[] soc = new int[person];
	int[] sci = new int[person];
	int[] mus = new int[person];
	int[] pai = new int[person];
	int[] tot = new int[person];
	int[] avg = new int[person];
	int ct;
	Bclass()
	{
		while(true)
		{
			System.out.println("\n1.�����Է�");
			System.out.println("2.�������");
			System.out.println("3.����");
			System.out.print("����:"); int cho = sc.nextInt();
			if(cho == 1)
			{
				input();
			}
			else if(cho == 2)
			{
				output();
			}
			else if(cho == 3)
			{
				System.out.println("\n���α׷� ����.\n"); break;
			}
		}
	}
	void input()
	{
		System.out.print("\n�̸�:"); name[ct] = sc.next();
		System.out.print("����:"); kor[ct] = sc.nextInt();
		System.out.print("����:"); eng[ct] = sc.nextInt();
		System.out.print("����:"); mat[ct] = sc.nextInt();
		System.out.print("��ȸ:"); soc[ct] = sc.nextInt();
		System.out.print("����:"); sci[ct] = sc.nextInt();
		System.out.print("����:"); mus[ct] = sc.nextInt(); 
		System.out.print("�̼�:"); pai[ct] = sc.nextInt(); 
		tot[ct] = kor[ct]+eng[ct]+mat[ct]+soc[ct]+sci[ct]+mus[ct]+pai[ct];
		avg[ct] = tot[ct]/7;
		ct++;
	}
	void output()
	{
		for(int i=0; i<ct; i++)
		{
			System.out.println("\n"+(i+1)+"�� �л� �̸�:"+name[i]);
			System.out.println("����:"+kor[i]+"��");
			System.out.println("����:"+eng[i]+"��");
			System.out.println("����:"+mat[i]+"��");
			System.out.println("��ȸ:"+soc[i]+"��");
			System.out.println("����:"+sci[i]+"��");
			System.out.println("����:"+mus[i]+"��");
			System.out.println("�̼�:"+pai[i]+"��");
			System.out.println("����:"+tot[i]+"��"+"  / ���:"+avg[i]+"��");
		}
	}
}