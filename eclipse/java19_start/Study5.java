package java19_start;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Study5 {

	public static void main(String[] args) {
		TajaGame tj = new TajaGame();
	}

}
class TajaGame extends Frame implements ActionListener
{
	private Dimension dimen, dimen1;
	private int xpos, ypos;
	Font font10 = new Font ("SansSerif", Font.BOLD, 10);
	Font font20 = new Font ("SansSerif", Font.BOLD, 20);
	Font font30 = new Font ("SansSerif", Font.BOLD, 30);
	
	Label lbtj = new Label("타자:");
	TextField tf1 = new TextField(4);
	Button bts = new Button("게임스타트!");
	Label lbrm = new Label("타자이름 기입후 스타트");
	Label lbnow = new Label("현재기록");
	int an=0, ho=0, po=0;
	Label lban = new Label("안타: "+an);
	Label lbho = new Label("홈런: "+ho);
	Label lbpo = new Label("파울: "+po);
	Label lbsec = new Label("초세기");
	
	TajaGame()
	{
		super("타자게임");
		this.setSize(350,550);
		this.center();
		this.init();
		this.start();
		this.setVisible(true);
	}
	void init()
	{
		this.setLayout(null);
		this.add(lbtj); lbtj.setBounds(50,50,50,30); lbtj.setFont(font20);
		this.add(tf1); tf1.setBounds(110,50,170,30); tf1.setFont(font20);
		this.add(bts); bts.setBounds(100,110,150,50); bts.setFont(font20);
		this.add(lbrm); lbrm.setBounds(50,235,300,50); lbrm.setFont(font20);
		this.add(lbnow); lbnow.setBounds(50,300,150,50); lbnow.setFont(font20);
		this.add(lban); lban.setBounds(50,350,150,50); lban.setFont(font20);
		this.add(lbho); lbho.setBounds(50,400,150,50); lbho.setFont(font20);
		this.add(lbpo); lbpo.setBounds(50,450,150,50); lbpo.setFont(font20);
		this.add(lbsec); lbsec.setBounds(130,170,150,50); lbsec.setFont(font20);
	}
	void start()
	{
		this.addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent e){System.exit(0);}});
		tf1.addActionListener(this);
		bts.addActionListener(this);
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
		if(tf1.getText().equals("")){lbrm.setText("타자 이름 필요."); return;}
		
		try {lbsec.setText("3......"); Thread.sleep(500); lbsec.setText("3............");Thread.sleep(500); 
			 lbsec.setText("2......"); Thread.sleep(500); lbsec.setText("2............");Thread.sleep(500);
			 lbsec.setText("1......"); Thread.sleep(500); lbsec.setText("1............");Thread.sleep(500);
		
		int i = (int)(Math.random()*3);
		if(i==0)
		{
			lbrm.setText(tf1.getText()+"님이 안타를 쳤습니다!"); an+=1; lban.setText("안타: "+an);
		}
		else if(i==1)
		{
			lbrm.setText(tf1.getText()+"님이 홈런을 쳤습니다!"); ho+=1; lbho.setText("홈런: "+ho);
		}
		else if(i==2)
		{
			lbrm.setText(tf1.getText()+"님이 파울을 쳤습니다!"); po+=1; lbpo.setText("파울: "+po);
		}
		} catch (InterruptedException e1) {e1.printStackTrace();}
	}
}