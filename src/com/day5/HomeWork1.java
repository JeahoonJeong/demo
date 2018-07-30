package com.day5;

import java.util.Scanner;

public class HomeWork1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		
		int i=0;
		while(i<5){
			num[i] = sc.nextInt();
			i++;
		}
		i=0;
		int min=num[0],max=num[0];
		while(i<5){
			if(num[i]>max){
				max=num[i];
			}else if(num[i]<min){
				min=num[i];
			}
			i++;
		}
		System.out.println("min: "+min+" max: "+max);
	}

}
