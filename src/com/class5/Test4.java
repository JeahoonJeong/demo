package com.class5;

class SuperClass{
	
	protected int a =10, b=20;
	public void write(){
		
		System.out.println("SuperClass write....");
		System.out.println("a:"+a+" b: "+b);
	}
	
}

class SubClass extends SuperClass{
	int c =40,b=30;
	@Override
	public void write(){
		System.out.println("SubClass write...");
		System.out.println("a: "+a+" b: "+b+" c: "+c);
		System.out.println("super.b : "+b);
	}
	
	public void print1(){
		System.out.println("SubClass print1");
		write();//오버라이드 하지 않았다면 부모의 write호출
	}
	
	public void print2(){
		System.out.println("Subclass print2");
		super.write();
		
	}
}

public class Test4 {

	public static void main(String[] args) {
		
		SubClass ob = new SubClass();
		
		ob.write();
		
		ob.print1();
		
		ob.print2();
		
		
		System.out.println("-------------------------");
		
		System.out.println("ob.b : "+ob.b);
		
		System.out.println("((SuperClass)ob).b :"+((SuperClass)ob).b);//upcast
		
		((SuperClass)ob).write();//upcast하더라도 부모의 메소드에 접근할수 없다.
		
		//메소드는 인스턴스 변수와 다르게 자신의 메소드를 호출
		//메소드는 heap영역이 아닌 메소드 영역에 저장되어있기때문에
		//접근이 불가하다.
		
		//SuperClass ob1 = new SuperClass();
		//
		//ob = ((SubClass)ob1);
		
		ob.write();
		
		
		
		
		
	}

}
