package java14_start;
import java.util.Scanner;
public class Login 
{
	public static void main(String[] args) 
	{
		Login2 log2 = new Login2();
	}
}
class Login2
{
	Scanner sc = new Scanner(System.in);
	private String id = "admin";
	private String pw = "1004";
	int max = 100; //�ִ� ȸ����
	private String name[] = new String[max];
	private String uspw[] = new String[max];
	private String usid[] = new String[max];
	private String ushp[] = new String[max];
	int count;
 	Login2()
	{
		while(true)
		{
			System.out.println("\n1.�α���");
			System.out.println("2.ȸ������");
			System.out.println("3.����\n");
			System.out.print("����:"); int cho = sc.nextInt();
			if(cho == 1)
			{
				System.out.print("���̵�:"); String inid = sc.next();
				System.out.print("���:"); String inpw = sc.next();
				login(inid,inpw);
			}
			else if(cho == 2)
			{
				System.out.println("\n�ű�ȸ������\n");
				System.out.print("���̵�:"); usid[count] = sc.next();
				System.out.print("���:"); uspw[count] = sc.next();
				System.out.print("�̸�:"); name[count] = sc.next();
				System.out.print("����:"); ushp[count] = sc.next(); count++;
				System.out.println("\n���ԿϷ�");
			}
			else if(cho == 3)
			{
				System.out.println("\n���α׷� ����.");break;
			}
		}
	}
	void login(String id, String pw)
	{
		if(this.id.equals(id))
		{
			if(this.pw.equals(pw))
			{
				System.out.println("\n�����ڷ� �α��� �Ǿ����ϴ�.");
				while(true)
				{
					System.out.println("\n1.ȸ����ü����");
					System.out.println("2.�α׾ƿ�");
					System.out.println("3.����\n");
					System.out.print("����:"); int cho = sc.nextInt();
					if(cho == 1)
					{
						for(int i=0; i<count; i++)
						{
							System.out.println((i+1)+"�� "+usid[i]+" / "+name[i]+" / "+ushp[i]);
						}
					}
					else if(cho == 2)
					{
						System.out.println("\n�α׾ƿ� �Ǿ����ϴ�.");
						break;
					}
					else if(cho == 3)
					{
						System.exit(-1);
					}
				}
			}
		}
		for(int i=0; i<count; i++)
		{
			if(this.usid[i].equals(id))
			{
				if(this.uspw[i].equals(pw))
				{
					while(true)
					{
						System.out.println("\n1�α��� �Ǿ����ϴ�.");
						System.out.println("\n1.��ɾ���");
						System.out.println("2.�α׾ƿ�");
						System.out.println("3.����\n");
						System.out.print("����:"); int cho = sc.nextInt();
						if(cho == 1)
						{
							System.out.println("\n1������ ����� �����ϴ�\n");
						}
						else if(cho == 2)
						{
							System.out.println("\n�α׾ƿ� �Ǿ����ϴ�.");
							break;
						}
						else if(cho == 3)
						{
							System.exit(-1);
						}
					}
				}
			}
		}
	}
}