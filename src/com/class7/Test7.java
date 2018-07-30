package com.class7;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;




public class Test7 {

	private static final String[] city = {"서울","부산","대구","인천","광주","대전","울산"};
	
	public static void main(String[] args) {
		
		Vector<String> v = new Vector<String>();
		
		String str;
		
		System.out.println("백터의 초기용량: "+v.capacity());
		
		for(String c : city){
			v.add(c);
		}
		
		System.out.println("Iterator를 사용한 전체출력...");
		
		Iterator<String> it = v.iterator();
		
		while(it.hasNext()){
			String str1 = it.next();
			System.out.println(str1);
		}
		
		System.out.println("데이터(요소) 갯수: "+ v.size());
		//데이터 변경
		v.set(0, "seoul");
		v.set(1, "Pusan");
		
		System.out.println("전체출력...");
		
		for(String s : v){
			System.out.print(s+" ");
		}
		System.out.println();
		
		//데이터 끼워넣기
		System.out.println("iterator 출력...");
		v.insertElementAt("대한민국", 0);
		
		Iterator<String> i = v.iterator();
		
		while(i.hasNext()){
			
			System.out.print(i.next()+" ");
		}
		System.out.println();
		
		//검색
		
		int index = v.indexOf("대구");
		
		if(index!=-1){
			System.out.println("검색성공"+index);
		}else{
			System.out.println("검색실패"+index);
		}
		
		System.out.println("오름차순 정렬");
		
		//오름차순
		Collections.sort(v);
		
		for(String s : v){
			System.out.print(s+" ");
		}
		System.out.println();
		//내림차순
		System.out.println("내림차순 정렬");
		
		Collections.sort(v, Collections.reverseOrder());
		
		for(String s : v){
			System.out.print(s+" ");
		}
		System.out.println();
		
		//삭제
		v.remove(0);//울산
		v.remove("Pusan");
		
		for(String s : v){
			System.out.print(s+" ");
		}
		System.out.println();
		
		//용량 증가
		
		for(int i1=0; i1<20; i1++){
			
			v.add(Integer.toString(i1));
		}
		
		System.out.println("용량증가");
		for(String s : v){
			System.out.print(s+" ");
		}
		System.out.println();
		
		System.out.println(v.capacity()+" "+v.size());
		
		//범위삭제
		
		System.out.println("범위삭제 0-9");
		
		for(int i1 =0; i1<10; i1++){
			v.remove(6);
		}
		
		for(String s : v){
			System.out.print(s+" ");
		}
		System.out.println();
		
		System.out.println(v.capacity()+" "+v.size());
		
		//빈공간삭제
		System.out.println("빈공간삭제");
		
		v.trimToSize();
		
		System.out.println(v.capacity()+" "+v.size());
		
		//전체삭제
		v.clear();
		for(String s : v){
			System.out.print(s+" ");
		}
		System.out.println();
		
		System.out.println(v.capacity()+" "+v.size());
		System.out.println("공간삭제 X");
		
		v.trimToSize();
		System.out.println(v.capacity()+" "+v.size());
		System.out.println("공간삭제 O");

		
		
	}

}

