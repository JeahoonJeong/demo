package com.collect;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

//List(I) - ArrayList(c)
//Vector보다 성능이 좋다(동기화가 안됨)
//Vector는 동기화가 됨

public class Test2 {

	public static void main(String[] args) {
		
		ArrayList<String> lists = new ArrayList<String>();
		lists.add("서울");
		lists.add("부산");
		lists.add("대구");
		
		Iterator<String> it1 = lists.iterator();//move사용
		
		while(it1.hasNext()){
			
			String str = it1.next();//move사용
			System.out.print(str+" ");
			
		}
		System.out.println();
		
		ListIterator<String> it2 = lists.listIterator();//copy사용
		
		while(it2.hasNext()){
			
			System.out.print(it2.next()+" ");//copy
			
		}
		System.out.println();
		
		while(it2.hasPrevious()){
			
			System.out.print(it2.previous()+" ");//copy
			
		}
		
		System.out.println();
		
		List<String> lists1 = new ArrayList<String>();
		
		lists1.addAll(lists);
		lists1.add("인천");
		
		int n = lists1.indexOf("부산");
		lists1.add(n+1, "광주");
		
		for(String s : lists1){
			System.out.print(s+" ");
		}
		System.out.println();
		
		lists1.add("자바프로그래머");
		lists1.add("프레임워크");
		lists1.add("스트럿츠");
		lists1.add("자바란?");
		lists1.add("스프링");
		
		String str;
		
		Iterator<String> it3 = lists1.iterator();
		
		while(it3.hasNext()){
			
			str = it3.next();
			
			if(str.startsWith("자바")){
				System.out.print(str+" ");
			}
			
		}
		
	}

}





























