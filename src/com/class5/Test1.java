package com.class5;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test1 {

	public static void main(String[] args) {
		
		/*
		 * int a =10;
		 * double b = 20;
		 * 
		 * b = a;  �Ͻ��� ����ȯ
		 * 
		 * a = (int)b;  o ����� ����ȯ
		 * 
		 * a = b;  x
		 * ------------------------------------------
		 * 
		 * �θ� Ŭ���� ��ü = �ڽ� Ŭ���� ��ü  -����   (UPCAST)
		 * 
		 * �θ� Ŭ���� ��ü = (�θ� Ŭ����) ��ü -����
		 * 
		 * �ڽ� = �θ�;  -�Ұ���
		 * 
		 * �ڽ� = (�ڽ�) �θ� -����   (DOWNCAST)
		 * 
		 * 
		 *
		
		Object a ;
		
		String b = "a";
		
		a = (Object)b;
		
		b = (String)a;
		
		System.out.println(a);//a
		
		*/
		
		
		
		//���� �ý����� ��¥ �� �ð��� ����
		
		Calendar now = Calendar.getInstance();
		//Calendar now1 = new GregorianCalendar;
		GregorianCalendar now1 = (GregorianCalendar) GregorianCalendar.getInstance();
		
		now = now1; //(upcast)
		now1 = (GregorianCalendar)now; 
		
		int y = now.get(Calendar.YEAR);
		int x = Calendar.MONTH;
		//static int	MONTH
		// : Field number for get and set indicating the month.
		
		//System.out.println(y); 2018
		//System.out.println(x); 1
		
		int m = now.get(Calendar.MONTH)+1;
		int d = now.get(Calendar.DATE);
		int w = now.get(Calendar.DAY_OF_WEEK);
		
		System.out.println(y+"."+m+"."+d);
		System.out.println(w); // 1-7 ��-��
		
		String[] week = {"��","��","ȭ","��","��","��","��"};
		
		System.out.println(week[w-1]);
		
		System.out.println(now.getActualMinimum(Calendar.AM));
		System.out.println(now.getActualMaximum(Calendar.DATE));
		
		System.out.printf("%tF\n",now);
		System.out.printf("%tT\n",now);
		
		System.out.printf("%tF %1$tT %2$d\n",now,10);
		
		now.set(2019, 10-1, 15);
		
		now.add(Calendar.DATE, 1);
		
		y = now.get(Calendar.YEAR);
		m = now.get(Calendar.MONTH)+1;
		d = now.get(Calendar.DATE);
		w = now.get(Calendar.DAY_OF_WEEK);
		
		System.out.println(y+"."+m+"."+d+" "+week[w-1]);
		
		
	}

}
