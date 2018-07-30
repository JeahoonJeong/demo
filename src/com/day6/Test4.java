package com.day6;

public class Test4 {

	public static void main(String[] args) {
		int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] b = {{9,8,7},{6,5,4},{3,2,1}};
		int[][] sum = new int[3][3];
		int i,j;
		
		for(i=0;i<a.length;i++){
			for(j=0;j<b.length;j++){
				sum[i][j] = a[i][j]+b[i][j];
				System.out.printf("%d\t",sum[i][j]);
			}
			System.out.println();
		}
		
	}

}
