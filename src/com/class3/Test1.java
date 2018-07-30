package com.class3;

//생성자
//메모리 할당 받을때 사용
//변수 초기화할때 사용

//class 의 이름과 동일
//리턴값이 없기때문에 property가 없다.
//중복정의가 가능 overloading
//제일 선두에서 한번만 호출이가능

public class Test1 {
	
	private int x;
	
	public Test1(){//기본 생성자
		//오버로딩이 필요하다면 기본생성자는 반드시 명시해놓아야 한다.
		//ex) public Test1()[{}
		
		
		
		System.out.println("인수가 없는 생성자..");
		x = 10;
		System.out.println("x : "+x);
		
		
	}
	
	public Test1(int x){//오버로딩된 생성자
		System.out.println("인수가 있는 생성자..");
		this.x = x;
		System.out.println("x : "+x);
	}

	public static void main(String[] args) {
		
		Test1 ob1 = new Test1();
		int x = 11;
		Test1 ob2 = new Test1(x);
		
	}

}
