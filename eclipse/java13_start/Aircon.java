package java13_start;
import java.util.Scanner;
public class Aircon 
{
	public static void main(String[] args) 
	{
		Air air = new Air();
		air.start();
	}
}
class Air extends Thread
{
	Scanner sc = new Scanner(System.in);
	int nowTp=30; //현재온도
	int setTp=25; //설정온도
	public void run()
	{
		while(true)
		{
			System.out.println("\n[현재온도:"+nowTp+"도"+"/설정온도:"+setTp+"도]\n");
			System.out.println("1.에어컨 가동");
			System.out.println("2.온도설정");
			System.out.println("3.종료");
			System.out.print("선택:"); int select = sc.nextInt();
			if(select == 1)
			{
				System.out.println("\n에어컨이 가동됩니다.\n");
				while(true)
				{
					int a = (int)(Math.random()*2); nowTp -= a; //온도누적값
					System.out.println("[현재온도:"+nowTp+"도/설정온도:"+setTp+"도]");
					try {sleep(1000);} 
					catch (InterruptedException e) {e.printStackTrace();}
					if(nowTp==setTp)
					{
						System.out.println("\n설정온도에 도달!"); break;
					}
				}	
			}
			else if(select == 2)
			{
				System.out.println("\n[현재설정온도:"+setTp+"]\n");
				System.out.print("온도변경:"); setTp = sc.nextInt();
			}
			else if(select == 3){System.out.println("\n-프로그램 종료-\n");break;}
		}	
	}
}