package com.network;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Test2 extends Frame implements ActionListener{
	
	private static final long serialVersionUID = 1L;
	
	private TextArea ta;
	private TextField tf;
	
	private Test2(){
		
		ta = new TextArea();
		add(ta);
		
		tf = new TextField("http://");
		tf.addActionListener(this);
		add(tf,BorderLayout.NORTH);
		
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		
		setTitle("HTML VIEWR");
		setSize(1000, 1600);
		setVisible(true);
		
		
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
	
		try {
			String str;
			URL url = new URL(tf.getText());
			ta.setText("");
			//���1
			/*
			InputStream is = url.openStream();
			
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			*/
			
			URLConnection conn =url.openConnection();
			InputStream is = conn.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			
			String s = conn.getContentType();
			ta.setText("mime Type : " +s);
			
			while((str = br.readLine())!=null){
				
				if(ta.getText().equals("")){
					
					ta.setText(str);
					
				}else {
					
					ta.setText(ta.getText()+"\r\n"+str);
					
				}
				
			}
			
			is.close();
			
			
		} catch (Exception e2) {
			// TODO: handle exception
		}
	
	}



	public static void main(String[] args) {
		new Test2();
	}

}





















