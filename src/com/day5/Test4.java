package com.day5;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		// 10���̳��� �̸��� ������ �Է¹޾� �������ϱ�
		// �Է� ������� �̸� ���� ����

		String[] name;
		int[] score;
		int[] rank = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
		int num;

		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();

		score = new int[num];
		name = new String[num];

		for (int i = 0; i < num; i++) {
			System.out.print("�̸�: ");
			name[i] = sc.next();
			System.out.print("����: ");
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
			System.out.println("�̸�: " + name[i] + " ����: " + score[i] + " ����: "
					+ rank[i]);
		}
	}

}
