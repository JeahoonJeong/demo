package com.day4;

public class Question3 {

	public static void main(String[] args) {
		int result=0;
		for(int i=1;i<=10;i++){
			if(i%2!=0){
				result+=i;
			}else{
				result-=i;
			}
		}
		System.out.printf("%d",result);
	}

}
