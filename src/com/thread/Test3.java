package com.thread;

import java.util.Calendar;

class Tclock implements Runnable{

	
	@Override
	public void run() {
		
		try {
			
			while(true){
				Thread.sleep(1000);
				System.out.printf("%1$tF %1$tT",Calendar.getInstance());
				System.out.println();
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}

public class Test3 {

	public static void main(String[] args) {
		
		//System.out.printf("%1$tF %1$tT",Calendar.getInstance());
		
		Thread t1 = new Thread(new Tclock());
		
		t1.start();
		
	}

}
