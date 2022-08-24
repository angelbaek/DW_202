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
	String TeamName[] = {"토트넘","바르셀로나","레알마드리드"};
	String myTeamName;
	String ment[] = {
			"공격합니다",				// 0번째
			"1골을 넣었습니다.", 		// 1번째 +골처리
			"슈팅을 넣었지만 실패했습니다",  	// 2번째
			"수비가 끝내주네요.",			// 3번째
			"공격수가 자빠집니다.",		// 4번째	
			"골키퍼가 선방합니다.",		// 5번째
			"패널티에 실패합니다.",		// 6번째
			"패널티를 성공합니다.",	    // 7번째 +골처리
			"자살골을 넣었습니다.", 		// 8번째 -골처리
			"1명이 퇴장을 당했습니다." 		// 9번째
	};
	int win[] = new int[3];
	int draw[] = new int[3];
	int loss[] = new int[3];
	int myWin, myDraw, myLoss; //내팀 승,무,패 기록변수
	int score[] = new int[3]; // 상대 랭킹 점수기록
	int myScore; // 내 점수 기록
	int rd,rd2,rd3; //적팀 랜덤수
	Soccer()
	{
		System.out.println("\n<축구게임을 시작합니다!>\n");
		System.out.print("내팀명입력:"); myTeamName = sc.next();
		System.out.println("\n게임을 시작합니다.\n");
		while(true)
		{
			System.out.println("\n-------팀이름:"+myTeamName+"-------");
			System.out.println("\n1.게임시작");
			System.out.println("2.랭킹보기");
			System.out.println("3.종료");
			System.out.print("선택:"); int sel = sc.nextInt();
			if(sel == 1) {gameStart();}
			else if(sel == 2) {ranking();}
			else if(sel == 3) {break;}	
		}
	}
	void gameStart() //게임시작
	{
		teamvs();
	}
	void ranking() //랭킹보기
	{
		System.out.println("\n<<<<<<<랭킹>>>>>>>\n");
		System.out.println("팀명:"+myTeamName);
		System.out.println("승리:"+myWin+" 무승부:"+myDraw+" 패배:"+myLoss);
		System.out.println("총점:"+myScore);
		System.out.println("\n팀명:"+TeamName[rd]);
		System.out.println("승리:"+win[rd]+" 무승부:"+draw[rd]+" 패배:"+loss[rd]);
		System.out.println("총점:"+score[rd]);
		System.out.println("\n팀명:"+TeamName[rd2]);
		System.out.println("승리:"+win[rd2]+" 무승부:"+draw[rd2]+" 패배:"+loss[rd2]);
		System.out.println("총점:"+score[rd2]);
		System.out.println("\n팀명:"+TeamName[rd3]);
		System.out.println("승리:"+win[rd3]+" 무승부:"+draw[rd3]+" 패배:"+loss[rd3]);
		System.out.println("총점:"+score[rd3]);
	}
	void save() //파일저장
	{
		try{
            //파일 객체 생성
            File file = new File("C:\\aaa\\work\\soccer.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file,true));

          //현재 시간구하기 초까지...
        	Date nowDate = new Date();       
    		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분");      
    		String now = simpleDateFormat.format(nowDate);
    		
            //쓰기
    		bufferedWriter.write(now);
    		bufferedWriter.newLine();
            bufferedWriter.write("팀명:"+myTeamName);
            bufferedWriter.newLine(); 
            bufferedWriter.write("승리:"+myWin+" /무승부:"+myDraw+" /패배:"+myLoss);
            bufferedWriter.newLine(); 
            bufferedWriter.close();           
            
        }catch (IOException e) {
            System.out.println(e);
        }
	}
	void saveEm(int teamRd) // 적팀 저장
	{
		try{
            //파일 객체 생성
            File file = new File("C:\\aaa\\work\\soccer.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file,true));

          //현재 시간구하기 초까지...
        	Date nowDate = new Date();       
    		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분");      
    		String now = simpleDateFormat.format(nowDate);
    		//쓰기
	    	bufferedWriter.write(now);
	    	bufferedWriter.newLine();
	        bufferedWriter.write("팀명:"+TeamName[teamRd]);
	        bufferedWriter.newLine(); 
	        bufferedWriter.write("승리:"+win[teamRd]+" /무승부:"+draw[teamRd]+" /패배:"+loss[teamRd]);
	        bufferedWriter.newLine(); 
	        bufferedWriter.close();             
        }catch (IOException e) {
            System.out.println(e);
        }
	}
	void load() //파일로드
	{
		try{
            //파일 객체 생성
            File file = new File("C:\\aaa\\work\\soccer.txt");
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
	void teamvs()
	{
		boolean team = false;
		System.out.println("\n1팀:"+myTeamName); // 내팀 1팀 고정
		int rd = (int)(Math.random()*3);
		this.rd = rd;
		System.out.println("2팀:"+TeamName[rd]); // 2팀 rd
		int rd2 = (int)(Math.random()*3); //3팀 rd2
		if(rd2!=rd) //3팀이 2팀과 같지 않을때
		{
			System.out.println("3팀:"+TeamName[rd2]); this.rd2 = rd2;
		}
		if(rd2==rd) //3팀이 2팀과 같을때
		{
			team = true;
			while(team)
			{
				rd2 = (int)(Math.random()*3);
				if(rd2!=rd)
				{
					System.out.println("3팀:"+TeamName[rd2]); this.rd2 = rd2; team=false;
				}
			}
		}
		int rd3 = (int)(Math.random()*3); //4팀 rd3
		if(rd3!=rd2&&rd3!=rd) // 4팀이 3,2팀과 같지 않을때
		{
			System.out.println("3팀:"+TeamName[rd3]); this.rd3 = rd3;
		}
		if(rd3==rd2||rd3==rd) // 4팀이 3,2팀과 같을때
		{
			team = true;
			while(team)
			{
				rd3 = (int)(Math.random()*3);
				if(rd3!=rd&&rd3!=rd2)
				{
					System.out.println("4팀:"+TeamName[rd3]); this.rd3 = rd3; team=false;
				}
			}
		}
		while(true)
		{
			System.out.println("\n1.축구시작");
			System.out.println("2.돌아가기");
			System.out.print("선택:"); int sel = sc.nextInt();
			if(sel == 1) 
			{
				int myGoal=0; // 1,2팀 시합전용
				int myGoall=0; // 3,4팀 시합전용
				try {
					
					Thread.sleep(1000);
					System.out.println("\n매칭중입니다.\n");
					Thread.sleep(1000);
					System.out.println("\n매칭중입니다..\n");
					Thread.sleep(1000);
					System.out.println("\n매칭중입니다...\n");
					Thread.sleep(1000);
					System.out.println("\n매칭 되었습니다!\n");
				} catch (InterruptedException e1) {
						e1.printStackTrace();
				}
				System.out.println("\n1팀:"+myTeamName+"과 2팀:"+TeamName[rd]+" 이(가) 시합을 시작합니다.\n");
				for(int i=0; i<4; i++)
				{
					try 
					{int me = (int)(Math.random()*10); // 멘트 10가지 추출하기
					Thread.sleep(1000);
					System.out.println(i+1+"."+ment[me]);
					if(me==1||me==7)
					{
						myGoal += 1; //+골처리
						System.out.println("!!득점!!");
					}
					else if(me==8)
					{
						myGoal -= 1; //-골처리
						System.out.println("..감점..");
					}
						Thread.sleep(500);
					} catch (InterruptedException e) {e.printStackTrace();}				
				}
				if(myGoal>=1)
				{
					myWin += 1; loss[rd] += 1; //승리
					myScore += 5; score[rd] += 1;
					System.out.println("\n!!!!승리하였습니다!!!!\n");
				}
				else if(myGoal==0)
				{
					myDraw += 1; draw[rd] += 1; //동점
					myScore += 3; score[rd] += 3;
					System.out.println("\n-무승부-\n");
				}
				else if(myGoal<=-1)
				{
					myLoss += 1; win[rd] += 1; //패배
					myScore += 1; score[rd] += 5;
					System.out.println("\n....패배하였습니다....\n");
				}		
				save();
//				 1팀 2팀 시합 종료
				try {
					
					Thread.sleep(1000);
					System.out.println("\n매칭중입니다.\n");
					Thread.sleep(1000);
					System.out.println("\n매칭중입니다..\n");
					Thread.sleep(1000);
					System.out.println("\n매칭중입니다...\n");
					Thread.sleep(1000);
					System.out.println("\n매칭 되었습니다!\n");
				} catch (InterruptedException e1) {
						e1.printStackTrace();
				}
				// 3팀 4팁 시합 시작
				System.out.println("\n3팀:"+TeamName[rd2]+"과 4팀:"+TeamName[rd3]+" 이(가) 시합을 시작합니다.\n");
				for(int i=0; i<4; i++)
				{
					try {
						Thread.sleep(1000);
						int me = (int)(Math.random()*10); // 멘트 10가지 추출하기
						System.out.println(i+1+"."+ment[me]);
						if(me==1||me==7)
						{
							myGoall += 1; //+골처리
						}
						else if(me==8)
						{
							myGoall -= 1; //-골처리
						}
						Thread.sleep(500);		
						} catch (InterruptedException e) {e.printStackTrace();}
				}
				if(myGoall>=1)
				{
					win[rd2] += 1; loss[rd3] += 1; //승리
					score[rd2] += 5; score[rd3] += 1;
				}
				else if(myGoall==0)
				{
					draw[rd2] += 1; draw[rd3] += 1; //동점
					score[rd2] += 3; score[rd3] += 3;
				}
				else if(myGoall<=-1)
				{
					loss[rd2] += 1; win[rd3] += 1; //패배
					score[rd2] += 1; score[rd3] += 5;
				}
				// 3팀 4팀 시합 종료
				saveEm(rd);
				saveEm(rd2);
				saveEm(rd3);
			}
			else if(sel == 2) {break;}
		}
	}
}  