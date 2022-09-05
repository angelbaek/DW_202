package java20_start;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Study3 {
	public static void main(String[] args) {		
		Friends2 f = new Friends2();		
	}
}
class Friends2 extends Frame implements ActionListener{
	//폰트를 자주사용해서 위에 클래스 변수로 배치해놓음.
	Font font20 = new Font("SansSerif", Font.PLAIN, 20);
	Font font30 = new Font("SansSerif", Font.BOLD, 30);
	private Dimension dimen, dimen1;
	private int xpos, ypos;
	
	Label lbName = new Label("이름:");
	Label lbHp = new Label("전번:");
	Label lbAddr = new Label("주소:");
	Label lbList = new Label("친구리스트");
	Label lbMent = new Label("알림대기...");
	TextField tfName = new TextField();
	TextField tfHp = new TextField();
	TextField tfAddr = new TextField();
	Button btn = new Button("추가하기");
	Button btnSave = new Button("파일저장");
	Button btnRead = new Button("읽어오기");
	TextArea ta = new TextArea();
	
	String result ="";
	int cnt=0;
	Friends2()
	{
		super("친구리스트");
		this.setSize(850,300);
		this.center();
		this.init();
		this.start();	
		this.setVisible(true);
	}
	void init()
	{
		this.setLayout(null);
		this.add(lbAddr);		this.add(lbHp);
		this.add(lbName);		this.add(lbList);
		this.add(btn);			this.add(ta);
		this.add(tfName);		this.add(tfHp);
		this.add(tfAddr); 		this.add(lbMent);
		this.add(btnSave); 		this.add(btnRead);
		
		lbName.setBounds(50, 50, 50, 30);lbName.setFont(font20);
		lbHp.setBounds(50, 100, 50, 30);lbHp.setFont(font20);
		lbAddr.setBounds(50, 150, 50, 30);lbAddr.setFont(font20);
		tfName.setBounds(120, 50, 150, 30);tfName.setFont(font20);
		tfHp.setBounds(120, 100, 150, 30);tfHp.setFont(font20);
		tfAddr.setBounds(120, 150, 150, 30);tfAddr.setFont(font20);
		lbMent.setBounds(70, 190, 300, 30);lbMent.setFont(font20);
		btn.setBounds(120, 240, 150, 30);btn.setFont(font20);
		
		lbList.setBounds(300, 50, 150, 30);lbList.setFont(font20);
		ta.setBounds(300, 100, 370, 170);ta.setFont(font20);
		
		btnSave.setBounds(700, 100, 120, 30);btnSave.setFont(font20);
		btnRead.setBounds(700, 170, 120, 30);btnRead.setFont(font20);	
		
		
	}
	void start()
	{
		btn.addActionListener(this);
		btnSave.addActionListener(this);
		btnRead.addActionListener(this);
		
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	void center() {
		dimen = Toolkit.getDefaultToolkit().getScreenSize();
		dimen1 = this.getSize();
		xpos = (int) (dimen.getWidth() / 2 - dimen1.getWidth() / 2);
		ypos = (int) (dimen.getHeight() / 2 - dimen1.getHeight() / 2);
		this.setLocation(xpos, ypos);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btn)
		{
			String name = tfName.getText();
			String hp = tfHp.getText();
			String addr = tfAddr.getText();
			
			//공백체크...
			if(name.equals("")) {
				lbMent.setText("이름을 입력해주세요!");
				return;
			}
			if(hp.equals("")) {
				lbMent.setText("전번을 입력해주세요!");
				return;
			}
			if(addr.equals("")) {
				lbMent.setText("주소를 입력해주세요!");
				return;
			}
			cnt++;//한명증가
			//결과처리
			result += cnt+"번:"+name +" / "+ hp +" / "+ addr+"\n";
			ta.setText(result);
			
			//초기화
			tfName.setText("");
			tfHp.setText("");
			tfAddr.setText("");
		}
		else if(e.getSource() == btnSave)
		{
			save();
		}
		else if(e.getSource() == btnRead)
		{
			load();
		}
		
		
	}
	void save() {
		   try{
	            //파일 객체 생성
	            File file = new File("C:\\aaa\\work\\friends.txt");
	            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));

    		
	            bufferedWriter.write(result);	                        	             
	            bufferedWriter.close();           
	            ta.setText("");
	            result="";
	        }catch (IOException e) {
	            System.out.println(e);
	        }
		   
		   
	   }//파일저장
	   void load() {
		   try{
	            //파일 객체 생성
	            File file = new File("C:\\aaa\\work\\friends.txt");
	            //입력 스트림 생성
	            FileReader filereader = new FileReader(file);
	            //입력 버퍼 생성
	            BufferedReader bufReader = new BufferedReader(filereader);
	            String line = "";            
	            String data = "";
	            cnt = 0;
	            while((line = bufReader.readLine()) != null){
	            	data += line+"\n";
	            	result += line+"\n";
	            	cnt++;	            	
	            }         
	            ta.setText(data);
	            
	            bufReader.close();
	        }catch (FileNotFoundException e) { 
	        }catch(IOException e){           
	        }
		   
		   
	   }//파일로드
	
	
}














