package com.day4;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		//����ڿ��� ��,��,���� �Է� �޾� ������ ��ȯ
		//2018�� 5�� 21�� ������
		
		Scanner sc = new Scanner(System.in);

		// ���� ��¥���� �迭�� ����

		int months[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		int year, month, day, mDay = 0, week = 0, i;
		
		String D = null;

		do {
			System.out.print("�⵵?");
			year = sc.nextInt();
		} while (year < 1);

		do {
			System.out.print("��?");
			month = sc.nextInt();
		} while (month < 1 || month > 12);
		
		
		do {
			System.out.print("��?");
			mDay = sc.nextInt();
		} while (mDay < 0 || mDay > 31);
		

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
		
		
		day +=mDay;
		
		day %=7;
		
		switch(day){
		
		case  0 :
			D = "��";
		break;
		
		case  1 :
			D = "��";
			break;
			
		case  2 :
			D = "ȭ";
			break;
			
		case  3 :
			D = "��";
			break;
			
		case  4 :
			D = "��";
			break;
			
		case  5 :
			D = "��";
			break;
			
		case  6 :
			D = "��";
			break;
		
		}
		
		System.out.println(year+"��"+" "+month+"��"+" "+mDay+" "+D+"����");
		
		
	}

}
