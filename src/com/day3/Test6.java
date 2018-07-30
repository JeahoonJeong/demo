package com.day3;



class Test6 {
	public static void main(String[] args)  {
		//3중 for문 3가지
		//2중 for문

		//구구단 
		//2 3 4 5
		//6 7 8 9
		
		int i,j,k;
		
		for(i=2;i<=9;i+=4){
			
			for(int d=i; d<i+4;d++){
				System.out.printf("%d단\t",d);
			}
			System.out.println();
			
			for(j=1;j<=9;j++){
				for(k=i;k<=i+3;k++){
					System.out.printf("%dx%d=%d\t",k,j,k*j);
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
