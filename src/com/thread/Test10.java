package com.thread;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

//������ �ð��� Ư�� �۾��� �Ϸ��� �Ҷ� ���
//TimeTask



public class Test10 extends Thread{

	private int num = 0;
	
	public Test10(){
		
		TimerTask task = new TimerTask() {
			
			@Override
			public void run() {
				
				//�ݺ������� �۾�
				num = 0;
			}
		};
		
		Timer t = new Timer();
		Calendar d = Calendar.getInstance();
		/*
		 * ���� 0��0��0�ʺ��� �Ϸ翡 �ѹ��� �ݺ�
		 * d.add(Calendar.DATE,1);
		 * d.set(Calendar.HOUR,0);//����1��:13
		 * d.set(Calendar.MINUTE,0);
		 * d.set(Calendar.SECOND,0);
		 * d.set(Calendar.MILLISECOND,0);
		 * t.schedule(task,d.getTime(),1000*60*60*24);
		 * 1000�� �ð��� �и��������� ����(��,��,��)
		 */
		
		t.schedule(task,d.getTime(),10000);
		
	}
	
	
	
	@Override
	public void run() {
		while(true){
			System.out.println(num++);
			try {
				sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
	}



	public static void main(String[] args) {
		Test10 ob =new Test10();
		ob.start();
	}

}
