package java6_start;
import java.util.Scanner;
public class Study1 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int kor[] = new int[3];	int eng[] = new int[3];
		int mat[] = new int[3]; int tot[] = new int[3];
		int avg[] = new int[3];
		String name[] = new String[3];
		for(int i=0; i < name.length; i++)
		{
			System.out.print(i+1+"번 학생 이름: ");	name[i] = sc.next();
			System.out.print(i+1+"번 학생 국어: ");	kor[i] = sc.nextInt(); 
			System.out.print(i+1+"번 학생 영어: ");	eng[i] = sc.nextInt(); 
			System.out.print(i+1+"번 학생 수학: ");	mat[i] = sc.nextInt(); 
			tot[i]=kor[i]+eng[i]+mat[i];
			avg[i]=tot[i]/3;
		}
		for(int i=0; i < name.length; i++)
		{
			System.out.println(i+1+"번 "+name[i]+" 총점:"+tot[i]+"/평균:"+avg[i]);
		}
	}
}