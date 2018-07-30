package com.class7;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;




public class Test7 {

	private static final String[] city = {"����","�λ�","�뱸","��õ","����","����","���"};
	
	public static void main(String[] args) {
		
		Vector<String> v = new Vector<String>();
		
		String str;
		
		System.out.println("������ �ʱ�뷮: "+v.capacity());
		
		for(String c : city){
			v.add(c);
		}
		
		System.out.println("Iterator�� ����� ��ü���...");
		
		Iterator<String> it = v.iterator();
		
		while(it.hasNext()){
			String str1 = it.next();
			System.out.println(str1);
		}
		
		System.out.println("������(���) ����: "+ v.size());
		//������ ����
		v.set(0, "seoul");
		v.set(1, "Pusan");
		
		System.out.println("��ü���...");
		
		for(String s : v){
			System.out.print(s+" ");
		}
		System.out.println();
		
		//������ �����ֱ�
		System.out.println("iterator ���...");
		v.insertElementAt("���ѹα�", 0);
		
		Iterator<String> i = v.iterator();
		
		while(i.hasNext()){
			
			System.out.print(i.next()+" ");
		}
		System.out.println();
		
		//�˻�
		
		int index = v.indexOf("�뱸");
		
		if(index!=-1){
			System.out.println("�˻�����"+index);
		}else{
			System.out.println("�˻�����"+index);
		}
		
		System.out.println("�������� ����");
		
		//��������
		Collections.sort(v);
		
		for(String s : v){
			System.out.print(s+" ");
		}
		System.out.println();
		//��������
		System.out.println("�������� ����");
		
		Collections.sort(v, Collections.reverseOrder());
		
		for(String s : v){
			System.out.print(s+" ");
		}
		System.out.println();
		
		//����
		v.remove(0);//���
		v.remove("Pusan");
		
		for(String s : v){
			System.out.print(s+" ");
		}
		System.out.println();
		
		//�뷮 ����
		
		for(int i1=0; i1<20; i1++){
			
			v.add(Integer.toString(i1));
		}
		
		System.out.println("�뷮����");
		for(String s : v){
			System.out.print(s+" ");
		}
		System.out.println();
		
		System.out.println(v.capacity()+" "+v.size());
		
		//��������
		
		System.out.println("�������� 0-9");
		
		for(int i1 =0; i1<10; i1++){
			v.remove(6);
		}
		
		for(String s : v){
			System.out.print(s+" ");
		}
		System.out.println();
		
		System.out.println(v.capacity()+" "+v.size());
		
		//���������
		System.out.println("���������");
		
		v.trimToSize();
		
		System.out.println(v.capacity()+" "+v.size());
		
		//��ü����
		v.clear();
		for(String s : v){
			System.out.print(s+" ");
		}
		System.out.println();
		
		System.out.println(v.capacity()+" "+v.size());
		System.out.println("�������� X");
		
		v.trimToSize();
		System.out.println(v.capacity()+" "+v.size());
		System.out.println("�������� O");

		
		
	}

}

