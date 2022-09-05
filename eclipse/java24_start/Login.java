package java24_start;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class Login extends Frame implements ActionListener{
	
	Font font20 = new Font("SansSerif", Font.BOLD, 20);
	Font font30 = new Font("SansSerif", Font.BOLD, 30);
	private Dimension dimen, dimen1;
	private int xpos, ypos; // 센터,폰트
	Label lbTitle = new Label("로그인화면");
	Label lbId = new Label("아이디:");
	Label lbPw = new Label("패스워드:");
	TextField tfId = new TextField();
	TextField tfPw = new TextField();
	Button btLogin = new Button("로그인");
	Button btJoin = new Button("회원가입");
	
	Login(){
		super();
		this.setSize(320,460);
		this.setVisible(true);
		this.init();
		this.start();
		this.center();
	}
	void center(){
		this.addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent e){System.exit(0);}});
		dimen = Toolkit.getDefaultToolkit().getScreenSize();
		dimen1 = this.getSize();
		xpos = (int) (dimen.getWidth() / 2 - dimen1.getWidth() / 2);
		ypos = (int) (dimen.getHeight() / 2 - dimen1.getHeight() / 2);
		this.setLocation(xpos, ypos);	
	}
	
	void init() {
		this.setLayout(null);
		this.add(lbTitle); lbTitle.setBounds(85,50,180,50); lbTitle.setFont(font30);
		this.add(lbId); lbId.setBounds(30,150,100,50); lbId.setFont(font20);
		this.add(lbPw); lbPw.setBounds(30,200,100,50); lbPw.setFont(font20);
		this.add(tfId); tfId.setBounds(140,160,150,30); tfId.setFont(font20);
		this.add(tfPw); tfPw.setBounds(140,210,150,30); tfPw.setFont(font20);
		this.add(btLogin); btLogin.setBounds(110,300,100,30); btLogin.setFont(font20);
		this.add(btJoin); btJoin.setBounds(110,350,100,30); btJoin.setFont(font20);
	}
	void start() {
		btLogin.addActionListener(this);
		btJoin.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btLogin) {
			
		}
		if(e.getSource()==btJoin) {
			
		}
	}
}