package Round06_Examples;

import java.io.*;

public class Round06_Ex03 {
	public static void main(String[] ar) throws IOException {
		System.out.print("�ֹι�ȣ 7��° �ڸ��� �Է��ϼ��� : ");
		int x = System.in.read() - 48; // 7��° �ڸ� �� �Է�
		int year = 0; // ���븦 ������ Field
		String sex = ""; // ������ ������ Field

		switch (x) {
		case 9:
		case 0:
			year = 1800;
			break;
		case 1:
		case 2:
			year = 1900;
			break;
		case 3:
		case 4:
			year = 2000;
			break;
		default:
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			System.exit(-1); // ���α׷� ����
		}

		sex = x % 2 == 0 ? "����" : "����";

		System.out.print("����� " + year + "���� ");
		System.out.println(sex + "�̽ʴϴ�.");
	}
}
