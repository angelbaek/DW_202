package java6_start;
import java.util.Scanner;
public class Study5 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name[][] = new String[2][2];
		String tel[][] = new String[2][2];
		String loc[][] = new String[2][2];
		while(true)
		{
			System.out.println("1.�����Է�");
			System.out.println("2.�������");
			System.out.println("3.�����˻�");
			System.out.println("4.����");
			System.out.print("����:");
			int select = sc.nextInt();
			if(select == 1)
			{
				for(int i=0; i < name.length; i++)
				{	
					for(int k=0; k < name.length; k++)
					{
						System.out.print(i+1+"��"+(1+k)+"�� �̸�:"); name[i][k]=sc.next();
						System.out.print(i+1+"��"+(1+k)+"�� ����:"); tel[i][k]=sc.next();
						System.out.print(i+1+"��"+(1+k)+"�� �ּ�:"); loc[i][k]=sc.next();
					}
				}
			}
			else if(select == 2)
			{
				for(int i=0; i < name.length; i++)
				{
					for(int k=0; k < name.length; k++)
					{
						System.out.println(i+1+"��"+(k+1)+"�� "+name[i][k]+" / "+tel[i][k]+" / "+loc[i][k]);
					}
				}
			}
			else if(select == 3)
			{
				System.out.print("�˻� �̸�:"); 
				String search = sc.next();
				for(int i=0; i < name.length; i++)
				{
					for(int k=0; k < name.length; k++)
					{
						if(search.equals(name[i][k]))
						{
							System.out.println("name"+"["+i+"]"+"["+k+"]"+"�� ��ġ�մϴ�.");
						}
					}
				}
			}
			else
			{
				System.out.println("���α׷� ����"); break;
			}
		}
	}
}