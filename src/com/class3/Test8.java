package com.class3;

//상속(부모가 자식)
//1.부모님꺼는 내(자식)꺼다.
//2.private로 선언한 것은 부모꺼다.
//3.protected로 선언한 것은 상속이 가능
//4.내껀 내꺼다.
//5.같은 객체를 가지고있으면 내꺼쓴다. 같은 객체?


class Test{
	private String title;
	private int area;
	
	public void set(String title, int area){
		
		this.title = title;
		this.area = area;
		
	}
	
	
	public void print(){
		
		System.out.println("title: "+title);
		System.out.println("area: "+area);
		
	}
	
	
	
}

class RectA extends Test{
	
	private int w,h;
	
	public RectA(){}
	
	public RectA(int w , int h){
		this.w = w;
		this.h = h;
	}
	
	public void rectArea(){
		
		int a = w*h;
		set("사각형", a);
		
	}
	
	
	
}

public class Test8 {

	public static void main(String[] args) {
		
		RectA ob = new RectA(10,20);
		
		ob.rectArea();
		
		ob.print();
		
	}

}
