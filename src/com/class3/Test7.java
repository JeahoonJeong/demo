package com.class3;

import java.util.Calendar;

//call by value
//stack������ �����Ͱ� heap�������� ������ ��ü�� �Ѿ
//call by reference
//���� �ѱ涧 ��ü�� ������ �ּҰ� �Ѿ

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
		
		System.out.println("sub()�޼ҵ� ������ x : "+ob.x);
		ob.sub(a);//call by value
		System.out.println("sub()�޼ҵ� ������ x : "+ob.x);
		
		
		//call by reference 
		Sub ob1;
		ob1 = ob;
		
		
		System.out.println("sub()�޼ҵ� ������ x : "+ob1.x);
		ob.sub(a);//call by value
		System.out.println("sub()�޼ҵ� ������ x : "+ob1.x);
		
		Calendar new1 = Calendar.getInstance();
		

	}

}
