package com.swing;

//class 클래스
//특정 크래스나 인터페이스의 정보를 검색할 수 있는 메소드를 제공한다.

class Test{
	
	public void write(){
		
		System.out.println("테스트....");
		
		
	}
	
}

public class Test3 {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		Class<?> c = Class.forName("com.swing.Test");
		//Class<?> c = Class.forName("클래스이름.class");
		
		Object ob = c.newInstance();//객체생성
		
		Test t = (Test)ob;//downcast
		
		t.write();
	}

}
