package com.class2;

//static �ڱⰡ �˾Ƽ� �޸𸮷� �ö� 
//�޸𸮷� �ø��� new������ ���
//1000���� ���� �޸� ������ �Ѱ��� ���

public class Test2 {
	
	public static int a = 10;//class ����
	//Ŭ���� ������ Ŭ���� �޼ҵ�� �ε��Ǵ� ����
	//�޸� �Ҵ��� �̷������[Ŭ�����̸�.��ü�̸�]���� ����
	// ��, new�� ������� �ʰ� �ٷ� ����� �� �ִ�.
	
	private int b =20;//instance ����
	//������ Ŭ������ �޼ҵ�(instance �޼ҵ�) �ȿ��� �ٷ� ������ ���� ������
	//Ŭ���� �޼ҵ忡���� ������ �� ����.
	//Ŭ���� �޼ҵ忡�� �����ϱ� ���ؼ��� new������ ��ü�� �����ϰ�
	//��ü �̸����θ� ������ �����ϴ�.
	
	public void write(){//instance method
		
		System.out.println("class���� :" +a);
		System.out.println("instance���� :"+b);
		
	}
	
	public static void print(){
		
		System.out.println("class���� :" +a);
		//System.out.println("instance���� :"+b);
		
	}

	public static void main(String[] args) {
		
		//Test2.print();
		System.out.println("class���� a : "+a);
		a=10;
		System.out.println("class���� Test2.a : "+Test2.a);
		
		Test2 ob1 = new Test2();
		
		Test2.print();
		print();
		
		System.out.println("instance ���� b: "+ob1.b);
		
		ob1.write();
		ob1.print();
		System.out.println("class ���� a : "+ob1.a);
		
		Test2 ob2 = new Test2();
		
		ob2.a =100;
		ob2.b =200;
		System.out.println("ob2----------------------");
		ob2.write();
		
		System.out.println("ob1----------------------");
		ob1.write();
		
	}

}
