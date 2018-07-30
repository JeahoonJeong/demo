package com.class2;

import java.io.IOException;

public class HomeWork1_1 {

	public static void main(String[] args) throws IOException {
		
		String temp ="";
		char c;
		int sum=0;
		while( (c=(char)System.in.read()) !=13){
			temp +=c;
		}
		
		int num = Integer.parseInt(temp);
		
		for(int i =1; i<=num;i++){
			sum +=i;
		}
		
		System.out.println(sum);
		
	}

}
