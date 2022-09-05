package java10_start;
import java.util.Scanner;
public class Study3 
{
	public static void main(String[] args) 
	{
		Aclass a = new Aclass();
		Bclass b = new Bclass();
	}
}
class Aclass
{
	Scanner sc = new Scanner(System.in);
	int person=30;
	String[] name = new String[person];
	int[] kor = new int[person];
	int[] eng = new int[person];
	int[] mat = new int[person];
	int[] soc = new int[person];
	int[] sci = new int[person];
	int[] tot = new int[person];
	int[] avg = new int[person];
	int ct;
	Aclass()
	{
		while(true)
		{
			System.out.println("\n1.점수입력");
			System.out.println("2.점수출력");
			System.out.println("3.종료");
			System.out.print("선택:"); int cho = sc.nextInt();
			if(cho == 1)
			{
				input();
			}
			else if(cho == 2)
			{
				output();
			}
			else if(cho == 3)
			{
				System.out.println("\n프로그램 종료.\n"); break;
			}
		}
	}
	void input()
	{
		System.out.print("\n이름:"); name[ct] = sc.next();
		System.out.print("국어:"); kor[ct] = sc.nextInt();
		System.out.print("영어:"); eng[ct] = sc.nextInt();
		System.out.print("수학:"); mat[ct] = sc.nextInt();
		System.out.print("사회:"); soc[ct] = sc.nextInt();
		System.out.print("과학:"); sci[ct] = sc.nextInt(); 
		tot[ct] = kor[ct]+eng[ct]+mat[ct]+soc[ct]+sci[ct];
		avg[ct] = tot[ct]/5;
		ct++;
	}
	void output()
	{
		for(int i=0; i<ct; i++)
		{
			System.out.println("\n"+(i+1)+"번 학생 이름:"+name[i]);
			System.out.println("국어:"+kor[i]+"점");
			System.out.println("영어:"+eng[i]+"점");
			System.out.println("수학:"+mat[i]+"점");
			System.out.println("사회:"+soc[i]+"점");
			System.out.println("과학:"+sci[i]+"점");
			System.out.println("총점:"+tot[i]+"점"+"  / 평균:"+avg[i]+"점");
		}
	}
}
class Bclass
{
	Scanner sc = new Scanner(System.in);
	int person=30;
	String[] name = new String[person];
	int[] kor = new int[person];
	int[] eng = new int[person];
	int[] mat = new int[person];
	int[] soc = new int[person];
	int[] sci = new int[person];
	int[] mus = new int[person];
	int[] pai = new int[person];
	int[] tot = new int[person];
	int[] avg = new int[person];
	int ct;
	Bclass()
	{
		while(true)
		{
			System.out.println("\n1.점수입력");
			System.out.println("2.점수출력");
			System.out.println("3.종료");
			System.out.print("선택:"); int cho = sc.nextInt();
			if(cho == 1)
			{
				input();
			}
			else if(cho == 2)
			{
				output();
			}
			else if(cho == 3)
			{
				System.out.println("\n프로그램 종료.\n"); break;
			}
		}
	}
	void input()
	{
		System.out.print("\n이름:"); name[ct] = sc.next();
		System.out.print("국어:"); kor[ct] = sc.nextInt();
		System.out.print("영어:"); eng[ct] = sc.nextInt();
		System.out.print("수학:"); mat[ct] = sc.nextInt();
		System.out.print("사회:"); soc[ct] = sc.nextInt();
		System.out.print("과학:"); sci[ct] = sc.nextInt();
		System.out.print("음악:"); mus[ct] = sc.nextInt(); 
		System.out.print("미술:"); pai[ct] = sc.nextInt(); 
		tot[ct] = kor[ct]+eng[ct]+mat[ct]+soc[ct]+sci[ct]+mus[ct]+pai[ct];
		avg[ct] = tot[ct]/7;
		ct++;
	}
	void output()
	{
		for(int i=0; i<ct; i++)
		{
			System.out.println("\n"+(i+1)+"번 학생 이름:"+name[i]);
			System.out.println("국어:"+kor[i]+"점");
			System.out.println("영어:"+eng[i]+"점");
			System.out.println("수학:"+mat[i]+"점");
			System.out.println("사회:"+soc[i]+"점");
			System.out.println("과학:"+sci[i]+"점");
			System.out.println("음악:"+mus[i]+"점");
			System.out.println("미술:"+pai[i]+"점");
			System.out.println("총점:"+tot[i]+"점"+"  / 평균:"+avg[i]+"점");
		}
	}
}