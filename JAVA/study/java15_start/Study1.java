package java15_start;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Study1 
{
	public static void main(String[] args) 
	{
		Info in = new Info();
	}
}
class Info
{
	Scanner sc = new Scanner(System.in);
	String name, age, adr, hp;
	Info()
	{
		while(true)
		{
			System.out.println("\n<���� ����� �׽�Ʈ>");
			System.out.println("\n1.�����Է�");
			System.out.println("2.�������");
			System.out.println("3.����");
			System.out.print("����:"); int sel = sc.nextInt();
			if(sel == 1) {input();}
			else if(sel == 2) {output();}
			else if(sel == 3) {System.out.println("\n���α׷� ����.\n"); break;} 
		}
	}
	void input()
	{
		System.out.print("\n�̸�:"); name = sc.next();
		System.out.print("����:"); age = sc.next();
		System.out.print("�ּ�:"); adr = sc.next();
		System.out.print("����ó:"); hp = sc.next();
		 try{
	            File file = new File("C:\\aaa\\work\\file.txt");
	            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file,true));
	            
	                bufferedWriter.write(name+" / "+age+"��"+" / "+adr+" / "+hp);	          
	                bufferedWriter.newLine();      
	                bufferedWriter.close();
	           
	        }catch (IOException e) {System.out.println(e);}
	}
	void output()
	{
		try{
            File file = new File("C:\\aaa\\work\\file.txt");
            FileReader filereader = new FileReader(file);
            BufferedReader bufReader = new BufferedReader(filereader);
            String line = "";
            int num = 1;
            System.out.println("");
            while((line = bufReader.readLine()) != null){System.out.println(num+++"�� "+line);}                 
            bufReader.close();
        }catch (FileNotFoundException e) {}catch(IOException e){}
	}
}