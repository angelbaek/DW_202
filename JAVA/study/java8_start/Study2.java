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
		System.out.print("\n1.����:"); kor = sc.nextInt();
		System.out.print("2.����:"); eng = sc.nextInt();
		System.out.print("3.����:"); mat = sc.nextInt();
		tot=kor+eng+mat; avg=tot/3;
	}
	void output()
	{
		System.out.println("\n����:"+kor+" / "+"����:"+eng+" / "+"����:"+mat);
		System.out.println("����:"+tot+" / "+"���:"+avg+"�Դϴ�.");
	}
	
	Score()
	{
		while(true)
		{
			System.out.println("\n1.�����Է�");
			System.out.println("2.�������");
			System.out.println("3.����");
			System.out.print("4.����:"); int select = sc.nextInt();
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
				System.out.println("\n���α׷� ����."); break;
			}
		}
	}	
}
