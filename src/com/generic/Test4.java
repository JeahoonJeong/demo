package com.generic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Test4 {
	
	public static String getOper(){
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String oper = null;
		
		try{
			
			System.out.print("������?");
			oper = br.readLine();
			if(!oper.equals("+") && !oper.equals("-") && !oper.equals("/") && !oper.equals("*")){
				//throw�� ���ܸ� �ǵ������� �߻� ��Ŵ
				//throw�� ����Ϸ��� ���� throws Exception�� ����ؾ���
				//throw�� �ݵ�� try���� ���ԵǾ���Ѵ�.
				
				throw new Exception("������ �Է¿���!!");
				
			}
			
		}catch( Exception e){
			
			//System.out.println("�Է¿���");
			System.out.println(e.toString());
		}
		
		return oper;
		
	}

	public static void main(String[] args) {
		
		int num1, num2, result;
		String oper;
		
		Scanner sc = new Scanner(System.in);
		
		
		
		try {
			
			System.out.print("�ΰ��� ��?");
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
