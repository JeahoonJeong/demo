package com.stream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

//InputStreamReader
//1byte�� Stream�� 2byte Stream ���� ��ȯ���ִ� Stream


public class Test3 {

	public static void main(String[] args) throws IOException {
		
		int data;
		System.out.println("���ڿ� �Է�: ");
		
		InputStream in = new FileInputStream("d:\\doc\\test.txt");
		
		//Reader rd = new InputStreamReader(System.in);
		Reader rd = new InputStreamReader(in);
		
		
		
		//while((data = in.read())!=-1){

		while((data = rd.read())!=-1){
			char ch =  (char)data;
			System.out.print(ch);
		}
		
	}

}
