package com.day4;

public class SelectionSort {
	
	public static int[] selectionSort(int[] array){
		
		for(int i=0;i<array.length-1;i++){//0~n-1��° �ε����� ���� Ž���� ������ �ε����� �ȴ�.
			
			int index=i;//���� for������ Ž���� ������ �ε����� int������ index�� �ִ´�.
			
			for(int j=i;j<array.length;j++){//Ž���� ������ �ε������� n ���� Ž���� �Ѵ�.
				
				if(array[j]<array[index]){// Ž���� �������� ���� ������ �ִ� �ε�����ȣ�� index������ �ִ´�.
					index=j;
				}
			}//end..for
			
			int temp = array[i];//Ž�� ���� �ε��� ������ �ּҰ��ε��� ������ �����Ѵ�.
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
