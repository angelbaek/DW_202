package java2_start;
import java.util.Scanner;
public class study21 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name;
		System.out.print("�̸��� �Է��ϼ���:"); name = sc.next();
		switch(name)
		{
			case "ȫ�浿" : System.out.println("������½ ������½ �������!"); break;
			case "������" : System.out.println("�Ϳ�~! ��� ���� ���̵�!!"); break;
			case "�̺���" : System.out.println("�θ�ƽ ������! �̰� �����! ����!"); break;
			case "������" : System.out.println("��� �����մϴ�!"); break;
			default : System.out.println("�����̾���");
		}
	}
}