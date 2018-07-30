package com.day5;

import java.util.Random;

public class Test3 {

	public static void main(String[] args) {
		// 1~45까지의 난수를 발생시켜 6개의 난수를 크기순으로 정렬
		Random random = new Random();

		int[] array = new int[6];
		
		/*
		for (int i = 0; i < 6; i++) {
			array[i] = random.nextInt(44)+1;
		}
		*/
		int n=0;
		while(n<6){
			array[n] = random.nextInt(44)+1;
			
			/*
			int num =0;
			for(int j=0;j<6;j++){
				if(array[n]==array[j]){
					num++;
				}
			}
			if(num>=2){
				n--;
			}
			*/
			
			for(int i=0;i<n;i++){
				if(array[i]==array[n]){
					n--;
					break;
				}
			}
			
			n++;
			
		}
		
		

		for (int i = 0; i < 6 - 1; i++) {
			for (int j = i + 1; j < 6; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}

			}
		}

		for (int i : array) {
			System.out.print(i + " ");
		}

	}

}
