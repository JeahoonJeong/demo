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
				System.out.print("�����Է�?[" + (i + 1) + "°��ȸ] : ");
				int yNum = sc.nextInt();
				if (yNum == num) {
					System.out.println("�¾Ҿ��!!");
					break;
				} else {
					System.out.println("Ʋ�Ⱦ��!!");
				}
			}
			System.out.println();
			System.out.println("������ " + num + "�Դϴ�.");

			System.out.println("����ҷ�?[Y/N]");
			char check;
			check = sc.next().charAt(0);
			if (check != 'y' && check != 'Y') {
				break;
			}
		}

	}

}
