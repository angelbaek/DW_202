package join;

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

import javax.swing.JOptionPane;

class Login extends Frame implements ActionListener{
	
	private static final Component frame = null;
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
		String userId = tfId.getText();
		String pw = tfPw.getText();
		if(e.getSource()==btLogin) {
			search(userId,pw);
		}
		if(e.getSource()==btJoin) {
			Join jo = new Join();
		}		
	}	
	void imsg(String msg) {		
		final Dialog dlg = new Dialog(this, "알림 메세지창", true);
		dlg.setLayout(null);
		Label lbMsg = new Label(msg);
		
		dlg.add(lbMsg);	lbMsg.setFont(font20);
		lbMsg.setBounds(70, 70, 450, 30);
		
		dlg.setSize(250, 150);
		dlg.setLocation(840, 420);
		
		dlg.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dlg.setVisible(false);
			}
			
		});
		dlg.setVisible(true);
		if(msg.equals("로그인 성공")) {
			MainButton mb = new MainButton();
		}
	}
	void search(String userId, String pw) {
		try {
			Class.forName("org.gjt.mm.mysql.Driver");
		} catch (ClassNotFoundException ee) {
			System.exit(0);
		}
		Connection conn = null;
		/*String url = "jdbc:mysql://localhost:3306/java";*/
		String url = "jdbc:mysql://127.0.0.1:3306/dw202?"
					+ "useUnicode=true&characterEncoding=utf8";
		String id = "root";
		String pass = "qwer";
		Statement stmt = null;
		ResultSet rs = null;
		String query = "select * from member";
		try {
			conn = DriverManager.getConnection(url, id, pass);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			String result = "";
			while (rs.next()) {
				if(rs.getString(2).equals(userId) && rs.getString(4).equals(pw)) {
					result = "로그인 성공";break;
				}								
			}
			if(!result.equals("로그인 성공")) {				
				result = "로그인 실패";
			}
			imsg(result);
			rs.close();
			stmt.close();
			conn.close();
		} catch (SQLException ee) {
			System.err.println("error = " + ee.toString());
		}
	}
}