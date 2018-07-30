package com.day4;

public class SelectionSort {
	
	public static int[] selectionSort(int[] array){
		
		for(int i=0;i<array.length-1;i++){//0~n-1번째 인덱스는 까지 탐색을 시작할 인덱스가 된다.
			
			int index=i;//다음 for문에서 탐색을 시작할 인덱스를 int형변수 index에 넣는다.
			
			for(int j=i;j<array.length;j++){//탐색을 시작할 인덱스부터 n 까지 탐색을 한다.
				
				if(array[j]<array[index]){// 탐색중 가장작은 값을 가지고 있는 인덱스번호를 index변수에 넣는다.
					index=j;
				}
			}//end..for
			
			int temp = array[i];//탐색 시작 인덱스 변수와 최소값인덱스 변수를 스왑한다.
			array[i] = array[index];
			array[index] = temp;
		}
		
		
		return array;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {0,2,3,6,1,5,9,4,8,7};
		array = selectionSort(array);
		
		for(int i=0; i<array.length;i++){
			
			System.out.print(array[i]);
		}
	}

}
