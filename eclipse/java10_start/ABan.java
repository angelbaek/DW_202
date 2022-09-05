package java10_start;

import java.util.Scanner;

public class ABan extends Score {
	Scanner sc = new Scanner(System.in);
	int soc, sie, tot, avg;	

	ABan()
	{
		System.out.println("<국영수사과 구하기>");
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
		System.out.print("사회:"); soc = sc.nextInt();
		System.out.print("과학:"); sie = sc.nextInt();
		tot = kor+eng+mat+soc+sie;
		avg = tot/5;	
		
	}
	void output() {
		System.out.println("총점:"+tot+" / 평균:"+avg);
	}
}
