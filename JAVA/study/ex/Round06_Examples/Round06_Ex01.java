package Round06_Examples;

import java.io.*;

public class Round06_Ex01 {
	public static void main(String[] ar) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int firstsu = 0, secondsu = 0;

		System.out.print("ù��° �� = ");
		firstsu = Integer.parseInt(in.readLine());

		System.out.print("�ι�° �� = ");
		secondsu = Integer.parseInt(in.readLine());

		if (firstsu > secondsu) {
			System.out.print("ù��° ��(" + firstsu + ")");
			System.out.print("�� �ι�° ��(" + secondsu + ")");
			System.out.println("���� ū �� �Դϴ�.");
		} else {
			System.out.print("ù��° ��(" + firstsu + ")");
			System.out.print("�� �ι�° ��(" + secondsu + ")");
			System.out.println("���� ���� �� �Դϴ�.");
		}
	}
}
