package com.stream;

import java.io.FileOutputStream;
import java.io.PrintStream;



public class Test10 {

	public static void main(String[] args) {
		
		try {
			FileOutputStream fos;
			PrintStream ps;
			
			fos = new FileOutputStream("d:\\doc\\out5.txt");
			ps = new PrintStream(fos);
			
			ps.println("배수지");
			ps.println("한지혜");
			ps.println("티파니");
			ps.println("천송이");
			
			ps.close();
			fos.close();
			//true:append(추가, 누적)
			fos = new FileOutputStream("d:\\doc\\out5.txt",true);
			ps = new PrintStream(fos);
			
			ps.println("배수지1");
			ps.println("한지혜1");
			ps.println("티파니1");
			ps.println("천송이1");
			
			ps.close();
			fos.close();
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
