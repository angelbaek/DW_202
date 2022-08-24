package java9_start;
import java.util.Scanner;
public class Study1 
{
	public static void main(String[] args) 
	{
		Calc c = new Calc();
	}

}
class Calc
{
	Scanner sc = new Scanner(System.in);
	int a,b,result; // 첫 번째, 두 번째, 결과값
	String c; // 연산자(+,-,*,/)
	void add(int a, int b) //덧셈
	{
		result = a+b;
		System.out.println("결과값:"+result);
	}
	void min(int a, int b) //뺄셈
	{	
		result = a-b;
		System.out.println("결과값:"+result);
	}
	void mul(int a, int b) //곱셈
	{	
		result = a*b;
		System.out.println("결과값:"+result);
	}
	void div(int a, int b) //나눗셈
	{	
		result = a/b;
		System.out.println("결과값:"+result);
	}
	Calc()
	{	
		while(true)
		{
			System.out.println("1.계산하기");
			System.out.println("2.종료");
			System.out.print("선택:"); int select = sc.nextInt();
			
			if(select == 1)
			{
				System.out.print("첫 번째 수:"); a = sc.nextInt();
				System.out.print("두 번째 수:"); b = sc.nextInt();
				System.out.print("연산자:(+,-,*,/):"); c = sc.next();
				if(c.equals("+"))
				{
					add(a,b);
				}
				else if(c.equals("-"))
				{
					min(a,b);
				}
				else if(c.equals("*"))
				{
					mul(a,b);
				}
				else if(c.equals("/"))
				{
					div(a,b);
				}
			}
			if(select == 2)
			{
				System.out.println("프로그램 종료."); break;
			}
		}
	}
}