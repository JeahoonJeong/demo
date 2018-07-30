package com.naver;

import java.util.Scanner;

public class NaverMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Naver ob = new NaverImpl();

		int ch;

		while (true) {

			do {
				System.out.print("1.회원가입 2.회원전체 출력 3.아이디검색 4.삭제 5.수정 "
						+ "6.종료: ");
				try {
					
					ch = sc.nextInt();
					sc.nextLine();
					
				} catch (Exception e) {
					System.out.println("1-6사이의 정수를 입력하세요."+"["+e+"]");
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
				System.out.println("종료합니다.");
				System.exit(0);
			}

		}

	}

}
