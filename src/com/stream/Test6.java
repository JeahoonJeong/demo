package com.stream;

import java.io.FileOutputStream;

//���ϳ��� �����
//FileOutputStream

public class Test6 {

	public static void main(String[] args) {
		
		try {
			
			FileOutputStream fos = new FileOutputStream("d:\\doc\\out.txt");
			int data;
			
			System.out.print("���ڿ� �Է�: ");
			while((data = System.in.read())!=-1){
				
				fos.write(data);
				fos.flush();
				
			}
			
			fos.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
