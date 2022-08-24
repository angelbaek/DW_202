package java2_start;

import java.util.Scanner;

public class study12 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int box, pri, inapp, totea, totpri, sell, etotea, etotpri;
		System.out.print("사과박스당갯수:"); inapp = sc.nextInt();
		System.out.print("사과박스갯수:"); box = sc.nextInt();
		System.out.print("사과가격:"); pri = sc.nextInt();
		totea = inapp * box;
		totpri = totea * pri;
		System.out.println("총갯수:" + totea + "개" + "/총가격은:" + totpri + "원");	
		System.out.print("판매된사과갯수:"); sell = sc.nextInt();
		etotea = totea - sell;
		etotpri = totpri - sell * pri;
		System.out.print("남은갯수:" + etotea +"개"+"/판매금액"+ etotpri +"원");
	}
}