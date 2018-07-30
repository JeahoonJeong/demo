package com.class4;


class Test extends Object{// 생략되어있다.
	
	private int a=10;
	
	public void write(){
		
		System.out.println("a :"+a);
		
	}
	
	
}

public class Test2 {

	public static void main(String[] args) {
		
		Test ob1 = new Test();
		Test ob2 = new Test();
		Test ob3 = ob1;
		
		
		System.out.println();
		
		
		//Object의 equals는 주소를 비교한다.
		System.out.println("ob1 == ob2: "+(ob1==ob2));
		System.out.println("ob1.equals(ob2): "+ob1.equals(ob2));
		//String 형의 비교는 equals를 사용 
		System.out.println(ob1);
		System.out.println(ob1.toString());
		System.out.println(ob2);
		System.out.println(ob3);
		System.out.println((ob3==ob1));
		
		//Object의 toString은 주소값
		
	}

}
