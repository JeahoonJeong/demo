package com.stream;

import java.io.FileInputStream;

//파일내용 입출력
//FileInputStream
//FileOutputStream


public class Test5 {

	public static void main(String[] args) {
		
		try {
			
			FileInputStream fis = new FileInputStream("d:\\doc\\test.txt");
			int data;
			while((data=fis.read())!=-1){
				
				//System.out.print((char)data);
				System.out.write(data);
				
				/*
				 * Note that the byte is written as given; 
				 * to write a character that will be translated
				 * according to the platform's default character encoding, 
				 * use the print(char) or println(char) methods.
				 */
				
				
				System.out.flush();//네번째줄이 나온다. 마지막에 엔터가 없다.
				
			}
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
