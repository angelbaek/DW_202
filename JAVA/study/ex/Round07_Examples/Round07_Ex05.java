package Round07_Examples;

import java.io.*;

public class Round07_Ex05 {
	public static int getInt(String str) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print(str + " = ");
		int imsi = Integer.parseInt(in.readLine());
		return imsi;
	}

	public static void main(String[] ar) throws IOException {
		int kor = getInt("국어");
		System.out.println("국어 점수는 " + kor + "입니다.");
	}
}
