package java11_start;
public class Study2 
{
	public static void main(String[] args) 
	{
		AA aa = new AA();
		BB bb = new BB();
		aa.start();
		Thread BB = new Thread(bb);
		BB.start();
	}
}
class AA extends Thread
{
	public void run()
	{
		int count = 1;
		while(true)
		{
			try
			{
				sleep(1000);
				System.out.println(count+"�� �ȳ��ϼ���?");count++;
			}
			catch(InterruptedException ie)
			{
					
			}
		}
	}
}
class BB implements Runnable
{
	public void run()
	{
		while(true)
		{
			try
			{
				Thread.sleep(2000);
				System.out.println("�ڹ� ��ճ���?");
			}
			catch(InterruptedException ie)
			{
				
			}
		}
	}
}