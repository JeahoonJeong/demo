package com.class7;

//내부클래스
//중첩

class Outer2{
	
	static int a = 10;
	int b =20;
	
	public static class Inner2{
		int c = 30;
		//int b = 100;
		public void write(){
			
			System.out.println("a: "+a);
			//System.out.println("b: "+b);
			System.out.println("c: "+c);
			
			Outer2 ob = new Outer2();
		
			System.out.println(ob.b);
			
		}
	}
	
	public void print(){
		Inner2 ob = new Inner2();
		ob.write();
	}
	
}

public class Test3 {

	public static void main(String[] args) {
			Outer2 ob = new Outer2();
			ob.print();
			
			Outer2.Inner2 ob1 = new Outer2.Inner2();
			
			ob1.write();
			
	}

}
