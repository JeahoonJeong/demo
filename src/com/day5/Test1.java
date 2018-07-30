package com.day5;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		// 배열안에

		int[] array = new int[5];
		
		System.out.print("5개의 숫자를 입력하시오.");

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < array.length; i++) {

			array[i] = sc.nextInt();
		}

		for (int i = 0; i < array.length; i++) {

			for (int j = i + 1; j < array.length; j++) {

				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
					//System.out.printf("%d : %d\n", i, j);
				}

			}
		}
		
		/*
		 * for (int i = 0; i < array.length; i++) {
		 * 
		 * System.out.print(" "+array[i]); }
		 */

		for (int i : array) {
			System.out.print(i+" ");
		}
	}

}
