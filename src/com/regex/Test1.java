package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//java.util.regex
//정규화 표현식
//단어바꾸기, 메일주소 검색, 파일 제어문자 제거

/*
 * c[a-z]* : c로시작하는 영단어(c,ca,cbsdf) 글자수 제한 없음.
 * c[a-z] : c로시작하는 두단어(ca,cb)
 * c[a-zA-Z0-9] : ca,cA,c4
 * c. : c로 시작하는 두글자 (ca,cB,c&)
 * c.* : c로 시작하는 모든 문자cssssssssssssssss
 * c.*t : ct,cssssssssssssssssssst,c7777777777777777t
 * [b|c].* 또는 [bc].* 또는 [b-c].* : b,c,bbb,cas  b와 c 둘중에 하나로 시작한다.
 * [^b|c].* 또는 [^bc].* 또는 [^b-c].* :b와 c 둘중에 하나로 시작하지 않는다.
 * *c.* : c가 포함된 문자열(ksi93c74dkdk)
 * [\\d]+ 또는 [0-9]+ : 하나이상의 숫자
 */
public class Test1 {

	public static void main(String[] args) {
		
		String[] str = {"bat","baby","bonus","c","cA","ca","c","c0","car","combat","count","date","disc"};
		
		Pattern p = Pattern.compile("c[a-z]*");//패턴정의
		for(String s : str){
			Matcher m = p.matcher(s);
			
			if(m.matches()){
				System.out.println(s);
			}
		}
		
		System.out.println("--------------------------");
		
		p = Pattern.compile("c[a-z]+");
		for(String s : str){
			
			Matcher m = p.matcher(s);
			
			if(m.matches()){
				System.out.println(s);
			}
			
		}
		
		System.out.println("--------------------------");
		
		p = Pattern.compile("c.");
		for(String s : str){
			
			Matcher m = p.matcher(s);
			
			if(m.matches()){
				System.out.println(s);
			}
			
		}
		

		System.out.println("--------------------------");
		
		//메일확인
		String[] mail = {"aaa@aaa.com","@aaa.co.kr",".@bbb.com","aaa@vvv.co.kr","sss.co.kr","abc@bbb"};
		//영어,숫자 @ 영어,숫자 . 영어,숫자 . . .
		//   [\\w]+ : 한글자 이상의 영, 숫자
		//@
		// (\\.[\\w]+) : 괄호안에 있는 것은 반드시 한번은 사용
		// \\. : dot반드시 사용
		
		String pat = "[\\w]+@[\\w]+(\\.[\\w]+)+";
		
		for(String s : mail){
			
			if(Pattern.matches(pat,s)){
				System.out.println(s);
			}
			
		}
		
		System.out.println("--------------------------");
		
		
		
		p = Pattern.compile(pat);
		
		for(String s : mail){
			
			Matcher m = p.matcher(s);
			
			if(m.matches()){
				System.out.println(s);
			}
			
		}
		
		
	}

}
