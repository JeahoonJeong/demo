package com.class7;

//����Ŭ����
//Local

class Outer1{
	
	static int a = 10;
	int b = 20;
	
	public void write(){
		
		int c = 30;
		final int d =40;
		
		class Local{
			
			public void print(){
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);
				System.out.println(d);
			}
			
		}
		
		Local ob = new Local(); //�޼ҵ�ȿ���aks  Local Ŭ���� ���� ����
		ob.print();
	}
	
}

public class Test2 {

	public static void main(String[] args) {
		Outer1 out = new Outer1();
		out.write();
		
		
	}

}
