package com.class3;

import java.io.IOException;
import java.util.Scanner;


class Calc{
	
	private int num1,num2;
	private char oper;
	
	public boolean input() throws IOException{
		Scanner sc = new Scanner(System.in);
		System.out.print("�μ�?");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		System.out.print("������?");
		oper = (char)System.in.read();
		
		//������ Ȯ��
		
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
		
		if(!ob.input()){//!�� �Ἥ ���ڵ�� ª�� �ڵ带 ����
			return;//stop ª�� �ڵ带 ���� ���� �� �ڵ带 if�� ������ 
		}
		
		
		System.out.println(ob.result());
		
		
	}

}
