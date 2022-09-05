package java8_start;

public class Study1 {

	public static void main(String[] args) 
	{
		AAA t = new AAA();
		AAA b = new AAA(300,"자동");
	}

}
class AAA
{
	int gold = 100;
	String name = "호달달";
	AAA()
	{
		System.out.println("이름:"+name+"	/가진돈:"+gold);
	}
	AAA(int gold, String name)
	{
		this.gold = gold; this.name = name;
		System.out.println("이름:"+name+" /가진돈:"+gold);
	}
}
