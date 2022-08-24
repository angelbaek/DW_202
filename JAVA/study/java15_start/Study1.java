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
			System.out.println("\n<파일 입출력 테스트>");
			System.out.println("\n1.정보입력");
			System.out.println("2.정보출력");
			System.out.println("3.종료");
			System.out.print("선택:"); int sel = sc.nextInt();
			if(sel == 1) {input();}
			else if(sel == 2) {output();}
			else if(sel == 3) {System.out.println("\n프로그램 종료.\n"); break;} 
		}
	}
	void input()
	{
		System.out.print("\n이름:"); name = sc.next();
		System.out.print("나이:"); age = sc.next();
		System.out.print("주소:"); adr = sc.next();
		System.out.print("연락처:"); hp = sc.next();
		 try{
	            File file = new File("C:\\aaa\\work\\file.txt");
	            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file,true));
	            
	                bufferedWriter.write(name+" / "+age+"세"+" / "+adr+" / "+hp);	          
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
            while((line = bufReader.readLine()) != null){System.out.println(num+++"번 "+line);}                 
            bufReader.close();
        }catch (FileNotFoundException e) {}catch(IOException e){}
	}
}