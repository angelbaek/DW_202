package java2_start;
import java.util.Scanner;
public class study21 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name;
		System.out.print("이름을 입력하세요:"); name = sc.next();
		switch(name)
		{
			case "홍길동" : System.out.println("동에번쩍 서에번쩍 옛날사람!"); break;
			case "에스파" : System.out.println("와우~! 요새 예쁜 아이돌!!"); break;
			case "이병헌" : System.out.println("로맨틱 성공적! 이걸 연기로! 격파!"); break;
			case "마동석" : System.out.println("행님 존경합니다!"); break;
			default : System.out.println("조건이없음");
		}
	}
}