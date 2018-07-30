package com.stream;

import java.io.IOException;
import java.io.OutputStream;

//기본 입출력 스트림
//System.out


public class Test2 {

	public static void main(String[] args) throws IOException {
		
		OutputStream os = System.out;
		
		byte[] b = new byte[3];
		
		b[0] = 65;
		b[1] = 97;
		b[2] = 122;
		
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);
		
		os.write(b);//스트림에 기록
		
		System.out.println("출력가능?");//가능
		
		os.close();
		
		System.out.println("출력가능?");//불가능
		
	}

}
