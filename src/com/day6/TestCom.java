package com.day6;

public class TestCom {
	private int w,h,area,length;//��������,instance����
	
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
		System.out.println("����: "+area+" "+"�ѷ� :"+length);
	}
	
}
