package java2_start;
import java.util.Scanner;
public class study17 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int grade;
		System.out.print("���л��г��� �Է��ϼ���:");
		grade = sc.nextInt();
		switch(grade)
		{
			case 1 : System.out.println("1�г��Դϴ�!"); break;
			case 2 : System.out.println("2�г��Դϴ�!"); break;
			case 3 : System.out.println("3�г��Դϴ�!"); break;
			default : System.out.println("1~3�� �Է����ּ���!");
		}
	}		
}