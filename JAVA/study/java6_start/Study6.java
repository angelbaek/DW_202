package java6_start;
import java.util.Scanner;
public class Study6 
{
	public static void main(String[] args) 
	{ 
		Test t = new Test();
		t.speak();
		System.out.println("�����̸�:"+t.name);
		Study8 t2 = new Study8();
		t2.speak();
		System.out.println("�����̸�:"+t2.name);
	}
}
class Test
{
	String name="�ְ���";
	int age=12;
	void speak() {	System.out.println("���簡 ���Ѵ�.");}
	void study() {	System.out.println("�л��� �����Ѵ�.");}
}