package java18_start;

import java.awt.*;

public class Study2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Join jo = new Join();
	}

}
class Join extends Frame
{
	private Dimension dimen, dimen1;
	private int xpos, ypos;
	Label join = new Label("회원가입");
	Label id = new Label("아이디:");
	Label pw = new Label("비밀번호:");
	Label pwck = new Label("비번확인:");
	Label name = new Label("이름:");
	Label hp = new Label("전번:");
	Button ck = new Button("중복체크");
	Button fin = new Button("가입완료");
	
	TextField tfid = new TextField(20);
	TextField tfpw = new TextField(20);
	TextField tfck = new TextField(20);
	TextField tfnm = new TextField(20);
	TextField tfhp = new TextField(20);
	Join()
	{
		super("회원가입");
		init();
		setSize(450,500);
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
		Font font20 = new Font ("SansSerif", Font.BOLD, 20);
		Font font30 = new Font ("SansSerif", Font.BOLD, 30);
		setLayout(null);
		
		add(join); join.setBounds(165, 70, 150, 30);
		join.setFont(font30);
		
		add(id); id.setBounds(50, 150, 100, 30);
		id.setFont(font20);
		add(tfid); tfid.setBounds(150, 150, 150, 30);
		tfid.setFont(font20);
		
		add(pw); pw.setBounds(50, 200, 100, 30);
		pw.setFont(font20);
		add(tfpw); tfpw.setBounds(150, 200, 150, 30);
		tfpw.setFont(font20);
		
		add(pwck); pwck.setBounds(50, 250, 100, 30);
		pwck.setFont(font20);
		add(tfck); tfck.setBounds(150, 250, 150, 30);
		tfck.setFont(font20);
		
		add(name); name.setBounds(50, 300, 100, 30);
		name.setFont(font20);
		add(tfnm); tfnm.setBounds(150, 300, 150, 30);
		tfnm.setFont(font20);
		
		add(hp); hp.setBounds(50, 350, 100, 30);
		hp.setFont(font20);
		add(tfhp); tfhp.setBounds(150, 350, 150, 30);
		tfhp.setFont(font20);
		
		add(ck); ck.setBounds(310, 150, 100, 30);
		ck.setFont(font20);
		add(fin); fin.setBounds(175, 425, 100, 30);
		fin.setFont(font20);
	}
}