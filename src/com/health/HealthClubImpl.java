package com.health;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;



public class HealthClubImpl implements HealthClub {
	
	private Map<String, MemberVO> hMap = new TreeMap<String, MemberVO>();

	Scanner sc = new Scanner(System.in);
	String name;
	
	@Override
	public void input() {

		MemberVO vo = new MemberVO();

		System.out.print("�̸�?");
		name = sc.next();
		
		if(searchName(name)){
			System.out.println("�̸��� �����մϴ�.");
			return;
		}
		
		System.out.print("����?");
		vo.setAge(sc.nextInt());

		System.out.print("����?");
		vo.setGender(sc.next());
		
		System.out.print("�����ȣ?");
		vo.setZip(sc.next());
		
		System.out.print("�ּ�");
		vo.setAddr(sc.next());
		
		System.out.print("������?");
		vo.setWeight(sc.nextInt());
		
		System.out.print("Ű?");
		vo.setHeight(sc.nextInt());

		hMap.put(name, vo);

		System.out.println("�߰�����.");
		
	}

	@Override
	public void print() {
		

		Iterator<String> it = hMap.keySet().iterator();

		while (it.hasNext()) {

			String key = it.next();
			MemberVO vo = hMap.get(key);
			System.out.println(key + " " + vo.toString());

		}
		
	}

	@Override
	public boolean searchName(String name) {
		
		if (hMap.containsKey(name)) {
			return true;
		}

		return false;
	}

	@Override
	public void delete() {
		
		System.out.print("������ ȸ��?");
		String key = sc.next();
		if (!searchName(key)) {
			System.out.println("ȸ���� �����ϴ�.");
			return;
		}
		hMap.remove(key);
		System.out.println("���� ����");
		
	}

	@Override
	public void update() {
		
		System.out.print("������ ȸ��?");
		String key = sc.next();
		if (!searchName(key)) {
			System.out.println("ȸ���� �����ϴ�.");
			return;
		}

		MemberVO vo = hMap.get(key);

		
		System.out.print("�����ȣ?");
		vo.setZip(sc.next());
		
		System.out.print("�ּ�");
		vo.setAddr(sc.next());
		
		System.out.print("������?");
		vo.setWeight(sc.nextInt());
		
		System.out.print("Ű?");
		vo.setHeight(sc.nextInt());

		hMap.replace(key, vo);

		System.out.println("��������.");
		
	}

	@Override
	public void findZip() {
		
		
		System.out.print("������ ����� �����ȣ?");
		String zip = sc.next();

		Iterator<String> it = hMap.keySet().iterator();
		MemberVO vo = new MemberVO();
		
		boolean flag = false;
		
		while (it.hasNext()) {

			String key = it.next();
			vo = hMap.get(key);

			if (vo.getZip().equals(zip)) {
				System.out.println(key + vo);
				flag =true;
			}
		}
		
		if(!flag)
			System.out.println("ȸ���� �����ϴ�.");
		
		
	}

	@Override
	public void findName() {
		
		System.out.print("������ ����� ȸ��?");
		String key = sc.next();
		if (!searchName(key)) {
			System.out.println("ȸ���� �����ϴ�.");
			return;
		}

		MemberVO vo = new MemberVO();

		vo = hMap.get(key);

		System.out.println(key + vo);
		
	}

}
























