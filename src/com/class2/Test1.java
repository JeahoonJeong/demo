package com.class2;



class Circle{
	
	private int r;//������ ����(ĸ��ȭ) �ν��Ͻ������� ��κ� private�� �����.
	
	public void setData(int r){//���� �ʱ�ȭ �޼ҵ�
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
		
		ob1.setData(10);//���������δ� ob1�� �ּҰ��� ��������.
		//ob1.r; ���� �Ұ��� private
		double area = ob1.area();
		ob1.write(area);
		
		ob1.setData(100);
		ob1.write(ob1.area());
		
	}

}
