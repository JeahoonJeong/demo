package com.beakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class N11651 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int[][] array;
		int num;
		//Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//num = sc.nextInt();
		num = Integer.parseInt(br.readLine());

		array = new int[num][2];

		for (int i = 0; i < num; i++) {
			//array[i][0] = sc.nextInt();
			StringTokenizer str = new StringTokenizer(br.readLine());
			array[i][0] = Integer.parseInt(str.nextToken());
			//array[i][1] = sc.nextInt();
			array[i][1] = Integer.parseInt(str.nextToken());
		}

		for (int i = 1; i < num; i++) {
			for (int j = 0; j < num - i; j++) {
				if (array[j][1] > array[j + 1][1]) {
					int temp1 = array[j][1];
					array[j][1] = array[j + 1][1];
					array[j + 1][1] = temp1;

					int temp2 = array[j][0];
					array[j][0] = array[j + 1][0];
					array[j + 1][0] = temp2;
				}

			}
		}

		for (int i = 1; i < num; i++) {
			for (int j = 0; j < num - i; j++) {

				if (array[j][1] == array[j + 1][1]
						&& array[j][0] > array[j + 1][0]) {
					int temp1 = array[j][1];
					array[j][1] = array[j + 1][1];
					array[j + 1][1] = temp1;

					int temp2 = array[j][0];
					array[j][0] = array[j + 1][0];
					array[j + 1][0] = temp2;
				}

			}
		}
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int i = 0; i < num; i++) {
			
			bw.write(array[i][0]+" "+array[i][1]+"\n");
			//System.out.println(array[i][0]+" "+array[i][1]);	
		}
		//bw.flush();
		br.close();
		bw.close();

	}

}
