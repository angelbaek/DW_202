package java17_start;
import java.awt.*;
import java.util.Scanner;
public class Javaprograming {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ÿ��Ʋ �Է�:"); String title = sc.next();
		Programming p = new Programming(title);
	}
}
class Programming extends Frame
{
	private Dimension dimen, dimen1;
	private int xpos, ypos;
	Label lbTitle = new Label("�ڹ����α׷���");
	Label lbMent1 = new Label("���θ�");
	Label lbMent2 = new Label("�����Ϸ���");
	Label lbMent3 = new Label("��ư�� �����ÿ�");
	Button btnStart = new Button("����");
	Programming(String str)
	{
		super(str);
		this.setSize(500,400);
		this.center();
		this.init();
		this.setVisible(true);
	}
	void center()

	{
		dimen = Toolkit.getDefaultToolkit().getScreenSize();
		dimen1 = this.getSize();
		xpos = (int) (dimen.getWidth() / 2 - dimen1.getWidth() / 2);
		ypos = (int) (dimen.getHeight() / 2 - dimen1.getHeight() / 2);
		this.setLocation(xpos, ypos);
	}
	void init()
	{
		Font font20 = new Font ("SansSerif", Font.BOLD, 20);
		Font font30 = new Font ("SansSerif", Font.BOLD, 30);
				
		this.setLayout(null);
		this.add(lbTitle); lbTitle.setBounds(130, 50, 250, 50);
		lbTitle.setFont(font30);
		

		this.add(lbMent1); lbMent1.setBounds(130, 100, 250, 50);
		lbTitle.setFont(font20);
		

		this.add(lbMent2); lbMent2.setBounds(130, 150, 250, 50);
		lbTitle.setFont(font20);
		
		this.add(lbMent3); lbMent3.setBounds(130, 200, 250, 50);
		lbTitle.setFont(font20);
		
		this.add(btnStart); btnStart.setBounds(200,280,100,50);
		btnStart.setFont(font20);
	}
}