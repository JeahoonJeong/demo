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
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest1 extends Frame implements ActionListener, Runnable{
	
	private static final long serialVersionUID =1L;

	private TextArea ta =new TextArea();
	private TextField tf = new TextField();
	private ServerSocket ss = null;
	private Socket sc = null;
	
	public ServerTest1(){
		
		add(ta,BorderLayout.CENTER);
		add(tf,BorderLayout.SOUTH);
		tf.addActionListener(this);
		
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
		
		setTitle("채팅 서버");
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
			
			ip = sc.getInetAddress().getHostAddress();//ip
			ta.append("\r\n["+ip+"] 접속");
			
			while((str=br.readLine())!=null){
				
				ta.append("\r\n"+str);
				
			}
			
			
		} catch (Exception e) {
			ta.append("\r\n클라이언트 종료..");
			sc=null;
			ss=null;
		}
		
	}
	
	public void serverStart(){
		
		try {
			//서버 소켓을 생성
			ss = new ServerSocket(5555);
			ta.setText("서버시작!!");
			
			//클라이언트의 접속을 기다림
			sc = ss.accept();//접속
			Thread th = new Thread(this);
			th.start();
			
		} catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
		}
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		//내가 데이터를 보낼때
		
		String str = tf.getText();
		
		if(str.trim().equals("")){
			return;
		}
		
		if(sc==null){
			return;
		}
		
		try {
			OutputStream os = sc.getOutputStream();
			PrintWriter pw = new PrintWriter(os,true);
			pw.println("서버]"+str);
			
			ta.append("\r\n서버]"+str);
			tf.setText("");
			tf.requestFocus();
			
		} catch (Exception e2) {
			
			ta.append("\r\n클라이언트와 연결종료...");
			sc=null;
			
		}
		
	
	}

	public static void main(String[] args) {
		
		new ServerTest1().serverStart();
		

	}

}


















