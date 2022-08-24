package java17_start;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;

public class MyAWTFrame {
	private Frame fr;
	
	public MyAWTFrame(String str)
	{
		initialize(str);
	}
	
	public static void main(String[] args) {
		MyAWTFrame myfr = new MyAWTFrame("MyAWTFrameTitle");
		myfr.fr.setVisible(true);
	}
	
	private void initialize(String str) {
		fr = new Frame(str);
		Button bt1 = new Button("North");
		Button bt2 = new Button("South");
		Button bt3 = new Button("East");
		Button bt4 = new Button("West");
		Button bt5 = new Button("Center");
//		Panel pn = new Panel();
//		Checkbox ck1 = new Checkbox("First");
//		Checkbox ck2 = new Checkbox("Second");
//		Checkbox ck3 = new Checkbox("Third");
		
		fr.setLayout(new FlowLayout(FlowLayout.RIGHT, 0,0));
		fr.add(bt1);
		fr.add(bt2);
		fr.add(bt3);
		fr.add(bt4);
		fr.add(bt5);
		
//		pn.add(ck1);
//		pn.add(ck2);
//		pn.add(ck3);
//		fr.add(pn,BorderLayout.CENTER);
		
		fr.setSize(200, 200);
	}
}