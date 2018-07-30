package com.class3;

//static 로딩때  
//생성자 객체 생성때
public class Test3 {
	
	int a = 5;
	{//초기화 블럭
		System.out.println("초기화 블력:a "+a);
		a = 10;
		System.out.println("초기화 블력:a "+a);
		
	}
	
	static int b;
	static {//static 초기화 블럭
		System.out.println("static 초기화 블력:b "+b);
		b = 10;
		System.out.println("static 초기화 블력:b "+b);
		
	}
	
	final int C;//상수 반드시 초기값이 필요 객체를 생성시 생성
	
	public Test3(){
		
		System.out.println("생성자...");
		C = 100;//상수 초기화
		System.out.println("상수 C:"+C);
		
	}
	
	public static void main(String[] args) {
		
		Test3 ob1 = new Test3();
		Test3 ob2 = new Test3();
		
	}

}
