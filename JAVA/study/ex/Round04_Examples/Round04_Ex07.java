package Round04_Examples;

public class Round04_Ex07 {
	public static void main(String[] ar) throws java.io.IOException {
		System.out.print("�Է�1 = "); // println �ƴ�.
		char aa = (char) System.in.read();
		System.in.read();
		System.in.read();
		System.out.print("�Է�2 = "); // println �ƴ�.
		int bb = System.in.read() - 48; // ���ڸ� �Է��� ��.
		System.out.println("�Էµ� ���ڴ� " + aa + "�Դϴ�.");
		System.out.println("�Էµ� ���ڴ� " + bb + "�Դϴ�.");
	}
}
