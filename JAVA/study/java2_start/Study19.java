package java2_start;
import java.util.Scanner;
public class study19 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String score;
		System.out.print("������ �Է��Ͻÿ� : "); score = sc.next();
		switch(score)
		{
			case "A" : System.out.println("90��~100���Դϴ�.");break;
			case "B" : System.out.println("80��~90���Դϴ�.");break;
			case "C" : System.out.println("70��~80���Դϴ�.");break;
			default : System.out.println("70�� �̸��Դϴ�.");
		}
	}
}
