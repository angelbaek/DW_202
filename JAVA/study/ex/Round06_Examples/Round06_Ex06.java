package Round06_Examples;

import java.io.*;

public class Round06_Ex06 {
	public static void main(String[] ar) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int su1 = 0, su2 = 0, n = 0, tot = 0;

		System.out.print("ù��° �� = ");
		su1 = Integer.parseInt(in.readLine());
		System.out.print("�ι�° �� = ");
		su2 = Integer.parseInt(in.readLine());
		System.out.print("��� = ");
		n = Integer.parseInt(in.readLine());

		if (su1 > su2) {
			int imsi = su1;
			su1 = su2;
			su2 = imsi;
		}

		for (int i = su1; i <= su2; i++) {
			if (i % n == 0) {
				tot += i;
			}
		}

		System.out.println();
		System.out.print(su1 + "���� " + su2 + "������ ");
		System.out.println(n + "����� ���� " + tot + "�Դϴ�.");
	}
}
