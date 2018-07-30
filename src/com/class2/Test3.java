package com.class2;

import java.util.Calendar;


public class Test3 {

	public static void main(String[] args) {
		
		CustomInfo ob = new CustomInfo();
		//ob.info();
		CustomInfo.info();
		
		Calendar ob1 = Calendar.getInstance();
		Calendar ob2;
		ob1.getInstance();
		System.out.println(ob1);
		//System.out.println(ob2);
		CustomInfo ci = new CustomInfo();
		System.out.println(ci);
		
	}

}
