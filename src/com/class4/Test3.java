package com.class4;

//String
//int,double..
//String �� class�̴�(�ڷ����� �ƴϴ�)

public class Test3 {

	public static void main(String[] args) {
		
		String ob1 = "Seoul";
		String ob2 = "Seoul";//���ڿ��� ���ٸ� heap������ ���� ������ ������ �ʴ´�.(�ּҰ� ����)
		String ob3 = new String("Seoul");//new �����ڸ� ����ϸ� ������ heap������ ������ �����.
		
		System.out.println("ob1 == ob2 "+(ob1==ob2));
		System.out.println((ob1 == ob3));
		System.out.println(ob1.equals(ob3));//String Ŭ�������� override��
		
		//ob2�� ����Ű�� �ּҿ� ����Ǿ��ִ� Seoul�� ����� ����� �ʴ´�.
		//heap ������ ���ο� ������ ����� korea�� ����.
		
		ob2 = "korea";
		System.out.println("ob1 == ob2 "+(ob1==ob2));
		System.out.println((ob1 == ob3));
		System.out.println(ob1.equals(ob3));//String Ŭ�������� override��
		
		ob2 = "Seoul";
		System.out.println("ob1 == ob2 "+(ob1==ob2));
		System.out.println((ob1 == ob3));
		System.out.println(ob1.equals(ob3));//String Ŭ�������� override��
		
		System.out.println(ob1.toString());
		
		//ó���ϴ� �����ʹ� ����ϰ� ���󵵴� ���⶧����
		//�����ʹ� heap������ �����ϰ� ����ϴ� ����� �ڷ��� ó�� ����Ѵ�.
	}

}
