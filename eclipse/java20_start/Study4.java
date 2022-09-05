package java20_start;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Study4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hhhhhhhhhh h = new Hhhhhhhhhh();
	}

}
class Hhhhhhhhhh extends Frame implements MouseListener
{
	Button bt1 = new Button("+1점");
	Button bt2 = new Button("+2점");
	Button bt3 = new Button("+3점");
	int d=0;
	TextField tfnow = new TextField("현재점수:"+d+"점"); 
		
	Hhhhhhhhhh()
	{
		super("");
		this.setSize(270,290);
		this.init();
		this.start();
		this.setVisible(true);
	}
	void init()
	{
		this.setLayout(null);
		this.add(bt1); this.add(bt2); this.add(bt3); this.add(tfnow);
		bt1.setBounds(50,100,50,30); bt2.setBounds(110,100,50,30); bt3.setBounds(170,100,50,30); tfnow.setBounds(50,150,170,100);
	}
	void start()
	{
		bt1.addMouseListener(this);
		bt2.addMouseListener(this);
		bt3.addMouseListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==bt1)
		{
			d++; tfnow.setText("현재점수:"+d+"점");
		}
		else if(e.getSource()==bt2)
		{
			d+=2; tfnow.setText("현재점수:"+d+"점");
		}
		else if(e.getSource()==bt3)
		{
			d+=3; tfnow.setText("현재점수:"+d+"점");
		}
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==bt1){d++; tfnow.setText("현재점수:"+d+"점");}
		else if(e.getSource()==bt2){d+=2; tfnow.setText("현재점수:"+d+"점");}
		else if(e.getSource()==bt3){d+=3; tfnow.setText("현재점수:"+d+"점");}
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}