package com.day6;

import java.util.Scanner;

public class Test2_1 {
	
	
	private int[] check = {2,3,4,5,6,7,8,9,2,3,4,5};
	private String num;
	
	public void setNum(String num){
		this.num = num;
	}
	
	public void check(){
		
		int tot =0;
		for(int i = 0;i<12; i++){
			
			if(i>=6){
				tot += check[i]*
						Integer.parseInt(num.substring(i+1, i+2));
			}else{
				tot += check[i]*
						Integer.parseInt(num.substring(i, i+1));
			}
			
		}
		
		tot = 11-tot%11;
		tot = tot%10;
		
		if(tot==Integer.parseInt(num.substring(13))){
			System.out.println("정상");
		}else{
			System.out.println("비정상");
		}
		
	}
	
	

}
