package Round06_Examples;

import java.io.*;

public class Round06_Ex07 
{
	public static void main(String[] ar) throws IOException 
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int ���� = 0, ���� = 0, ���� = 0, ���� = 0;
		char ���� = 0;
		float ��� = 0.0f;

		do 
		{
			System.out.print("���� = ");
			���� = Integer.parseInt(in.readLine());
		} while (���� < 0 || ���� > 100);

		do 
		{
			System.out.print("���� = ");
			���� = Integer.parseInt(in.readLine());
		} while (���� < 0 || ���� > 100);

		do 
		{
			System.out.print("���� = ");
			���� = Integer.parseInt(in.readLine());
		} while (���� < 0 || ���� > 100);

		���� = ���� + ���� + ����;
		��� = ���� / 3.0f;

		switch ((int) (��� / 10)) {
		case 10:
		case 9:
			���� = 'A';
			break;
		case 8:
			���� = 'B';
			break;
		case 7:
			���� = 'C';
			break;
		case 6:
			���� = 'D';
			break;
		default:
			���� = 'F';
		}

		System.out.println();
		System.out.println("���� = " + ����);
		System.out.printf("��� = %.2f\n", ���);
		System.out.println("���� = " + ���� + "����");
	}
}
