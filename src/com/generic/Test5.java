package com.generic;

import java.util.Scanner;

public class Test5 {

	//5-10�� �̳��� ���ڿ��� �Է¹޾� ���
	//���ڿ�? abcde
	//abcde
	
	//���� 5-10������ Ȯ��
	//2.������(��ҹ��� ���о���)�� �Է�
	
	public void inputForm(String str) throws Exception{
		
		if(str.length()<5 || str.length()>10){
			throw new Exception("5-10�̳��� ���ڸ� �Է��ϼ���.");
		}
		
		
		for(int i=0;i<str.length();i++){
			 
			char ch = str.charAt(i);
			
			if( !((str.charAt(i)>='A' && str.charAt(i)<='Z') 
					|| ( str.charAt(i)>='a' && str.charAt(i)<='z'))){
				throw new Exception("�����ڸ� �Է��ϼ���.");
			}
			
			
			if((ch<65||ch>90)&&(ch<'a'||ch>'z')){
				throw new Exception("�����ڸ� �Է��ϼ���.");
			}
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str;
		
		Test5 ob = new Test5();
		
		try {
			
			System.out.print("���ڿ�?");
			str = sc.next();
			
			ob.inputForm(str);
			System.out.println(str);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString());
		}

	}

}
