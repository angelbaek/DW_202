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
	SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy�� MM�� dd�� HH:mm:ss");
	String strNowDate = simpleDateFormat.format(nowDate);
	public void run()
	{
		while(true)
		{
			System.out.println("\n1.���ӽ���");
			System.out.println("2.��躸��");
			System.out.println("3.����");
			System.out.print("����:"); int sel = sc.nextInt();
			if(sel == 1)
			{
				tot++;
				System.out.print("�� ����(����,����,��):"); String my = sc.next();
				int kai = (int)(Math.random()*3);
				if(my.equals("����"))
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
							System.out.println("����:"+my+"	/��ǻ�ʹ�: ����");
							System.out.println("\n�й��߽��ϴ�...\n");lose++;
						} 
						catch (InterruptedException e){e.printStackTrace();}
						try{
				            File file = new File("C:\\aaa\\work\\KBB.txt");
				            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file,true));
				            				            	
				            	bufferedWriter.write(strNowDate);
				            	bufferedWriter.newLine();
				                bufferedWriter.write("���� ����:"+my+"/��ǻ��:����");	          
				                bufferedWriter.newLine();
				                bufferedWriter.write("���:�й�");
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
							System.out.println("����:"+my+"	/��ǻ�ʹ�: ����");
							System.out.println("\n�����ϴ�.\n");draw++;
						} 
						catch (InterruptedException e){e.printStackTrace();}
						try{
				            File file = new File("C:\\aaa\\work\\KBB.txt");
				            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file,true));
					            bufferedWriter.write(strNowDate);
				            	bufferedWriter.newLine();
				                bufferedWriter.write("���� ����:"+my+"/��ǻ��:����");	          
				                bufferedWriter.newLine();
				                bufferedWriter.write("���:���");
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
							System.out.println("����:"+my+"	/��ǻ�ʹ�: ��");
							System.out.println("\n�¸��߽��ϴ�!!!\n");win++;
						} 
						catch (InterruptedException e){e.printStackTrace();}
						try{
				            File file = new File("C:\\aaa\\work\\KBB.txt");
				            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file,true));
					            bufferedWriter.write(strNowDate);
				            	bufferedWriter.newLine();
				                bufferedWriter.write("���� ����:"+my+"/��ǻ��:��");	          
				                bufferedWriter.newLine();
				                bufferedWriter.write("���:�¸�");
				                bufferedWriter.newLine();
				                bufferedWriter.close();
				           
				        }catch (IOException e) {System.out.println(e);}
					}
				}
				else if(my.equals("����"))
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
							System.out.println("����:"+my+"	/��ǻ�ʹ�: ����");
							System.out.println("\n�����ϴ�.\n");draw++;
						} 
						catch (InterruptedException e){e.printStackTrace();}
						try{
				            File file = new File("C:\\aaa\\work\\KBB.txt");
				            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file,true));
					            bufferedWriter.write(strNowDate);
				            	bufferedWriter.newLine();
				                bufferedWriter.write("���� ����:"+my+"/��ǻ��:����");	          
				                bufferedWriter.newLine();
				                bufferedWriter.write("���:���");
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
							System.out.println("����:"+my+"	/��ǻ�ʹ�: ����");
							System.out.println("\n�¸��߽��ϴ�!!!\n");win++;
						} 
						catch (InterruptedException e){e.printStackTrace();}
						try{
				            File file = new File("C:\\aaa\\work\\KBB.txt");
				            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file,true));
					            bufferedWriter.write(strNowDate);
				            	bufferedWriter.newLine();
				                bufferedWriter.write("���� ����:"+my+"/��ǻ��:����");	          
				                bufferedWriter.newLine();
				                bufferedWriter.write("���:�¸�");
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
							System.out.println("����:"+my+"	/��ǻ�ʹ�: ��");
							System.out.println("\n�й��߽��ϴ�..\n");lose++;
						} 
						catch (InterruptedException e){e.printStackTrace();}
						try{
				            File file = new File("C:\\aaa\\work\\KBB.txt");
				            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file,true));
					            bufferedWriter.write(strNowDate);
				            	bufferedWriter.newLine();
				                bufferedWriter.write("���� ����:"+my+"/��ǻ��:��");	          
				                bufferedWriter.newLine();
				                bufferedWriter.write("���:�й�");
				                bufferedWriter.newLine();
				                bufferedWriter.close();
				           
				        }catch (IOException e) {System.out.println(e);}
					}
				}
				else if(my.equals("��"))
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
							System.out.println("����:"+my+"	/��ǻ�ʹ�: ����");
							System.out.println("\n�̰���ϴ�!!\n");win++;
						} 
						catch (InterruptedException e){e.printStackTrace();}
						try{
				            File file = new File("C:\\aaa\\work\\KBB.txt");
				            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file,true));
					            bufferedWriter.write(strNowDate);
				            	bufferedWriter.newLine();
				                bufferedWriter.write("���� ����:"+my+"/��ǻ��:����");	          
				                bufferedWriter.newLine();
				                bufferedWriter.write("���:�¸�");
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
							System.out.println("����:"+my+"	/��ǻ�ʹ�: ����");
							System.out.println("\n�й�...\n");lose++;
						} 
						catch (InterruptedException e){e.printStackTrace();}
						try{
				            File file = new File("C:\\aaa\\work\\KBB.txt");
				            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file,true));
					            bufferedWriter.write(strNowDate);
				            	bufferedWriter.newLine();
				                bufferedWriter.write("���� ����:"+my+"/��ǻ��:����");	          
				                bufferedWriter.newLine();
				                bufferedWriter.write("���:�й�");
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
							System.out.println("����:"+my+"	/��ǻ�ʹ�: ��");
							System.out.println("\n�����ϴ�.\n");draw++;
						} 
						catch (InterruptedException e){e.printStackTrace();}
						try{
				            File file = new File("C:\\aaa\\work\\KBB.txt");
				            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file,true));
					            bufferedWriter.write(strNowDate);
				            	bufferedWriter.newLine();
				                bufferedWriter.write("���� ����:"+my+"/��ǻ��:��");	          
				                bufferedWriter.newLine();
				                bufferedWriter.write("���:���");
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
				System.out.println("���α׷� ����"); break;
			}
		}
	}
}