package com.class7;

import java.util.Vector;

//collection Framework(�����)

//List(I) - ArrayList(C), Vector(C)
//Map(I) - Hashtable(C), HashMap(C)
//���ʸ�

public class Test5 {
	
	
	
	public static void main(String[] args) {
		
		
		//�⺻ ������ Ÿ���� Object�̴�.
		
		Vector v = new Vector();//�÷����� �⺻������ �ε���10���� �����Ѵ�.
		
		v.add("����");//upcast
		v.add(30);//upcast
		v.add('a');
		
		String str = (String)v.get(0);//�ٿ�ĳ��Ʈ
		System.out.println(str);
		
		int i = (int)v.get(1);
		System.out.println(i);
		
		char ch = (char)v.get(2);
		System.out.println(ch);
	}

}
