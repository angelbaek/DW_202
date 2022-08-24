package java5_start;
import java.util.Scanner;
public class Study5 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int age[] = new int[5];
		for(int i=0; i < age.length; i++)
		{
			System.out.print(i+1+"번 학생 나이: ");
			age[i] = sc.nextInt();
		}
		for(int i=0; i < age.length; i++)
		{
			System.out.println(i+1+"번 학생 나이는"+age[i]+"살입니다!");
		}
	}
}