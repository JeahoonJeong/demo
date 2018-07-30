package com.generic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Test4 {
	
	public static String getOper(){
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String oper = null;
		
		try{
			
			System.out.print("연산자?");
			oper = br.readLine();
			if(!oper.equals("+") && !oper.equals("-") && !oper.equals("/") && !oper.equals("*")){
				//throw로 예외를 의도적으로 발생 시킴
				//throw를 사용하려면 위에 throws Exception을 기술해야함
				//throw는 반드시 try문에 포함되어야한다.
				
				throw new Exception("연산자 입력에러!!");
				
			}
			
		}catch( Exception e){
			
			//System.out.println("입력에러");
			System.out.println(e.toString());
		}
		
		return oper;
		
	}

	public static void main(String[] args) {
		
		int num1, num2, result;
		String oper;
		
		Scanner sc = new Scanner(System.in);
		
		
		
		try {
			
			System.out.print("두개의 수?");
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			
			oper = Test4.getOper();
			
			result = 0;
			
			if(oper.equals("+")){
				result = num1+num2;
			}else if(oper.equals("-")){
				result = num1-num2;
			}else if(oper.equals("/")){
				result = num1/num2;
			}else if(oper.equals("*")){
				result = num1*num2;
			}
			
			System.out.printf("%d %s %d = %d",num1,oper,num2,result);
			
		} catch(Exception e){
			
		}
		
		
	}

}
