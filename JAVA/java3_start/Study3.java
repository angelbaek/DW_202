package java3_start;
import java.util.Scanner;
public class Study3 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("원하는 단을 입력하시오:"); int a = sc.nextInt(); 
			for(int b=1 ; b < 10 ; b++)
			{
				System.out.println(a+"X"+b+"="+a*b); //구구단
			}
	}
}