package java9_start;
import java.util.Scanner;
public class Study2 
{
	public static void main(String[] args) 
	{
		Friends f = new Friends();
	}
}
class Friends
{
	Scanner sc = new Scanner(System.in);
	String name[] = new String[100];
	String tel[] = new String[100];
	String loc[] = new String[100];
	String sex[] = new String[100];
	String age[] = new String[100];
	int i=0; //ī��Ʈ
	void input()
	{
		System.out.print("�̸��� �Է��ϼ���:"); 		name[i] = sc.next();
		System.out.print("��ȭ��ȣ�� �Է��ϼ���:");	tel[i] = sc.next();
		System.out.print("������ �Է��ϼ���:"); 		loc[i] = sc.next();
		System.out.print("������ �Է��ϼ���:"); 		sex[i] = sc.next();
		System.out.print("���̸� �Է��ϼ���:");	 	age[i] = sc.next(); 
		i++;
	}
	void output()
	{
		for(int k=0; k<i; k++)
		{
			System.out.println(k+1+"�� �̸�:"+name[k]+k+1+"�� ��ȭ��ȣ:"+tel[k]+k+1+"�� ����:"+loc[k]+k+1+"�� ����:"+sex[k]+k+1+"�� ����:"+age[k]);
		}
	}
	Friends()
	{	
		while(true)
		{
			System.out.println("1.ģ���߰�");
			System.out.println("2.ģ����ü����");
			System.out.println("3.����");
			System.out.print("����:"); int select = sc.nextInt();
			if(select == 1)
			{
				input();
			}
			else if(select == 2)
			{
				output();
			}
			else if(select == 3)
			{
				System.out.println("���α׷� ����."); break;
			}
		}
	}
}