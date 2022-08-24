package java10_start;

import java.util.Scanner;

public class Study1 {

	public static void main(String[] args) {
		Account ac = new Account();

	}

}
class Account
{
	Scanner sc = new Scanner(System.in);
	int p=100; // 총 계좌
	String acount[] = new String[p]; // 계좌번호
	String pw[] = new String[p]; // 비번
	String name[] = new String[p]; // 이름
	int won[] = new int[p];  // 잔액
	int i=0; //카운트
	
	void create()
	{
		System.out.print("\n이름:"); name[i] = sc.next();
		System.out.print("계좌번호:"); acount[i] = sc.next();
		System.out.print("비밀번호:"); pw[i] = sc.next();
		System.out.println("\n계좌가 생성되었습니다"); i++;
	}
	
	void search()
	{
		System.out.print("조회하실 계좌번호를 입력하세요:"); String acc = sc.next();
		for(int c=0; c<i; c++)
		{
			if(acc.equals(acount[c]))
			{
				System.out.print("비밀번호를 입력하세요:"); String pww = sc.next();
				if(pww.equals(pw[c]))
				{
					System.out.print("\n조회 하신 계좌의 잔액은:"+won[c]+"원 입니다.\n"); break;
				}
			}
		}
	}
	
	void input()
	{
		System.out.print("입금하실 계좌번호를 입력하세요:"); String ac = sc.next();
		for(int d=0; d<i; d++)
		{
			if(ac.equals(acount[d]))
			{
				System.out.print("입금하실 금액을 입력하세요:"); int iw = sc.nextInt(); won[d] = won[d]+iw;
				System.out.print("\n"+iw+"원 입금 완료\n"); break;
			}
		}
	}
	
	void output()
	{
		System.out.print("출금하실 계좌번호를 입력하세요:"); String ac = sc.next();
		for(int e=0; e<i; e++)
		{	
			if(ac.equals(acount[e]))
			{
				System.out.print("비밀번호를 입력하세요:"); String inpw = sc.next();
				if(inpw.equals(pw[e]))
				{
					System.out.print("출금하실 금액을 입력하세요:"); int ow = sc.nextInt(); won[e] = won[e]-ow;
					System.out.print("\n"+ow+"원 출금 완료\n"); break;
				}
			}
		}		
	}
	
	Account()
	{
		while(true)
		{
			System.out.println("\n1.계좌생성");
			System.out.println("2.계좌조회");
			System.out.println("3.입금하기");
			System.out.println("4.출금하기");
			System.out.println("5.프로그램 종료\n");
			System.out.print("선택:"); int select = sc.nextInt();
			if(select == 1)
			{
				create();
			}
			else if(select == 2)
			{
				search();
			}
			else if(select == 3)
			{
				input();
			}
			else if(select == 4)
			{
				output();
			}
			else if(select == 5)
			{
				System.out.println("\n프로그램 종료\n"); break;
			}
			else
			{
				System.out.println("\n'1~5'만 입력하세요.");
			}
		}
	}
}