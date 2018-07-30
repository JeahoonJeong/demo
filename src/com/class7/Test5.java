package com.class7;

import java.util.Vector;

//collection Framework(방법론)

//List(I) - ArrayList(C), Vector(C)
//Map(I) - Hashtable(C), HashMap(C)
//제너릭

public class Test5 {
	
	
	
	public static void main(String[] args) {
		
		
		//기본 데이터 타입은 Object이다.
		
		Vector v = new Vector();//컬랙션은 기본적으로 인덱스10까지 생성한다.
		
		v.add("서울");//upcast
		v.add(30);//upcast
		v.add('a');
		
		String str = (String)v.get(0);//다운캐스트
		System.out.println(str);
		
		int i = (int)v.get(1);
		System.out.println(i);
		
		char ch = (char)v.get(2);
		System.out.println(ch);
	}

}
