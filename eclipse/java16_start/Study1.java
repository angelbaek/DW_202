package java16_start;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
public class Study1 
{
	public static void main(String[] args) 
	{
		Soccer so = new Soccer();
	}
}
class Soccer
{
	Scanner sc = new Scanner(System.in);
	String TeamName[] = {"��Ʈ��","�ٸ����γ�","���˸��帮��"};
	String myTeamName;
	String ment[] = {
			"�����մϴ�",				// 0��°
			"1���� �־����ϴ�.", 		// 1��° +��ó��
			"������ �־����� �����߽��ϴ�",  	// 2��°
			"���� �����ֳ׿�.",			// 3��°
			"���ݼ��� �ں����ϴ�.",		// 4��°	
			"��Ű�۰� �����մϴ�.",		// 5��°
			"�г�Ƽ�� �����մϴ�.",		// 6��°
			"�г�Ƽ�� �����մϴ�.",	    // 7��° +��ó��
			"�ڻ���� �־����ϴ�.", 		// 8��° -��ó��
			"1���� ������ ���߽��ϴ�." 		// 9��°
	};
	int win[] = new int[3];
	int draw[] = new int[3];
	int loss[] = new int[3];
	int myWin, myDraw, myLoss; //���� ��,��,�� ��Ϻ���
	int score[] = new int[3]; // ��� ��ŷ �������
	int myScore; // �� ���� ���
	int rd,rd2,rd3; //���� ������
	Soccer()
	{
		System.out.println("\n<�౸������ �����մϴ�!>\n");
		System.out.print("�������Է�:"); myTeamName = sc.next();
		System.out.println("\n������ �����մϴ�.\n");
		while(true)
		{
			System.out.println("\n-------���̸�:"+myTeamName+"-------");
			System.out.println("\n1.���ӽ���");
			System.out.println("2.��ŷ����");
			System.out.println("3.����");
			System.out.print("����:"); int sel = sc.nextInt();
			if(sel == 1) {gameStart();}
			else if(sel == 2) {ranking();}
			else if(sel == 3) {break;}	
		}
	}
	void gameStart() //���ӽ���
	{
		teamvs();
	}
	void ranking() //��ŷ����
	{
		System.out.println("\n<<<<<<<��ŷ>>>>>>>\n");
		System.out.println("����:"+myTeamName);
		System.out.println("�¸�:"+myWin+" ���º�:"+myDraw+" �й�:"+myLoss);
		System.out.println("����:"+myScore);
		System.out.println("\n����:"+TeamName[rd]);
		System.out.println("�¸�:"+win[rd]+" ���º�:"+draw[rd]+" �й�:"+loss[rd]);
		System.out.println("����:"+score[rd]);
		System.out.println("\n����:"+TeamName[rd2]);
		System.out.println("�¸�:"+win[rd2]+" ���º�:"+draw[rd2]+" �й�:"+loss[rd2]);
		System.out.println("����:"+score[rd2]);
		System.out.println("\n����:"+TeamName[rd3]);
		System.out.println("�¸�:"+win[rd3]+" ���º�:"+draw[rd3]+" �й�:"+loss[rd3]);
		System.out.println("����:"+score[rd3]);
	}
	void save() //��������
	{
		try{
            //���� ��ü ����
            File file = new File("C:\\aaa\\work\\soccer.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file,true));

          //���� �ð����ϱ� �ʱ���...
        	Date nowDate = new Date();       
    		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm��");      
    		String now = simpleDateFormat.format(nowDate);
    		
            //����
    		bufferedWriter.write(now);
    		bufferedWriter.newLine();
            bufferedWriter.write("����:"+myTeamName);
            bufferedWriter.newLine(); 
            bufferedWriter.write("�¸�:"+myWin+" /���º�:"+myDraw+" /�й�:"+myLoss);
            bufferedWriter.newLine(); 
            bufferedWriter.close();           
            
        }catch (IOException e) {
            System.out.println(e);
        }
	}
	void saveEm(int teamRd) // ���� ����
	{
		try{
            //���� ��ü ����
            File file = new File("C:\\aaa\\work\\soccer.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file,true));

          //���� �ð����ϱ� �ʱ���...
        	Date nowDate = new Date();       
    		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm��");      
    		String now = simpleDateFormat.format(nowDate);
    		//����
	    	bufferedWriter.write(now);
	    	bufferedWriter.newLine();
	        bufferedWriter.write("����:"+TeamName[teamRd]);
	        bufferedWriter.newLine(); 
	        bufferedWriter.write("�¸�:"+win[teamRd]+" /���º�:"+draw[teamRd]+" /�й�:"+loss[teamRd]);
	        bufferedWriter.newLine(); 
	        bufferedWriter.close();             
        }catch (IOException e) {
            System.out.println(e);
        }
	}
	void load() //���Ϸε�
	{
		try{
            //���� ��ü ����
            File file = new File("C:\\aaa\\work\\soccer.txt");
            //�Է� ��Ʈ�� ����
            FileReader filereader = new FileReader(file);
            //�Է� ���� ����
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
	void teamvs()
	{
		boolean team = false;
		System.out.println("\n1��:"+myTeamName); // ���� 1�� ����
		int rd = (int)(Math.random()*3);
		this.rd = rd;
		System.out.println("2��:"+TeamName[rd]); // 2�� rd
		int rd2 = (int)(Math.random()*3); //3�� rd2
		if(rd2!=rd) //3���� 2���� ���� ������
		{
			System.out.println("3��:"+TeamName[rd2]); this.rd2 = rd2;
		}
		if(rd2==rd) //3���� 2���� ������
		{
			team = true;
			while(team)
			{
				rd2 = (int)(Math.random()*3);
				if(rd2!=rd)
				{
					System.out.println("3��:"+TeamName[rd2]); this.rd2 = rd2; team=false;
				}
			}
		}
		int rd3 = (int)(Math.random()*3); //4�� rd3
		if(rd3!=rd2&&rd3!=rd) // 4���� 3,2���� ���� ������
		{
			System.out.println("3��:"+TeamName[rd3]); this.rd3 = rd3;
		}
		if(rd3==rd2||rd3==rd) // 4���� 3,2���� ������
		{
			team = true;
			while(team)
			{
				rd3 = (int)(Math.random()*3);
				if(rd3!=rd&&rd3!=rd2)
				{
					System.out.println("4��:"+TeamName[rd3]); this.rd3 = rd3; team=false;
				}
			}
		}
		while(true)
		{
			System.out.println("\n1.�౸����");
			System.out.println("2.���ư���");
			System.out.print("����:"); int sel = sc.nextInt();
			if(sel == 1) 
			{
				int myGoal=0; // 1,2�� ��������
				int myGoall=0; // 3,4�� ��������
				try {
					
					Thread.sleep(1000);
					System.out.println("\n��Ī���Դϴ�.\n");
					Thread.sleep(1000);
					System.out.println("\n��Ī���Դϴ�..\n");
					Thread.sleep(1000);
					System.out.println("\n��Ī���Դϴ�...\n");
					Thread.sleep(1000);
					System.out.println("\n��Ī �Ǿ����ϴ�!\n");
				} catch (InterruptedException e1) {
						e1.printStackTrace();
				}
				System.out.println("\n1��:"+myTeamName+"�� 2��:"+TeamName[rd]+" ��(��) ������ �����մϴ�.\n");
				for(int i=0; i<4; i++)
				{
					try 
					{int me = (int)(Math.random()*10); // ��Ʈ 10���� �����ϱ�
					Thread.sleep(1000);
					System.out.println(i+1+"."+ment[me]);
					if(me==1||me==7)
					{
						myGoal += 1; //+��ó��
						System.out.println("!!����!!");
					}
					else if(me==8)
					{
						myGoal -= 1; //-��ó��
						System.out.println("..����..");
					}
						Thread.sleep(500);
					} catch (InterruptedException e) {e.printStackTrace();}				
				}
				if(myGoal>=1)
				{
					myWin += 1; loss[rd] += 1; //�¸�
					myScore += 5; score[rd] += 1;
					System.out.println("\n!!!!�¸��Ͽ����ϴ�!!!!\n");
				}
				else if(myGoal==0)
				{
					myDraw += 1; draw[rd] += 1; //����
					myScore += 3; score[rd] += 3;
					System.out.println("\n-���º�-\n");
				}
				else if(myGoal<=-1)
				{
					myLoss += 1; win[rd] += 1; //�й�
					myScore += 1; score[rd] += 5;
					System.out.println("\n....�й��Ͽ����ϴ�....\n");
				}		
				save();
//				 1�� 2�� ���� ����
				try {
					
					Thread.sleep(1000);
					System.out.println("\n��Ī���Դϴ�.\n");
					Thread.sleep(1000);
					System.out.println("\n��Ī���Դϴ�..\n");
					Thread.sleep(1000);
					System.out.println("\n��Ī���Դϴ�...\n");
					Thread.sleep(1000);
					System.out.println("\n��Ī �Ǿ����ϴ�!\n");
				} catch (InterruptedException e1) {
						e1.printStackTrace();
				}
				// 3�� 4�� ���� ����
				System.out.println("\n3��:"+TeamName[rd2]+"�� 4��:"+TeamName[rd3]+" ��(��) ������ �����մϴ�.\n");
				for(int i=0; i<4; i++)
				{
					try {
						Thread.sleep(1000);
						int me = (int)(Math.random()*10); // ��Ʈ 10���� �����ϱ�
						System.out.println(i+1+"."+ment[me]);
						if(me==1||me==7)
						{
							myGoall += 1; //+��ó��
						}
						else if(me==8)
						{
							myGoall -= 1; //-��ó��
						}
						Thread.sleep(500);		
						} catch (InterruptedException e) {e.printStackTrace();}
				}
				if(myGoall>=1)
				{
					win[rd2] += 1; loss[rd3] += 1; //�¸�
					score[rd2] += 5; score[rd3] += 1;
				}
				else if(myGoall==0)
				{
					draw[rd2] += 1; draw[rd3] += 1; //����
					score[rd2] += 3; score[rd3] += 3;
				}
				else if(myGoall<=-1)
				{
					loss[rd2] += 1; win[rd3] += 1; //�й�
					score[rd2] += 1; score[rd3] += 5;
				}
				// 3�� 4�� ���� ����
				saveEm(rd);
				saveEm(rd2);
				saveEm(rd3);
			}
			else if(sel == 2) {break;}
		}
	}
}  