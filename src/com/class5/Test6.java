package com.class5;

//final을 사용하는 3가지 경우
//1.멤버변수에 final을 붙이면 단 한번만 초기화가 가능
//2.메소드에 final을 붙이면 Override가 불가
//3.클래스에 final을 붙이면 상속이 불가


class Test{
	
	public static final double PI;
	
	static{//초기화블럭
		PI = 3.14;
	}
	
	public double area;
	public final void write(String title){//override불가
		System.out.println(title+": "+area);
	}
	
	
}

public class Test6 extends Test{
	
	public void circleArea(int r){
		area = (double)r*r*PI;
	}
	

	public static void main(String[] args) {
		
		Test6 ob = new Test6();
		ob.circleArea(10);
		ob.write("원");
	}

}
