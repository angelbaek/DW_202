package java2_start;
import java.util.Scanner;
public class study22 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a, b; // 첫번째, 두번째 수
		String c; // 연산자
		System.out.print("첫번째수:"); a = sc.nextInt();
		System.out.print("두번째수:"); b = sc.nextInt();
		System.out.print("연산자(+,-,*,/):"); c = sc.next();
		switch(c)
		{
			case "+" : System.out.println("결과 : " + (a + b)); break;
			case "-" : System.out.println("결과 : " + (a - b)); break;
			case "*" : System.out.println("결과 : " + (a * b)); break;
			case "/" : System.out.println("결과 : " + (a / b)); break;
		}
	}
}