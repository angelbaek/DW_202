package Round07_Examples;

import java.io.*;

public class Round07_Ex02 {
	public static int aaa() throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("ù��° �� = ");
		int a = Integer.parseInt(in.readLine());
		System.out.print("�ι�° �� = ");
		int b = Integer.parseInt(in.readLine());
		if (a > b) {
			return a;
		}
		return b;
	}

	public static void bbb() throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("ù��° �� = ");
		int a = Integer.parseInt(in.readLine());
		System.out.print("�ι�° �� = ");
		int b = Integer.parseInt(in.readLine());
		int tot = 0;
		if (a > b) {
			int imsi = a;
			a = b;
			b = imsi;
		}
		for (int i = a; i <= b; i++) {
			tot += i;
		}
		System.out.println(a + " ~ " + b + "������ �� = " + tot);
		return;
	}

	public static String ccc(int x, int y, int z) {
		if (y >= x && y >= z) {
			int imsi = x;
			x = y;
			y = imsi;
		} else if (z >= x && z >= y) {
			int imsi = x;
			x = z;
			z = imsi;
		}
		if (z >= y) {
			int imsi = y;
			y = z;
			z = imsi;
		}
		String abc = x + " >= " + y + " >= " + z;
		return abc;
	}

	public static void main(String[] ar) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int x = 0;
		while (true) {
			System.out.print("1:�ִ�� 2:������ 3:������ 4:���� => ");
			x = Integer.parseInt(in.readLine());
			if (x == 1) { // ����� return ���� ����� ����
				int k = aaa();
				System.out.println("�� �� �ִ���� " + k + "�Դϴ�.");
			} else if (x == 2) { // Call By Name
				bbb();
			} else if (x == 3) { // Call By Value
				System.out.print("ù��° �� = ");
				int firstSu = Integer.parseInt(in.readLine());
				System.out.print("�ι�° �� = ");
				int secondSu = Integer.parseInt(in.readLine());
				System.out.print("����° �� = ");
				int thirdSu = Integer.parseInt(in.readLine());
				String str = ccc(firstSu, secondSu, thirdSu);
				System.out.println("ū ������ ������ " + str);
			} else if (x == 4) {
				break;
			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
			System.out.println();
		}
		System.out.println("���� �ϼ̽��ϴ�.");
	}
}
