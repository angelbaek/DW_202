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
			System.out.println("1.입력");
			System.out.println("2.출력");
			System.out.println("3.종료");
			System.out.print("선택:");
			select = sc.nextInt();
			String insert;
			if(select==1)
			{
				System.out.print("입력기능입니다:"); insert = sc.next();
				System.out.println("다른 기능을 선택하시겠습니까? 예 or 아니오 :"); String first = sc.next();
				if(first=="예")
				{
					while(true)
					{
						System.out.println("1.입력");
						System.out.println("2.출력");
						System.out.println("3.종료");
						System.out.print("선택:");
						select = sc.nextInt();
						if(select==1)
						{
							System.out.print("입력기능입니다:"); insert = sc.next();
							System.out.println("다른 기능을 선택하시겠습니까? 예 or 아니오 :"); String second = sc.next();
						}
						else if(select==2)
						{
							System.out.println(insert);
						}
						else
						{
							System.out.print("프로그램 종료"); break;
						}
					}
				}
				else if(first=="아니오")
				{
					break;
				}
			}
			else if(select==2)
			{
				System.out.println("출력할게 없습니다");
			}
			else
			{
				System.out.print("프로그램 종료"); break;
			}
		}
	}
}