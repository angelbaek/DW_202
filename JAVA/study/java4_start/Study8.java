package java4_start;
import java.util.Scanner;
public class Study8 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int select;
		while(true)
		{
			System.out.println("1.�Է�");
			System.out.println("2.���");
			System.out.println("3.����");
			System.out.print("����:");
			select = sc.nextInt();
			String insert;
			if(select==1)
			{
				System.out.print("�Է±���Դϴ�:"); insert = sc.next();
				System.out.println("�ٸ� ����� �����Ͻðڽ��ϱ�? �� or �ƴϿ� :"); String first = sc.next();
				if(first=="��")
				{
					while(true)
					{
						System.out.println("1.�Է�");
						System.out.println("2.���");
						System.out.println("3.����");
						System.out.print("����:");
						select = sc.nextInt();
						if(select==1)
						{
							System.out.print("�Է±���Դϴ�:"); insert = sc.next();
							System.out.println("�ٸ� ����� �����Ͻðڽ��ϱ�? �� or �ƴϿ� :"); String second = sc.next();
						}
						else if(select==2)
						{
							System.out.println(insert);
						}
						else
						{
							System.out.print("���α׷� ����"); break;
						}
					}
				}
				else if(first=="�ƴϿ�")
				{
					break;
				}
			}
			else if(select==2)
			{
				System.out.println("����Ұ� �����ϴ�");
			}
			else
			{
				System.out.print("���α׷� ����"); break;
			}
		}
	}
}