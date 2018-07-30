package com.collect;

import java.awt.List;
import java.util.Collections;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.Iterator;

//Collection
//Map<Ű,��>
//Hashtable: ����ȭ�� ����(Vector)
//HashMap: ����ȭ�� ��������(ArrayList)

//Ű�� �ߺ����ΰ��� ������ ����(Ű�� Set)
//Ű�� �ߺ����� ���̸� ���������� ����ȴ�(����)
//Map�� Iterator�� ����.
//put : �߰�
//get : ��������

public class Test3 {

	public static final String[] name =
		{"�����","õ����","������","����ȿ","�ڽ���"};
	public static final String[] tel =
		{"111-111","222-222","333-333","111-111","444-444"};
	
	
	public static void main(String[] args) {
		
		Hashtable<String,String> h = new Hashtable<String,String>();	
		
		
		for(int i =0; i<name.length;i++){
			
			h.put(tel[i], name[i]);
			
		}
		
		System.out.println(h);//��¼����� �ʾ��� �˰��� ���� ����.
		
		
		
		String str;
		
		str = h.get("111-111");//Ű�� �ָ� ���� ������
		
		if(str == null||str.equals("")){
			System.out.println("�ڷ����");
		}else{
			System.out.println(str);
		}
		
		//Ű���� �ִ��� �˻�
		if(h.containsKey("222-222")){
			System.out.println("222�ִ�.");
		}else{
			System.out.println("222����.");
		}
		
		//�����Ͱ� �����ϴ��� �˻�
		if(h.containsValue("õ����")){
			System.out.println("õ���� �ִ�.");
		}else{
			System.out.println("õ���� ����.");
		}
		
		//����
		h.remove("222-222");
		if(h.containsKey("222-222")){
			System.out.println("222����");
		}else{
			System.out.println("222����.");
		}
		
		
		//��ü���
		Iterator<String> it = h.keySet().iterator();
		while(it.hasNext()){
			
			String key = it.next();//Ű�� ��ȯ
			String val = h.get(key);//value�� ��ȯ
			
			System.out.print(key +" ");
		}
		
		
	}

}
























