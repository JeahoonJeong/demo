package com.students;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentsMain {

	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		StudentImpl st = new StudentImpl();
		int ch;
		
		do{
			System.out.print("1.입력 2.출력 3.종료 =>");
			ch = sc.nextInt();
			

			switch (ch) {
			case 1:
				st.input();
				break;
			case 2:
				st.print();
				break;
			case 3:
				st.exit();
				return;
			default:
				break;
			}
			
			
			
		}while(ch>0||ch<4);
		
		/*
		while(true){
			System.out.print("1.입력 2.출력 3.종료 =>");
			String ch = sc.next();
		*/
			
			
			
		
		
	}

}
