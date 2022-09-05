package java15_start;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
 
public class Study_File_Log {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	boolean start = false; //로그기록을 컨트롤하는 변수
    	 

		while(true)
		{
			System.out.println("1.로그기록 시작");			
			System.out.println("2.종료");
			System.out.print("선택:"); int select = sc.nextInt();
			
			if(select == 1) {				
					try{
			            while(true)
			            {
			            	try {
								Thread.sleep(1000);	
								//현재 시간구하기 초까지...
				            	Date nowDate = new Date();       
				        		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");      
				        		String now = simpleDateFormat.format(nowDate);
							    //파일 객체 생성후 기록
					            File file = new File("C:\\aaa\\work\\log.txt");
					            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true));
					            bufferedWriter.write(now);
					            bufferedWriter.newLine();
					            bufferedWriter.close();
					            
					            System.out.println(now);
				       
							} catch (InterruptedException e) {e.printStackTrace();}  
			            }   
			        }catch (IOException e) {
			            System.out.println(e);
			        }
	            }		
		
			else if(select == 2) {System.out.println("프로그램종료."); break;}
		}
		
		

    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
        try{
            //파일 객체 생성
            File file = new File("C:\\aaa\\work\\data.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            
           System.out.print("이름:");String name = sc.next();
           System.out.print("전번:");String hp = sc.next();
           System.out.print("주소:");String addr = sc.next();
           
           String data = name +"/"+ hp+"/" + addr;
           
                //쓰기
                bufferedWriter.write("ㄴㅇㄹㅇ ㅇㄴㄹㅇㄴ  ㅇㄹㅇㄹㅇㄹ ㅇㄹㅇㄹ");
                //개행문자쓰기
                bufferedWriter.newLine();       
                
                bufferedWriter.close();
            
        }catch (IOException e) {
            System.out.println(e);
        }
    }
}
