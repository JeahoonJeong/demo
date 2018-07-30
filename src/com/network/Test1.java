package com.network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;

public class Test1 {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			String host;
			
			System.out.println("호스트[www.naver.com]");
			host = br.readLine();
			
			InetAddress ia = InetAddress.getByName(host);
			
			System.out.println("ip주소: "+ia.getHostAddress());
			System.out.println("호스트: "+ia.getHostName());
			
			ia = InetAddress.getLocalHost();
			System.out.println("local host: "+ia.getHostAddress());
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
