package java3_start;
import java.util.Scanner;
public class Study1 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name=""; //�̸�
		int age=0; //����
		double height=0, weight=0; //Ű,������
		System.out.print("�̸�:"); name = sc.next();
		System.out.print("Ű:"); height = sc.nextDouble();
		System.out.print("������:"); weight = sc.nextDouble();
		System.out.print("����:"); age = sc.nextInt();
		//���Ǻ�
		if(age>19 && age<31 && height>=180 && height <191 && weight>=70 && weight<81)
			{	System.out.println("����� �Ƴ��Դϴ�!!"); }
		else if(age>30 && age<39 && height>=175 && height <186 && weight>=75 && weight<90)
			{	System.out.println("����� ���߳��Դϴ�!!"); }
		else
			{	System.out.println("����� �����Դϴ�!!"); }
	}
}