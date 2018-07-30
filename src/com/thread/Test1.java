package com.thread;

class MyThread1 extends Thread{
	
	private int num;
	private String name;
	
	public MyThread1(int num, String name){
		
		this.num = num;
		this.name = name;
	}

	@Override
	public void run() {
		
		int i =0;
		while(i<num){
			
			System.out.println(this.getName()+":"+name+i);
			i++;
			
			try {
				sleep(100);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		super.run();
	}
	
	
}

public class Test1 {

	public static void main(String[] args) {

		System.out.println("main시작...");
		
		MyThread1 t1 = new MyThread1(100,"첫번째");
		MyThread1 t2 = new MyThread1(200,"두번째");
		
		t1.start();
		t2.start();
		//여기까지 실행된 스레드 : 3개(main,t1,t2)
		
		System.out.println("main 종료...");
	}

}
