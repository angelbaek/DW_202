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
	
	Label lblist = new Label("��������Ʈ");
	List lipl = new List();	
	Label lbsc = new Label("�౸����:�����...");
	Button bt1 = new Button("�߰Ÿ���");
	Button bt2 = new Button("���");
	Button bt3 = new Button("�г�Ƽ��");
	Label lbre = new Label("���:�����...");
	int tot, succ=0, fail, gameTot=10;
	Label lbtot = new Label("������: "+tot+"����");
	Label lbsucc = new Label("������ "+succ+"ȸ");
	Label lbfail = new Label("������ "+fail+"ȸ");
	String name="";
	Button btnReset = new Button("�����ʱ�ȭ");
	Label lbTot = new Label("�Ѱ��Ӱ���Ƚ��:"+gameTot);
	int cntS1=1, cntS2=2;
	Dialog dlg1 = new Dialog(this, "���!", false);
	Label dlglb = new Label("è�Ǿ𽺸��� ���! ��׷����̼�~~!", Label.CENTER);
	Button lbSave = new Button("��������");
	Button lbGameTot = new Button("�������");
	
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
		lipl.add("�����");
		lipl.add("�޽�");
		lipl.add("������");
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
				lbre.setText("������ ���� �����ϼ���.");return;
			}
		}
		if(e.getSource()==btnReset)
		{
			tot=0; succ=0; fail=0; gameTot=10; cntS1=1; cntS2=2;
			lbtot.setText("������: "+tot+"����"); lbsucc.setText("������ "+succ+"ȸ");
			lbfail.setText("������ "+fail+"ȸ");
			lbTot.setText("�Ѱ��Ӱ���Ƚ��:"+gameTot);
			lbre.setText("���� �����ϼ���!!");
		}
		if(gameTot==0)
		{
			lbre.setText("��� ��Ⱑ �������ϴ�.");return;
		}		
		if(e.getSource()==bt1) //�߰Ÿ��� 30%
		{
			gameTot--;
			lbTot.setText("�Ѱ��Ӱ���Ƚ��:"+gameTot);
			int rd = (int)(Math.random()*10);
			if(rd==0 || rd==1 || rd==2)
			{
				lbre.setText(name+"��(��) �߰Ÿ��� ����!"); succ++; tot++;
				lbtot.setText("������: "+tot+"����"); lbsucc.setText("������ "+succ+"ȸ");
				lbfail.setText("������ "+fail+"ȸ");			
			}
			else
			{
				lbre.setText(name+"��(��) �߰Ÿ��� ����!"); fail++; tot++;
				lbtot.setText("������: "+tot+"����"); lbsucc.setText("������ "+succ+"ȸ");
				lbfail.setText("������ "+fail+"ȸ");
			}
		}
		if(e.getSource()==bt2) //��� 50%
		{
			if(cntS2==0)
			{
				lbre.setText("���̻� ����� ������");return;
			}
			gameTot--;
			cntS2--;
			lbTot.setText("�Ѱ��Ӱ���Ƚ��:"+gameTot);
			int rd = (int)(Math.random()*10);
			if(rd==0 || rd==1 || rd==2 || rd==3 || rd==4)
			{
				lbre.setText(name+"��(��) ��� ����!"); succ++; tot++;
				lbtot.setText("������: "+tot+"����"); lbsucc.setText("������ "+succ+"ȸ");
				lbfail.setText("������ "+fail+"ȸ");			
			}
			else
			{
				lbre.setText(name+"��(��) ��� ����!"); fail++; tot++;
				lbtot.setText("������: "+tot+"����"); lbsucc.setText("������ "+succ+"ȸ");
				lbfail.setText("������ "+fail+"ȸ");
			}
		}
		if(e.getSource()==bt3) //�г�Ƽ 90%
		{
			if(cntS1==0)
			{
				lbre.setText("���̻� �г�Ƽ���� ������");return;
			}
			gameTot--;
			cntS1--;			
			lbTot.setText("�Ѱ��Ӱ���Ƚ��:"+gameTot);			
			int rd = (int)(Math.random()*10);
			if(rd==0 || rd==1 || rd==2 || rd==3 || rd==4 || rd==5 || rd==6 || rd==7 || rd==8)
			{
				lbre.setText(name+"��(��) �г�Ƽ ����!"); succ++; tot++;
				lbtot.setText("������: "+tot+"����"); lbsucc.setText("������ "+succ+"ȸ");
				lbfail.setText("������ "+fail+"ȸ");			
			}
			else
			{
				lbre.setText(name+"��(��) �г�Ƽ ����!"); fail++; tot++;
				lbtot.setText("������: "+tot+"����"); lbsucc.setText("������ "+succ+"ȸ");
				lbfail.setText("������ "+fail+"ȸ");
			}
		}
		if(succ==8)
		{
			dlg1.setVisible(true);
		}
	}
	public void itemStateChanged(ItemEvent arg0) {

		name = lipl.getSelectedItem();
		if(arg0.getSource()==lipl) //��������
		{
			lbsc.setText("�౸����:"+name);
		}
	}
	void save() 
	{
		   try{
	            //���� ��ü ����
	            File file = new File("C:\\aaa\\work\\SoccerGame.txt");
	            Date nowDate = new Date();	            
	    		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd"); 
	            //���ϴ� ������ ���� ����
	    		String strNowDate = simpleDateFormat.format(nowDate); 
	    		//������ �������� ��ȯ	
	    
	            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file,true));	            
	            bufferedWriter.write(name+" / "+(10-gameTot)+"ȸ����"+" / "+"������:"+succ+" / "+"������:"+fail+" "+strNowDate+"\n");
	
	            bufferedWriter.close();          	          
	        }catch (IOException e) {}
		   
		   
	}//��������
	void load() 
	{
	   try{
            //���� ��ü ����
            File file = new File("C:\\aaa\\work\\SoccerGame.txt");
            //�Է� ��Ʈ�� ����
            FileReader filereader = new FileReader(file);
            //�Է� ���� ����
            BufferedReader bufReader = new BufferedReader(filereader);
            String line = "";            
            String data = "";
         
            while((line = bufReader.readLine()) != null){
            	data += line+"\n";
            }                   
            final Dialog dlg = new Dialog(this, "�������", true);
            dlg.setLayout(new BorderLayout());				
            dlg.add("Center", new TextArea(data));            
            Button bt = new Button("Ȯ��");
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
   }//���Ϸε�
}