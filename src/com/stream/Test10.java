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
			
			ps.println("�����");
			ps.println("������");
			ps.println("Ƽ�Ĵ�");
			ps.println("õ����");
			
			ps.close();
			fos.close();
			//true:append(�߰�, ����)
			fos = new FileOutputStream("d:\\doc\\out5.txt",true);
			ps = new PrintStream(fos);
			
			ps.println("�����1");
			ps.println("������1");
			ps.println("Ƽ�Ĵ�1");
			ps.println("õ����1");
			
			ps.close();
			fos.close();
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
