package com.thread;

import java.util.Random;
import java.util.Scanner;

class ThreadHW extends Thread{

	@Override
	public void run() {
		try {
			System.out.print("�����.");
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
			{"�忹��","��ȫ��","�ֿ���","����","������",
			"������","�强��","�ѽ´�","������","������",
			"�贩��","������","��뱤","������","������",
			"�̾��","�����","������","���Ѱ�","������",
			"�Ӵܺ�","���س�","������","������","�ڿ���",
			"��ο�","������","�ڸ�","�㵵��","�Ż�"};
		
		System.out.print("��ǥ�ڼ�: ");
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
		
		System.out.println("�����մϴ�!!,��ǥ�� �Դϴ�.\n");
		
		for(int i=0;i<num;i++){
			System.out.println((i+1)+"�� ��ǥ�� : "+ name[sel[i]]);
			
		}
		
		
		

	}

}
