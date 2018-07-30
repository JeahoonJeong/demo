package com.day5;

import java.util.Random;
import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {

		Random ran = new Random();
		int num = ran.nextInt(10);
		num++;

		Scanner sc = new Scanner(System.in);

		while (true) {
			for (int i = 0; i < 3; i++) {
				System.out.print("정수입력?[" + (i + 1) + "째기회] : ");
				int yNum = sc.nextInt();
				if (yNum == num) {
					System.out.println("맞았어요!!");
					break;
				} else {
					System.out.println("틀렸어요!!");
				}
			}
			System.out.println();
			System.out.println("정답은 " + num + "입니다.");

			System.out.println("계속할래?[Y/N]");
			char check;
			check = sc.next().charAt(0);
			if (check != 'y' && check != 'Y') {
				break;
			}
		}

	}

}
