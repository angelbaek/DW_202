package vendingMachine;

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

public class Admin extends Frame implements ActionListener {	
	
	String data[][] = new String[6][4];
	Font font20 = new Font("SansSerif", Font.BOLD, 20);
	Font font30 = new Font("SansSerif", Font.BOLD, 30);
	private Dimension dimen, dimen1;
	private int xpos, ypos;
	
	Label lbTitle = new Label("자판기-관리자화면");
	Label lbName1 = new Label("상품1 이름: ");	TextField tfName1 = new TextField();
	Label lbName2 = new Label("상품2 이름: ");	TextField tfName2 = new TextField();
	Label lbName3 = new Label("상품3 이름: ");	TextField tfName3 = new TextField();
	Label lbName4 = new Label("상품4 이름: ");	TextField tfName4 = new TextField();
	Label lbName5 = new Label("상품5 이름: ");	TextField tfName5 = new TextField();
	Label lbName6 = new Label("상품6 이름: ");	TextField tfName6 = new TextField();
	
	Label lbEa1 = new Label("수량:"); TextField tfEa1 = new TextField();
	Label lbEa2 = new Label("수량:"); TextField tfEa2 = new TextField();
	Label lbEa3 = new Label("수량:"); TextField tfEa3 = new TextField();
	Label lbEa4 = new Label("수량:"); TextField tfEa4 = new TextField();
	Label lbEa5 = new Label("수량:"); TextField tfEa5 = new TextField();
	Label lbEa6 = new Label("수량:"); TextField tfEa6 = new TextField();
	
	Label lbPrice1 = new Label("가격:");	TextField tfPrice1 = new TextField();
	Label lbPrice2 = new Label("가격:");	TextField tfPrice2 = new TextField();
	Label lbPrice3 = new Label("가격:");	TextField tfPrice3 = new TextField();
	Label lbPrice4 = new Label("가격:");	TextField tfPrice4 = new TextField();
	Label lbPrice5 = new Label("가격:");	TextField tfPrice5 = new TextField();
	Label lbPrice6 = new Label("가격:");	TextField tfPrice6 = new TextField();
	
	Button btApply1 = new Button("적용");	Button btApply2 = new Button("적용");
	Button btApply3 = new Button("적용");	Button btApply4 = new Button("적용");
	Button btApply5 = new Button("적용");	Button btApply6 = new Button("적용");	
	
	Admin(){
		super();
		this.setSize(710,430);
		this.setVisible(true);
		this.init();
		this.start();
		this.center();	
		getData();
	}	
	
	void init() {
		this.setLayout(null);
		this.add(lbTitle); lbTitle.setBounds(50,50,200,50); lbTitle.setFont(font30); // 타이틀
		
		this.add(lbName1); lbName1.setBounds(30,110,120,30); lbName1.setFont(font20);
		this.add(lbEa1); lbEa1.setBounds(290,110,50,30); lbEa1.setFont(font20);
		this.add(tfEa1); tfEa1.setBounds(350,110,70,30); tfEa1.setFont(font20);
		this.add(lbPrice1); lbPrice1.setBounds(440,110,50,30); lbPrice1.setFont(font20);
		this.add(tfPrice1); tfPrice1.setBounds(500,110,100,30); tfPrice1.setFont(font20);
		this.add(btApply1); btApply1.setBounds(620,110,50,30); btApply1.setFont(font20);
		this.add(tfName1); tfName1.setBounds(150,110,120,30); tfName1.setFont(font20); // 1번
		int y = 50;
		this.add(lbName2); lbName2.setBounds(30,110+y,120,30); lbName2.setFont(font20);
		this.add(lbEa2); lbEa2.setBounds(290,110+y,50,30); lbEa2.setFont(font20);
		this.add(tfEa2); tfEa2.setBounds(350,110+y,70,30); tfEa2.setFont(font20);
		this.add(lbPrice2); lbPrice2.setBounds(440,110+y,50,30); lbPrice2.setFont(font20);
		this.add(tfPrice2); tfPrice2.setBounds(500,110+y,100,30); tfPrice2.setFont(font20);
		this.add(btApply2); btApply2.setBounds(620,110+y,50,30); btApply2.setFont(font20);
		this.add(tfName2); tfName2.setBounds(150,110+y,120,30); tfName2.setFont(font20); // 2번
		y += 50;
		this.add(lbName3); lbName3.setBounds(30,110+y,120,30); lbName3.setFont(font20);
		this.add(lbEa3); lbEa3.setBounds(290,110+y,50,30); lbEa3.setFont(font20);
		this.add(tfEa3); tfEa3.setBounds(350,110+y,70,30); tfEa3.setFont(font20);
		this.add(lbPrice3); lbPrice3.setBounds(440,110+y,50,30); lbPrice3.setFont(font20);
		this.add(tfPrice3); tfPrice3.setBounds(500,110+y,100,30); tfPrice3.setFont(font20);
		this.add(btApply3); btApply3.setBounds(620,110+y,50,30); btApply3.setFont(font20);
		this.add(tfName3); tfName3.setBounds(150,110+y,120,30); tfName3.setFont(font20); // 3번
		y += 50;
		this.add(lbName4); lbName4.setBounds(30,110+y,120,30); lbName4.setFont(font20);
		this.add(lbEa4); lbEa4.setBounds(290,110+y,50,30); lbEa4.setFont(font20);
		this.add(tfEa4); tfEa4.setBounds(350,110+y,70,30); tfEa4.setFont(font20);
		this.add(lbPrice4); lbPrice4.setBounds(440,110+y,50,30); lbPrice4.setFont(font20);
		this.add(tfPrice4); tfPrice4.setBounds(500,110+y,100,30); tfPrice4.setFont(font20);
		this.add(btApply4); btApply4.setBounds(620,110+y,50,30); btApply4.setFont(font20);
		this.add(tfName4); tfName4.setBounds(150,110+y,120,30); tfName4.setFont(font20); // 4번
		y += 50;
		this.add(lbName5); lbName5.setBounds(30,110+y,120,30); lbName5.setFont(font20);
		this.add(lbEa5); lbEa5.setBounds(290,110+y,50,30); lbEa5.setFont(font20);
		this.add(tfEa5); tfEa5.setBounds(350,110+y,70,30); tfEa5.setFont(font20);
		this.add(lbPrice5); lbPrice5.setBounds(440,110+y,50,30); lbPrice5.setFont(font20);
		this.add(tfPrice5); tfPrice5.setBounds(500,110+y,100,30); tfPrice5.setFont(font20);
		this.add(btApply5); btApply5.setBounds(620,110+y,50,30); btApply5.setFont(font20);
		this.add(tfName5); tfName5.setBounds(150,110+y,120,30); tfName5.setFont(font20); // 5번
		y += 50;
		this.add(lbName6); lbName6.setBounds(30,110+y,120,30); lbName6.setFont(font20);
		this.add(lbEa6); lbEa6.setBounds(290,110+y,50,30); lbEa6.setFont(font20);
		this.add(tfEa6); tfEa6.setBounds(350,110+y,70,30); tfEa6.setFont(font20);
		this.add(lbPrice6); lbPrice6.setBounds(440,110+y,50,30); lbPrice6.setFont(font20);
		this.add(tfPrice6); tfPrice6.setBounds(500,110+y,100,30); tfPrice6.setFont(font20);
		this.add(btApply6); btApply6.setBounds(620,110+y,50,30); btApply6.setFont(font20);
		this.add(tfName6); tfName6.setBounds(150,110+y,120,30); tfName6.setFont(font20); // 6번		
	}
	void start() {
		btApply1.addActionListener(this);
		btApply2.addActionListener(this);
		btApply3.addActionListener(this);
		btApply4.addActionListener(this);
		btApply5.addActionListener(this);
		btApply6.addActionListener(this);
	}
	void center() {		
		this.addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent e){System.exit(1);;}});
		dimen = Toolkit.getDefaultToolkit().getScreenSize();
		dimen1 = this.getSize();
		xpos = (int) (dimen.getWidth() / 2 - dimen1.getWidth() / 2);
		ypos = (int) (dimen.getHeight() / 2 - dimen1.getHeight() / 2);
		this.setLocation(xpos, ypos);
	}
	boolean spaceEmpty(String name, String ea,String pr) {
		if(name.equals("")) {this.msg("상품을 입력하세요"); return true;}
		if(ea.equals("")) {this.msg("갯수를 입력하세요"); return true;}
		if(pr.equals("")) {this.msg("가격을 입력하세요"); return true;}
		return false;		
	}
	public void actionPerformed(ActionEvent e) {	
		
		String name1 = tfName1.getText();
		String ea1 = tfEa1.getText();
		String price1 = tfPrice1.getText(); // 1번
		String name2 = tfName2.getText();
		String ea2 = tfEa2.getText();
		String price2 = tfPrice2.getText(); // 2번
		String name3 = tfName3.getText();
		String ea3 = tfEa3.getText();
		String price3 = tfPrice3.getText(); // 3번
		String name4 = tfName4.getText();
		String ea4 = tfEa4.getText();
		String price4 = tfPrice4.getText(); // 4번
		String name5 = tfName5.getText();
		String ea5 = tfEa5.getText();
		String price5 = tfPrice5.getText(); // 5번
		String name6 = tfName6.getText();
		String ea6 = tfEa6.getText();
		String price6 = tfPrice6.getText(); // 6번
		
		if(e.getSource() == btApply1) {	
			if(spaceEmpty(name1,ea1,price1)){
				return;
			}
			else update(name1, ea1, price1,1);
			msg("적용되었습니다.");
		}
		if(e.getSource() == btApply2) {	
			if(spaceEmpty(name2,ea2,price2)){
				return;
			}
			else update(name2, ea2, price2,2);
			msg("적용되었습니다.");
		}
		if(e.getSource() == btApply3) {		
			if(spaceEmpty(name3,ea3,price3)){
				return;
			}
			else update(name3, ea3, price3,3);
			msg("적용되었습니다.");
		}
		if(e.getSource() == btApply4) {		
			if(spaceEmpty(name4,ea4,price4)){
				return;
			}
			else update(name4, ea4, price4,4);
			msg("적용되었습니다.");
		}
		if(e.getSource() == btApply5) {		
			if(spaceEmpty(name5,ea5,price5)){
				return;
			}
			else update(name5, ea5, price5,5);
			msg("적용되었습니다.");
		}
		if(e.getSource() == btApply6) {		
			if(spaceEmpty(name6,ea6,price6)){
				return;
			}
			else update(name6, ea6, price6,6);
			msg("적용되었습니다.");
		}
	}
	void update(String name,String ea,String price,int idx) {
		try {
			Class.forName("org.gjt.mm.mysql.Driver");
			System.out.println("드라이브가 있습니당~! ^_^v");
		} catch (ClassNotFoundException ee) {
			System.out.println("드라이브 없음!!");
		}
		Connection conn = null;
		String url = "jdbc:mysql://127.0.0.1:3306/dw202?useUnicode=true&characterEncoding=utf8";
		String user = "root";
		String password = "qwer";
		try {
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("연결되었습니다.");
		} catch (SQLException ee) {
			System.err.println("연결객체 생성실패!!");
		}				
		String pquery = "update japangee set name = ?, ea = ?, price = ? where idx = ?";
		PreparedStatement pstmt = null;
		try {			
			pstmt = conn.prepareStatement(pquery);
			pstmt.setString(1, name);
			pstmt.setString(2, ea);
			pstmt.setString(3, price);
			pstmt.setInt(4, idx);
			pstmt.executeUpdate();
			System.out.println("실행성공");
		} catch (SQLException ee) {
			System.err.println("Query 실행 클래스 생성 에러~!! : " + ee.toString());
		}				
		try {		
			pstmt.close();		
			if (conn != null) {
				if (!conn.isClosed()) {
					conn.close();
				}
				conn = null;
			}
		} catch (SQLException ee) {
			System.err.println("닫기 실패~!!");
		}
	}
	void msg(String msg)
	{
		final Dialog dlg = new Dialog(this, "알림 메세지창", true);
		dlg.setLayout(null);
		Label lbMsg = new Label(msg);
		
		dlg.add(lbMsg);	lbMsg.setFont(font20);
		lbMsg.setBounds(70, 70, 450, 30);
		
		dlg.setSize(350, 150);
		dlg.setLocation(840, 420);
		
		dlg.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dlg.setVisible(false);
			}
		});
		dlg.setVisible(true);
	}	
	void getData() {
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
		String query = "select * from japangee";
		try {
			conn = DriverManager.getConnection(url, id, pass);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);	
			int i = 0;
			while(rs.next()) {
				data[i][0] = rs.getInt("idx")+"";
				data[i][1] = rs.getString("name");
				data[i][2] = rs.getString("ea");
				data[i][3] = rs.getString("price");
				i++;
			}
			tfName1.setText(data[0][1]);
			tfEa1.setText(data[0][2]);
			tfPrice1.setText(data[0][3]);
			
			tfName2.setText(data[1][1]);
			tfEa2.setText(data[1][2]);
			tfPrice2.setText(data[1][3]);
			
			tfName3.setText(data[2][1]);
			tfEa3.setText(data[2][2]);
			tfPrice3.setText(data[2][3]);
			
			tfName4.setText(data[3][1]);
			tfEa4.setText(data[3][2]);
			tfPrice4.setText(data[3][3]);
			
			tfName5.setText(data[4][1]);
			tfEa5.setText(data[4][2]);
			tfPrice5.setText(data[4][3]);
			
			tfName6.setText(data[5][1]);
			tfEa6.setText(data[5][2]);
			tfPrice6.setText(data[5][3]);
			
			rs.close();
			stmt.close();
			conn.close();
		} catch (SQLException ee) {
			System.err.println("error = " + ee.toString());
		}
	}
}
