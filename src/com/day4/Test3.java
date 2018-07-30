package com.day4;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		// 만년달력

		Scanner sc = new Scanner(System.in);

		// 월별 날짜수를 배열에 저장

		int months[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		int year, month, day, week = 0, i;

		do {
			System.out.print("년도?");
			year = sc.nextInt();
		} while (year < 1);

		do {
			System.out.print("월?");
			month = sc.nextInt();
		} while (month < 1 || month > 12);

		// 윤년 2월 날수 계산

		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
			months[1] = 29;

		// 1년1월1일부터 전년도(year-1) 12월 31일일까지의 날수 계산

		day = ((year - 1) * 365)
				+ ((year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400);

		// 전월까지의 날수

		for (i = 0; i < month - 1; i++) {
			day += months[i];
		}
		// y년m월1일까지의 날수
		day += 1;
		week = day % 7;

		System.out.printf("\n일\t월\t화\t수\t목\t금\t토\n");
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
