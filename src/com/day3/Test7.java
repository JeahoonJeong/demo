package com.day3;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = 0;
		System.out.print("숫자입력 1~3");
		num = sc.nextInt();
		switch(num){
		
		case 3:
			System.out.println("***");
			break;
		case 2:
			System.out.println("**");
		case 1:
			System.out.println("*");
			break;
		default:
			System.out.println("오류");
			break;
		}
	}

}
