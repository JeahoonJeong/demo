package com.class4;

class C{
	
	public C(){
		System.out.println("parents");
	}
	
}

class D extends C{
	
	public D(){
		System.out.println("children");
	}
}

public class Test10 {

	public static void main(String[] args) {
		
		D d = new D();
		
	}

}
