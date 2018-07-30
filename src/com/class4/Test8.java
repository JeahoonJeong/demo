package com.class4;

//Wrapper클래스
//기본 데이터(자료형)를 객체로 사용할 수 있게 해준다.
//자바 자료형 : boolean,byte,char, short, int, long, float, double
//레퍼런스데이터 : Boolean, Byte, Character, Short, Integer, Long, Double

//Auto-Boxing(stack->heap)
//Auto-UnBoxing(heap->stack)

public class Test8 {

	public static void main(String[] args) {
		
		int n1 = 10;
		int n2;
		Integer num1;
		Integer num2 = new Integer(20);
		
		num1 = n1;//Auto-Boxing(stack->heap)
		n2 = num2;//Auto-UnBoxing(heap->stack)
		
		System.out.println(num1);
		System.out.println(num2);
		
	}

}
