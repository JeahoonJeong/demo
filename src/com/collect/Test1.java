package com.collect;

import java.util.Vector;

class Test{
	
	String name;
	int age;
	
	@Override
	public String toString() {
		
		String str = "name: "+name+" age: "+age;
		return str;
	}
	
	
	
}

public class Test1 {

	public static void main(String[] args) {
		
		Vector<Test> v  = new Vector<Test>();
		
		Test ob = new Test();
		ob.name = "�����";
		ob.age = 25;
		
		v.add(ob);
		System.out.println(v.toString());
		
		//�߸��ۼ��ϴ� ���
		ob.name = "�ڽ���";
		ob.age = 28;
		v.add(ob);// ob�� �����ϰ� add �ε����� ���� 0�� 1�� �ε���, ob�� ����Ų��.
		
		for(Test t : v){
			System.out.println(t.name+t.age);//�ڽ���28  �ι����
		}
		
		System.out.println();
		
		ob = new Test();//�������� ���ο� �޸𸮸� �Ҵ�޾� Test�ν��Ͻ��� ����
		ob.name = "��ȿ��";
		ob.age = 29;
		v.add(ob);
		
		for(Test t : v){
			System.out.println(t.name+t.age);//�ڽ���28 �ι� ��ȿ��29 �ѹ�
		}
		
		
		
		
		
		
	}

}
