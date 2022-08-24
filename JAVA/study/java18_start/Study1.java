package java18_start;

import java.awt.*;

public class Study1 {

	public static void main(String[] args) {
		Login lo = new Login();
	}
}
class Login extends Frame
{
	private Dimension dimen, dimen1;
	private int xpos, ypos;
	
	private Label log = new Label("로그인");
	private Label id = new Label("아 이 디  : ");
	private Label pw = new Label("비밀번호 : ");
	private TextField tfid = new TextField(20);
	private TextField tfpw = new TextField(20);
	private Button btlog = new Button("로그인");
	private Button btjoin = new Button("회원가입");
	
	Login()
	{
		super("로그인");
		this.init();
		this.start();
		this.setSize(390,450);
		center();	
		this.setVisible(true);
	}
	
	public void init() 
	{
		Font font20 = new Font ("SansSerif", Font.BOLD, 20);
		Font font30 = new Font ("SansSerif", Font.BOLD, 30);
		// 화면 구성 넣을 부분
		this.setLayout(null);
		this.add(log); log.setBounds(150, 50, 100, 30);
		log.setFont(font30);
		
		this.add(id); id.setBounds(50, 150, 100, 30);
		id.setFont(font20);
		this.add(pw); pw.setBounds(50, 200, 100, 30);
		pw.setFont(font20);
		this.add(tfid); tfid.setBounds(200, 150, 100, 30);
		tfid.setFont(font20);
		this.add(tfpw); tfpw.setBounds(200, 200, 100, 30);
		tfpw.setFont(font20);
		
		this.add(btlog); btlog.setBounds(150, 300, 100, 30);
		btlog.setFont(font20);
		this.add(btjoin); btjoin.setBounds(150, 350, 100, 30);
		btjoin.setFont(font20);
	}
	public void start() 
	{
		// 이벤트나 쓰레드 처리할 부분
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