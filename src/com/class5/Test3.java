package com.class5;

import java.util.Calendar;
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		
		//오늘로 부터 x일 후 년 월 일 요일
		//2018년 5월 30일 수요일
		//1000
		//1000일 후 : 201x년 x월 xx일 x요일
		
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH)+1;
		int day = now.get(Calendar.DATE);
		int week = now.get(Calendar.DAY_OF_WEEK);
		
		String[] weekDay = {"일","월","화","수","목","금","토"};
		
		System.out.println(year+"년 "+month+"월 "+day+"일 "+weekDay[week-1]+"요일");
		
		Scanner sc = new Scanner(System.in);
		
		int days = sc.nextInt();
		
		now.add(Calendar.DATE, days);
		
		year = now.get(Calendar.YEAR);
		month = now.get(Calendar.MONTH)+1;
		day = now.get(Calendar.DATE);
		week = now.get(Calendar.DAY_OF_WEEK);
		
		System.out.println(days+"일후 "+year+"년 "+month+"월 "+day+"일 "+weekDay[week-1]+"요일");
	}

}
