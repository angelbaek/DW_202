package java2_start;
import java.util.Scanner;
public class study19 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String score;
		System.out.print("학점을 입력하시오 : "); score = sc.next();
		switch(score)
		{
			case "A" : System.out.println("90점~100점입니다.");break;
			case "B" : System.out.println("80점~90점입니다.");break;
			case "C" : System.out.println("70점~80점입니다.");break;
			default : System.out.println("70점 미만입니다.");
		}
	}
}
