package java23_start;

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


class Imsi extends Frame implements ActionListener{
	
	Font font20 = new Font("SansSerif", Font.BOLD, 20);
	Font font30 = new Font("SansSerif", Font.BOLD, 30);
	private Dimension dimen, dimen1;
	private int xpos, ypos; // 센터,폰트
	
	Label lbTitle = new Label("조회화면");
	Label lbName = new Label("이름:");
	TextField tfName = new TextField();
	Button btSearch = new Button("검색");
	Button btAllSearch = new Button("전체검색");
	TextArea taAll = new TextArea();
	
	Imsi(){
		super("조회화면");
		this.center();
		this.init();
		this.start();
		this.setSize(325,470);
		this.setVisible(true);		
	}
	void init() {
		this.setLayout(null);
		this.add(lbTitle); lbTitle.setBounds(50,50,200,50); lbTitle.setFont(font30);
		this.add(lbName); lbName.setBounds(50,100,50,50); lbName.setFont(font20);
		this.add(tfName); tfName.setBounds(110,110,110,30); tfName.setFont(font20);
		this.add(btSearch); btSearch.setBounds(230,110,50,30); btSearch.setFont(font20);
		this.add(btAllSearch); btAllSearch.setBounds(180,160,100,30); btAllSearch.setFont(font20);
		this.add(taAll); taAll.setBounds(50,200,230,230); taAll.setFont(font20);
	}
	void center() {
		this.addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent e){System.exit(0);}});
		dimen = Toolkit.getDefaultToolkit().getScreenSize();
		dimen1 = this.getSize();
		xpos = (int) (dimen.getWidth() / 2 - dimen1.getWidth() / 2);
		ypos = (int) (dimen.getHeight() / 2 - dimen1.getHeight() / 2);
		this.setLocation(xpos, ypos);		
	}
	void start() {
		btSearch.addActionListener(this);
		btAllSearch.addActionListener(this);
	}	
	public void actionPerformed(ActionEvent e) {
			if(e.getSource()==btSearch) {
				search();
			}			
			if(e.getSource()==btAllSearch) {
				searchAll();
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
			taAll.setText(ta);								
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
			taAll.setText(ta);
			rs.close();
			stmt.close();
			conn.close();
		} catch (SQLException ee) {
			System.err.println("error = " + ee.toString());
		}
	}	
}