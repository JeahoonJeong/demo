package com.day5;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		// 10명이내의 이름과 점수를 입력받아 석차구하기
		// 입력 순서대로 이름 점수 석차

		String[] name;
		int[] score;
		int[] rank = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
		int num;

		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();

		score = new int[num];
		name = new String[num];

		for (int i = 0; i < num; i++) {
			System.out.print("이름: ");
			name[i] = sc.next();
			System.out.print("점수: ");
			score[i] = sc.nextInt();
		}

		for (int i = 0; i < num - 1; i++) {
			for (int j = i + 1; j < num; j++) {
				if (score[i] < score[j]) {
					rank[i]++;
				} else if(score[i]>score[j]){
					rank[j]++;
				}
			}
		}

		for (int i = 0; i < num; i++) {
			System.out.println("이름: " + name[i] + " 점수: " + score[i] + " 석차: "
					+ rank[i]);
		}
	}

}
