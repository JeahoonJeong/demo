package com.class3;

//���(�θ� �ڽ�)
//1.�θ�Բ��� ��(�ڽ�)����.
//2.private�� ������ ���� �θ𲨴�.
//3.protected�� ������ ���� ����� ����
//4.���� ������.
//5.���� ��ü�� ������������ ��������. ���� ��ü?


class TestB{
	private String title;
	//private int area;
	
	protected int area;
	
	public void set(String title){
		
		this.title = title;
		
		
	}
	
	
	public void print(){
		
		System.out.println("title: "+title);
		System.out.println("area: "+area);
		
	}
	
	
	
}

class RectB extends TestB{
	
	private int w,h;
	
	public RectB(){}
	
	public RectB(int w , int h){
		this.w = w;
		this.h = h;
	}
	
	public void rectArea(){
		
		area = w*h;
		set("�簢��");
		
	}
	
	
	
}

public class Test9 {

	public static void main(String[] args) {
		
		RectB ob = new RectB(10,20);
		
		ob.rectArea();
		
		ob.print();
		
	}

}
