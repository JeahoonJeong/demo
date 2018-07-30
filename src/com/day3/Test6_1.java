package com.day3;

public class Test6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k=0;
		
		for(i=1;i<=19;i++){		
			for(j=2+k;j<=5+k;j++){
				if(i==10){
					k+=4;
					break;
				}
				System.out.printf("%dx%d=%d\t",j,i%10,j*(i%10));
			}
			System.out.println();
		}
	}

}
