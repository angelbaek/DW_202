package java17_start;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.Panel;

public class Test {

	public static void main(String[] args) {
		new Testing("테스트하기");
	}

}
class Testing extends Frame
{
	Choice ch;
	public Testing(String str)
	{
		super(str);
		ch = new Choice();
//		Panel p = new Panel();
//		Checkbox ck1 = new Checkbox("1",true);
//		Checkbox ck2 = new Checkbox("2");
//		Checkbox ck3 = new Checkbox("3");
//		p.add(ck1);
//		p.add(ck2);
//		p.add(ck3);
//		
//		CheckboxGroup ckg = new CheckboxGroup();
//		Checkbox ck4 = new Checkbox("1",ckg,true);
//		Checkbox ck5 = new Checkbox("2",ckg,false);
//		Checkbox ck6 = new Checkbox("3",ckg,false);
//		p.add(ck4);
//		p.add(ck5);
//		p.add(ck6);
		ch.addItem("1");
		ch.addItem("2");
		ch.addItem("3");
		
//		add(p);
		add(ch);
		setSize(200,100);
		setVisible(true);
	}
}