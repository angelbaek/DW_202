package Round07_Examples;

public class Round07_Ex01 {
	public static void X() {
		for (int a = 0; a < 5; a++) {
			System.out.print("*");
		}
		return; // ����� return ���� void �� ��� return ���� ���� ����
	}

	public static void main(String[] ar) {
		X();
		System.out.println("\nHello");
		X();
		System.out.println("\nJava");
		X();
		System.out.println("\n!!!");
		X();
		return; // main���� ������ �� ������ �־�� ������ ���� ��
	}
}
