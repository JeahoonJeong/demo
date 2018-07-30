package com.beakjoon;

import java.util.Scanner;

public class N1026 {

	public static void main(String[] args) {
		
		int[] A,B,C;
		int num;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		A = new int[num];
		B = new int[num];
		C = new int[num];
		
		for(int i = 0; i<num ; i++){
			A[i] =sc.nextInt();
		}
		for(int i = 0; i<num ; i++){
			B[i] =sc.nextInt();
		}
		for(int i = 0; i<num ; i++){
			C[i] =0;
		}
		
		for(int i =0; i<num-1; i++){
			for(int j = i+1; j<num; j++){
				if(B[i]<B[j]){
					C[i]++;
				}else if(B[i]>B[j]){
					C[j]++;
				}
			}
		}
		
		
		boolean check = false;
		
		while(!check){
			check = true;
			for(int i=0; i<num-1;i++){
				if(A[i]>A[i+1]){
					int temp = A[i];
					A[i] = A[i+1];
					A[i+1] = temp;
					check = false;
				}
			}
			
		}
		
		for(int i =0; i<num; i++){
			int temp = A[i];
			A[i] = A[C[i]];
			A[C[i]] = temp;
		}
		
		int result =0;
		for(int i=0;i<num;i++){
			result+=(A[i]*B[i]);
		}
		
		System.out.println(result);
		
	}

}
