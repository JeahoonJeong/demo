package com.day4;

public class Question2 {

	public static void main(String[] args) {
		int odd=0,even=0,sum=0;
		
		for(int i=1;i<=100;i++){
			if(i%2==0){
				even+=i;
			}else{
				odd+=i;
			}
			sum+=i;
		}
		
		System.out.printf("È¦:%d Â¦:%d ÇÕ:%d",odd,even,sum);
	}

}
