package java15_start;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
 
public class Study_File2_Read {
    public static void main(String[] args){
        try{
            //파일 객체 생성
            File file = new File("C:\\aaa\\work\\data.txt");
            //입력 스트림 생성
            FileReader filereader = new FileReader(file);
            //입력 버퍼 생성
            BufferedReader bufReader = new BufferedReader(filereader);
            String line = "";
            while((line = bufReader.readLine()) != null){
                System.out.println(line);
            }                 
            bufReader.close();
        }catch (FileNotFoundException e) {           
        }catch(IOException e){           
        }
    }
}



