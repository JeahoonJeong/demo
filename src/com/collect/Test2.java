package com.collect;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

//List(I) - ArrayList(c)
//Vector���� ������ ����(����ȭ�� �ȵ�)
//Vector�� ����ȭ�� ��

public class Test2 {

	public static void main(String[] args) {
		
		ArrayList<String> lists = new ArrayList<String>();
		lists.add("����");
		lists.add("�λ�");
		lists.add("�뱸");
		
		Iterator<String> it1 = lists.iterator();//move���
		
		while(it1.hasNext()){
			
			String str = it1.next();//move���
			System.out.print(str+" ");
			
		}
		System.out.println();
		
		ListIterator<String> it2 = lists.listIterator();//copy���
		
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
		lists1.add("��õ");
		
		int n = lists1.indexOf("�λ�");
		lists1.add(n+1, "����");
		
		for(String s : lists1){
			System.out.print(s+" ");
		}
		System.out.println();
		
		lists1.add("�ڹ����α׷���");
		lists1.add("�����ӿ�ũ");
		lists1.add("��Ʈ����");
		lists1.add("�ڹٶ�?");
		lists1.add("������");
		
		String str;
		
		Iterator<String> it3 = lists1.iterator();
		
		while(it3.hasNext()){
			
			str = it3.next();
			
			if(str.startsWith("�ڹ�")){
				System.out.print(str+" ");
			}
			
		}
		
	}

}





























