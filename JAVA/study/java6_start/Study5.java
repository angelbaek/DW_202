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
			System.out.println("1.정보입력");
			System.out.println("2.정보출력");
			System.out.println("3.정보검색");
			System.out.println("4.종료");
			System.out.print("선택:");
			int select = sc.nextInt();
			if(select == 1)
			{
				for(int i=0; i < name.length; i++)
				{	
					for(int k=0; k < name.length; k++)
					{
						System.out.print(i+1+"반"+(1+k)+"번 이름:"); name[i][k]=sc.next();
						System.out.print(i+1+"반"+(1+k)+"번 전번:"); tel[i][k]=sc.next();
						System.out.print(i+1+"반"+(1+k)+"번 주소:"); loc[i][k]=sc.next();
					}
				}
			}
			else if(select == 2)
			{
				for(int i=0; i < name.length; i++)
				{
					for(int k=0; k < name.length; k++)
					{
						System.out.println(i+1+"반"+(k+1)+"번 "+name[i][k]+" / "+tel[i][k]+" / "+loc[i][k]);
					}
				}
			}
			else if(select == 3)
			{
				System.out.print("검색 이름:"); 
				String search = sc.next();
				for(int i=0; i < name.length; i++)
				{
					for(int k=0; k < name.length; k++)
					{
						if(search.equals(name[i][k]))
						{
							System.out.println("name"+"["+i+"]"+"["+k+"]"+"에 위치합니다.");
						}
					}
				}
			}
			else
			{
				System.out.println("프로그램 종료"); break;
			}
		}
	}
}