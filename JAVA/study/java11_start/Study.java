package java11_start;

public class Study {

	public static void main(String[] args) {
		
		A a = new A();
		B b = new B();
		Thread B = new Thread(b);
		a.start();
		B.start();
	}
}
class A extends Thread
{
	public void run() {
		while(true) 
		{
			for(int i=0; i<999; i++)
			{
			System.out.println(i+1+"�� �ȳ��ϼ���");
			try
			{
				Thread.sleep(1000);
			}catch(InterruptedException ie){}}
			
		}
	}
}
class B implements Runnable
{
	public void run() {
		while(true) {
			System.out.println("�ڹ� ���� ���� ��ճ׿�!");
			try
			{
				Thread.sleep(2000);
			}catch(InterruptedException ie){}
		}
	}
}