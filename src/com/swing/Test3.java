package com.swing;

//class Ŭ����
//Ư�� ũ������ �������̽��� ������ �˻��� �� �ִ� �޼ҵ带 �����Ѵ�.

class Test{
	
	public void write(){
		
		System.out.println("�׽�Ʈ....");
		
		
	}
	
}

public class Test3 {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		Class<?> c = Class.forName("com.swing.Test");
		//Class<?> c = Class.forName("Ŭ�����̸�.class");
		
		Object ob = c.newInstance();//��ü����
		
		Test t = (Test)ob;//downcast
		
		t.write();
	}

}
