package com.class4;

public class Test5 {

	public static void main(String[] args) {
		
		StringBuffer ob = new StringBuffer();
		
		ob.append("����");
		ob.append("�λ�");
		ob.append("�뱸");
		
		System.out.println(ob);
		
		//StringBuffer -> String���� ��ȯ
		
		String str = ob.toString();
		
		System.out.println(str);
		
		
		int a = 24;
		
		System.out.println(a);
		System.out.println(Integer.toString(a));
		System.out.println(Integer.toString(a,2));
		System.out.println(Integer.toString(a, 16));
		
		
		//����ȭ???
		
	}

}
