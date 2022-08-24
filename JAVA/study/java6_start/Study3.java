package java6_start;
import java.util.Scanner;
public class Study3 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int select; //선택 값
		String name="",loc="", tel="";
		while(true) //무한 반복 루트
		{
			System.out.println("1.정보입력");
			System.out.println("2.정보출력");
			System.out.println("3.정보검색");
			System.out.println("4.종료");
			System.out.print("1~4 선택:");
			select = sc.nextInt();
			if(select == 1) // 1번 선택
			{
				System.out.print("이름:"); 
				name = sc.next(); // 이름 입력
				System.out.print("전번:");
				tel = sc.next(); // 전번 입력
				System.out.print("주소:");
				loc = sc.next(); // 주소 입력
			}
			else if(select == 2) // 2번 선택
			{
				System.out.println(name+"/"+tel+"/"+loc); //1번문항에서 입력한 값 출력
			}
			else if(select == 3) // 3번 선택
			{
				
			}
			else
			{
				System.out.println("프로그램 종료");
				break; //종료
			}
		}
	}
}