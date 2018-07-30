package com.class6;

class TestA{
	
	public void print(){
		
		System.out.println("Aclass...");
	}
	
}

class TestB extends TestA{
	
	public void print(){
		
		System.out.println("Bclass...");
	}
}

public class Test1 {

	public static void main(String[] args) {
		
		TestA a = new TestA();
		TestB b = new TestB();
		
		b = (TestB)a;
		a = b;
	}

}
