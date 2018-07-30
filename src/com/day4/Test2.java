package com.day4;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		//배열
		
		int array1[] = new int[5];
		//int[] array2 = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.print("다섯개의 정수 입력");
		
		for(int i=0;i<array1.length;i++){		
			array1[i]=sc.nextInt();
		}
		
		for(int i=0;i<array1.length;i++){
			/*
			if(i!=0)
				array1[i]=array1[i-1]+10;
			else 
				array1[i]=10;
			*/
			System.out.printf("num[%d] : %d\n",i,array1[i]);
		}
		
		
		
		
		
		
		
	}

}
