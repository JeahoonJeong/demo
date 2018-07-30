package com.day4;

import java.util.Scanner;

public class Beakjoon1427 {

	public static void main(String[] args) {
		//주어진 숫자 n 각자리수를 내림차순으로
		
		int num = 0;
		int mul = 1;
		int[] array = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
		boolean check = false;
		
		Scanner sc = new Scanner(System.in);
		
		num = sc.nextInt();
		
		for(int i=0;i<10;i++){
			array[i]=num%10;
			num /=10;
			if(num<1)break;
		}
		
		
		while(!check){
			check=true;
			for(int i=0;i<array.length-1;i++){
				
				if(array[i]>array[i+1]){
					int temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp;
					check = false;
				}
				
			}
			
		}
		
		
		for(int i = 0; i<array.length;i++){
			if(array[i]!=-1){
				num = array[i]*mul+num;
				mul *=10;
			}
			
		}
		
		System.out.println(num);
	}

}
