package com.class2;

//static 자기가 알아서 메모리로 올라감 
//메모리로 올릴때 new연산자 사용
//1000개를 만들어도 메모리 공간은 한개만 사용

public class Test2 {
	
	public static int a = 10;//class 변수
	//클래스 변수나 클래스 메소드는 로딩되는 순간
	//메모리 할당이 이루어지고[클래스이름.객체이름]으로 접근
	// 즉, new를 사용하지 않고 바로 사용할 수 있다.
	
	private int b =20;//instance 변수
	//동일한 클래스의 메소드(instance 메소드) 안에서 바로 접근이 가능 하지만
	//클래스 메소드에서는 접근할 수 없다.
	//클래스 메소드에서 접근하기 위해서는 new를통해 객체를 생성하고
	//객체 이름으로만 접근이 가능하다.
	
	public void write(){//instance method
		
		System.out.println("class변수 :" +a);
		System.out.println("instance변수 :"+b);
		
	}
	
	public static void print(){
		
		System.out.println("class변수 :" +a);
		//System.out.println("instance변수 :"+b);
		
	}

	public static void main(String[] args) {
		
		//Test2.print();
		System.out.println("class변수 a : "+a);
		a=10;
		System.out.println("class변수 Test2.a : "+Test2.a);
		
		Test2 ob1 = new Test2();
		
		Test2.print();
		print();
		
		System.out.println("instance 변수 b: "+ob1.b);
		
		ob1.write();
		ob1.print();
		System.out.println("class 변수 a : "+ob1.a);
		
		Test2 ob2 = new Test2();
		
		ob2.a =100;
		ob2.b =200;
		System.out.println("ob2----------------------");
		ob2.write();
		
		System.out.println("ob1----------------------");
		ob1.write();
		
	}

}
