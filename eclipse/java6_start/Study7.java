package java6_start;
import java.util.Scanner;
public class Study7 
{
	public static void main(String[] args) 
	{
		chulsu1();
		chulsu2(10000);
		int boxCount = chulsu3();
		System.out.println("철수가 가져온 택배수:"+boxCount);
		int bbq = chulsu4(20000);
		System.out.println("철수가 가져온 치킨마리수:"+bbq);
	}
	static void chulsu1()
	{
		System.out.println("철수야 놀다와라!!");
	}
	static void chulsu2(int money)
	{
		System.out.println("철수가 받은돈은:"+money);
	}
	static int chulsu3()
	{
		System.out.println("철수야 들어올때 택배 2개만 가져다줘!");
		return 2;
	}
	static int chulsu4(int money)
	{
		System.out.println("철수야"+money+"원 줄테니 치킨1개 사다줘");
		return 1;
	}
}