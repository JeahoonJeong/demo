package com.class3;

//static �ε���  
//������ ��ü ������
public class Test3 {
	
	int a = 5;
	{//�ʱ�ȭ ��
		System.out.println("�ʱ�ȭ ���:a "+a);
		a = 10;
		System.out.println("�ʱ�ȭ ���:a "+a);
		
	}
	
	static int b;
	static {//static �ʱ�ȭ ��
		System.out.println("static �ʱ�ȭ ���:b "+b);
		b = 10;
		System.out.println("static �ʱ�ȭ ���:b "+b);
		
	}
	
	final int C;//��� �ݵ�� �ʱⰪ�� �ʿ� ��ü�� ������ ����
	
	public Test3(){
		
		System.out.println("������...");
		C = 100;//��� �ʱ�ȭ
		System.out.println("��� C:"+C);
		
	}
	
	public static void main(String[] args) {
		
		Test3 ob1 = new Test3();
		Test3 ob2 = new Test3();
		
	}

}
