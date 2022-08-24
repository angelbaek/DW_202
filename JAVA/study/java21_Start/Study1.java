package java21_Start;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Study1 {
	public static void main(String[] args) {
		SoccerGame sg = new SoccerGame();
	}
}
class SoccerGame extends Frame implements ActionListener, ItemListener
{
	Font font20 = new Font("SansSerif", Font.BOLD, 20);
	Font font30 = new Font("SansSerif", Font.BOLD, 30);
	private Dimension dimen, dimen1;
	private int xpos, ypos;
	
	Label lblist = new Label("선수리스트");
	List lipl = new List();	
	Label lbsc = new Label("축구선수:대기중...");
	Button bt1 = new Button("중거리슛");
	Button bt2 = new Button("헤딩");
	Button bt3 = new Button("패널티슛");
	Label lbre = new Label("결과:대기중...");
	int tot, succ=0, fail, gameTot=10;
	Label lbtot = new Label("총전적: "+tot+"게임");
	Label lbsucc = new Label("슛성공 "+succ+"회");
	Label lbfail = new Label("슛실패 "+fail+"회");
	String name="";
	Button btnReset = new Button("전적초기화");
	Label lbTot = new Label("총게임가능횟수:"+gameTot);
	int cntS1=1, cntS2=2;
	Dialog dlg1 = new Dialog(this, "우승!", false);
	Label dlglb = new Label("챔피언스리그 우승! 콩그레츄레이션~~!", Label.CENTER);
	Button lbSave = new Button("파일저장");
	Button lbGameTot = new Button("게임통계");
	
	SoccerGame()
	{
		super();
		this.setSize(770,400);
		this.init();
		this.start();
		this.center();
		this.setVisible(true);
	}
	void init()
	{
		this.setLayout(null);
		this.add(lblist); lblist.setBounds(50,50,150,30); lblist.setFont(font20);
		this.add(lipl); lipl.setBounds(50,100,110,200); lipl.setFont(font20);
		this.add(lbsc); lbsc.setBounds(200,50,200,30); lbsc.setFont(font20);
		this.add(bt1); bt1.setBounds(200,100,100,30); bt1.setFont(font20);
		this.add(bt2); bt2.setBounds(310,100,100,30); bt2.setFont(font20);
		this.add(bt3); bt3.setBounds(420,100,100,30); bt3.setFont(font20);
		this.add(lbre); lbre.setBounds(230,170,300,30); lbre.setFont(font20);
		this.add(lbtot); lbtot.setBounds(200,230,150,30); lbtot.setFont(font20);
		this.add(lbsucc); lbsucc.setBounds(200,280,120,30); lbsucc.setFont(font20);
		this.add(lbfail); lbfail.setBounds(330,280,120,30); lbfail.setFont(font20);
		this.add(btnReset); btnReset.setBounds(410,50,110,30); btnReset.setFont(font20);
		this.add(lbTot); lbTot.setBounds(50,330,200,30); lbTot.setFont(font20);
		dlg1.setBounds(800,470,250,200); dlg1.add("Center", dlglb);
		this.add(lbSave); lbSave.setBounds(600,100,100,30); lbSave.setFont(font20);
		this.add(lbGameTot); lbGameTot.setBounds(600,200,100,30); lbGameTot.setFont(font20);
		
	}
	void start()
	{
		this.addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent e){System.exit(0);}});
		lipl.addItemListener(this);
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		bt3.addActionListener(this);
		lipl.add("손흥민");
		lipl.add("메시");
		lipl.add("강날두");
		btnReset.addActionListener(this);
		dlg1.addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent e){dlg1.setVisible(false);}});
		lbSave.addActionListener(this);
		lbGameTot.addActionListener(this);
	}
	void center()
	{
		dimen = Toolkit.getDefaultToolkit().getScreenSize();
		dimen1 = this.getSize();
		xpos = (int) (dimen.getWidth() / 2 - dimen1.getWidth() / 2);
		ypos = (int) (dimen.getHeight() / 2 - dimen1.getHeight() / 2);
		this.setLocation(xpos, ypos);
	}
	public void actionPerformed(ActionEvent e) 
	{
		name = lipl.getSelectedItem();
		if(e.getSource()==lbSave)
		{
			if(name==null) {return;}			
			save();
		}
		if(e.getSource()==lbGameTot)
		{
			load();
		}
		if(name==null)
		{
			if(e.getSource()==bt1 || e.getSource()==bt2 || e.getSource()==bt3)
			{
				lbre.setText("선수를 먼저 선택하세요.");return;
			}
		}
		if(e.getSource()==btnReset)
		{
			tot=0; succ=0; fail=0; gameTot=10; cntS1=1; cntS2=2;
			lbtot.setText("총전적: "+tot+"게임"); lbsucc.setText("슛성공 "+succ+"회");
			lbfail.setText("슛실패 "+fail+"회");
			lbTot.setText("총게임가능횟수:"+gameTot);
			lbre.setText("슛을 선택하세요!!");
		}
		if(gameTot==0)
		{
			lbre.setText("모든 경기가 끝났습니다.");return;
		}		
		if(e.getSource()==bt1) //중거리슛 30%
		{
			gameTot--;
			lbTot.setText("총게임가능횟수:"+gameTot);
			int rd = (int)(Math.random()*10);
			if(rd==0 || rd==1 || rd==2)
			{
				lbre.setText(name+"이(가) 중거리슛 성공!"); succ++; tot++;
				lbtot.setText("총전적: "+tot+"게임"); lbsucc.setText("슛성공 "+succ+"회");
				lbfail.setText("슛실패 "+fail+"회");			
			}
			else
			{
				lbre.setText(name+"이(가) 중거리슛 실패!"); fail++; tot++;
				lbtot.setText("총전적: "+tot+"게임"); lbsucc.setText("슛성공 "+succ+"회");
				lbfail.setText("슛실패 "+fail+"회");
			}
		}
		if(e.getSource()==bt2) //헤딩 50%
		{
			if(cntS2==0)
			{
				lbre.setText("더이상 헤딩을 사용못함");return;
			}
			gameTot--;
			cntS2--;
			lbTot.setText("총게임가능횟수:"+gameTot);
			int rd = (int)(Math.random()*10);
			if(rd==0 || rd==1 || rd==2 || rd==3 || rd==4)
			{
				lbre.setText(name+"이(가) 헤딩 성공!"); succ++; tot++;
				lbtot.setText("총전적: "+tot+"게임"); lbsucc.setText("슛성공 "+succ+"회");
				lbfail.setText("슛실패 "+fail+"회");			
			}
			else
			{
				lbre.setText(name+"이(가) 헤딩 실패!"); fail++; tot++;
				lbtot.setText("총전적: "+tot+"게임"); lbsucc.setText("슛성공 "+succ+"회");
				lbfail.setText("슛실패 "+fail+"회");
			}
		}
		if(e.getSource()==bt3) //패널티 90%
		{
			if(cntS1==0)
			{
				lbre.setText("더이상 패널티슛을 사용못함");return;
			}
			gameTot--;
			cntS1--;			
			lbTot.setText("총게임가능횟수:"+gameTot);			
			int rd = (int)(Math.random()*10);
			if(rd==0 || rd==1 || rd==2 || rd==3 || rd==4 || rd==5 || rd==6 || rd==7 || rd==8)
			{
				lbre.setText(name+"이(가) 패널티 성공!"); succ++; tot++;
				lbtot.setText("총전적: "+tot+"게임"); lbsucc.setText("슛성공 "+succ+"회");
				lbfail.setText("슛실패 "+fail+"회");			
			}
			else
			{
				lbre.setText(name+"이(가) 패널티 실패!"); fail++; tot++;
				lbtot.setText("총전적: "+tot+"게임"); lbsucc.setText("슛성공 "+succ+"회");
				lbfail.setText("슛실패 "+fail+"회");
			}
		}
		if(succ==8)
		{
			dlg1.setVisible(true);
		}
	}
	public void itemStateChanged(ItemEvent arg0) {

		name = lipl.getSelectedItem();
		if(arg0.getSource()==lipl) //선수선택
		{
			lbsc.setText("축구선수:"+name);
		}
	}
	void save() 
	{
		   try{
	            //파일 객체 생성
	            File file = new File("C:\\aaa\\work\\SoccerGame.txt");
	            Date nowDate = new Date();	            
	    		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd"); 
	            //원하는 데이터 포맷 지정
	    		String strNowDate = simpleDateFormat.format(nowDate); 
	    		//지정한 포맷으로 변환	
	    
	            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file,true));	            
	            bufferedWriter.write(name+" / "+(10-gameTot)+"회도전"+" / "+"슛성공:"+succ+" / "+"슛실패:"+fail+" "+strNowDate+"\n");
	
	            bufferedWriter.close();          	          
	        }catch (IOException e) {}
		   
		   
	}//파일저장
	void load() 
	{
	   try{
            //파일 객체 생성
            File file = new File("C:\\aaa\\work\\SoccerGame.txt");
            //입력 스트림 생성
            FileReader filereader = new FileReader(file);
            //입력 버퍼 생성
            BufferedReader bufReader = new BufferedReader(filereader);
            String line = "";            
            String data = "";
         
            while((line = bufReader.readLine()) != null){
            	data += line+"\n";
            }                   
            final Dialog dlg = new Dialog(this, "게임통계", true);
            dlg.setLayout(new BorderLayout());				
            dlg.add("Center", new TextArea(data));            
            Button bt = new Button("확인");
            Panel pp = new Panel(new FlowLayout());
            pp.add(bt);
            bt.addActionListener(new ActionListener() {
            	public void actionPerformed(ActionEvent e) {dlg.setVisible(false);}
            });
            dlg.add("South", pp);
            dlg.setLocation(800, 450);
            dlg.setSize(350, 200);
            dlg.setVisible(true);
			bufReader.close();
        }catch (FileNotFoundException e){}catch(IOException e){}		   
   }//파일로드
}