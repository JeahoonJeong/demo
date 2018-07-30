package com.class3;

import java.io.IOException;
import java.util.Scanner;


class Calc{
	
	private int num1,num2;
	private char oper;
	
	public boolean input() throws IOException{
		Scanner sc = new Scanner(System.in);
		System.out.print("두수?");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		System.out.print("연산자?");
		oper = (char)System.in.read();
		
		//연산자 확인
		
		if(oper!='+' && oper !='-' && oper !='*' && oper!='/'){
			return false;
		}else{
			return true;
		}
	}
	
	public int result(){
		
		int r = 0;
		
		switch (oper) {
		case '+':
			r = num1+num2;
			break;
			
		case '-':
			r = num1-num2;
			break;
			
		case '*':
			r = num1*num2;
			break;
	
		case '/':
			r = num1/num2;
			break;

		default:
			break;
		}
		
		return r;
		
	}
	
}

public class Test6 {

	public static void main(String[] args) throws IOException {
		
		Calc ob = new Calc();
		
		if(!ob.input()){//!를 써서 긴코드와 짧은 코드를 스왑
			return;//stop 짧은 코드를 먼저 쓰고 긴 코드를 if문 밖으로 
		}
		
		
		System.out.println(ob.result());
		
		
	}

}
