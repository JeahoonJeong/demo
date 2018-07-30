package com.class4;

//StringBuffer  : ����, ����ȭ����
//StringBuilder : ����, ����ȭ ������

public class Test4 {

	public void stringTime(){
		
		System.out.println("StringTime...");
		
		long start = System.nanoTime();
		
		String str = "a";
		
		for(int i =0; i<50000;i++){
			str +="a";
			
		}
		
		long end = System.nanoTime();
		
		System.out.println(start - end);
		
	}
	
	public void stringBufferTime(){
		
		System.out.println("StringBufferTime...");
		
		long start = System.nanoTime();
		
		StringBuffer str = new StringBuffer("a");
		
		for(int i =0; i<50000;i++){
			str.append("a");
			
		}
		
		long end = System.nanoTime();
		
		System.out.println(start - end);
		
	}
	
	
	public void stringBuilderTime(){
		
		System.out.println("StringBuilderTime...");
		
		long start = System.nanoTime();
		
		StringBuilder str = new StringBuilder("a");
		
		for(int i =0; i<50000;i++){
			str.append("a");
			
		}
		
		long end = System.nanoTime();
		
		System.out.println(start - end);
		
	}
	
	
	
	
	public static void main(String[] args) {
			
		Test4 ob = new Test4();
		
		ob.stringTime();
		
		ob.stringBuilderTime();
		
		ob.stringBufferTime();
	}

}
