package com.class6;

class SuperTest {
	public int a = 10, b=20;
	
	public void write(){
		System.out.println("SuperTest write()...");
	}
	
	public int hap(){
		
		return a+b;
	}
	
}

class SubTest extends SuperTest{
	
	public int b=100,c=200;
	
	public void print(){
		
		System.out.println("SubTest print()...");
	}

	@Override
	public int hap() {
		return a+b+c;
	}
}


public class Test2 {

	public static void main(String[] args) {
		
		SubTest ob1 = new SubTest();
		
		System.out.println("ob1.b: "+ob1.b);
		
		SuperTest ob2 = ob1;//upcast
		
		SuperTest ob3 = new SuperTest();
		
		//SubTest ob4 = (SubTest)ob3;
		
		System.out.println("ob2.b :"+ob2.b);
		//���� ���� ������ �ڱ���� ����.
		
		System.out.println("sum: "+ob2.hap());//310  ob2�� SuperŬ������ ��ü, hap() �ڽ� ���� ����?
		
		ob2.write();
		//ob2.print(); x
		((SubTest)ob2).print();//downcast
		
		System.out.println(ob3 instanceof SubTest);
		
		//System.out.println(ob4 instanceof SubTest);
		
	}

}
