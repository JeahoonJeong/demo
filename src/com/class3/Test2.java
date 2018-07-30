package com.class3;

class Rect{
	
	private int w,h;
	
	public Rect(){}//기본생성자

	public Rect(int w, int h){//오버로딩된 생성자
		
		this.w = w;
		this.h = h;
		
	}
	
	public void set(int w , int h){//초기화 메소드
		
		this.w = w;
		this.h = h;
		
	}
	
	public int area(){
		
		return w*h;
	}
	
	public int length(){
		
		return (w*h)*2;
	}
	
	public void print(int a){
		System.out.println("w :"+w);
		System.out.println("h :"+h);
		System.out.println("area :"+a);
		
	}
	
	public void print(int a, int l){
		System.out.println("w :"+w);
		System.out.println("h :"+h);
		System.out.println("area :"+a);
		System.out.println("length :"+l);
	}
	
}

public class Test2 {

	public static void main(String[] args) {
		
		Rect ob1 = new Rect();
		ob1.set(10, 20);
		ob1.print(ob1.area());
		ob1.print(ob1.area(), ob1.length());
		
		Rect ob2 = new Rect(20, 30);
		ob2.print(ob2.area());
		ob2.print(ob2.area(), ob2.length());
		
		
		
		
		
	}

}
