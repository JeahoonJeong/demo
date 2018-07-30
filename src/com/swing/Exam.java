package com.swing;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//Reflect개념을 사용한 메소드 호출방법


	public class Exam {
	
	public Integer hap(Integer a, Integer b){
		
		return a+b;
	
	}
	
	public int sub(int a, int b){
		
		return a-b;
	
	}
	
	public void write(String title, int result){
		
		System.out.println(title+":"+result);
		
	}
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		
		Class cls = Class.forName("com.swing.Exam");
		//Class 클래스의 객체생성
		
		Object ob = cls.newInstance();
		
		//hap 메소드 정보를 리턴받음
		Method hap = cls.getDeclaredMethod("hap", new Class[]{Integer.class,Integer.class});
		
		//sub 메소드 정보를 리턴받음
		Method sub = cls.getDeclaredMethod("sub", new Class[]{int.class,int.class});
		
		//write 메소드 정보를 리턴받음
		Method write = cls.getDeclaredMethod("write", new Class[]{String.class,int.class});
		
		//인수가 없는 메소드
		//Method write = cls.getDeclaredMethod("write", null});
		
		//메소드 호출(invoke()사용)
		Object h = hap.invoke(ob, new Object[]{20,10});
		write.invoke(ob, new Object[]{"합",h});
		
		Integer i = (Integer)sub.invoke(ob, new Object[]{100,200});
		write.invoke(ob, new Object[]{"차",i});
		
		//인수가 없는 경우
		//write.invoke(obj, null);
		
		 //int[] a = new int[]{1,2,3};
	}

}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	