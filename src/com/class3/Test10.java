package com.class3;

class SuperClass{
	private String title;
	protected double area;
	
	public SuperClass(){
		
	}
	
	public SuperClass(String title){
		this.title = title;
	}
	
	public void write(){
		System.out.println("title : "+title+"area :"+area);
	}
	
}

class Circle extends SuperClass{
	private int r;
	protected static final double PI = 3.14;
	
	public Circle(int r){
		super("원");//부모클래스의 오버로딩된 생성자
		this.r = r;
		
	}
	
	public void circleArea(){
		
		area = (double)r*r*PI;
		
	}
	
}

class RectC extends SuperClass{
	
	private int w,h;
	
	public void rectArea(int w, int h){
		this.w = w;
		this.h = h;
		
		area = (w+h)*2;
	}
	
	public void print(){
		
		System.out.println("w: "+w);
		System.out.println("h: "+h);
		System.out.println("area: "+area);
		
	}
	
	
	
	
	//메소드 오버라이드
	@Override//어노테이션
	//감시 어노테이션이 없다면 writee 에러
	public void write() {
		System.out.println("w: "+w);
		System.out.println("h: "+h);
		System.out.println("area: "+area);
		
	}
	
}

public class Test10 {

	public static void main(String[] args) {
		
		Circle ob1 = new Circle(10);
		
		ob1.circleArea();
		
		ob1.write();
		
		System.out.println("---------------------");
		
		RectC ob2 = new RectC();
		
		ob2.rectArea(10, 20);
		
		ob2.write();
		
		ob2.print();
		
		ob1.write();
		
		
	}

}
