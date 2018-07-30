package com.day6;

public class TestCom {
	private int w,h,area,length;//전역변수,instance변수
	
	public void set(int w,int h){
		this.w = w;
		this.h = h;
		area = w*h;
		length = (w*2)+(h*2);
	}
	public int getArea(){
		return area;
	}
	public int getLength(){
		return length;
	}
	public void print(){
		System.out.println("넓이: "+area+" "+"둘레 :"+length);
	}
	
}
