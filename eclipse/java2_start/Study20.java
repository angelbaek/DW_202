package java2_start;
import java.util.Scanner;
public class study20 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int kor, eng, mat; //±¹¿µ¼ö
		int avg; //Æò±Õ
		System.out.print("±¹¾î:"); kor = sc.nextInt();
		System.out.print("¿µ¾î:"); eng = sc.nextInt();
		System.out.print("¼öÇÐ:"); mat = sc.nextInt();
		avg = (kor + eng + mat)/3;
		if(avg < 101 && avg >= 90) {	System.out.println("ÃÑÁ¡:A");}
		else if(avg < 90 && avg >= 80) {	System.out.println("ÃÑÁ¡:B");}
		else if(avg < 80 && avg >= 70) {	System.out.println("ÃÑÁ¡:C");}
		else {	System.out.println("F");}
				}
	}