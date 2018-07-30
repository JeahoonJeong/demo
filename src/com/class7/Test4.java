package com.class7;

//내부클래스
//Annonymouse, 익명의, 무명의 클래스

public class Test4 {
	
	public Object getTitle(){
		
		return new Object(){// 주로 인터페이스를 사용

			@Override
			public String toString() {
				return "무명의 클래스";
			}
			
			
		};
	}
	
	public Object getNUmber(int n){
		
		String str = "num :"+n;
		
		return new Object(){

			@Override
			public String toString() {
				return str;
			}
			
		};
	}
	
	public static void main(String[] args) {
		
		Test4 ob = new Test4();
		
		System.out.println(ob.getTitle());
		
		System.out.println((ob.getNUmber(4)).toString());
		
	}

}
