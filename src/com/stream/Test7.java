package com.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {

		// ��������? d:\\doc\\test.txt
		// �������? d:\\doc\\out2.txt
		// ����Ϸ�!!

		Scanner sc = new Scanner(System.in);
		System.out.print("��������?");
		String input = sc.next();

		System.out.print("�������?");
		String output = sc.next();
		
		String add = "����Ǿ����ϴ�.";

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
			System.out.println("����Ϸ�");

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
