package com.day6;

import java.util.Scanner;

public class Test2_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Test2_1 ts = new Test2_1();
		

		String str;

		System.out.print("주민번호를 입력하시오. xxxxxx-xxxxxxx");
		str = sc.next();

		if (str.length() != 14) {
			System.out.println("입력오류");
			return;// main메소드를 빠져나감
		}
		
		ts.setNum(str);
		ts.check();
		
		

	}

}
