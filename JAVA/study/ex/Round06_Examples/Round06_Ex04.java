package Round06_Examples;

import java.io.*;

public class Round06_Ex04 {
	public static void main(String[] ar) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int su1 = 0, su2 = 0, tot = 0;
		char yon = 0;

		System.out.print("ù��° �� = ");
		su1 = Integer.parseInt(in.readLine());
		System.out.print("������(+, -, *, /, %) = ");
		yon = (char) System.in.read();
		System.in.read();
		System.in.read();
		System.out.print("�ι�° �� = ");
		su2 = Integer.parseInt(in.readLine());

		switch (yon) {
		case '+':
			tot = su1 + su2;
			break;
		case '-':
			tot = su1 - su2;
			break;
		case '*':
			tot = su1 * su2;
			break;
		case '/':
			tot = su1 / su2;
			break;
		case '%':
			tot = su1 % su2;
			break;
		default:
			System.out.println("�߸��� ������ �Է�");
			System.exit(-1);
		}

		System.out.println();
		System.out.println(su1 + " " + yon + " " + su2 + " = " + tot);
	}
}
