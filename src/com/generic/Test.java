package com.generic;

import java.util.Scanner;

//����ó��

public class Test {

	public static void main(String[] args) {
		int num1, num2, result;
		String oper;
		
		Scanner sc = new Scanner(System.in);
		
		
		try {
			
			System.out.print("�ΰ��� ��?");
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			
			System.out.print("������?");
			oper = sc.next();
			
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
			
		} catch(NumberFormatException e){
			
			System.out.println("������ �Է��ϼ���.");
			
		} catch(ArithmeticException e){
			
			System.out.println("0���� ������ �����ϴ�.");
			
		} catch (Exception e) {
			//System.out.println(e);
			//e.printStackTrace();
			
			System.out.println("���ڸ� �Է��ϼ���.");
		} finally{
			System.out.println("finally �׻� ��µ˴ϴ�.");
		}
		
		
		
		
	}

}
