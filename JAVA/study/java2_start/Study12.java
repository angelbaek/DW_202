package java2_start;

import java.util.Scanner;

public class study12 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int box, pri, inapp, totea, totpri, sell, etotea, etotpri;
		System.out.print("����ڽ��簹��:"); inapp = sc.nextInt();
		System.out.print("����ڽ�����:"); box = sc.nextInt();
		System.out.print("�������:"); pri = sc.nextInt();
		totea = inapp * box;
		totpri = totea * pri;
		System.out.println("�Ѱ���:" + totea + "��" + "/�Ѱ�����:" + totpri + "��");	
		System.out.print("�ǸŵȻ������:"); sell = sc.nextInt();
		etotea = totea - sell;
		etotpri = totpri - sell * pri;
		System.out.print("��������:" + etotea +"��"+"/�Ǹűݾ�"+ etotpri +"��");
	}
}