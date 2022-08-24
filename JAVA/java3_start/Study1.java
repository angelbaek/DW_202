package java3_start;
import java.util.Scanner;
public class Study1 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name=""; //이름
		int age=0; //나이
		double height=0, weight=0; //키,몸무게
		System.out.print("이름:"); name = sc.next();
		System.out.print("키:"); height = sc.nextDouble();
		System.out.print("몸무게:"); weight = sc.nextDouble();
		System.out.print("나이:"); age = sc.nextInt();
		//조건부
		if(age>19 && age<31 && height>=180 && height <191 && weight>=70 && weight<81)
			{	System.out.println("당신은 훈남입니다!!"); }
		else if(age>30 && age<39 && height>=175 && height <186 && weight>=75 && weight<90)
			{	System.out.println("당신은 꽃중년입니다!!"); }
		else
			{	System.out.println("당신은 루저입니다!!"); }
	}
}