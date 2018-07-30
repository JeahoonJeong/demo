package com.class5;

import java.util.Calendar;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		//Calendar를 사용하여 만년달력 만들기
		
		Calendar cal = Calendar.getInstance();
		
		Scanner sc = new Scanner(System.in);
		
		int y,m;
		
		y = sc.nextInt();
		m = sc.nextInt();
		cal.set(Calendar.YEAR, y);
		cal.set(Calendar.MONTH, m-1);
		
		cal.set(Calendar.DATE, 1);
		//cal.set(Calendar.MONTH, 3);
		int week = cal.get(Calendar.DAY_OF_WEEK)-1; 
		
		
		
		System.out.printf("\n일\t월\t화\t수\t목\t금\t토\n");
		System.out.printf("---------------------------------------------------\n");
		
		
		for (int i = 0; i < week; i++)
			System.out.printf(" \t");
		
		for (int i = 0; i < cal.getActualMaximum(Calendar.DATE); i++) {
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
