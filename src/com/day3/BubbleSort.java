package com.day3;

public class BubbleSort {
	
	public static void bubble(int[] array){
		
		boolean isSorted = false;//������ �Ǿ����� Ȯ���ϴ� �÷���
		
		while(!isSorted){ //������ �Ǹ� while���� �����.
			
			isSorted = true; // �÷��׸� true�� ���� 
			
			for(int i = 0; i<array.length-1;i++){ // array ����-1 �� ���Ѵ�.
				
				if(array[i]>array[i+1]){ // �ε���1 ���̳��� ��Ҹ� ���Ͽ� ������������ �����Ѵ�.
					int temp = array[i]; // ����
					array[i] = array[i+1];
					array[i+1] = temp;
					isSorted = false; // ������ �߻��� ��� �÷��׸� false�� �����Ѵ�.(���������� ��� �����Ѵ�.)
				}//end..if
				
			}//end..for
		}//end..while
		for(int i = 0; i<array.length; i++){//array���
			System.out.print(array[i]);
		}
	}
	
	public static void main(String[] args){
		
		int[] array = {3,4,1,5,7,2,8,9,0};//0~9������ ��������ִ� int�� �迭 array ����
		
		bubble(array); // bubble �޼ҵ� ȣ��
		
	}

}
