package join;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainButton extends Frame implements ActionListener {
	
	Font font20 = new Font("SansSerif", Font.BOLD, 20);
	Font font30 = new Font("SansSerif", Font.BOLD, 30);
	private Dimension dimen, dimen1;
	private int xpos, ypos;
	Label lbTitle = new Label("메인화면");
	Button btLook = new Button("회원조회");
	Button btEdit = new Button("회원수정");
	Button btDel = new Button("회원삭제");
	Button btInv = new Button("회원가입");
	Button btExit = new Button("종료");
	
	MainButton(){
		super("메인화면");
		this.setSize(300,400);
		this.setVisible(true);
		this.center();
		this.init();
		this.start();
	}
	void init() {
		this.setLayout(null);
		this.add(lbTitle); lbTitle.setBounds(90,50,200,50);; lbTitle.setFont(font30);
		this.add(btLook); btLook.setBounds(100,120,100,30); btLook.setFont(font20);
		this.add(btEdit); btEdit.setBounds(100,160,100,30); btEdit.setFont(font20);
		this.add(btDel); btDel.setBounds(100,200,100,30); btDel.setFont(font20);
		this.add(btInv); btInv.setBounds(100,240,100,30); btInv.setFont(font20);
		this.add(btExit); btExit.setBounds(100,310,100,30); btExit.setFont(font20);		
	}
	void start() {
		btLook.addActionListener(this);
		btEdit.addActionListener(this);
		btDel.addActionListener(this);
		btInv.addActionListener(this);
		btExit.addActionListener(this);
	}
	void center() {
		this.addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent e){close();}});
		dimen = Toolkit.getDefaultToolkit().getScreenSize();
		dimen1 = this.getSize();
		xpos = (int) (dimen.getWidth() / 2 - dimen1.getWidth() / 2);
		ypos = (int) (dimen.getHeight() / 2 - dimen1.getHeight() / 2);
		this.setLocation(xpos, ypos);
	}	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btLook) {
			LookUp l = new LookUp();
		}
		if(e.getSource()==btEdit) {
			MemberEdit edit = new MemberEdit();
		}
		if(e.getSource()==btDel) {
			MemberDel d = new MemberDel();
		}
		if(e.getSource()==btInv) {
			Join j = new Join();	
				}
		if(e.getSource()==btExit) {
			System.exit(0);
		}
	}
	void close() {
		this.setVisible(false);
	}
}
