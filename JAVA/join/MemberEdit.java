package join;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MemberEdit extends Frame implements ActionListener {
	private Connection dc;
	Font font20 = new Font("SansSerif", Font.BOLD, 20);
	Font font30 = new Font("SansSerif", Font.BOLD, 30);
	private Dimension dimen, dimen1;
	private int xpos, ypos;
	Label lbTitle = new Label("회원수정");
	Label lbId = new Label("아이디:");
	Label lbName = new Label("이름:");
	Label lbPw = new Label("비번:");
	Label lbHp = new Label("연락처:");
	Label lbAge = new Label("나이:");
	TextField tfId = new TextField();
	TextField tfName = new TextField();
	TextField tfPw = new TextField();
	TextField tfHp = new TextField();
	TextField tfAge = new TextField();
	Button btSearch = new Button("검색");
	Button btCom = new Button("수정완료");
	
	MemberEdit(){
		super("회원수정");
		this.setSize(325,450);
		this.setVisible(true);		
		this.center();
		this.init();
		this.start();		
	}
	void init() {
		this.setLayout(null);
		this.add(lbTitle); lbTitle.setBounds(100,50,150,50); lbTitle.setFont(font30);
		this.add(lbId); lbId.setBounds(20,100,100,30); lbId.setFont(font20);
		this.add(lbName); lbName.setBounds(20,150,100,30); lbName.setFont(font20);
		this.add(lbPw); lbPw.setBounds(20,200,100,30); lbPw.setFont(font20);
		this.add(lbHp); lbHp.setBounds(20,250,100,30); lbHp.setFont(font20);
		this.add(lbAge); lbAge.setBounds(20,300,100,30); lbAge.setFont(font20);
		this.add(tfId); tfId.setBounds(120,100,120,30); tfId.setFont(font20);
		this.add(tfName); tfName.setBounds(120,150,120,30); tfName.setFont(font20);
		this.add(tfPw); tfPw.setBounds(120,200,120,30); tfPw.setFont(font20);
		this.add(tfHp); tfHp.setBounds(120,250,120,30); tfHp.setFont(font20);
		this.add(tfAge); tfAge.setBounds(120,300,120,30); tfAge.setFont(font20);
		this.add(btSearch); btSearch.setBounds(250,100,50,30); btSearch.setFont(font20);
		this.add(btCom); btCom.setBounds(90,350,150,50); btCom.setFont(font20);
		
	}
	void center() {
		this.addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent e){close();}});
		dimen = Toolkit.getDefaultToolkit().getScreenSize();
		dimen1 = this.getSize();
		xpos = (int) (dimen.getWidth() / 2 - dimen1.getWidth() / 2);
		ypos = (int) (dimen.getHeight() / 2 - dimen1.getHeight() / 2);
		this.setLocation(xpos, ypos);		
	}
	void close() {
		this.setVisible(false);
	}
	void start() {
		btSearch.addActionListener(this);
		btCom.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {	
		
		String userId = tfId.getText();
		String name = tfName.getText();
		String pw = tfPw.getText();
		String hp = tfHp.getText();
		
		if(e.getSource()==btSearch) {
			search(userId);
		}
		if(e.getSource()==btCom) {
			edit(userId,name,pw,hp);
		}		
	}
	void search(String userId) {
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
			while (rs.next()) {
				if(rs.getString(2).equals(userId)) {
					tfName.setText(rs.getString(3));
					tfPw.setText(rs.getString(4));
					tfHp.setText(rs.getString(5));					
				}
			}								
			rs.close();
			stmt.close();
			conn.close();
		} catch (SQLException ee) {
			System.err.println("error = " + ee.toString());
		}
	}
	void edit(String userId, String name, String pw, String hp) {		
		try {
			Class.forName("org.gjt.mm.mysql.Driver");
		} catch (ClassNotFoundException ee) {
			return;
		}
		String url = "jdbc:mysql://127.0.0.1:3306/dw202?useUnicode=true&characterEncoding=utf8";
		String id = "root";
		String pass = "qwer";
		try {
			dc = DriverManager.getConnection(url, id, pass);
		} catch (SQLException ee) {
		}
		String query = "update member set name = ?, pw = ?, hp = ? where id = ?";
		
		try {
			PreparedStatement pstmt = dc.prepareStatement(query);
			pstmt.setString(1, name);
			pstmt.setString(2, pw);
			pstmt.setString(3, hp);
			pstmt.setString(4, userId);
			pstmt.executeUpdate();
			pstmt.close();
		} catch (SQLException ee) {
			imsg("수정실패!!");			
		}	
		imsg("수정되었습니다!");
	}
	void imsg(String msg) {		
		final Dialog dlg = new Dialog(this, "알림 메세지창", true);
		dlg.setLayout(null);
		Label lbMsg = new Label(msg);
		
		dlg.add(lbMsg);	lbMsg.setFont(font20);
		lbMsg.setBounds(50, 70, 450, 30);
		
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
}
