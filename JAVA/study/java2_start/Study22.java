package java2_start;
import java.util.Scanner;
public class study22 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a, b; // ù��°, �ι�° ��
		String c; // ������
		System.out.print("ù��°��:"); a = sc.nextInt();
		System.out.print("�ι�°��:"); b = sc.nextInt();
		System.out.print("������(+,-,*,/):"); c = sc.next();
		switch(c)
		{
			case "+" : System.out.println("��� : " + (a + b)); break;
			case "-" : System.out.println("��� : " + (a - b)); break;
			case "*" : System.out.println("��� : " + (a * b)); break;
			case "/" : System.out.println("��� : " + (a / b)); break;
		}
	}
}