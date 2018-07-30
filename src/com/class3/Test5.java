package com.class3;

//비정형 인수

public class Test5 {
	
	int sum(int...args){//개수가 정해지지 않은 인수
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
