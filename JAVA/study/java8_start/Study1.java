package java8_start;

public class Study1 {

	public static void main(String[] args) 
	{
		AAA t = new AAA();
		AAA b = new AAA(300,"�ڵ�");
	}

}
class AAA
{
	int gold = 100;
	String name = "ȣ�޴�";
	AAA()
	{
		System.out.println("�̸�:"+name+"	/������:"+gold);
	}
	AAA(int gold, String name)
	{
		this.gold = gold; this.name = name;
		System.out.println("�̸�:"+name+" /������:"+gold);
	}
}
