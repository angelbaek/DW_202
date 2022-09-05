package java19_start;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.im.InputContext;

public class Study4 
{
	public static void main(String[] args) {
		Imsi im = new Imsi();
	}
}
class Imsi extends Frame implements ActionListener
{
	private Dimension dimen, dimen1;
	private int xpos, ypos;
	Font font10 = new Font ("SansSerif", Font.BOLD, 10);
	Font font20 = new Font ("SansSerif", Font.PLAIN, 20);
	Font font30 = new Font ("SansSerif", Font.BOLD, 30);
	
	Label lbfirst = new Label("첫번째수:");
	Label lbsecond = new Label("두번째수:");
	Label lbresult = new Label("결과:");
	TextField tffirst = new TextField(20);
	TextField tfsecond = new TextField(20);
	TextField tfresult = new TextField(20);
	Button bp = new Button("+");
	Button bm = new Button("-");
	Button bg = new Button("*");
	Button bn = new Button("/");
	Imsi()
	{
		super("");
		this.setSize(340,450);
		this.center();
		this.init();
		this.start();
		this.setVisible(true);
	}
	void start()
	{
		this.addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent e){System.exit(0);}});
		bp.addActionListener(this);
		bm.addActionListener(this);
		bg.addActionListener(this);
		bn.addActionListener(this);
	}
	void init()
	{
		this.setLayout(null);
		this.add(lbfirst); lbfirst.setBounds(50,150,100,30); lbfirst.setFont(font20);
		this.add(lbsecond); lbsecond.setBounds(50,200,100,30); lbsecond.setFont(font20);
		this.add(lbresult); lbresult.setBounds(50,350,50,30); lbresult.setFont(font20);
		this.add(tffirst); tffirst.setBounds(170,150,100,30); tffirst.setFont(font20);
		this.add(tfsecond); tfsecond.setBounds(170,200,100,30); tfsecond.setFont(font20);
		this.add(tfresult); tfresult.setBounds(110,350,160,30); tfresult.setFont(font20);
		
		this.add(bp); bp.setBounds(50,250,50,50); bp.setFont(font20);
		this.add(bm); bm.setBounds(110,250,50,50); bm.setFont(font20);
		this.add(bg); bg.setBounds(170,250,50,50); bg.setFont(font20);
		this.add(bn); bn.setBounds(230,250,50,50); bn.setFont(font20);
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
		String num1 = tffirst.getText();
		String num2 = tffirst.getText();
		
		if(num1.equals("")||num2.equals(""))
		{
			return;
		}
		
		int first = Integer.parseInt(num1);
		int second = Integer.parseInt(num2);
		
		if(e.getSource()==bp)
		{
			int result = first + second;
			tfresult.setText(Integer.toString(result));
		}
		else if(e.getSource()==bm)
		{
			int result = first - second;
			tfresult.setText(Integer.toString(result));
		}
		else if(e.getSource()==bg)
		{
			int result = first * second;
			tfresult.setText(Integer.toString(result));
		}

		else if(e.getSource()==bn)
		{
			int result = first / second;
			tfresult.setText(Integer.toString(result));
		}
	}	
}