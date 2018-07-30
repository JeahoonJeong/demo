package com.day6;

public class Test1 {

	public static void main(String[] args) {
		//bubble sort(이웃하는 수하고 비교)
		int[] num = {36,30,26,10,4};
		
		for(int i =1;i<num.length;i++){
			for(int j=0;j<num.length-i;j++){
				if(num[j]>num[j+1]){
					int temp = num[j];
					num[j] =num[j+1];
					num[j+1] = temp;
				}
			}
		}
		for(int i =0; i<num.length;i++){
			System.out.print(num[i]+" ");
		}
	}

}
