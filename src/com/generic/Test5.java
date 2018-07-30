package com.generic;

import java.util.Scanner;

public class Test5 {

	//5-10자 이내의 문자열을 입력받아 출력
	//문자열? abcde
	//abcde
	
	//조건 5-10자인지 확인
	//2.영문자(대소문자 구분없이)만 입력
	
	public void inputForm(String str) throws Exception{
		
		if(str.length()<5 || str.length()>10){
			throw new Exception("5-10이내의 문자를 입력하세요.");
		}
		
		
		for(int i=0;i<str.length();i++){
			 
			char ch = str.charAt(i);
			
			if( !((str.charAt(i)>='A' && str.charAt(i)<='Z') 
					|| ( str.charAt(i)>='a' && str.charAt(i)<='z'))){
				throw new Exception("영문자만 입력하세요.");
			}
			
			
			if((ch<65||ch>90)&&(ch<'a'||ch>'z')){
				throw new Exception("영문자만 입력하세요.");
			}
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str;
		
		Test5 ob = new Test5();
		
		try {
			
			System.out.print("문자열?");
			str = sc.next();
			
			ob.inputForm(str);
			System.out.println(str);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString());
		}

	}

}
