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
			System.out.print("�μ�[a,b]?");
			str = br.readLine();
			
			auth.inputForm(str);//�Է¿���ó��
			
			String[] temp = str.split(",");
			
			auth.number(temp[0]);//�Ǽ����� ����ó��
			num1 = Double.parseDouble(temp[0]);

			auth.number(temp[1]);//�Ǽ����� ����ó��
			num2 = Double.parseDouble(temp[1]);
			
			System.out.print("������?");
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
			//%d�� ������ ����.
			
		} catch (IOException e){
		
		} catch (MyException e) {
			System.out.println(e.toString());
		}
		
	}

}
