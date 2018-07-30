package com.day4;

public class Question4 {

	public static void main(String[] args) {
		
		int result =0;
		
		for(int i=1;i<=100;i++){
			if(i%3==0){
				result++;
			}
		}
		System.out.printf("%d",result);
	}

}
