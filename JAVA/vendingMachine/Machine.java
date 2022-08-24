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
import java.util.Date;

public class Machine extends Frame implements ActionListener{
	
	String data[][] = new String[6][4];
	
	Font font20 = new Font("SansSerif", Font.BOLD, 20);
	Font font30 = new Font("SansSerif", Font.BOLD, 30);
	private Dimension dimen, dimen1;
	private int xpos, ypos; // 센터,폰트
	
	private Image imgMoka;
	private Image imgAme;
	private Image imgKafu; 	
	private Image imgCafe;
	private Image imgFra;
	private Image imgD; // 이미지
	
	Label lbTitle = new Label("자판기");
	int ea1;
	Label lbEa1 = new Label("수량"+ea1+"개");
	int ea2;
	Label lbEa2 = new Label("수량"+ea2+"개");
	int ea3;
	Label lbEa3 = new Label("수량"+ea3+"개");
	int ea4;
	Label lbEa4 = new Label("수량"+ea4+"개");
	int ea5;
	Label lbEa5 = new Label("수량"+ea5+"개");
	int ea6;
	Label lbEa6 = new Label("수량"+ea6+"개"); // 라벨
	
	String name1 = "모카커피";
	Button btMoka = new Button(name1);	
	String name2 = "아메리카노";
	Button btAme = new Button(name2);
	String name3 = "카푸치노";
	Button btKafu = new Button(name3);
	String name4 = "카페라떼";
	Button btCl = new Button(name4);
	String name5 = "프라푸치노";
	Button btFra = new Button(name5);
	String name6 = "된장라떼";
	Button btBa = new Button(name6); // 버튼
	
	int price1 = 2500;
	Label lbPrice1 = new Label(price1+"원");
	int price2 = 2000;
	Label lbPrice2 = new Label(price2+"원");
	int price3 = 4000;
	Label lbPrice3 = new Label(price3+"원");
	int price4 = 3500;
	Label lbPrice4 = new Label(price4+"원");
	int price5 = 6000;
	Label lbPrice5 = new Label(price5+"원");
	int price6 = 15000;
	Label lbPrice6 = new Label(price6+"원");
	Label lbInMo = new Label("투입금액"); // 라벨
	
	Button bt1Won = new Button("1000원");
	Button bt2Won = new Button("5000원");
	Button bt3Won = new Button("10000원");
	Button btPay = new Button("결제하기"); // 버튼
	
	int nowPay; // 현재 돈
	Label lbNowP = new Label("현재잔액: "+nowPay+"원");
	int pay; // 결제 금액
	Label lbPay = new Label("결제금액: "+pay+"원");	 // 변수
	//선택
	Label lbCho = new Label("선택상품");
	private Image imgCho;
	Label lbChoName = new Label("");
	Label lbChoEa1 = new Label(""); // 모카커피 수량
	Label lbChoEa2 = new Label(""); // 아메리카노 수량
	Label lbChoEa3 = new Label(""); // 카푸치노 수량
	Label lbChoEa4 = new Label(""); // 카페라떼 수량
	Label lbChoEa5 = new Label(""); // 프라푸치노 수량
	Label lbChoEa6 = new Label(""); // 된장라떼 수량
	Label lbChoPri = new Label("");
	// 카운트
	int countMoka;
	int countAme;
	int countKafu;
	int countCafe;
	int countFra;
	int countD;
	
	Machine(){ // 생성자
		super();
		this.setSize(620,650);
		this.setVisible(true);
		this.init();
		this.start();
		this.center();				
		while (true) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException ee) {
			}
			this.repaint();
		}
		
	}
	void init() {
		getData();
		this.setLayout(null);
		imgMoka = Toolkit.getDefaultToolkit().getImage("모카커피.jpg");
		imgAme = Toolkit.getDefaultToolkit().getImage("아메리카노.jpg");
		imgKafu = Toolkit.getDefaultToolkit().getImage("카푸치노.jpg");
		imgCafe = Toolkit.getDefaultToolkit().getImage("카페라떼.jpg");
		imgFra = Toolkit.getDefaultToolkit().getImage("프라푸치노.jpg");
		imgD = Toolkit.getDefaultToolkit().getImage("된장라떼.jpg");
		imgCho = Toolkit.getDefaultToolkit().getImage("대기중.png");	
		
		this.add(lbTitle); lbTitle.setBounds(160,50,150,50); lbTitle.setFont(font30);
		
		this.add(lbEa1); lbEa1.setBounds(60,210,100,30); lbEa1.setFont(font20); // 수량
		this.add(lbEa2); lbEa2.setBounds(175,210,100,30); lbEa2.setFont(font20);
		this.add(lbEa3); lbEa3.setBounds(285,210,100,30); lbEa3.setFont(font20);	
		
		this.add(btMoka); btMoka.setBounds(50,270,95,30); btMoka.setFont(font20); // 모카
		this.add(lbPrice1); lbPrice1.setBounds(65,240,75,30); lbPrice1.setFont(font20);
		
		this.add(btAme); btAme.setBounds(155,270,110,30); btAme.setFont(font20); // 아메
		this.add(lbPrice2); lbPrice2.setBounds(180,240,100,30); lbPrice2.setFont(font20);
		
		this.add(btKafu); btKafu.setBounds(275,270,95,30); btKafu.setFont(font20); // 카푸
		this.add(lbPrice3); lbPrice3.setBounds(290,240,100,30); lbPrice3.setFont(font20);
		int y = 200; // y값으로 이동
		this.add(lbEa4); lbEa4.setBounds(60,y+210,100,30); lbEa4.setFont(font20);
		this.add(lbEa5); lbEa5.setBounds(175,y+210,100,30); lbEa5.setFont(font20);
		this.add(lbEa6); lbEa6.setBounds(285,y+210,100,30); lbEa6.setFont(font20);
		this.add(btCl); btCl.setBounds(50,y+270,95,30); btCl.setFont(font20);
		this.add(btFra); btFra.setBounds(155,y+270,110,30); btFra.setFont(font20);
		this.add(btBa); btBa.setBounds(275,y+270,95,30); btBa.setFont(font20);
		this.add(lbPrice4); lbPrice4.setBounds(65,y+240,100,30); lbPrice4.setFont(font20);
		this.add(lbPrice5); lbPrice5.setBounds(180,y+240,100,30); lbPrice5.setFont(font20);
		this.add(lbPrice6); lbPrice6.setBounds(285,y+240,100,30); lbPrice6.setFont(font20);
		
		this.add(lbInMo); lbInMo.setBounds(50,510,100,20); 
		this.add(bt1Won); bt1Won.setBounds(45,530,100,30); bt1Won.setFont(font20);
		this.add(bt2Won); bt2Won.setBounds(155,530,100,30); bt2Won.setFont(font20);
		this.add(bt3Won); bt3Won.setBounds(270,530,100,30); bt3Won.setFont(font20);
		this.add(btPay); btPay.setBounds(420,510,150,50); btPay.setFont(font30);
		this.add(lbNowP); lbNowP.setBounds(40,580,200,50); lbNowP.setFont(font20);
		this.add(lbPay); lbPay.setBounds(400,580,200,50); lbPay.setFont(font20);
		//선택		
		this.add(lbCho); lbCho.setBounds(430,50,200,50); lbCho.setFont(font30);				
		this.add(lbChoName); lbChoName.setBounds(450,210,150,30); lbChoName.setFont(font20);		
		this.add(lbChoEa1); lbChoEa1.setBounds(420,260,200,30); lbChoEa1.setFont(font20);
		this.add(lbChoEa2); lbChoEa2.setBounds(420,290,200,30); lbChoEa2.setFont(font20);
		this.add(lbChoEa3); lbChoEa3.setBounds(420,320,200,30); lbChoEa3.setFont(font20);
		this.add(lbChoEa4); lbChoEa4.setBounds(420,350,200,30); lbChoEa4.setFont(font20);
		this.add(lbChoEa5); lbChoEa5.setBounds(420,380,200,30); lbChoEa5.setFont(font20);
		this.add(lbChoEa6); lbChoEa6.setBounds(420,410,200,30); lbChoEa6.setFont(font20);		
		
		this.add(lbChoPri); lbChoPri.setBounds(420,470,200,30); lbChoPri.setFont(font20);
	}
	void start() {
		btMoka.addActionListener(this);		
		btAme.addActionListener(this);		
		btKafu.addActionListener(this);		
		btFra.addActionListener(this);		
		btCl.addActionListener(this);		
		btBa.addActionListener(this);
		bt1Won.addActionListener(this);		
		bt2Won.addActionListener(this);		
		bt3Won.addActionListener(this);		
		btPay.addActionListener(this);
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
	void msg2(String msg)
	{
		final Dialog dlg = new Dialog(this, "알림 메세지창", true);
		dlg.setLayout(null);
		Label lbMsg = new Label(msg);
		
		dlg.add(lbMsg);	lbMsg.setFont(font20);
		lbMsg.setBounds(30, 70, 450, 30);
		
		dlg.setSize(350, 150);
		dlg.setLocation(840, 420);
		
		dlg.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dlg.setVisible(false);
			}
		});
		dlg.setVisible(true);
	}
	void center() {
		this.addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent e){System.exit(1);;}});
		dimen = Toolkit.getDefaultToolkit().getScreenSize();
		dimen1 = this.getSize();
		xpos = (int) (dimen.getWidth() / 2 - dimen1.getWidth() / 2);
		ypos = (int) (dimen.getHeight() / 2 - dimen1.getHeight() / 2);
		this.setLocation(xpos, ypos);
	}
	public void paint(Graphics g) {		
		g.drawImage(imgMoka, 50, 100, 100, 100, this);
		g.drawImage(imgAme, 160, 100, 100, 100, this);
		g.drawImage(imgKafu, 270, 100, 100, 100, this);
		g.drawImage(imgCafe, 50, 305, 100, 100, this);
		g.drawImage(imgFra, 160, 305, 100, 100, this);
		g.drawImage(imgD, 270, 305, 100, 100, this);
		g.drawImage(imgCho, 450, 110, 100, 100, this);
	}
	public void actionPerformed(ActionEvent e) {		
		if(e.getSource()==btMoka) { // 모카커피
			if(ea1<=0) {
				msg2("모카커피 수량이 부족합니다");return;
			}
			imgCho = Toolkit.getDefaultToolkit().getImage("모카커피.jpg");
			this.repaint();
			ea1--;
			countMoka++;
			lbEa1.setText("수량"+ea1+"개");
			lbChoName.setText(name1);
			lbChoEa1.setText(name1+": "+countMoka+"개");
			pay += price1;
			lbChoPri.setText("총금액 "+pay+"원");
			lbPay.setText("결제금액: "+pay+"원");			
		}
		if(e.getSource()==btAme) { // 아메리카노
			if(ea2<=0) {
				msg2("아메리카노 수량이 부족합니다");return;
			}
			imgCho = Toolkit.getDefaultToolkit().getImage("아메리카노.jpg");
			this.repaint();
			ea2--;
			countAme++;
			lbEa2.setText("수량"+ea2+"개");
			lbChoName.setText(name2);
			lbChoEa2.setText(name2+": "+countAme+"개");
			pay += price2;
			lbChoPri.setText("총금액 "+pay+"원");
			lbPay.setText("결제금액: "+pay+"원");
		}
		if(e.getSource()==btKafu) { // 카푸치노
			if(ea3<=0) {
				msg2("카푸치노 수량이 부족합니다");return;
			}
			imgCho = Toolkit.getDefaultToolkit().getImage("카푸치노.jpg");
			this.repaint();
			ea3--;
			countKafu++;
			lbEa3.setText("수량"+ea3+"개");
			lbChoName.setText(name3);
			lbChoEa3.setText(name3+": "+countKafu+"개");
			pay += price3;
			lbChoPri.setText("총금액 "+pay+"원");
			lbPay.setText("결제금액: "+pay+"원");
		}
		if(e.getSource()==btCl) { // 카페라떼
			if(ea4<=0) {
				msg2("카페라떼 수량이 부족합니다");return;
			}
			imgCho = Toolkit.getDefaultToolkit().getImage("카페라떼.jpg");
			this.repaint();
			ea4--;
			countCafe++;
			lbEa4.setText("수량"+ea4+"개");
			lbChoName.setText(name4);
			lbChoEa4.setText(name4+": "+countCafe+"개");
			pay += price4;
			lbChoPri.setText("총금액 "+pay+"원");
			lbPay.setText("결제금액: "+pay+"원");
		}	
		if(e.getSource()==btFra) { // 프라푸치노
			if(ea5<=0) {
				msg2("프라푸치노 수량이 부족합니다");return;
			}
			imgCho = Toolkit.getDefaultToolkit().getImage("프라푸치노.jpg");
			this.repaint();
			ea5--;
			countFra++;
			lbEa5.setText("수량"+ea5+"개");
			lbChoName.setText(name5);
			lbChoEa5.setText(name5+": "+countFra+"개");
			pay += price5;
			lbChoPri.setText("총금액 "+pay+"원");
			lbPay.setText("결제금액: "+pay+"원");
		}
		if(e.getSource()==btBa) { // 된장라떼
			if(ea6<=0) {
				msg2("된장라떼 수량이 부족합니다");return;
			}
			imgCho = Toolkit.getDefaultToolkit().getImage("된장라떼.jpg");
			this.repaint();
			ea6--;
			countD++;
			lbEa6.setText("수량"+ea6+"개");
			lbChoName.setText(name6);
			lbChoEa6.setText(name6+": "+countD+"개");
			pay += price6;
			lbChoPri.setText("총금액 "+pay+"원");
			lbPay.setText("결제금액: "+pay+"원");
		}
		if(e.getSource()==bt1Won) {
			nowPay += 1000;
			lbNowP.setText("현재잔액: "+nowPay+"원");
		}
		if(e.getSource()==bt2Won) {
			nowPay += 5000;
			lbNowP.setText("현재잔액: "+nowPay+"원");
		}
		if(e.getSource()==bt3Won) {
			nowPay += 10000;
			lbNowP.setText("현재잔액: "+nowPay+"원");
		}
		if(e.getSource()==btPay) {
			if(pay==0) {
				msg("상품을 선택하세요."); return;
			}
			if(nowPay<pay) {
				msg("잔액이 부족합니다."); return;
			}
			msg("결제가 완료되었습니다.");			
			imgCho = Toolkit.getDefaultToolkit().getImage("대기중.png");
			nowPay -= pay;
			lbChoName.setText("");		
			lbChoEa1.setText("");
			lbChoEa2.setText("");
			lbChoEa3.setText("");
			lbChoEa4.setText("");
			lbChoEa5.setText("");
			lbChoEa6.setText("");
			lbChoPri.setText("");			
			lbNowP.setText("현재잔액: "+nowPay+"원");
			lbPay.setText("결제금액: "+pay+"원");
			
			countMoka=0;
			countAme=0;
			countKafu=0;
			countCafe=0;
			countFra=0;
			countD=0;
			pay=0;
			update(ea1,1);
			update(ea2,2);
			update(ea3,3);
			update(ea4,4);
			update(ea5,5);
			update(ea6,6);
		}
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
			this.name1 = data[0][1];
			this.ea1 = Integer.parseInt(data[0][2]);			
			this.lbPrice1.setText(data[0][3]+"원");
			this.price1 = Integer.parseInt(data[0][3]);	
			lbEa1.setText("수량"+ea1+"개");
			btMoka.setLabel(name1);
			
			this.name2 = data[1][1];
			this.ea2 = Integer.parseInt(data[1][2]);			
			this.lbPrice2.setText(data[1][3]+"원");
			this.price2 = Integer.parseInt(data[1][3]);
			lbEa2.setText("수량"+ea2+"개");
			btAme.setLabel(name2);
			
			this.name3 = data[2][1];
			this.ea3 = Integer.parseInt(data[2][2]);			
			this.lbPrice3.setText(data[2][3]+"원");
			this.price3 = Integer.parseInt(data[2][3]);
			lbEa3.setText("수량"+ea3+"개");
			btKafu.setLabel(name3);
			
			this.name4 = data[3][1];
			this.ea4 = Integer.parseInt(data[3][2]);			
			this.lbPrice4.setText(data[3][3]+"원");
			this.price4 = Integer.parseInt(data[3][3]);
			lbEa4.setText("수량"+ea4+"개");
			btCl.setLabel(name4);
			
			this.name5 = data[4][1];
			this.ea5 = Integer.parseInt(data[4][2]);			
			this.lbPrice5.setText(data[4][3]+"원");
			this.price5 = Integer.parseInt(data[4][3]);
			lbEa5.setText("수량"+ea5+"개");
			btFra.setLabel(name5);
			
			this.name6 = data[5][1];
			this.ea6 = Integer.parseInt(data[5][2]);			
			this.lbPrice6.setText(data[5][3]+"원");
			this.price6 = Integer.parseInt(data[5][3]);
			lbEa6.setText("수량"+ea6+"개");
			btBa.setLabel(name6);
			
			this.repaint();
			rs.close();
			stmt.close();
			conn.close();
		} catch (SQLException ee) {
			System.err.println("error = " + ee.toString());
		}
	}
	void update(int ea, int idx) {
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
		String pquery = "update japangee set ea = ? where idx = ?";
		PreparedStatement pstmt = null;
		try {			
			pstmt = conn.prepareStatement(pquery);
			pstmt.setInt(1, ea);
			pstmt.setInt(2, idx);			
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
}
