package com.class4;

class A{
	
	public int x = 10;
	
	
	public A(){}
	
	public A(int x){
		this.x = x;
	}
	
	public void print(){
		
		System.out.println("x :"+x);
		
	}
	
}

class B extends A{
	
	public int y  = 20;
	
	public B(int y){
		super(y);
	}
	
	public B(){
		super();//생략되어있음 부모의 생성자
	}
	
	
	public void write(){
		
		System.out.println("y :"+y);
		
	}
	
}

public class Test1 {

	public static void main(String[] args) {
		
		//A ob1 = new A();	
		
		B ob = new B();
		
		//ob1 = (A)ob;
		
		//ob1.y; upcast  접근할수 없다. 
		
		ob.write();
		
		ob.print();
		
		
		B ob1 = new B(100);
		
		ob1.write();
		ob1.print();
		
		
		ob.write();
		
		ob.print();
	}

}
