package com.network;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

//UDP

public class ChatCS extends Frame implements ActionListener, Runnable{
	
	
	private static final long serialVersionUID = 1L;
	
	private MulticastSocket ms = null;
	private InetAddress xGroup = null;
	
	private String host = "230.0.0.10";
	private int port = 5555;
	private String userName = "제훈";
	
	private TextArea ta = new TextArea();
	private TextField tf = new TextField();
	
	/*
	 * DatagramSocket : UDP로 데이터 그램 패킷을 전송하거나 수신
	 * DatagramPacket : UDP를 이용하여 전송할 수있는 데이터
	 * MulticastSocket : 다수의 클라이언트에 데이터그램을 전송
	 * 그룹범위 : D Class (224.0.0.0~239.255.255.255);
	 */
	public ChatCS(){
		
		ta.setEditable(false);
		add(ta,BorderLayout.CENTER);
		tf.addActionListener(this);
		add(tf,BorderLayout.SOUTH);
		
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		setTitle("채팅");
		setSize(400, 400);
		setVisible(true);
		tf.requestFocus();
		
		
	}
	
	
	public void setup(){
		
		try {
			xGroup = InetAddress.getByName(host);
			
			ms = new MulticastSocket(port);
			//특정 그룹에 포함
			ms.joinGroup(xGroup);//같은 그룹끼리 송수신 가능
			
			Thread th = new Thread(this);
			th.start();
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	
	
	public void disConnect(){
		
		try {
			//특정 그룹에서 빠져나옴
			ms.leaveGroup(xGroup);
			ms.close();
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	
	@Override
	public void run() {
	
		try {
			
			while(true){
				
				byte[] buffer = new byte[521];
				
				//전송받을 패킷
				DatagramPacket dp = new DatagramPacket(buffer,buffer.length);
				
				//전송받기
				ms.receive(dp);
				
				String str = new String(dp.getData()).trim();
				
				ta.append(str+"\r\n");
				
				
				
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			disConnect();
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String str = tf.getText().trim();
		
		if(str.equals("")){
			
			return;
			
		}
		
		byte[] buffer = (userName +")"+ str).getBytes();
		
		try {
			
			DatagramPacket dp = new DatagramPacket(buffer,buffer.length,xGroup,port);
			
			ms.send(dp);
			
			tf.setText("");
			tf.requestFocus();
			
		} catch (Exception e2) {
			// TODO: handle exception
		}
		
	}

	public static void main(String[] args) {
		new ChatCS().setup();
	}

}
























