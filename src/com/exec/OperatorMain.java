package com.exec;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OperatorMain {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str;
		double num1, num2, result;
		
		OperationAuthen auth = new OperationAuthen();
		
		try {
			System.out.print("두수[a,b]?");
			str = br.readLine();
			
			auth.inputForm(str);//입력오류처리
			
			String[] temp = str.split(",");
			
			auth.number(temp[0]);//실수정수 오류처리
			num1 = Double.parseDouble(temp[0]);

			auth.number(temp[1]);//실수정수 오류처리
			num2 = Double.parseDouble(temp[1]);
			
			System.out.print("연산자?");
			str = br.readLine();
			
			auth.operator(str.charAt(0));
			
			
			result = 0;
			
			if(str.equals("+")){
				result = num1+num2;
			}else if(str.equals("-")){
				result = num1-num2;
			}else if(str.equals("/")){
				result = num1/num2;
			}else if(str.equals("*")){
				result = num1*num2;
			}
			
			System.out.printf("%g %s %g = %g",num1,str,num2,result);
			//%d로 받으면 에러.
			
		} catch (IOException e){
		
		} catch (MyException e) {
			System.out.println(e.toString());
		}
		
	}

}
