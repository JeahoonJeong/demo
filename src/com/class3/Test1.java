package com.class3;

//������
//�޸� �Ҵ� ������ ���
//���� �ʱ�ȭ�Ҷ� ���

//class �� �̸��� ����
//���ϰ��� ���⶧���� property�� ����.
//�ߺ����ǰ� ���� overloading
//���� ���ο��� �ѹ��� ȣ���̰���

public class Test1 {
	
	private int x;
	
	public Test1(){//�⺻ ������
		//�����ε��� �ʿ��ϴٸ� �⺻�����ڴ� �ݵ�� ����س��ƾ� �Ѵ�.
		//ex) public Test1()[{}
		
		
		
		System.out.println("�μ��� ���� ������..");
		x = 10;
		System.out.println("x : "+x);
		
		
	}
	
	public Test1(int x){//�����ε��� ������
		System.out.println("�μ��� �ִ� ������..");
		this.x = x;
		System.out.println("x : "+x);
	}

	public static void main(String[] args) {
		
		Test1 ob1 = new Test1();
		int x = 11;
		Test1 ob2 = new Test1(x);
		
	}

}
