package java2_start;
import java.util.Scanner;
public class study18 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int kor, eng, mat, tot, avg;
		System.out.print("국어:"); kor = sc.nextInt();
		System.out.print("영어:"); eng = sc.nextInt();
		System.out.print("수학:"); mat = sc.nextInt();
		tot = kor + eng + mat;
		avg = tot / 3;
		if(avg < 101 && avg >= 90) {	System.out.print("참잘했어요!!");}
		else if(avg < 90 && avg >= 80) {	System.out.print("우수합니다!!");}
		else {	System.out.print("힘내세요!!");}
	}		
}