package com.class5;

//�߻�Ŭ����
//�޸��� ������� Ŭ������ �̸� ����
//�޼ҵ带 �������ؼ� ���

abstract class ShapeClass{
	
	abstract void draw();
	
}

class Cir extends ShapeClass{

	@Override
	public void draw() {
		System.out.println("���� �׸���...");
	}
	
	
	
}

class Rect extends ShapeClass{

	@Override
	public void draw() {
		System.out.println("�簢���� �׸���...");
	}
	
}

class Tri extends ShapeClass{

	@Override
	public void draw() {
		System.out.println("�ﰢ���� �׸���....");
	}
	
}

public class Test7 {

	public static void main(String[] args) {
			
		Cir c = new Cir();
		Rect r = new Rect();
		Tri t = new Tri();
		
		c.draw();
		r.draw();
		t.draw();
		
		
	}

}
