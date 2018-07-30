package com.day4;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1,num2,result=0;
		System.out.printf("두수를 입력하시오.");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		if(num1>num2){
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		for(int i = num1; i<=num2;i++){
			result+=i;
		}
		System.out.printf("%d",result);
	}

}
