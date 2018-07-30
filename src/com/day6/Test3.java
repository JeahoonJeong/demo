package com.day6;

public class Test3 {

	public static void main(String[] args) {
		int[][] arr = new int[6][6];
		int n = 0;
		boolean flag = true;
		
		for (int i = 0; i < 5; i++) {

			if (flag) {
				for (int j = 0; j < 5; j++) {
					n++;

					arr[i][j] = n;

					arr[5][5] += n;
					arr[i][5] += n;
					arr[5][j] += n;
					//arr[5][i] += arr[j][i];

				}
			} else {

				for (int j = 4; j >= 0; j--) {
					n++;

					arr[i][j] = n;

					arr[5][5] += n;
					arr[i][5] += n;
					arr[5][j] += n;
					//arr[5][i] += arr[j][i];

				}
			}
			
			flag = !flag;

		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.printf("%d\t", arr[i][j]);
			}
			System.out.println();
		}

	}

}
