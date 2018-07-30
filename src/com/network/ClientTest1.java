package com.network;

import java.awt.BorderLayout;
import java.awt.Button;
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
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ClientTest1 extends Frame implements ActionListener, Runnable{
	
	private static final long serialVersionUID =1L;

	private TextArea ta =new TextArea();
	private TextField tf = new TextField();
	private ServerSocket ss = null;
	private Socket sc = null;
	private int port = 5555;
	private String host = "192.168.16.25";//127.0.0.1 루프백 주소
	
	private Button bt;
	
	public ClientTest1(){
		
		add(ta,BorderLayout.CENTER);
		add(tf,BorderLayout.SOUTH);
		tf.addActionListener(this);
		
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
		
		bt = new Button("ln");
		add(bt,BorderLayout.NORTH);
		setTitle("채팅 클라이언트");
		setSize(300, 400);
		setVisible(true);
		
		
	}
	
	
	
	@Override
	public void run() {
		//데이터를 받을때
		
		String str;
		String ip;
		
		try {
			
			if(sc==null){
				return;
			}
			
			InputStream is = sc.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			
			while((str=br.readLine())!=null){
				
				ta.append("\r\n"+str);
				
			}
			
			
		} catch (Exception e) {
			ta.append("\r\n서버연결 종료..");
			sc=null;
		}
		
	}
	
	public void connect(){
		
		try {
			
			sc = new Socket(host,port);
			
			Thread th = new Thread(this);
			th.start();
			
		} catch (Exception e) {
			System.out.println("서버가 죽었습니다.");
			// TODO: handle exception
		}
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		//내가 데이터를 보낼때
		
		String str = tf.getText();
		
		Object ob = e.getSource();
		
		if(ob instanceof Button){
			
			try {
				OutputStream os = sc.getOutputStream();
				PrintWriter pw = new PrintWriter(os,true);
				pw.print("\r\n");
				
				ta.append("\r\n");
				tf.setText("");
				tf.requestFocus();
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
			
			return;
		}
		
		
		
		if(str.trim().equals("")){
			return;
		}
		
		if(sc==null){
			return;
		}
		
		try {
			OutputStream os = sc.getOutputStream();
			PrintWriter pw = new PrintWriter(os,true);
			
			pw.print("정제훈]"+str+"\n\r");//ln없어도 나가나?... 안나간다..
			
			ta.append("\r\n정제훈]"+str);
			tf.setText("");
			tf.requestFocus();
			
		} catch (Exception e2) {
			
			ta.append("\r\n서버와 연결종료...");
			sc=null;
			
		}
		
	
	}

	public static void main(String[] args) {
		
		new ClientTest1().connect();
		

	}

}


















