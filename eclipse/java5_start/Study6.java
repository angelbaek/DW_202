package java5_start;
import java.util.Scanner;
public class Study6 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int score[] = new int[3];
		int tot[] = new int[3];
		int avg[] = new int[3];
		String name[] = new String[3];
		for(int i=0; i < score.length; i++)
		{
			System.out.print(i+1+"�� �л� �̸�: ");	name[i] = sc.next();
			System.out.print(i+1+"�� �л� ����: ");	score[i] = sc.nextInt(); tot[i]=score[i]+tot[i];
			System.out.print(i+1+"�� �л� ����: ");	score[i] = sc.nextInt(); tot[i]=score[i]+tot[i];
			System.out.print(i+1+"�� �л� ����: ");	score[i] = sc.nextInt(); tot[i]=score[i]+tot[i];
			avg[i]=tot[i]/3;
		}
		for(int i=0; i < score.length; i++)
		{
			System.out.println(i+1+"�� "+name[i]+" ����:"+tot[i]+"/���:"+avg[i]);
		}
	}
}