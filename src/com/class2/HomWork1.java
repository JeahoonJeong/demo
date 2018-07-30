package com.class2;

import java.io.IOException;

public class HomWork1 {

	public static void main(String[] args) throws IOException  {
		
		String str ="";
		char c;
		int result=0;
		
		while((c=(char)System.in.read())!='\n'){
			str+=c;
		}
		
		int num = Integer.parseInt(str.trim());
		//int num = Integer.parseInt(str);
		
		
		for(int i = 1; i<=num; i++){
			result +=i;
		}
		
		System.out.println(result);
	}

}
