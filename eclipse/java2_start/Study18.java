package java2_start;
import java.util.Scanner;
public class study18 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int kor, eng, mat, tot, avg;
		System.out.print("����:"); kor = sc.nextInt();
		System.out.print("����:"); eng = sc.nextInt();
		System.out.print("����:"); mat = sc.nextInt();
		tot = kor + eng + mat;
		avg = tot / 3;
		if(avg < 101 && avg >= 90) {	System.out.print("�����߾��!!");}
		else if(avg < 90 && avg >= 80) {	System.out.print("����մϴ�!!");}
		else {	System.out.print("��������!!");}
	}		
}