package com.class5;

//final�� ����ϴ� 3���� ���
//1.��������� final�� ���̸� �� �ѹ��� �ʱ�ȭ�� ����
//2.�޼ҵ忡 final�� ���̸� Override�� �Ұ�
//3.Ŭ������ final�� ���̸� ����� �Ұ�


class Test{
	
	public static final double PI;
	
	static{//�ʱ�ȭ��
		PI = 3.14;
	}
	
	public double area;
	public final void write(String title){//override�Ұ�
		System.out.println(title+": "+area);
	}
	
	
}

public class Test6 extends Test{
	
	public void circleArea(int r){
		area = (double)r*r*PI;
	}
	

	public static void main(String[] args) {
		
		Test6 ob = new Test6();
		ob.circleArea(10);
		ob.write("��");
	}

}
