package com.class3;

import java.util.Calendar;

//call by value
//stack영역의 데이터가 heap영역으로 데이터 자체가 넘어감
//call by reference
//값을 넘길때 객체의 시작점 주소가 넘어감

class Sub{
	
	public int x =10;
	
	public void sub(int a){
		
		x +=a;
		
	}
	
}

public class Test7 {

	public static void main(String[] args) {
		
		Sub ob = new Sub(); 
		
		int a = 20;
		
		System.out.println("sub()메소드 실행전 x : "+ob.x);
		ob.sub(a);//call by value
		System.out.println("sub()메소드 실행후 x : "+ob.x);
		
		
		//call by reference 
		Sub ob1;
		ob1 = ob;
		
		
		System.out.println("sub()메소드 실행전 x : "+ob1.x);
		ob.sub(a);//call by value
		System.out.println("sub()메소드 실행후 x : "+ob1.x);
		
		Calendar new1 = Calendar.getInstance();
		

	}

}
