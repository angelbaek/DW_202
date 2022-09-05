package java2_start;
import java.util.Scanner;
public class study17 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int grade;
		System.out.print("중학생학년을 입력하세요:");
		grade = sc.nextInt();
		switch(grade)
		{
			case 1 : System.out.println("1학년입니다!"); break;
			case 2 : System.out.println("2학년입니다!"); break;
			case 3 : System.out.println("3학년입니다!"); break;
			default : System.out.println("1~3만 입력해주세요!");
		}
	}		
}