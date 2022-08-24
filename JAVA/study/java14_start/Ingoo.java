package java14_start;

import java.util.Scanner;

public class Ingoo 
{
	public static void main(String[] args) 
	{
		Daejeon d = new Daejeon();
	}
}
class Daejeon
{
	Scanner sc = new Scanner(System.in);
	int seo, jung, dong, you, dae, tot;
	Daejeon()
	{
		System.out.println("\n<대전인구조사프로그램>\n");
		while(true)
		{
			System.out.println("1.인구입력");
			System.out.println("2.인구보기");
			System.out.println("3.종료");
			System.out.print("선택:"); int sel = sc.nextInt();
			if(sel == 1)
			{
				System.out.print("\n서구(단위:만):"); seo = sc.nextInt();
				System.out.print("중구(단위:만):"); jung = sc.nextInt();
				System.out.print("동구(단위:만):"); dong = sc.nextInt();
				System.out.print("유성구(단위:만):"); you = sc.nextInt();
				System.out.print("대덕구(단위:만):"); dae = sc.nextInt();
				tot=seo+jung+dong+you+dae;
			}
			if(sel == 2)
			{
				System.out.println("\n대전총인구 :"+tot+"만명");
				System.out.println("서구"+seo+"만/"+"중구"+jung+"만/"+"동구"+dong+"만/"+"유성구"+you+"만/"+"대덕구"+dae+"만");
			}
			if(sel == 3)
			{
				break;
			}
		}
	}
}