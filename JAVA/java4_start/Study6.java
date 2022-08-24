package java4_start;
import java.util.Scanner;
public class Study6 
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
			if(select==1)
			{
				System.out.println("입력기능입니다.");
			}
			else if(select==2)
			{
				System.out.println("출력기능입니다.");
			}
			else
			{
				System.out.print("프로그램 종료"); break;
			}
		}
	}
}