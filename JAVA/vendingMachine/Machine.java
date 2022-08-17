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
	private int xpos, ypos; // ����,��Ʈ
	
	private Image imgMoka;
	private Image imgAme;
	private Image imgKafu; 	
	private Image imgCafe;
	private Image imgFra;
	private Image imgD; // �̹���
	
	Label lbTitle = new Label("���Ǳ�");
	int ea1;
	Label lbEa1 = new Label("����"+ea1+"��");
	int ea2;
	Label lbEa2 = new Label("����"+ea2+"��");
	int ea3;
	Label lbEa3 = new Label("����"+ea3+"��");
	int ea4;
	Label lbEa4 = new Label("����"+ea4+"��");
	int ea5;
	Label lbEa5 = new Label("����"+ea5+"��");
	int ea6;
	Label lbEa6 = new Label("����"+ea6+"��"); // ��
	
	String name1 = "��īĿ��";
	Button btMoka = new Button(name1);	
	String name2 = "�Ƹ޸�ī��";
	Button btAme = new Button(name2);
	String name3 = "īǪġ��";
	Button btKafu = new Button(name3);
	String name4 = "ī���";
	Button btCl = new Button(name4);
	String name5 = "����Ǫġ��";
	Button btFra = new Button(name5);
	String name6 = "�����";
	Button btBa = new Button(name6); // ��ư
	
	int price1 = 2500;
	Label lbPrice1 = new Label(price1+"��");
	int price2 = 2000;
	Label lbPrice2 = new Label(price2+"��");
	int price3 = 4000;
	Label lbPrice3 = new Label(price3+"��");
	int price4 = 3500;
	Label lbPrice4 = new Label(price4+"��");
	int price5 = 6000;
	Label lbPrice5 = new Label(price5+"��");
	int price6 = 15000;
	Label lbPrice6 = new Label(price6+"��");
	Label lbInMo = new Label("���Աݾ�"); // ��
	
	Button bt1Won = new Button("1000��");
	Button bt2Won = new Button("5000��");
	Button bt3Won = new Button("10000��");
	Button btPay = new Button("�����ϱ�"); // ��ư
	
	int nowPay; // ���� ��
	Label lbNowP = new Label("�����ܾ�: "+nowPay+"��");
	int pay; // ���� �ݾ�
	Label lbPay = new Label("�����ݾ�: "+pay+"��");	 // ����
	//����
	Label lbCho = new Label("���û�ǰ");
	private Image imgCho;
	Label lbChoName = new Label("");
	Label lbChoEa1 = new Label(""); // ��īĿ�� ����
	Label lbChoEa2 = new Label(""); // �Ƹ޸�ī�� ����
	Label lbChoEa3 = new Label(""); // īǪġ�� ����
	Label lbChoEa4 = new Label(""); // ī��� ����
	Label lbChoEa5 = new Label(""); // ����Ǫġ�� ����
	Label lbChoEa6 = new Label(""); // ����� ����
	Label lbChoPri = new Label("");
	// ī��Ʈ
	int countMoka;
	int countAme;
	int countKafu;
	int countCafe;
	int countFra;
	int countD;
	
	Machine(){ // ������
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
		imgMoka = Toolkit.getDefaultToolkit().getImage("��īĿ��.jpg");
		imgAme = Toolkit.getDefaultToolkit().getImage("�Ƹ޸�ī��.jpg");
		imgKafu = Toolkit.getDefaultToolkit().getImage("īǪġ��.jpg");
		imgCafe = Toolkit.getDefaultToolkit().getImage("ī���.jpg");
		imgFra = Toolkit.getDefaultToolkit().getImage("����Ǫġ��.jpg");
		imgD = Toolkit.getDefaultToolkit().getImage("�����.jpg");
		imgCho = Toolkit.getDefaultToolkit().getImage("�����.png");	
		
		this.add(lbTitle); lbTitle.setBounds(160,50,150,50); lbTitle.setFont(font30);
		
		this.add(lbEa1); lbEa1.setBounds(60,210,100,30); lbEa1.setFont(font20); // ����
		this.add(lbEa2); lbEa2.setBounds(175,210,100,30); lbEa2.setFont(font20);
		this.add(lbEa3); lbEa3.setBounds(285,210,100,30); lbEa3.setFont(font20);	
		
		this.add(btMoka); btMoka.setBounds(50,270,95,30); btMoka.setFont(font20); // ��ī
		this.add(lbPrice1); lbPrice1.setBounds(65,240,75,30); lbPrice1.setFont(font20);
		
		this.add(btAme); btAme.setBounds(155,270,110,30); btAme.setFont(font20); // �Ƹ�
		this.add(lbPrice2); lbPrice2.setBounds(180,240,100,30); lbPrice2.setFont(font20);
		
		this.add(btKafu); btKafu.setBounds(275,270,95,30); btKafu.setFont(font20); // īǪ
		this.add(lbPrice3); lbPrice3.setBounds(290,240,100,30); lbPrice3.setFont(font20);
		int y = 200; // y������ �̵�
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
		//����		
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
		final Dialog dlg = new Dialog(this, "�˸� �޼���â", true);
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
		final Dialog dlg = new Dialog(this, "�˸� �޼���â", true);
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
		if(e.getSource()==btMoka) { // ��īĿ��
			if(ea1<=0) {
				msg2("��īĿ�� ������ �����մϴ�");return;
			}
			imgCho = Toolkit.getDefaultToolkit().getImage("��īĿ��.jpg");
			this.repaint();
			ea1--;
			countMoka++;
			lbEa1.setText("����"+ea1+"��");
			lbChoName.setText(name1);
			lbChoEa1.setText(name1+": "+countMoka+"��");
			pay += price1;
			lbChoPri.setText("�ѱݾ� "+pay+"��");
			lbPay.setText("�����ݾ�: "+pay+"��");			
		}
		if(e.getSource()==btAme) { // �Ƹ޸�ī��
			if(ea2<=0) {
				msg2("�Ƹ޸�ī�� ������ �����մϴ�");return;
			}
			imgCho = Toolkit.getDefaultToolkit().getImage("�Ƹ޸�ī��.jpg");
			this.repaint();
			ea2--;
			countAme++;
			lbEa2.setText("����"+ea2+"��");
			lbChoName.setText(name2);
			lbChoEa2.setText(name2+": "+countAme+"��");
			pay += price2;
			lbChoPri.setText("�ѱݾ� "+pay+"��");
			lbPay.setText("�����ݾ�: "+pay+"��");
		}
		if(e.getSource()==btKafu) { // īǪġ��
			if(ea3<=0) {
				msg2("īǪġ�� ������ �����մϴ�");return;
			}
			imgCho = Toolkit.getDefaultToolkit().getImage("īǪġ��.jpg");
			this.repaint();
			ea3--;
			countKafu++;
			lbEa3.setText("����"+ea3+"��");
			lbChoName.setText(name3);
			lbChoEa3.setText(name3+": "+countKafu+"��");
			pay += price3;
			lbChoPri.setText("�ѱݾ� "+pay+"��");
			lbPay.setText("�����ݾ�: "+pay+"��");
		}
		if(e.getSource()==btCl) { // ī���
			if(ea4<=0) {
				msg2("ī��� ������ �����մϴ�");return;
			}
			imgCho = Toolkit.getDefaultToolkit().getImage("ī���.jpg");
			this.repaint();
			ea4--;
			countCafe++;
			lbEa4.setText("����"+ea4+"��");
			lbChoName.setText(name4);
			lbChoEa4.setText(name4+": "+countCafe+"��");
			pay += price4;
			lbChoPri.setText("�ѱݾ� "+pay+"��");
			lbPay.setText("�����ݾ�: "+pay+"��");
		}	
		if(e.getSource()==btFra) { // ����Ǫġ��
			if(ea5<=0) {
				msg2("����Ǫġ�� ������ �����մϴ�");return;
			}
			imgCho = Toolkit.getDefaultToolkit().getImage("����Ǫġ��.jpg");
			this.repaint();
			ea5--;
			countFra++;
			lbEa5.setText("����"+ea5+"��");
			lbChoName.setText(name5);
			lbChoEa5.setText(name5+": "+countFra+"��");
			pay += price5;
			lbChoPri.setText("�ѱݾ� "+pay+"��");
			lbPay.setText("�����ݾ�: "+pay+"��");
		}
		if(e.getSource()==btBa) { // �����
			if(ea6<=0) {
				msg2("����� ������ �����մϴ�");return;
			}
			imgCho = Toolkit.getDefaultToolkit().getImage("�����.jpg");
			this.repaint();
			ea6--;
			countD++;
			lbEa6.setText("����"+ea6+"��");
			lbChoName.setText(name6);
			lbChoEa6.setText(name6+": "+countD+"��");
			pay += price6;
			lbChoPri.setText("�ѱݾ� "+pay+"��");
			lbPay.setText("�����ݾ�: "+pay+"��");
		}
		if(e.getSource()==bt1Won) {
			nowPay += 1000;
			lbNowP.setText("�����ܾ�: "+nowPay+"��");
		}
		if(e.getSource()==bt2Won) {
			nowPay += 5000;
			lbNowP.setText("�����ܾ�: "+nowPay+"��");
		}
		if(e.getSource()==bt3Won) {
			nowPay += 10000;
			lbNowP.setText("�����ܾ�: "+nowPay+"��");
		}
		if(e.getSource()==btPay) {
			if(pay==0) {
				msg("��ǰ�� �����ϼ���."); return;
			}
			if(nowPay<pay) {
				msg("�ܾ��� �����մϴ�."); return;
			}
			msg("������ �Ϸ�Ǿ����ϴ�.");			
			imgCho = Toolkit.getDefaultToolkit().getImage("�����.png");
			nowPay -= pay;
			lbChoName.setText("");		
			lbChoEa1.setText("");
			lbChoEa2.setText("");
			lbChoEa3.setText("");
			lbChoEa4.setText("");
			lbChoEa5.setText("");
			lbChoEa6.setText("");
			lbChoPri.setText("");			
			lbNowP.setText("�����ܾ�: "+nowPay+"��");
			lbPay.setText("�����ݾ�: "+pay+"��");
			
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
			this.lbPrice1.setText(data[0][3]+"��");
			this.price1 = Integer.parseInt(data[0][3]);	
			lbEa1.setText("����"+ea1+"��");
			btMoka.setLabel(name1);
			
			this.name2 = data[1][1];
			this.ea2 = Integer.parseInt(data[1][2]);			
			this.lbPrice2.setText(data[1][3]+"��");
			this.price2 = Integer.parseInt(data[1][3]);
			lbEa2.setText("����"+ea2+"��");
			btAme.setLabel(name2);
			
			this.name3 = data[2][1];
			this.ea3 = Integer.parseInt(data[2][2]);			
			this.lbPrice3.setText(data[2][3]+"��");
			this.price3 = Integer.parseInt(data[2][3]);
			lbEa3.setText("����"+ea3+"��");
			btKafu.setLabel(name3);
			
			this.name4 = data[3][1];
			this.ea4 = Integer.parseInt(data[3][2]);			
			this.lbPrice4.setText(data[3][3]+"��");
			this.price4 = Integer.parseInt(data[3][3]);
			lbEa4.setText("����"+ea4+"��");
			btCl.setLabel(name4);
			
			this.name5 = data[4][1];
			this.ea5 = Integer.parseInt(data[4][2]);			
			this.lbPrice5.setText(data[4][3]+"��");
			this.price5 = Integer.parseInt(data[4][3]);
			lbEa5.setText("����"+ea5+"��");
			btFra.setLabel(name5);
			
			this.name6 = data[5][1];
			this.ea6 = Integer.parseInt(data[5][2]);			
			this.lbPrice6.setText(data[5][3]+"��");
			this.price6 = Integer.parseInt(data[5][3]);
			lbEa6.setText("����"+ea6+"��");
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
			System.out.println("����̺갡 �ֽ��ϴ�~! ^_^v");
		} catch (ClassNotFoundException ee) {
			System.out.println("����̺� ����!!");
		}
		Connection conn = null;
		String url = "jdbc:mysql://127.0.0.1:3306/dw202?useUnicode=true&characterEncoding=utf8";
		String user = "root";
		String password = "qwer";
		try {
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("����Ǿ����ϴ�.");
		} catch (SQLException ee) {
			System.err.println("���ᰴü ��������!!");
		}				
		String pquery = "update japangee set ea = ? where idx = ?";
		PreparedStatement pstmt = null;
		try {			
			pstmt = conn.prepareStatement(pquery);
			pstmt.setInt(1, ea);
			pstmt.setInt(2, idx);			
			pstmt.executeUpdate();
			System.out.println("���༺��");
		} catch (SQLException ee) {
			System.err.println("Query ���� Ŭ���� ���� ����~!! : " + ee.toString());
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
			System.err.println("�ݱ� ����~!!");
		}
	}
}
