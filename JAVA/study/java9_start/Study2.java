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
	int i=0; //카운트
	void input()
	{
		System.out.print("이름을 입력하세요:"); 		name[i] = sc.next();
		System.out.print("전화번호를 입력하세요:");	tel[i] = sc.next();
		System.out.print("지역을 입력하세요:"); 		loc[i] = sc.next();
		System.out.print("성별을 입력하세요:"); 		sex[i] = sc.next();
		System.out.print("나이를 입력하세요:");	 	age[i] = sc.next(); 
		i++;
	}
	void output()
	{
		for(int k=0; k<i; k++)
		{
			System.out.println(k+1+"번 이름:"+name[k]+k+1+"번 전화번호:"+tel[k]+k+1+"번 지역:"+loc[k]+k+1+"번 성별:"+sex[k]+k+1+"번 나이:"+age[k]);
		}
	}
	Friends()
	{	
		while(true)
		{
			System.out.println("1.친구추가");
			System.out.println("2.친구전체보기");
			System.out.println("3.종료");
			System.out.print("선택:"); int select = sc.nextInt();
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
				System.out.println("프로그램 종료."); break;
			}
		}
	}
}