package java7_start;
import java.util.Scanner;
public class Study1 
{
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Fan f = new Fan();
			System.out.println("[[[ ��ǳ�� ��������  ]]]");
			System.out.println("��ǳ���:"+f.name);
			System.out.println("����:"+f.power+" / "+"ȸ��:"+f.rotate);
			System.out.println("�ӵ�:"+f.fanspeed+" / "+"����:"+f.headControl);
			System.out.println("1.�����ѱ�");
			System.out.println("2.����");
			System.out.print("����:"); int select = sc.nextInt();
			if(select == 1)
			{
				System.out.println("\n��ǳ�������� �����ϴ�!\n");
				f.power = true;
			}
			else if(select == 2)
			{
				System.out.println("���α׷� ����");
			}
			while(f.power)
			{	
				System.out.println("[[[ ��ǳ�� ��������  ]]]");
				System.out.println("��ǳ���:"+f.name);
				System.out.println("����:"+f.power+" / "+"ȸ��:"+f.rotate);
				System.out.println("�ӵ�:"+f.fanspeed+" / "+"����:"+f.headControl);
				System.out.println("1.ȸ������");
				System.out.println("2.�ӵ�����");
				System.out.println("3.��������");
				System.out.println("4.����");
				System.out.print("����(1~4):"); int inselect = sc.nextInt();
				if(inselect == 1)
				{
					System.out.println("���� ȸ���� �����ֽ��ϴ�.");
					System.out.print("��ǳ�⸦ ȸ���Ͻðڽ��ϱ�?(Y,N):"); String ro = sc.next();
					if(ro.equals("Y")|| ro.equals("y"))
					{
						System.out.println("\n��ǳ�� ȸ���� �����ϴ�.\n");
						f.rotate=true;
					}
					else if(ro.equals("n")|| ro.equals("N"))
					{
						System.out.println("\n��ǳ�� ȸ���� �������ϴ�.\n");
						f.rotate=false;
					}
					else
					{
						System.out.println("Y or N�� �Է����ּ���.");
					}
				}
				else if(inselect == 2)
				{
					System.out.println("����ӵ��� ���� �Դϴ�.");
					System.out.print("ǳ�Ӽ���(0.���� 1.��ǳ 2.��ǳ 3.��ǳ):"); int spd = sc.nextInt();
					if(spd == 0)
					{
						System.out.println("\n��ǳ�Ⱑ ����ϴ�.\n");
						f.fanspeed=0;
					}
					else if(spd == 1)
					{
						System.out.println("\n��ǳ���� �����մϴ�.\n");
						f.fanspeed=1;
					}
					else if(spd == 2)
					{
						System.out.println("\n��ǳ���� �����մϴ�.\n");
						f.fanspeed=2;
					}
					else if(spd == 3)
					{
						System.out.println("\n��ǳ���� �����մϴ�.\n");
						f.fanspeed=3;
					}
					else
					{
						System.out.println("0~3���� �Է����ּ���.");
					}
				}
				else if(inselect == 3)
				{
					System.out.println("\n��ǳ�� �Ӹ� ���� �����Դϴ�.\n");
					System.out.print("Y(����),N(�Ʒ���):"); String up = sc.next();
					if(up.equals("Y")||up.equals("y"))
					{
						System.out.println("\n���� ���մϴ�.\n");
						f.headControl = true;
					}
					else if(up.equals("n")||up.equals("N"))
					{
						System.out.println("\n�Ʒ��� ���մϴ�.\n");
						f.headControl = false;
					}
				}
				else if(inselect == 4)
				{
					System.out.println("���α׷� ����");break;
				}
				else
				{
					System.out.println("1~4���� �Է��Ͻÿ�.");
				}
			
		}
	}
}
class Fan
{
	Scanner sc = new Scanner(System.in);
	boolean power = false; //����
	boolean rotate = false; //ȸ��
	int fanspeed = 0; //0���� 1:��ǳ 2:��ǳ 3:��ǳ
	boolean headControl = false; //���Ʒ�
	String name = "����̵���ǳ��"; //��ǳ���
	
	void power()		{System.out.println("1.���� ���� (1.on/2.off):");}
	void rotate()		{System.out.println("2.ǳ�� ���� (1.ȸ��/2.��ȸ��):");}
	void fanspeed()		{System.out.println("3.�ӵ����� (0.���� / 1.��ǳ / 2.��ǳ / 3.��ǳ):");}
	void headControl()	{System.out.println("4.���������� (1.��/2.�Ʒ�):");}
	void name()			{System.out.println("5.��ǳ��� ����:");}
}