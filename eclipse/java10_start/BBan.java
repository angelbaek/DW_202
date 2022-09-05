package java10_start;

import java.util.Scanner;

public class BBan extends Score {
	Scanner sc = new Scanner(System.in);
	int mus, art, tot, avg;	

	BBan()
	{
		System.out.println("<국영수음미 구하기>");
		while(true)
		{
			System.out.println("1.점수입력");
			System.out.println("2.점수출력");
			System.out.println("3.종료");
			System.out.print("선택:"); int sel = sc.nextInt();
			if(sel == 1) 	  {input();}
			else if(sel == 2) {output();}
			else if(sel == 3) {break;}
		}
	}
	void input() {
		super.input();
		System.out.print("음악:"); mus = sc.nextInt();
		System.out.print("미술:"); art = sc.nextInt();
		tot = kor+eng+mat+mus+art;
		avg = tot/5;	
		
	}
	void output() {
		System.out.println("총점:"+tot+" / 평균:"+avg);
	}
}
