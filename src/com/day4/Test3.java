package com.day4;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		// ����޷�

		Scanner sc = new Scanner(System.in);

		// ���� ��¥���� �迭�� ����

		int months[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		int year, month, day, week = 0, i;

		do {
			System.out.print("�⵵?");
			year = sc.nextInt();
		} while (year < 1);

		do {
			System.out.print("��?");
			month = sc.nextInt();
		} while (month < 1 || month > 12);

		// ���� 2�� ���� ���

		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
			months[1] = 29;

		// 1��1��1�Ϻ��� ���⵵(year-1) 12�� 31���ϱ����� ���� ���

		day = ((year - 1) * 365)
				+ ((year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400);

		// ���������� ����

		for (i = 0; i < month - 1; i++) {
			day += months[i];
		}
		// y��m��1�ϱ����� ����
		day += 1;
		week = day % 7;

		System.out.printf("\n��\t��\tȭ\t��\t��\t��\t��\n");
		System.out.printf("---------------------------------------------------\n");
		for (i = 0; i < week; i++)
			System.out.printf(" \t");
		for (i = 0; i < months[month - 1]; i++) {
			System.out.printf("%d\t", i + 1);
			week++;
			if (week % 7 == 0) {
				System.out.println();
			}
		}
		if (week % 7 != 0) {
			System.out.println();
		}
		System.out
				.printf("---------------------------------------------------\n");

	}

}
