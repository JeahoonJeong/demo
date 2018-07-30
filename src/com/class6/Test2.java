package com.class6;

class SuperTest {
	public int a = 10, b=20;
	
	public void write(){
		System.out.println("SuperTest write()...");
	}
	
	public int hap(){
		
		return a+b;
	}
	
}

class SubTest extends SuperTest{
	
	public int b=100,c=200;
	
	public void print(){
		
		System.out.println("SubTest print()...");
	}

	@Override
	public int hap() {
		return a+b+c;
	}
}


public class Test2 {

	public static void main(String[] args) {
		
		SubTest ob1 = new SubTest();
		
		System.out.println("ob1.b: "+ob1.b);
		
		SuperTest ob2 = ob1;//upcast
		
		SuperTest ob3 = new SuperTest();
		
		//SubTest ob4 = (SubTest)ob3;
		
		System.out.println("ob2.b :"+ob2.b);
		//같은 것이 있으면 자기것을 쓴다.
		
		System.out.println("sum: "+ob2.hap());//310  ob2는 Super클래스의 객체, hap() 자식 것을 쓴다?
		
		ob2.write();
		//ob2.print(); x
		((SubTest)ob2).print();//downcast
		
		System.out.println(ob3 instanceof SubTest);
		
		//System.out.println(ob4 instanceof SubTest);
		
	}

}
