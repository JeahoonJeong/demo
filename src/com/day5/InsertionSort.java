package com.day5;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		int[] array = new int[10];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i =0; i<array.length;i++){
			
			array[i] = sc.nextInt();
		}
		
		for(int i=1;i<array.length;i++){
			for(int j = i; j>0; j--){
				if(array[j]<array[j-1]){
					int temp = array[j];
					array[j] = array[j-1];
					array[j-1] = temp;					
				}
				
			}
			
		}
		/*
		for(int i : array){
			System.out.print(array[i-1]+" ");
		
		}
		*/
		
		for(int i : array){
			System.out.print(i);
		}
	}

}
