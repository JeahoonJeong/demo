package com.class3;

//������ �μ�

public class Test5 {
	
	int sum(int...args){//������ �������� ���� �μ�
		int s = 0;
		
		for(int i =0;i<args.length;i++){
			s+= args[i];
			
		}
		
		return s;
	}

	public static void main(String[] args) {
		
		Test5 ob = new Test5();
		
		ob.sum(1,2,3,4,5);
		
		System.out.println(ob.sum(1,2,3));
		
	}

}
