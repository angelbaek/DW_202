package java19_start;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Study3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Print pr = new Print();
	}

}
class Print extends Frame implements ActionListener
{
	private Dimension dimen, dimen1;
	private int xpos, ypos;
	
	Label lbname = new Label("이름:");
	Label lbre = new Label("결과:");
	Label lbwait = new Label("대기중.");
	Label lbresult = new Label("결과:");
	TextField tfname = new TextField(20);
	TextField tfresult = new TextField(20);
	Button export = new Button("출력");
	
	Font font10 = new Font ("SansSerif", Font.BOLD, 10);
	Font font20 = new Font ("SansSerif", Font.PLAIN, 20);
	Font font30 = new Font ("SansSerif", Font.BOLD, 30);
	
	Print()
	{
		super("그냥");
		this.setSize(270,300);
		this.center();
		this.init();
		this.start();
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		String name = tfname.getText();
		lbwait.setText(name);
		tfresult.setText(name);
	}
	void center()
	{
		dimen = Toolkit.getDefaultToolkit().getScreenSize();
		dimen1 = this.getSize();
		xpos = (int) (dimen.getWidth() / 2 - dimen1.getWidth() / 2);
		ypos = (int) (dimen.getHeight() / 2 - dimen1.getHeight() / 2);
		this.setLocation(xpos, ypos);
	}
	void start()
	{
		this.addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent e){System.exit(0);}});
		
		export.addActionListener(this);
		tfname.addActionListener(this);
		tfresult.addActionListener(this);
	}
	void init()
	{
		setLayout(null);
		this.add(lbname); lbname.setBounds(50,50,50,30); lbname.setFont(font20);
		this.add(tfname); tfname.setBounds(110,50,100,30); tfname.setFont(font20);
		this.add(export); export.setBounds(100,110,50,30); export.setFont(font20);
		this.add(lbre); lbre.setBounds(50,170,50,30); lbre.setFont(font20);
		this.add(lbwait); lbwait.setBounds(110,170,100,30); lbwait.setFont(font20);
		this.add(lbresult); lbresult.setBounds(50,220,50,30); lbresult.setFont(font20);
		this.add(tfresult); tfresult.setBounds(110,220,100,30); tfresult.setFont(font20);
	}
}