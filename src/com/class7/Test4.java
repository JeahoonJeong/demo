package com.class7;

//����Ŭ����
//Annonymouse, �͸���, ������ Ŭ����

public class Test4 {
	
	public Object getTitle(){
		
		return new Object(){// �ַ� �������̽��� ���

			@Override
			public String toString() {
				return "������ Ŭ����";
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
