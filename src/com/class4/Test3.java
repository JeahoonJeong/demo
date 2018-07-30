package com.class4;

//String
//int,double..
//String 은 class이다(자료형이 아니다)

public class Test3 {

	public static void main(String[] args) {
		
		String ob1 = "Seoul";
		String ob2 = "Seoul";//문자열이 같다면 heap영역에 새로 공간을 만들지 않는다.(주소가 같다)
		String ob3 = new String("Seoul");//new 연산자를 사용하면 무조건 heap영역에 공간을 만든다.
		
		System.out.println("ob1 == ob2 "+(ob1==ob2));
		System.out.println((ob1 == ob3));
		System.out.println(ob1.equals(ob3));//String 클래스에서 override함
		
		//ob2가 가리키는 주소에 저장되어있는 Seoul을 지우고 덮어쓰지 않는다.
		//heap 영역에 새로운 공간을 만들어 korea를 쓴다.
		
		ob2 = "korea";
		System.out.println("ob1 == ob2 "+(ob1==ob2));
		System.out.println((ob1 == ob3));
		System.out.println(ob1.equals(ob3));//String 클래스에서 override함
		
		ob2 = "Seoul";
		System.out.println("ob1 == ob2 "+(ob1==ob2));
		System.out.println((ob1 == ob3));
		System.out.println(ob1.equals(ob3));//String 클래스에서 override함
		
		System.out.println(ob1.toString());
		
		//처리하는 데이터는 방대하고 사용빈도는 높기때문에
		//데이터는 heap영역에 저장하고 사용하는 방법은 자료형 처럼 사용한다.
	}

}
