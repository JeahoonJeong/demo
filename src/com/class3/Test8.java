package com.class3;

//���(�θ� �ڽ�)
//1.�θ�Բ��� ��(�ڽ�)����.
//2.private�� ������ ���� �θ𲨴�.
//3.protected�� ������ ���� ����� ����
//4.���� ������.
//5.���� ��ü�� ������������ ��������. ���� ��ü?


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
		set("�簢��", a);
		
	}
	
	
	
}

public class Test8 {

	public static void main(String[] args) {
		
		RectA ob = new RectA(10,20);
		
		ob.rectArea();
		
		ob.print();
		
	}

}
