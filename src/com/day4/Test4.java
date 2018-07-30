package com.day4;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		//사용자에게 년,월,일을 입력 받아 요일을 반환
		//2018년 5월 21일 월요일
		
		Scanner sc = new Scanner(System.in);

		// 월별 날짜수를 배열에 저장

		int months[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		int year, month, day, mDay = 0, week = 0, i;
		
		String D = null;

		do {
			System.out.print("년도?");
			year = sc.nextInt();
		} while (year < 1);

		do {
			System.out.print("월?");
			month = sc.nextInt();
		} while (month < 1 || month > 12);
		
		
		do {
			System.out.print("일?");
			mDay = sc.nextInt();
		} while (mDay < 0 || mDay > 31);
		

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
		
		
		day +=mDay;
		
		day %=7;
		
		switch(day){
		
		case  0 :
			D = "일";
		break;
		
		case  1 :
			D = "월";
			break;
			
		case  2 :
			D = "화";
			break;
			
		case  3 :
			D = "수";
			break;
			
		case  4 :
			D = "목";
			break;
			
		case  5 :
			D = "금";
			break;
			
		case  6 :
			D = "토";
			break;
		
		}
		
		System.out.println(year+"년"+" "+month+"월"+" "+mDay+" "+D+"요일");
		
		
	}

}
