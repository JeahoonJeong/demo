package com.day6;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		TestCom tc = new TestCom();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����?");
		int w = sc.nextInt();
		System.out.print("����?");
		int h = sc.nextInt();
		
		tc.set(w, h);
		System.out.println(tc.getArea());
		System.out.println(tc.getLength());
		
		tc.print();
	}

}
