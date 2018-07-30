package com.day6;

public class Test1_1 {
	
	private int[] num;
	
	public void setArray(int[] array){
		num = array;
	}

	public int[] sort() {
		for (int i = 1; i < num.length; i++) {
			for (int j = 0; j < num.length - i; j++) {
				if (num[j] > num[j + 1]) {
					int temp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = temp;
				}
			}
		}
		return num;
	}
	
	public void print(){
		for(int i:num){
			System.out.print(i);
		}
	}

}



