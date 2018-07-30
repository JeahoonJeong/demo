package com.class5;

class SuperClass{
	
	protected int a =10, b=20;
	public void write(){
		
		System.out.println("SuperClass write....");
		System.out.println("a:"+a+" b: "+b);
	}
	
}

class SubClass extends SuperClass{
	int c =40,b=30;
	@Override
	public void write(){
		System.out.println("SubClass write...");
		System.out.println("a: "+a+" b: "+b+" c: "+c);
		System.out.println("super.b : "+b);
	}
	
	public void print1(){
		System.out.println("SubClass print1");
		write();//�������̵� ���� �ʾҴٸ� �θ��� writeȣ��
	}
	
	public void print2(){
		System.out.println("Subclass print2");
		super.write();
		
	}
}

public class Test4 {

	public static void main(String[] args) {
		
		SubClass ob = new SubClass();
		
		ob.write();
		
		ob.print1();
		
		ob.print2();
		
		
		System.out.println("-------------------------");
		
		System.out.println("ob.b : "+ob.b);
		
		System.out.println("((SuperClass)ob).b :"+((SuperClass)ob).b);//upcast
		
		((SuperClass)ob).write();//upcast�ϴ��� �θ��� �޼ҵ忡 �����Ҽ� ����.
		
		//�޼ҵ�� �ν��Ͻ� ������ �ٸ��� �ڽ��� �޼ҵ带 ȣ��
		//�޼ҵ�� heap������ �ƴ� �޼ҵ� ������ ����Ǿ��ֱ⶧����
		//������ �Ұ��ϴ�.
		
		//SuperClass ob1 = new SuperClass();
		//
		//ob = ((SubClass)ob1);
		
		ob.write();
		
		
		
		
		
	}

}
