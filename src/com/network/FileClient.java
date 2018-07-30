package com.network;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class FileClient extends Thread {
	
	
	public static void main(String[] args) {
		
		int port = 5555;
		String host = "192.168.16.25";
		
		Socket sc = null;
		
		ObjectOutputStream oos = null;
		
		Scanner scn = new Scanner(System.in);
		
		String path;
		
		try {
			
			System.out.println("전송할 파일 경로명?");
			path = scn.next();
			
			File f = new File(path);
			
			if(!f.exists()){
				System.out.println("파일이 없습니다.!!!");
				System.exit(0);
				
				
			}
			
			//서버연결
			sc = new Socket(host, port);
			
			oos = new ObjectOutputStream(sc.getOutputStream());
			oos.flush();
			
			//파일 전송 시작
			FileInfo info;
			
			info = new FileInfo();
			info.setCode(100);
			info.setData(f.getName().getBytes());
			info.setSize((int)f.length());
			
			oos.writeObject(info);
			System.out.println(f.getName() +"파일전송 시작..");
			
			Thread.sleep(30);
			// 파일전송을 슬립없이 하면 에러가 난다.. 왜??
			
			//파일 내용전송
			FileInputStream fis = new FileInputStream(f);
			int byteRead = 0;
			byte[] buffer = new byte[1024];
			while((byteRead=fis.read(buffer,0,1024))!=-1){
				
				info = new FileInfo();
				
				info.setCode(100);
				info.setSize(byteRead);
				info.setData(buffer);
				
				oos.writeObject(info);
				System.out.println(byteRead +"bytes 전송중...");
				
				buffer = new byte[1024];
				
				Thread.sleep(300);
				
			}
			
			fis.close();
			
			//파일전송 종료
			info = new FileInfo();
			
			info.setCode(200);
			info.setData(f.getName().getBytes());
			info.setSize((int)f.length());
			
			oos.writeObject(info);
			System.out.println(f.getName()+"파일전송 끝...");
			
			Thread.sleep(300);
			
			oos.close();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
	}

}













