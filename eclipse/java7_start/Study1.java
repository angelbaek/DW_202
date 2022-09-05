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
			System.out.println("[[[ 선풍기 상태정보  ]]]");
			System.out.println("선풍기명:"+f.name);
			System.out.println("전원:"+f.power+" / "+"회전:"+f.rotate);
			System.out.println("속도:"+f.fanspeed+" / "+"높이:"+f.headControl);
			System.out.println("1.전원켜기");
			System.out.println("2.종료");
			System.out.print("선택:"); int select = sc.nextInt();
			if(select == 1)
			{
				System.out.println("\n선풍기전원이 들어갔습니다!\n");
				f.power = true;
			}
			else if(select == 2)
			{
				System.out.println("프로그램 종료");
			}
			while(f.power)
			{	
				System.out.println("[[[ 선풍기 상태정보  ]]]");
				System.out.println("선풍기명:"+f.name);
				System.out.println("전원:"+f.power+" / "+"회전:"+f.rotate);
				System.out.println("속도:"+f.fanspeed+" / "+"높이:"+f.headControl);
				System.out.println("1.회전설정");
				System.out.println("2.속도조절");
				System.out.println("3.높이조절");
				System.out.println("4.종료");
				System.out.print("선택(1~4):"); int inselect = sc.nextInt();
				if(inselect == 1)
				{
					System.out.println("현재 회전이 꺼져있습니다.");
					System.out.print("선풍기를 회전하시겠습니까?(Y,N):"); String ro = sc.next();
					if(ro.equals("Y")|| ro.equals("y"))
					{
						System.out.println("\n선풍기 회전이 들어갔습니다.\n");
						f.rotate=true;
					}
					else if(ro.equals("n")|| ro.equals("N"))
					{
						System.out.println("\n선풍기 회전이 꺼졌습니다.\n");
						f.rotate=false;
					}
					else
					{
						System.out.println("Y or N만 입력해주세요.");
					}
				}
				else if(inselect == 2)
				{
					System.out.println("현재속도가 꺼짐 입니다.");
					System.out.print("풍속설정(0.꺼짐 1.약풍 2.중풍 3.강풍):"); int spd = sc.nextInt();
					if(spd == 0)
					{
						System.out.println("\n선풍기가 멈춥니다.\n");
						f.fanspeed=0;
					}
					else if(spd == 1)
					{
						System.out.println("\n약풍으로 동작합니다.\n");
						f.fanspeed=1;
					}
					else if(spd == 2)
					{
						System.out.println("\n중풍으로 동작합니다.\n");
						f.fanspeed=2;
					}
					else if(spd == 3)
					{
						System.out.println("\n강풍으로 동작합니다.\n");
						f.fanspeed=3;
					}
					else
					{
						System.out.println("0~3값만 입력해주세요.");
					}
				}
				else if(inselect == 3)
				{
					System.out.println("\n선풍기 머리 방향 조절입니다.\n");
					System.out.print("Y(위로),N(아래로):"); String up = sc.next();
					if(up.equals("Y")||up.equals("y"))
					{
						System.out.println("\n위로 향합니다.\n");
						f.headControl = true;
					}
					else if(up.equals("n")||up.equals("N"))
					{
						System.out.println("\n아래로 향합니다.\n");
						f.headControl = false;
					}
				}
				else if(inselect == 4)
				{
					System.out.println("프로그램 종료");break;
				}
				else
				{
					System.out.println("1~4값만 입력하시오.");
				}
			
		}
	}
}
class Fan
{
	Scanner sc = new Scanner(System.in);
	boolean power = false; //전원
	boolean rotate = false; //회전
	int fanspeed = 0; //0꺼짐 1:약풍 2:중풍 3:강풍
	boolean headControl = false; //위아래
	String name = "토네이도선풍기"; //선풍기명
	
	void power()		{System.out.println("1.전원 선택 (1.on/2.off):");}
	void rotate()		{System.out.println("2.풍향 조절 (1.회전/2.비회전):");}
	void fanspeed()		{System.out.println("3.속도조절 (0.꺼짐 / 1.약풍 / 2.중풍 / 3.강풍):");}
	void headControl()	{System.out.println("4.높낮이조절 (1.위/2.아래):");}
	void name()			{System.out.println("5.선풍기명 변경:");}
}