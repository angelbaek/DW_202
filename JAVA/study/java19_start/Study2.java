package java19_start;

import java.awt.*;

public class Study2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cal c = new Cal();
	}

}
class Cal extends Frame
{
	private Dimension dimen, dimen1;
	private int xpos, ypos;
	
	Button c1 = new Button("1");
	Button c2 = new Button("2");
	Button c3 = new Button("3");
	Button c4 = new Button("4");
	Button c5 = new Button("5");
	Button c6 = new Button("6");
	Button c7 = new Button("7");
	Button c8 = new Button("8");
	Button c9 = new Button("9");
	Button cp = new Button("+");
	Button cm = new Button("-");
	Button cg = new Button("*");
	Button cn = new Button("/");
	Button cc = new Button("C");
	Button c0 = new Button("0");
	Button ce = new Button("=");
	
	Label to = new Label("결과:");
	
	TextField tfto = new TextField(30);
	
	Font font10 = new Font ("SansSerif", Font.BOLD, 10);
	Font font20 = new Font ("SansSerif", Font.BOLD, 20);
	Font font30 = new Font ("SansSerif", Font.BOLD, 30);
	
	Cal()
	{
		super("계산기");
		setSize(315,365);
		center();
		init();
		setVisible(true);
	}
	public void init()
	{
		this.setLayout(null);
		this.add(c1); c1.setBounds(50,50,50,50); c1.setFont(font30);
		this.add(c2); c2.setBounds(105,50,50,50); c2.setFont(font30);
		this.add(c3); c3.setBounds(160,50,50,50); c3.setFont(font30);
		this.add(c4); c4.setBounds(50,105,50,50); c4.setFont(font30);
		this.add(c5); c5.setBounds(105,105,50,50); c5.setFont(font30);
		this.add(c6); c6.setBounds(160,105,50,50); c6.setFont(font30);
		this.add(c7); c7.setBounds(50,160,50,50); c7.setFont(font30);
		this.add(c8); c8.setBounds(105,160,50,50); c8.setFont(font30);
		this.add(c9); c9.setBounds(160,160,50,50); c9.setFont(font30);
		this.add(cp); cp.setBounds(215,50,50,50); cp.setFont(font30);
		this.add(cm); cm.setBounds(215,105,50,50); cm.setFont(font30);
		this.add(cg); cg.setBounds(215,160,50,50); cg.setFont(font30);
		this.add(cn); cn.setBounds(215,215,50,50); cn.setFont(font30);
		this.add(cc); cc.setBounds(50,215,50,50); cc.setFont(font30);
		this.add(c0); c0.setBounds(105,215,50,50); c0.setFont(font30);
		this.add(ce); ce.setBounds(160,215,50,50); ce.setFont(font30);
		this.add(to); to.setBounds(50,280,50,50); to.setFont(font20);
		this.add(tfto); tfto.setBounds(110,290,155,30); tfto.setFont(font30);
	}
	public void center()
	{
		dimen = Toolkit.getDefaultToolkit().getScreenSize();
		dimen1 = this.getSize();
		xpos = (int) (dimen.getWidth() / 2 - dimen1.getWidth() / 2);
		ypos = (int) (dimen.getHeight() / 2 - dimen1.getHeight() / 2);
		this.setLocation(xpos, ypos);
	}
}