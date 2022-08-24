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

import javax.swing.JOptionPane;
	
class Join extends Frame implements ActionListener {
	
	private static final Component frame = null;
	Font font20 = new Font("SansSerif", Font.BOLD, 20);
	Font font30 = new Font("SansSerif", Font.BOLD, 30);
	private Dimension dimen, dimen1;
	private int xpos, ypos; // ����,��Ʈ
	
	Label lbjoin = new Label("ȸ������");
	Label lbid = new Label("���̵�:");
	Label lbpw = new Label("���:");
	Label lbpwck = new Label("���Ȯ��:");
	Label lbname = new Label("�̸�:");
	Label lbhp = new Label("����ó:");
	Label lbage = new Label("����:"); // ��
	TextField tfid = new TextField();
	TextField tfpw = new TextField();
	TextField tfpwck = new TextField();
	TextField tfname = new TextField();
	TextField tfhp = new TextField();
	TextField tfage = new TextField(); // �ؽ�Ʈ�ʵ�
	Button btjoin = new Button("�����ϱ�"); // ��ư.
	Join() {
		super();
		this.setSize(300,400);
		this.init();
		this.start();
		this.center();
		this.setVisible(true);
	}
	void init() {
		this.setLayout(null);
		this.add(lbjoin); lbjoin.setBounds(90,30,200,30); lbjoin.setFont(font30);
		this.add(lbid); lbid.setBounds(20,70,100,30); lbid.setFont(font20);
		this.add(lbpw); lbpw.setBounds(20,110,100,30); lbpw.setFont(font20);
		this.add(lbpwck); lbpwck.setBounds(20,150,100,30); lbpwck.setFont(font20);
		this.add(lbname); lbname.setBounds(20,190,100,30); lbname.setFont(font20);
		this.add(lbhp); lbhp.setBounds(20,230,100,30); lbhp.setFont(font20);
		this.add(lbage); lbage.setBounds(20,270,100,30); lbage.setFont(font20); // ��
		
		this.add(tfid); tfid.setBounds(120,70,150,30); tfid.setFont(font20);
		this.add(tfpw); tfpw.setBounds(120,110,150,30); tfpw.setFont(font20);
		this.add(tfpwck); tfpwck.setBounds(120,150,150,30); tfpwck.setFont(font20);
		this.add(tfname); tfname.setBounds(120,190,150,30); tfname.setFont(font20);
		this.add(tfhp); tfhp.setBounds(120,230,150,30); tfhp.setFont(font20);
		this.add(tfage); tfage.setBounds(120,270,150,30); tfage.setFont(font20); // ����
		this.add(btjoin); btjoin.setBounds(100,330,100,30); btjoin.setFont(font20);
		
	}
	void start() {
		this.addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent e){test();}
			});
		btjoin.addActionListener(this);
	}
	void test()
	{
		this.setVisible(false);
	}
	void center() {
		dimen = Toolkit.getDefaultToolkit().getScreenSize();
		dimen1 = this.getSize();
		xpos = (int) (dimen.getWidth() / 2 - dimen1.getWidth() / 2);
		ypos = (int) (dimen.getHeight() / 2 - dimen1.getHeight() / 2);
		this.setLocation(xpos, ypos);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btjoin) {
			
			String id = tfid.getText();
			String pw = tfpw.getText();
			String pwCk = tfpwck.getText();
			String name = tfname.getText();
			String hp = tfhp.getText();
			String age = tfage.getText();
			
			if(id.equals("")) {msg("���̵��Է����ּ���!"); return;}
			if(pw.equals("")) {msg("��й�ȣ�� �Է��ϼ���.");return;}
			if(pwCk.equals("")) {msg("���Ȯ���� �Է����ּ���!");return;}
			if(name.equals("")) {msg("�̸��� �Է����ּ���!");return;}
			if(hp.equals("")) {msg("����ó���Է����ּ���!");return;}
			if(age.equals("")) {msg("���̸��Է����ּ���!");return;}
			
			if(!pw.equals(pwCk)){msg("����̼��ΰ����ʽ��ϴ�.");return;} 
			
			insert(id,pw,name,hp,age);
		}
	}
	void insert(String id,String pw,String name,String hp,String age) {
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
		String pquery = "insert into member values (null, ?, ?, ?, ?)";
		PreparedStatement pstmt = null;
		try {			
			pstmt = conn.prepareStatement(pquery);
			pstmt.setString(1, id);
			pstmt.setString(2, name);
			pstmt.setString(3, pw);
			pstmt.setString(4, hp);
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
}