package com.class4;

//WrapperŬ����
//�⺻ ������(�ڷ���)�� ��ü�� ����� �� �ְ� ���ش�.
//�ڹ� �ڷ��� : boolean,byte,char, short, int, long, float, double
//���۷��������� : Boolean, Byte, Character, Short, Integer, Long, Double

//Auto-Boxing(stack->heap)
//Auto-UnBoxing(heap->stack)

public class Test8 {

	public static void main(String[] args) {
		
		int n1 = 10;
		int n2;
		Integer num1;
		Integer num2 = new Integer(20);
		
		num1 = n1;//Auto-Boxing(stack->heap)
		n2 = num2;//Auto-UnBoxing(heap->stack)
		
		System.out.println(num1);
		System.out.println(num2);
		
	}

}
