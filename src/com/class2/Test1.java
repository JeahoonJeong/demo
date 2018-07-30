package com.class2;



class Circle{
	
	private int r;//정보의 은닉(캡슐화) 인스턴스변수는 대부분 private로 만든다.
	
	public void setData(int r){//변수 초기화 메소드
		//setData(int r, Circle this)
		
		this.r = r;
	}
	
	public double area(){//area(Circle this)
		
		return r*r*3.14;
	}
	
	public void write(double area){
		
		System.out.println(r);
		System.out.println(area);
	}
	
}

public class Test1 {

	public static void main(String[] args) {
		
		Circle ob1 = new Circle();
		
		ob1.setData(10);//내부적으로는 ob1의 주소값을 가져간다.
		//ob1.r; 접근 불가능 private
		double area = ob1.area();
		ob1.write(area);
		
		ob1.setData(100);
		ob1.write(ob1.area());
		
	}

}
