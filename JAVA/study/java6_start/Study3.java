package java6_start;
import java.util.Scanner;
public class Study3 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int select; //���� ��
		String name="",loc="", tel="";
		while(true) //���� �ݺ� ��Ʈ
		{
			System.out.println("1.�����Է�");
			System.out.println("2.�������");
			System.out.println("3.�����˻�");
			System.out.println("4.����");
			System.out.print("1~4 ����:");
			select = sc.nextInt();
			if(select == 1) // 1�� ����
			{
				System.out.print("�̸�:"); 
				name = sc.next(); // �̸� �Է�
				System.out.print("����:");
				tel = sc.next(); // ���� �Է�
				System.out.print("�ּ�:");
				loc = sc.next(); // �ּ� �Է�
			}
			else if(select == 2) // 2�� ����
			{
				System.out.println(name+"/"+tel+"/"+loc); //1�����׿��� �Է��� �� ���
			}
			else if(select == 3) // 3�� ����
			{
				
			}
			else
			{
				System.out.println("���α׷� ����");
				break; //����
			}
		}
	}
}