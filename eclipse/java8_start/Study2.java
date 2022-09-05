package java8_start;
import java.util.Scanner;
public class Study2 
{
	public static void main(String[] args) 
	{
		Score s = new Score();
	}
}
class Score
{
	Scanner sc = new Scanner(System.in);
	int kor, eng, mat, tot, avg;
	void input()
	{
		System.out.print("\n1.국어:"); kor = sc.nextInt();
		System.out.print("2.영어:"); eng = sc.nextInt();
		System.out.print("3.수학:"); mat = sc.nextInt();
		tot=kor+eng+mat; avg=tot/3;
	}
	void output()
	{
		System.out.println("\n국어:"+kor+" / "+"영어:"+eng+" / "+"수학:"+mat);
		System.out.println("총점:"+tot+" / "+"평균:"+avg+"입니다.");
	}
	
	Score()
	{
		while(true)
		{
			System.out.println("\n1.점수입력");
			System.out.println("2.점수출력");
			System.out.println("3.종료");
			System.out.print("4.선택:"); int select = sc.nextInt();
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
				System.out.println("\n프로그램 종료."); break;
			}
		}
	}	
}
