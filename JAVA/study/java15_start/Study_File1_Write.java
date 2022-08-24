package java15_start;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
 
public class Study_File1_Write {
    public static void main(String[] args){
        try{
            //파일 객체 생성
            File file = new File("C:\\aaa\\work\\data.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            
                String name = "홍길동";
                int age = 22;
                //쓰기
                bufferedWriter.write("이름:"+name + "/ 나이:"+age);
                //개행문자쓰기
                bufferedWriter.newLine();
                bufferedWriter.write("문자열 추가2");
                
                bufferedWriter.close();
           
        }catch (IOException e) {
            System.out.println(e);
        }
    }
}
