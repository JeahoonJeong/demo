package com.day6;

import java.util.Scanner;

public class Test2_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Test2_1 ts = new Test2_1();
		

		String str;

		System.out.print("�ֹι�ȣ�� �Է��Ͻÿ�. xxxxxx-xxxxxxx");
		str = sc.next();

		if (str.length() != 14) {
			System.out.println("�Է¿���");
			return;// main�޼ҵ带 ��������
		}
		
		ts.setNum(str);
		ts.check();
		
		

	}

}
