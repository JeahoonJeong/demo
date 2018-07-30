package com.collect;

import java.awt.List;
import java.util.Collections;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.Iterator;

//Collection
//Map<키,값>
//Hashtable: 동기화를 지원(Vector)
//HashMap: 동기화를 지원안함(ArrayList)

//키는 중복적인값을 가질수 없다(키는 Set)
//키가 중복적인 값이면 마지막값이 저장된다(수정)
//Map은 Iterator가 없다.
//put : 추가
//get : 가져오기

public class Test3 {

	public static final String[] name =
		{"배수지","천송이","전지현","송지효","박신혜"};
	public static final String[] tel =
		{"111-111","222-222","333-333","111-111","444-444"};
	
	
	public static void main(String[] args) {
		
		Hashtable<String,String> h = new Hashtable<String,String>();	
		
		
		for(int i =0; i<name.length;i++){
			
			h.put(tel[i], name[i]);
			
		}
		
		System.out.println(h);//출력순서는 맵안의 알고리즘에 의해 결정.
		
		
		
		String str;
		
		str = h.get("111-111");//키를 주면 값을 가져옴
		
		if(str == null||str.equals("")){
			System.out.println("자료없음");
		}else{
			System.out.println(str);
		}
		
		//키값이 있는지 검사
		if(h.containsKey("222-222")){
			System.out.println("222있다.");
		}else{
			System.out.println("222없다.");
		}
		
		//데이터가 존재하는지 검사
		if(h.containsValue("천송이")){
			System.out.println("천송이 있다.");
		}else{
			System.out.println("천송이 없다.");
		}
		
		//삭제
		h.remove("222-222");
		if(h.containsKey("222-222")){
			System.out.println("222삭제");
		}else{
			System.out.println("222없다.");
		}
		
		
		//전체출력
		Iterator<String> it = h.keySet().iterator();
		while(it.hasNext()){
			
			String key = it.next();//키를 반환
			String val = h.get(key);//value를 반환
			
			System.out.print(key +" ");
		}
		
		
	}

}
























