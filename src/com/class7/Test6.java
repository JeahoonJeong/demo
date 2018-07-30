package com.class7;

import java.util.Iterator;
import java.util.Vector;

public class Test6 {
	
	private static final String[] city = {"서울","부산","대구","인천","광주","대전","울산"};
	

	public static void main(String[] args) {

		Vector<String> v = new Vector<String>();
		
		for(String c : city){
			v.add(c);
		}
		
		//v.add(10);  x
		String str = v.firstElement();
		System.out.println(str);
		
		str = v.lastElement();
		System.out.println(str);
		
		str = v.get(2);
		System.out.println(str);
		
		for(int i =0;i<v.size();i++){
			System.out.println(i+1+"번째도시: "+v.get(i));
		}
		
		for(String s : v){
			System.out.println(s);
		}
		
		//Iterrator: 반복자
		//push pop
		
		Iterator<String> it = v.iterator();
		while(it.hasNext()){
			str = it.next();
			System.out.print(str + " ");
		}
		
		
		
				
	}

}
