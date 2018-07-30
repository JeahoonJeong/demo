package com.stream;

import java.io.FileOutputStream;

//파일내용 입출력
//FileOutputStream

public class Test6 {

	public static void main(String[] args) {
		
		try {
			
			FileOutputStream fos = new FileOutputStream("d:\\doc\\out.txt");
			int data;
			
			System.out.print("문자열 입력: ");
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
