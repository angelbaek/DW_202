package java5_start;

import java.util.Scanner;

public class Study2 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int kor=0,eng=0,mat=0,tot=0,avg=0;
		while(true)
		{
			System.out.println("1.�����Է�");
			System.out.println("2.�������");
			System.out.println("3.����");
			System.out.print("����:"); int select = sc.nextInt();
			if(select==1)
			{
				System.out.print("���������Է�:");	kor=sc.nextInt();
				System.out.print("���������Է�:"); 	eng=sc.nextInt();
				System.out.print("���������Է�:");	mat=sc.nextInt();
				tot=kor+eng+mat; avg=tot/3;
			}
							
			else if(select==2)
			{	
				System.out.println("����:"+tot+"/���:"+avg);
			}
			
			else
			{
				break;
			}
		}
	}
}