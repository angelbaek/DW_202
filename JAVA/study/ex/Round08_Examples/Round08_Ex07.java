package Round08_Examples;

import java.io.*;

public class Round08_Ex07 {
	public static void main(String[] ar) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] subname = { "����", "����", "����" };
		int[][] sub = new int[3][subname.length + 2];
		// 0:���� 1:���� 2:���� 3:���� 4:����
		float[] avg = new float[3];

		for (int k = 0; k < sub.length; k++) {
			for (int i = 0; i < sub[k].length - 2; i++) {
				do {
					System.out.print(subname[i] + " = ");
					sub[k][i] = Integer.parseInt(in.readLine());
				} while (sub[k][i] < 0 || sub[k][i] > 100);
				sub[k][sub[k].length - 2] += sub[k][i];
			}
			avg[k] = sub[k][sub[k].length - 2] / (float) (sub[k].length - 2);
			sub[k][sub[k].length - 1] = 1;
		}

		for (int k = 0; k < sub.length; k++) {
			for (int i = 0; i < sub.length; i++) {
				if (sub[k][sub[k].length - 2] < sub[i][sub[i].length - 2]) {
					sub[k][sub[k].length - 1]++;
				}
			}
		}

		for (int k = 0; k < sub.length; k++) {
			System.out.println();
			System.out.println("���� = " + sub[k][sub[k].length - 1] + "��");
			System.out.println("���� = " + sub[k][sub[k].length - 2]);
			System.out.println("��� = " + avg[k]);
		}
	}
}
