package com.class6;

//Interface
//1.�߻�Ŭ������ ���� ���� �ְ� ����(����)�� ����.
//2.final������ �����Ҽ��ִ�.
//3.�������̽��� �����ϱ� ���ؼ��� implements�� ����Ѵ�.
//4.�ϳ��̻��� �������̽��� implements�� Ŭ������ 
//  �������̽��� ��� �޼ҵ带 override�ؾ��Ѵ�.
//5.�������̽��� �������̽��� ��ӹ����� ������ �̶� extends
//  Ű���带 ����Ѵ�.
//6.�������̽��� ���� ����� �����ϴ�.
//7.�������̽��� ������̴�.
//8.���������� �����ϴ�. (���������� �޼ҵ带 �������̵� �ؾ��Ѵ�.)

interface Fruit{
	
	String Won = "��";//���� �빮�� final, public static final ����
	
	int getPrice();// public  abstract ����
	
	public String getName();
}

class FruitImpl implements Fruit{//implement�� Ŭ�����̸� ���� ��Ģ? xxxxImpl

	@Override
	public int getPrice() {
		return 1000;
	}

	@Override
	public String getName() {
		return "���";
	}
	
	public String getItems(){
		return "����";
	}
}

public class Test3 {

	public static void main(String[] args) {
		FruitImpl ob1 = new FruitImpl();
		
		System.out.println(ob1.getItems()+":"+ob1.getName()+" ����:"
				+ob1.getPrice()+Fruit.Won);
		
		Fruit ob2 = ob1;//upcast
		
		System.out.println(ob2.getName());//abstract �޼ҵ�� �ڽ��� �޼ҵ带 ����Ҽ� �ִ�.
		
		//System.out.println(ob2.getItems); ����� �� ����. �θ� ���������� �ʴ�.
		
		//�ڽ��� �����ڷ� �θ�Ŭ���� ��ü�� �����Ҽ� �ִ�.
		//������ �ڽ��� �޼ҵ带 ����� �� ����.
		
	}

}
