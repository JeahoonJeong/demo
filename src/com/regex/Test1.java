package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//java.util.regex
//����ȭ ǥ����
//�ܾ�ٲٱ�, �����ּ� �˻�, ���� ����� ����

/*
 * c[a-z]* : c�ν����ϴ� ���ܾ�(c,ca,cbsdf) ���ڼ� ���� ����.
 * c[a-z] : c�ν����ϴ� �δܾ�(ca,cb)
 * c[a-zA-Z0-9] : ca,cA,c4
 * c. : c�� �����ϴ� �α��� (ca,cB,c&)
 * c.* : c�� �����ϴ� ��� ����cssssssssssssssss
 * c.*t : ct,cssssssssssssssssssst,c7777777777777777t
 * [b|c].* �Ǵ� [bc].* �Ǵ� [b-c].* : b,c,bbb,cas  b�� c ���߿� �ϳ��� �����Ѵ�.
 * [^b|c].* �Ǵ� [^bc].* �Ǵ� [^b-c].* :b�� c ���߿� �ϳ��� �������� �ʴ´�.
 * *c.* : c�� ���Ե� ���ڿ�(ksi93c74dkdk)
 * [\\d]+ �Ǵ� [0-9]+ : �ϳ��̻��� ����
 */
public class Test1 {

	public static void main(String[] args) {
		
		String[] str = {"bat","baby","bonus","c","cA","ca","c","c0","car","combat","count","date","disc"};
		
		Pattern p = Pattern.compile("c[a-z]*");//��������
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
		
		//����Ȯ��
		String[] mail = {"aaa@aaa.com","@aaa.co.kr",".@bbb.com","aaa@vvv.co.kr","sss.co.kr","abc@bbb"};
		//����,���� @ ����,���� . ����,���� . . .
		//   [\\w]+ : �ѱ��� �̻��� ��, ����
		//@
		// (\\.[\\w]+) : ��ȣ�ȿ� �ִ� ���� �ݵ�� �ѹ��� ���
		// \\. : dot�ݵ�� ���
		
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
