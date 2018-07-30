package com.day6;

public class Test3_1 {
	private int[][] arr;
	int row,col;
	
	public void setNum(int row, int col){
		arr = new int[row][col];
		this.row = row;
		this.col = col;
	}
	
	public void sort(){
		int n = 0;
		boolean flag = true;
		
		for (int i = 0; i < row-1; i++) {

			if (flag) {
				for (int j = 0; j < col-1; j++) {
					n++;

					arr[i][j] = n;

					arr[row-1][col-1] += n;
					arr[i][col-1] += n;
					arr[row-1][j] += n;
					//arr[5][i] += arr[j][i];

				}
			} else {

				for (int j = col-2; j >= 0; j--) {
					n++;

					arr[i][j] = n;

					arr[row-1][col-1] += n;
					arr[i][col-1] += n;
					arr[row-1][j] += n;
					//arr[5][i] += arr[j][i];

				}
			}
			
			flag = !flag;

		}

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.printf("%d\t", arr[i][j]);
			}
			System.out.println();
		}
	}
	
	
}
