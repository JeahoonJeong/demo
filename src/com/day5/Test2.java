package com.day5;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		//열명 이내의 이름과 점수를 입력받아
		//점수가 높은사람에서 낮은 사람으로 정렬(내림차순)
		
		Scanner sc = new Scanner(System.in);
		
		String[] name;
		int[] score;
		int size;
		
		do{
			System.out.print("인원을 입력하시오(1-10)");
			size = sc.nextInt();
		}while(size<1 || size>10);
		
		//배열의 메모리 할당(객체생성)
		name = new String[size];
		score = new int[size];
		
		for(int i =0; i<size; i++){
			System.out.print("이름을 입력하시오");
			name[i] = sc.next();
			System.out.print("점수를 입력하시오");
			score[i] = sc.nextInt();
		}
		
		//selection sort
		 
		for(int i=0; i<size-1 ; i++){
			for(int j = i+1; j<size; j++){
				if(score[i]<score[j]){
					String nTemp = name[i];
					int sTemp = score[i];
					name[i] = name[j];
					score[i] = score[j];
					name[j] = nTemp;
					score[j] = sTemp;
				}
			}
		}
		
		
		//bubble sort
		
		/*
		boolean check = false;
		while(!check){
				check = true;
				for(int j = 0; j<size-1; j++){
					if(score[j]<score[j+1]){
						String nTemp = name[j];
						int sTemp = score[j];
						name[j] = name[j+1];
						score[j] = score[j+1];
						name[j+1] = nTemp;
						score[j+1] = sTemp;
						check = false;
					}
				}
			
		}
		*/
		//insertion sort
		/*
		for (int i = 1; i < size; i++) {
			for (int j = i; j > 0; j--) {
				if (score[j] > score[j - 1]) {
					String nTemp = name[j];
					int sTemp = score[j];
					name[j] = name[j - 1];
					score[j] = score[j - 1];
					name[j - 1] = nTemp;
					score[j - 1] = sTemp;
				}

			}
		}
		*/
		
		for(int i=0; i<size; i++){
			System.out.println((i+1)+"등 "+"이름 : "+name[i]+" 점수 : "+score[i]);
		}
		
	}

}
