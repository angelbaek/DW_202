package Round06_Examples;

import java.io.*;

public class Round06_Ex02 {
	public static void main(String[] ar) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int firstsu = 0, secondsu = 0, thirdsu = 0;
		int imsi = 0; // �ӽ÷� ���� ����

		System.out.print("ù��° �� = ");
		firstsu = Integer.parseInt(in.readLine());
		System.out.print("�ι�° �� = ");
		secondsu = Integer.parseInt(in.readLine());
		System.out.print("����° �� = ");
		thirdsu = Integer.parseInt(in.readLine());

		if (secondsu >= firstsu && secondsu >= thirdsu) {
			imsi = firstsu;
			firstsu = secondsu;
			secondsu = imsi;
		} else if (thirdsu >= firstsu && thirdsu >= thirdsu) {
			imsi = firstsu;
			firstsu = thirdsu;
			thirdsu = imsi;
		}

		if (thirdsu >= secondsu) {
			imsi = secondsu;
			secondsu = thirdsu;
			thirdsu = imsi;
		}

		System.out.println();
		System.out.println(firstsu + " >= " + secondsu + " >= " + thirdsu);
	}
}
