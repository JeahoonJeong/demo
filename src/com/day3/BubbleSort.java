package com.day3;

public class BubbleSort {
	
	public static void bubble(int[] array){
		
		boolean isSorted = false;//정렬이 되었는지 확인하는 플래그
		
		while(!isSorted){ //정렬이 되면 while문을 벗어난다.
			
			isSorted = true; // 플래그를 true로 변경 
			
			for(int i = 0; i<array.length-1;i++){ // array 길이-1 번 비교한다.
				
				if(array[i]>array[i+1]){ // 인덱스1 차이나는 요소를 비교하여 오름차순으로 정렬한다.
					int temp = array[i]; // 스왑
					array[i] = array[i+1];
					array[i+1] = temp;
					isSorted = false; // 스왑이 발생한 경우 플래그를 false로 변경한다.(버블정렬을 계속 실행한다.)
				}//end..if
				
			}//end..for
		}//end..while
		for(int i = 0; i<array.length; i++){//array출력
			System.out.print(array[i]);
		}
	}
	
	public static void main(String[] args){
		
		int[] array = {3,4,1,5,7,2,8,9,0};//0~9까지의 수가들어있는 int형 배열 array 선언
		
		bubble(array); // bubble 메소드 호출
		
	}

}
