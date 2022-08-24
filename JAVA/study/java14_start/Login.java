package java14_start;
import java.util.Scanner;
public class Login 
{
	public static void main(String[] args) 
	{
		Login2 log2 = new Login2();
	}
}
class Login2
{
	Scanner sc = new Scanner(System.in);
	private String id = "admin";
	private String pw = "1004";
	int max = 100; //최대 회원수
	private String name[] = new String[max];
	private String uspw[] = new String[max];
	private String usid[] = new String[max];
	private String ushp[] = new String[max];
	int count;
 	Login2()
	{
		while(true)
		{
			System.out.println("\n1.로그인");
			System.out.println("2.회원가입");
			System.out.println("3.종료\n");
			System.out.print("선택:"); int cho = sc.nextInt();
			if(cho == 1)
			{
				System.out.print("아이디:"); String inid = sc.next();
				System.out.print("비번:"); String inpw = sc.next();
				login(inid,inpw);
			}
			else if(cho == 2)
			{
				System.out.println("\n신규회원가입\n");
				System.out.print("아이디:"); usid[count] = sc.next();
				System.out.print("비번:"); uspw[count] = sc.next();
				System.out.print("이름:"); name[count] = sc.next();
				System.out.print("전번:"); ushp[count] = sc.next(); count++;
				System.out.println("\n가입완료");
			}
			else if(cho == 3)
			{
				System.out.println("\n프로그램 종료.");break;
			}
		}
	}
	void login(String id, String pw)
	{
		if(this.id.equals(id))
		{
			if(this.pw.equals(pw))
			{
				System.out.println("\n관리자로 로그인 되었습니다.");
				while(true)
				{
					System.out.println("\n1.회원전체보기");
					System.out.println("2.로그아웃");
					System.out.println("3.종료\n");
					System.out.print("선택:"); int cho = sc.nextInt();
					if(cho == 1)
					{
						for(int i=0; i<count; i++)
						{
							System.out.println((i+1)+"번 "+usid[i]+" / "+name[i]+" / "+ushp[i]);
						}
					}
					else if(cho == 2)
					{
						System.out.println("\n로그아웃 되었습니다.");
						break;
					}
					else if(cho == 3)
					{
						System.exit(-1);
					}
				}
			}
		}
		for(int i=0; i<count; i++)
		{
			if(this.usid[i].equals(id))
			{
				if(this.uspw[i].equals(pw))
				{
					while(true)
					{
						System.out.println("\n1로그인 되었습니다.");
						System.out.println("\n1.기능없음");
						System.out.println("2.로그아웃");
						System.out.println("3.종료\n");
						System.out.print("선택:"); int cho = sc.nextInt();
						if(cho == 1)
						{
							System.out.println("\n1구현된 기능이 없습니다\n");
						}
						else if(cho == 2)
						{
							System.out.println("\n로그아웃 되었습니다.");
							break;
						}
						else if(cho == 3)
						{
							System.exit(-1);
						}
					}
				}
			}
		}
	}
}