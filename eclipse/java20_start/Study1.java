package java20_start;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Study1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List li = new List();
	}

}
class List extends Frame implements ActionListener
{
	private Dimension dimen, dimen1;
	private int xpos, ypos;
	Font font10 = new Font ("SansSerif", Font.BOLD, 10);
	Font font20 = new Font ("SansSerif", Font.BOLD, 20);
	Font font30 = new Font ("SansSerif", Font.BOLD, 30);
	int i=1;
	String result="";
	
	Label lbname = new Label("이름:");
	Label lbhp = new Label("전번:");
	Label lbaddr = new Label("주소:");
	Label lblist = new Label("회원리스트");
	TextField tfname = new TextField();
	TextField tfhp = new TextField();
	TextField tfaddr = new TextField();
	Button btadd = new Button("추가하기");
	TextArea tali = new TextArea("");
	
	List()
	{
		super("회원관리");
		this.setSize(800,500);
		this.init();
		this.start();
		this.center();
		this.setVisible(true);
	}
	void init()
	{
		this.setLayout(null);
		this.add(lbname); lbname.setBounds(50,70,50,30); lbname.setFont(font20);
		this.add(lbhp); lbhp.setBounds(50,120,50,30); lbhp.setFont(font20);
		this.add(lbaddr); lbaddr.setBounds(50,170,50,30); lbaddr.setFont(font20);
		this.add(lblist); lblist.setBounds(400,70,150,30); lblist.setFont(font20);
		this.add(tfname); tfname.setBounds(110,70,200,30); tfname.setFont(font20);
		this.add(tfhp); tfhp.setBounds(110,120,200,30); tfhp.setFont(font20);
		this.add(tfaddr); tfaddr.setBounds(110,170,200,30); tfaddr.setFont(font20);
		this.add(btadd); btadd.setBounds(110,250,150,40); btadd.setFont(font20);
		this.add(tali); tali.setBounds(400,120,350,300); tali.setFont(font20);
	}
	void start()
	{
		this.addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent e){System.exit(0);}});
		tfname.addActionListener(this);
		tfhp.addActionListener(this);
		tfaddr.addActionListener(this);
		btadd.addActionListener(this);
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
		String name = tfname.getText();
		String hp = tfhp.getText();
		String addr = tfaddr.getText();
		result += i+"번/"+name+"/"+hp+"/"+addr+"\n";
		
		if(name.equals(""))
		{
			return;
		}
		if(hp.equals(""))
		{
			return;
		}
		if(addr.equals(""))
		{
			return;
		}
		i++;
		tali.setText(result);
	}
}