package com.collect;

import java.util.Vector;

class Test{
	
	String name;
	int age;
	
	@Override
	public String toString() {
		
		String str = "name: "+name+" age: "+age;
		return str;
	}
	
	
	
}

public class Test1 {

	public static void main(String[] args) {
		
		Vector<Test> v  = new Vector<Test>();
		
		Test ob = new Test();
		ob.name = "배수지";
		ob.age = 25;
		
		v.add(ob);
		System.out.println(v.toString());
		
		//잘못작성하는 경우
		ob.name = "박신혜";
		ob.age = 28;
		v.add(ob);// ob를 수정하고 add 인덱스가 증가 0번 1번 인덱스, ob를 가리킨다.
		
		for(Test t : v){
			System.out.println(t.name+t.age);//박신혜28  두번출력
		}
		
		System.out.println();
		
		ob = new Test();//힙역영에 새로운 메모리를 할당받아 Test인스턴스를 생성
		ob.name = "박효신";
		ob.age = 29;
		v.add(ob);
		
		for(Test t : v){
			System.out.println(t.name+t.age);//박신혜28 두번 박효신29 한번
		}
		
		
		
		
		
		
	}

}
