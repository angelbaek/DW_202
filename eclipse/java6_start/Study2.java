package java6_start;
import java.util.Scanner;
public class Study2 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i=0;
		String name[]=new String[3];
		name[i]="";
		String tel[]=new String[3];
		String loc[]=new String[3];
		String search;
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
				for(i=0; i < name.length; i++)
				{
					System.out.print(i+1+"�� �̸�:"); name[i]=sc.next();
					System.out.print(i+1+"�� ����:"); tel[i]=sc.next();
					System.out.print(i+1+"�� �ּ�:"); loc[i]=sc.next();
				}
			}
			else if(select == 2)
			{
				for(i=0; i < name.length; i++)
				{
					System.out.println(i+1+"�� "+name[i]+" / "+tel[i]+" / "+loc[i]);
				}
			}
			else if(select == 3)
			{
				System.out.print("�˻��̸�:"); 
				search=sc.next();
				for(i=0; i < name.length; i++)
				{
					if(search.equals(name[i]))
					{
						System.out.println(name[i]+" / "+tel[i]+" / "+loc[i]);
					}
				}
			}
			else
			{
				System.out.println("���α׷� ����");	break;
			}
		}
	}
}