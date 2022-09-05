package java19_start;

import java.awt.*;

public class Study1 {

	public static void main(String[] args) {
		Del d = new Del();
	}
}
class Del extends Frame
{
	private Dimension dimen, dimen1;
	private int xpos, ypos;
	Label top = new Label("회원삭제화면");
	Label id = new Label("아이디");
	TextField tfid = new TextField(10);
	Label list = new Label("회원리스트");
	Button search = new Button("대상검색");
	Button all = new Button("전체보기");
	TextArea tali = new TextArea();
	
	Del()
	{
		super("delete");
		init();
		setSize(450,560);
		center();	
		setVisible(true);
		
	}
	public void center()
	{
		dimen = Toolkit.getDefaultToolkit().getScreenSize();
		dimen1 = this.getSize();
		xpos = (int) (dimen.getWidth() / 2 - dimen1.getWidth() / 2);
		ypos = (int) (dimen.getHeight() / 2 - dimen1.getHeight() / 2);
		this.setLocation(xpos, ypos);
	}
	public void init()
	{
		Font font10 = new Font ("SansSerif", Font.BOLD, 10);
		Font font20 = new Font ("SansSerif", Font.PLAIN, 20);
		Font font30 = new Font ("SansSerif", Font.BOLD, 30);
		
		setLayout(null);
		add(top); top.setBounds(130,50,200,30); top.setFont(font30);
		add(id); id.setBounds(50,150,100,30); id.setFont(font20);
		add(tfid); tfid.setBounds(150,150,100,30); tfid.setFont(font20);
		add(search); search.setBounds(270,150,100,30); search.setFont(font20);
		add(all); all.setBounds(270,190,100,30); all.setFont(font20);
		add(list); list.setBounds(50,250,150,30); list.setFont(font20);
		add(tali); tali.setBounds(50,300,350,200); tali.setFont(font20);
	}
}