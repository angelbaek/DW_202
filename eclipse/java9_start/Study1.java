package java9_start;
import java.util.Scanner;
public class Study1 
{
	public static void main(String[] args) 
	{
		Calc c = new Calc();
	}

}
class Calc
{
	Scanner sc = new Scanner(System.in);
	int a,b,result; // ù ��°, �� ��°, �����
	String c; // ������(+,-,*,/)
	void add(int a, int b) //����
	{
		result = a+b;
		System.out.println("�����:"+result);
	}
	void min(int a, int b) //����
	{	
		result = a-b;
		System.out.println("�����:"+result);
	}
	void mul(int a, int b) //����
	{	
		result = a*b;
		System.out.println("�����:"+result);
	}
	void div(int a, int b) //������
	{	
		result = a/b;
		System.out.println("�����:"+result);
	}
	Calc()
	{	
		while(true)
		{
			System.out.println("1.����ϱ�");
			System.out.println("2.����");
			System.out.print("����:"); int select = sc.nextInt();
			
			if(select == 1)
			{
				System.out.print("ù ��° ��:"); a = sc.nextInt();
				System.out.print("�� ��° ��:"); b = sc.nextInt();
				System.out.print("������:(+,-,*,/):"); c = sc.next();
				if(c.equals("+"))
				{
					add(a,b);
				}
				else if(c.equals("-"))
				{
					min(a,b);
				}
				else if(c.equals("*"))
				{
					mul(a,b);
				}
				else if(c.equals("/"))
				{
					div(a,b);
				}
			}
			if(select == 2)
			{
				System.out.println("���α׷� ����."); break;
			}
		}
	}
}