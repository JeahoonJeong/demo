package com.network;

import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class FileServer extends Thread{
	
	
class WorkThread extends Thread{
		
		private Socket sc = null;
		
		public WorkThread(Socket sc){
			
			this.sc = sc;
		}

		@Override
		public void run() {
			try {
				
				ObjectInputStream ois = new ObjectInputStream(sc.getInputStream());
				System.out.println(sc.getInetAddress().getAddress()+"����...");
				
				FileOutputStream fos = null;
				Object ob = null;
				
				while((ob=ois.readObject())!=null){
					
					if(ob instanceof FileInfo){
						
						FileInfo info = (FileInfo)ob;
						
						
						if(info.getCode()==100){//�������� ����
							
							String str = new String(info.getData());//���ϸ�
							fos = new FileOutputStream(str);
							
							System.out.println("���� ���� ����....");
							
							
						}else if(info.getCode()==110){//��������
							
							if(fos==null)
								break;
							fos.write(info.getData(), 0, info.getSize());
							System.out.println(info.getSize()+"bytes �޴���...");
							
						}else if(info.getCode()==200){//�������� ����
							
							if(fos==null)
								break;
							
							String str = new String(info.getData());
							fos.close();
							System.out.println(str +"�������� ��...");
							break;
						}	
					}
					
				}
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
			}
		}

	}
	
	
	public void serverStart(){
		
		try {
			
			ServerSocket ss = new ServerSocket(5555);
			System.out.println("Ŭ���̾�Ʈ ���� �����...");
			
			Socket sc = ss.accept();
			
			WorkThread wt = new WorkThread(sc);
			wt.start();
			
		} catch (Exception e) {
			// TODO: handle exception
			
			System.out.println(e);
		}
		
	}
	
	public static void main(String[] args) {
		new FileServer().serverStart();
	}

}