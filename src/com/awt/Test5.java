package com.awt;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
	


public class Test5  extends Frame implements ActionListener{

	private static final long serialVersionUID = 1L;
	
	private TextField[] tf = new TextField[4];
	
	private Label result = new Label("",Label.LEFT);
	
	private Button btn1;
	private Button btn2;
	
	public Test5(){
		
		String[] title = {"이름","국어","영어","수학","총점"};
		setTitle("성적처리");
		setLayout(null);
		setSize(260,180);
		setResizable(false);
		
		for(int i =0; i<5;i++){
			
			Label lbl = new Label();
			lbl.setText(title[i]);
			
			lbl.setBounds(10, (i+1)*30, 50, 20);
			
			add(lbl);
			
			//Textfield
			if(i!=4){
				tf[i]= new TextField();
				
				tf[i].setBounds(80, (i+1)*30, 70, 20);
				tf[i].addKeyListener(new KeyHandler());
				
				add(tf[i]);
			}else{
				
				result.setBounds(80, (i+1)*30, 70, 20);
				add(result);
				
			}
		}
		
		btn1 = new Button("결과");
		btn1.setBounds(180, 30, 60, 20);
		add(btn1);
		btn1.addActionListener(this);
		btn1.addKeyListener(new KeyHandler());
		
		//종료
		btn2 = new Button("종료");
		btn2.setBounds(180, 60, 60, 20);
		add(btn2);
		btn2.addActionListener(this);
		
		
		
		
		
		addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		
		
		setVisible(true);
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object ob = e.getSource();
		if(ob instanceof Button){
			
			Button b = (Button)ob;
			
			if(b == btn1){
				
				excute();
				
			}else if (b == btn2){
				
				System.exit(0);
			}
			
			
		}
		
	}
	
	private void excute(){
		
		int tot = 0;
		
		try {
			for(int i =1 ;i<4;i++){
				tot += Integer.parseInt(tf[i].getText());
			}
			
			result.setText(Integer.toString(tot));
			
		} catch (Exception e2) {
			result.setText("입력오류!");
		}
		
	}
	
	
	class KeyHandler extends KeyAdapter{

		@Override
		public void keyPressed(KeyEvent e) {
			Object ob = e.getSource();
			if(e.getKeyCode()!=KeyEvent.VK_ENTER){
				return;
			}
			
			if(ob instanceof Button){
				
				Button b = (Button)ob;
				if(b == btn1){
					excute();
				}
				return;
				
			}
			
			if(ob instanceof TextField){
				
				TextField t = (TextField)ob;
				for(int i= 0; i<tf.length;i++){
					
					if(i!=3 && tf[i]==t){
						tf[i+1].requestFocus();
					}else if(tf[3]==t){
						btn1.requestFocus();
						return;
						
					}
					
				}
				
			}
			
		}
		
		
		
	}




	public static void main(String[] args) {
		new Test5();
	}

}




















