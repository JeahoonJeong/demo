package com.class2;

class Rect{
	
	private int w,h;
	
	public void set(int w, int h){
		
		this.w = w;
		this.h = h;
		
	}
	
	public int area(){
		return w*h;
	}
	
	public int length(){
		return (w+h)*2;
	}
	
	public void print(int area, int length){
		System.out.println(w+" "+h+" "+area+" "+length);
	}
}

public class Test4 {

	public static void main(String[] args) {
		Rect ob1 = new Rect();
		
		ob1.set(2, 3);
		
		
		ob1.print(ob1.area(),ob1.length());
	}

}
