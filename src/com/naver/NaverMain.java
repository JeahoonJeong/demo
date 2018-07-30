package com.naver;

import java.util.Scanner;

public class NaverMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Naver ob = new NaverImpl();

		int ch;

		while (true) {

			do {
				System.out.print("1.ȸ������ 2.ȸ����ü ��� 3.���̵�˻� 4.���� 5.���� "
						+ "6.����: ");
				try {
					
					ch = sc.nextInt();
					sc.nextLine();
					
				} catch (Exception e) {
					System.out.println("1-6������ ������ �Է��ϼ���."+"["+e+"]");
					sc.nextLine();
					ch = 10;
					continue;
				}

			} while (ch < 1);

			switch (ch) {
			case 1:
				ob.signUp();
				break;
			case 2:
				ob.print();
				break;
			case 3:
				ob.findId();
				break;
			case 4:
				ob.delete();
				break;
			case 5:
				ob.update();
				break;
			case 10:
				break;
			default:
				System.out.println("�����մϴ�.");
				System.exit(0);
			}

		}

	}

}
