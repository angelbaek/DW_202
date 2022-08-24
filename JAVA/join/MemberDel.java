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

public class MemberDel extends Frame implements ActionListener {

	private Connection dc;
	Font font20 = new Font("SansSerif", Font.BOLD, 20);
	Font font30 = new Font("SansSerif", Font.BOLD, 30);
	private Dimension dimen, dimen1;
	private int xpos, ypos;
	
	Label lbTitle = new Label("ȸ������");
	Label lbName = new Label("�̸�:");
	Label lbList = new Label("ȸ������Ʈ");
	TextField tfName = new TextField();
	Button btSearch = new Button("�˻�");
	Button btAll = new Button("��ü����");
	Button btDel = new Button("�����ϱ�");
	TextArea ta = new TextArea();
	
	MemberDel(){
		super();
		this.setSize(350,500);
		this.setVisible(true);
		this.center();
		this.init();
		this.start();
	}
	void init() {
		this.setLayout(null);
		this.add(lbTitle); lbTitle.setBounds(100,50,150,50); lbTitle.setFont(font30);
		this.add(lbName); lbName.setBounds(30,120,50,30); lbName.setFont(font20);
		this.add(lbList); lbList.setBounds(30,260,120,30); lbList.setFont(font20);
		this.add(tfName); tfName.setBounds(100,120,150,30); tfName.setFont(font20);
		this.add(btSearch); btSearch.setBounds(260,120,50,30); btSearch.setFont(font20);
		this.add(btAll); btAll.setBounds(210,170,100,30); btAll.setFont(font20);
		this.add(btDel); btDel.setBounds(25,210,300,50); btDel.setFont(font20);
		this.add(ta); ta.setBounds(30,300,295,150); ta.setFont(font20);
			
	}
	void start() {
		btSearch.addActionListener(this);
		btDel.addActionListener(this);
		btAll.addActionListener(this);
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
	public void actionPerformed(ActionEvent e) {	
		String name = tfName.getText();
		if(e.getSource()==btSearch) {
			search();
		}
		if(e.getSource()==btAll) {
			searchAll();		
				}
		if(e.getSource()==btDel) {
			del(name);
		}
			}
	void search() {
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
			String ta = "";
			while (rs.next()) {
				if(rs.getString(3).equals(tfName.getText())) {
					ta = rs.getInt(1)+" / "+rs.getString(2)+" / "+rs.getString(3)+" / "+rs.getString(4)+" / "+rs.getString(5);
				}
			}
			this.ta.setText(ta);								
			rs.close();
			stmt.close();
			conn.close();
		} catch (SQLException ee) {
			System.err.println("error = " + ee.toString());
		}
	}
	void searchAll() {
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
			String ta = "";
			while (rs.next()) {
				/*System.out.println(rs.getInt(1) + " : " + rs.getString(2) + " : " + rs.getString(3) + " : " + rs.getString(4) + " : " + rs.getString(5));*/
				ta += rs.getInt(1) + " : " + rs.getString(2) + " : " + rs.getString(3) + " : " + rs.getString(4) + " : " + rs.getString(5)+"\n";					
			}
			this.ta.setText(ta);
			rs.close();
			stmt.close();
			conn.close();
		} catch (SQLException ee) {
			System.err.println("error = " + ee.toString());
		}
	}	
	void del(String name) {
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
		String query = "delete from member where name = ?";
		
		try {
			PreparedStatement pstmt = dc.prepareStatement(query);
			pstmt.setString(1, name);
			pstmt.executeUpdate();
			pstmt.close();
		} catch (SQLException ee) {
			imsg("��������!!");			
		}	
		imsg("�����Ǿ����ϴ�.");
	}	
	void imsg(String msg) {		
		final Dialog dlg = new Dialog(this, "�˸� �޼���â", true);
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
		if(msg.equals("�α��� ����")) {
			MainButton mb = new MainButton();
		}
	}
}
