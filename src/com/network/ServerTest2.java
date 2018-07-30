package com.network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ServerTest2 {
	
	private ArrayList<Socket> clients = new ArrayList<Socket>();
	
	public void serverStart(){
		
		try {
			
			ServerSocket ss =new ServerSocket(5555);
			System.out.println("��������...");
			
			while(true){
				
				Socket sc =ss.accept();
				WorkThread wt = new WorkThread(sc);
				wt.start();
				
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	
	class WorkThread extends Thread{
		
		private Socket sc;
		
		public WorkThread(Socket sc){
			
			this.sc = sc;
			
		}

		@Override
		public void run() {
			String ip = null;
			String msg = null;
			
			try {
				BufferedReader br = new BufferedReader(new InputStreamReader(sc.getInputStream()));
				
				ip = sc.getInetAddress().getHostAddress();
				
				//������ Ŭ���̾�Ʈ
				clients.add(sc);
				
				//�ٸ� Ŭ���̾�Ʈ���� ���ӻ�� �˸�
				msg = ip +"]�� ���� �߽��ϴ�.! ";
				
				for(Socket s : clients){
					
					if(s==sc){
						continue;// ������ ó������
					}
					
					PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
					pw.println(msg);
					
				}
				System.out.println(msg);
				
				
				while((msg=br.readLine())!=null){
					
					for(Socket s : clients){
						
						if(s==sc){
							continue;// ������ ó������
						}
						
						PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
						pw.println(msg);
						
					}
					System.out.println(msg);
					
				}
				
			} catch (Exception e) {
				msg = ip+"]�� �����߽��ϴ�.";
				
				try {
					
					for(Socket s : clients){
						
						if(s==sc){
							continue;// ������ ó������
						}
						
						PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
						pw.println(msg);
						
					}
					System.out.println(msg);
					
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		}
		
		
		
	}
	
	public static void main(String[] args) {
		ServerTest2 ob = new ServerTest2();
		ob.serverStart();
	}

}



















