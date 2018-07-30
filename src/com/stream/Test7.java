package com.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {

		// 원본파일? d:\\doc\\test.txt
		// 대상파일? d:\\doc\\out2.txt
		// 복사완료!!

		Scanner sc = new Scanner(System.in);
		System.out.print("원본파일?");
		String input = sc.next();

		System.out.print("대상파일?");
		String output = sc.next();
		
		String add = "복사되었습니다.";

		try {

			FileInputStream fis = new FileInputStream(input);
			FileOutputStream fos = new FileOutputStream(output);
			int data;
			while ((data = fis.read()) != -1) {

				fos.write(data);
				fos.flush();

			}
			
			for(int i=0;i<add.length();i++){
				
				fos.write(add.charAt(i));
				fos.flush();
			}
			
			for(int j =0;j<input.length();j++){
				
				fos.write(input.charAt(j));
				fos.flush();
			}
			
			fis.close();
			fos.close();
			System.out.println("복사완료");

		} catch (Exception e) {
			// TODO: handle exception
		}

		/*
		 * String txt = null;
		 * 
		 * try {
		 * 
		 * FileInputStream fis = new FileInputStream(input); int data; while
		 * ((data = fis.read()) != -1) {
		 * 
		 * txt += (char) data;
		 * 
		 * }
		 * 
		 * } catch (Exception e) { // TODO: handle exception }
		 * 
		 * 
		 * 
		 * 
		 * try {
		 * 
		 * FileOutputStream fos = new FileOutputStream(output);
		 * 
		 * for(int i =0; i<txt.length();i++){
		 * 
		 * fos.write(txt.charAt(i)); fos.flush(); }
		 * 
		 * fos.close();
		 * 
		 * } catch (Exception e) { // TODO: handle exception }
		 */

	}

}
