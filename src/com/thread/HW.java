package com.thread;

import java.util.Random;
import java.util.Scanner;

class ThreadHW extends Thread{

	@Override
	public void run() {
		try {
			System.out.print("고민중.");
			for(int i=0;i<5;i++){
				sleep(700);
				System.out.print(".");
			}
			System.out.println();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	
	
}

public class HW {

	public static void main(String[] args) throws InterruptedException {
		
		Thread main = new Thread().currentThread();
		Thread t1 = new ThreadHW();
		Scanner sc = new Scanner(System.in);
		int num;
		int[] sel;
		String[] name = 
			{"장예진","노홍현","최원경","라영준","송재훈",
			"정제훈","장성진","한승덕","류정아","이현진",
			"김누리","조일준","김용광","박종훈","서영진",
			"이양규","김희민","박현재","김한결","여정민",
			"임단비","김해나","문승준","조기현","박원빈",
			"김민영","이태현","박명성","허도휘","신상엽"};
		
		System.out.print("발표자수: ");
		num = sc.nextInt();
		
		
		//main.wait();
		//main.join();
		t1.start();
		//main.interrupt();
		t1.join();
		//main.start();
		
		
		sel = new int[num];
		Random r = new Random();
		
		for(int i = 0;i<num;i++){
			sel[i] = r.nextInt(30);
			//for(int j =0;j<i;j++){
				for(int j = i-1; j>=0;j--){
				if(sel[i]==sel[j]){
					i--;
					break;
				}
			}
		}
		
		System.out.println("축하합니다!!,발표자 입니다.\n");
		
		for(int i=0;i<num;i++){
			System.out.println((i+1)+"번 발표자 : "+ name[sel[i]]);
			
		}
		
		
		

	}

}
