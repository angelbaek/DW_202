package java12_start;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Study2 
{
	public static void main(String[] args) 
	{
		Kai k = new Kai();
		k.start();
	}
}
class Kai extends Thread
{
	int tot=0, win=0, draw=0, lose=0;	
	Scanner sc = new Scanner(System.in);
	Date nowDate = new Date();
	SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy년 MM월 dd일 HH:mm:ss");
	String strNowDate = simpleDateFormat.format(nowDate);
	public void run()
	{
		while(true)
		{
			System.out.println("\n1.게임시작");
			System.out.println("2.통계보기");
			System.out.println("3.종료");
			System.out.print("선택:"); int sel = sc.nextInt();
			if(sel == 1)
			{
				tot++;
				System.out.print("내 선택(가위,바위,보):"); String my = sc.next();
				int kai = (int)(Math.random()*3);
				if(my.equals("가위"))
				{
					if(kai == 0)
					{
						try 
						{
							System.out.println("3");
							sleep(1000);
							System.out.println("2");
							sleep(1000);
							System.out.println("1");
							sleep(1000);
							System.out.println("나는:"+my+"	/컴퓨터는: 바위");
							System.out.println("\n패배했습니다...\n");lose++;
						} 
						catch (InterruptedException e){e.printStackTrace();}
						try{
				            File file = new File("C:\\aaa\\work\\KBB.txt");
				            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file,true));
				            				            	
				            	bufferedWriter.write(strNowDate);
				            	bufferedWriter.newLine();
				                bufferedWriter.write("내가 낸것:"+my+"/컴퓨터:바위");	          
				                bufferedWriter.newLine();
				                bufferedWriter.write("결과:패배");
				                bufferedWriter.newLine();
				                bufferedWriter.close();
				           
				        }catch (IOException e) {System.out.println(e);}
					}		
					else if(kai == 1)
					{
						try 
						{
							System.out.println("3");
							sleep(1000);
							System.out.println("2");
							sleep(1000);
							System.out.println("1");
							sleep(1000);
							System.out.println("나는:"+my+"	/컴퓨터는: 가위");
							System.out.println("\n비겼습니다.\n");draw++;
						} 
						catch (InterruptedException e){e.printStackTrace();}
						try{
				            File file = new File("C:\\aaa\\work\\KBB.txt");
				            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file,true));
					            bufferedWriter.write(strNowDate);
				            	bufferedWriter.newLine();
				                bufferedWriter.write("내가 낸것:"+my+"/컴퓨터:가위");	          
				                bufferedWriter.newLine();
				                bufferedWriter.write("결과:비김");
				                bufferedWriter.newLine();
				                bufferedWriter.close();
				           
				        }catch (IOException e) {System.out.println(e);}
					}
					else if(kai == 2)
					{
						try 
						{
							System.out.println("3");
							sleep(1000);
							System.out.println("2");
							sleep(1000);
							System.out.println("1");
							sleep(1000);
							System.out.println("나는:"+my+"	/컴퓨터는: 보");
							System.out.println("\n승리했습니다!!!\n");win++;
						} 
						catch (InterruptedException e){e.printStackTrace();}
						try{
				            File file = new File("C:\\aaa\\work\\KBB.txt");
				            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file,true));
					            bufferedWriter.write(strNowDate);
				            	bufferedWriter.newLine();
				                bufferedWriter.write("내가 낸것:"+my+"/컴퓨터:보");	          
				                bufferedWriter.newLine();
				                bufferedWriter.write("결과:승리");
				                bufferedWriter.newLine();
				                bufferedWriter.close();
				           
				        }catch (IOException e) {System.out.println(e);}
					}
				}
				else if(my.equals("바위"))
				{
					if(kai == 0)
					{
						try 
						{
							System.out.println("3");
							sleep(1000);
							System.out.println("2");
							sleep(1000);
							System.out.println("1");
							sleep(1000);
							System.out.println("나는:"+my+"	/컴퓨터는: 바위");
							System.out.println("\n비겼습니다.\n");draw++;
						} 
						catch (InterruptedException e){e.printStackTrace();}
						try{
				            File file = new File("C:\\aaa\\work\\KBB.txt");
				            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file,true));
					            bufferedWriter.write(strNowDate);
				            	bufferedWriter.newLine();
				                bufferedWriter.write("내가 낸것:"+my+"/컴퓨터:바위");	          
				                bufferedWriter.newLine();
				                bufferedWriter.write("결과:비김");
				                bufferedWriter.newLine();
				                bufferedWriter.close();
				           
				        }catch (IOException e) {System.out.println(e);}
					}		
					else if(kai == 1)
					{
						try 
						{
							System.out.println("3");
							sleep(1000);
							System.out.println("2");
							sleep(1000);
							System.out.println("1");
							sleep(1000);
							System.out.println("나는:"+my+"	/컴퓨터는: 가위");
							System.out.println("\n승리했습니다!!!\n");win++;
						} 
						catch (InterruptedException e){e.printStackTrace();}
						try{
				            File file = new File("C:\\aaa\\work\\KBB.txt");
				            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file,true));
					            bufferedWriter.write(strNowDate);
				            	bufferedWriter.newLine();
				                bufferedWriter.write("내가 낸것:"+my+"/컴퓨터:가위");	          
				                bufferedWriter.newLine();
				                bufferedWriter.write("결과:승리");
				                bufferedWriter.newLine();
				                bufferedWriter.close();
				           
				        }catch (IOException e) {System.out.println(e);}
					}
					else if(kai == 2)
					{
						try 
						{
							System.out.println("3");
							sleep(1000);
							System.out.println("2");
							sleep(1000);
							System.out.println("1");
							sleep(1000);
							System.out.println("나는:"+my+"	/컴퓨터는: 보");
							System.out.println("\n패배했습니다..\n");lose++;
						} 
						catch (InterruptedException e){e.printStackTrace();}
						try{
				            File file = new File("C:\\aaa\\work\\KBB.txt");
				            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file,true));
					            bufferedWriter.write(strNowDate);
				            	bufferedWriter.newLine();
				                bufferedWriter.write("내가 낸것:"+my+"/컴퓨터:보");	          
				                bufferedWriter.newLine();
				                bufferedWriter.write("결과:패배");
				                bufferedWriter.newLine();
				                bufferedWriter.close();
				           
				        }catch (IOException e) {System.out.println(e);}
					}
				}
				else if(my.equals("보"))
				{
					if(kai == 0)
					{
						try 
						{
							System.out.println("3");
							sleep(1000);
							System.out.println("2");
							sleep(1000);
							System.out.println("1");
							sleep(1000);
							System.out.println("나는:"+my+"	/컴퓨터는: 바위");
							System.out.println("\n이겼습니다!!\n");win++;
						} 
						catch (InterruptedException e){e.printStackTrace();}
						try{
				            File file = new File("C:\\aaa\\work\\KBB.txt");
				            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file,true));
					            bufferedWriter.write(strNowDate);
				            	bufferedWriter.newLine();
				                bufferedWriter.write("내가 낸것:"+my+"/컴퓨터:바위");	          
				                bufferedWriter.newLine();
				                bufferedWriter.write("결과:승리");
				                bufferedWriter.newLine();
				                bufferedWriter.close();
				           
				        }catch (IOException e) {System.out.println(e);}
					}		
					else if(kai == 1)
					{
						try 
						{
							System.out.println("3");
							sleep(1000);
							System.out.println("2");
							sleep(1000);
							System.out.println("1");
							sleep(1000);
							System.out.println("나는:"+my+"	/컴퓨터는: 가위");
							System.out.println("\n패배...\n");lose++;
						} 
						catch (InterruptedException e){e.printStackTrace();}
						try{
				            File file = new File("C:\\aaa\\work\\KBB.txt");
				            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file,true));
					            bufferedWriter.write(strNowDate);
				            	bufferedWriter.newLine();
				                bufferedWriter.write("내가 낸것:"+my+"/컴퓨터:가위");	          
				                bufferedWriter.newLine();
				                bufferedWriter.write("결과:패배");
				                bufferedWriter.newLine();
				                bufferedWriter.close();
				           
				        }catch (IOException e) {System.out.println(e);}
					}
					else if(kai == 2)
					{
						try 
						{
							System.out.println("3");
							sleep(1000);
							System.out.println("2");
							sleep(1000);
							System.out.println("1");
							sleep(1000);
							System.out.println("나는:"+my+"	/컴퓨터는: 보");
							System.out.println("\n비겼습니다.\n");draw++;
						} 
						catch (InterruptedException e){e.printStackTrace();}
						try{
				            File file = new File("C:\\aaa\\work\\KBB.txt");
				            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file,true));
					            bufferedWriter.write(strNowDate);
				            	bufferedWriter.newLine();
				                bufferedWriter.write("내가 낸것:"+my+"/컴퓨터:보");	          
				                bufferedWriter.newLine();
				                bufferedWriter.write("결과:비김");
				                bufferedWriter.newLine();
				                bufferedWriter.close();
				           
				        }catch (IOException e) {System.out.println(e);}
					}
				}
				
			}
			else if(sel == 2)
			{
				try{
		            File file = new File("C:\\aaa\\work\\KBB.txt");
		            FileReader filereader = new FileReader(file);
		            BufferedReader bufReader = new BufferedReader(filereader);
		            String line = "";
		            System.out.println("");
		            while((line = bufReader.readLine()) != null){System.out.println(line);}                 
		            bufReader.close();
		        }catch (FileNotFoundException e) {}catch(IOException e){}
			}
			else if(sel == 3)
			{
				System.out.println("프로그램 종료"); break;
			}
		}
	}
}