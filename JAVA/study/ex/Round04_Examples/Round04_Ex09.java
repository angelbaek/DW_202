package Round04_Examples;

import java.io.*;

public class Round04_Ex09 {
	public static void main(String[] ar) throws java.io.IOException {
		// ���ڿ� �Է��� ���� ���� ����
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String name = ""; // name ������ ����� �ʱ�ȭ
		System.out.print("�̸��� �Է��ϼ��� : "); // println�� �ƴմϴ�.
		name = in.readLine(); // �̸��� �Է� �޴´�ϴ�.
		System.out.println("����� �Է��Ͻ� �̸��� " + name + "�Դϴ�.");
	}
}