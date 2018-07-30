package com.score4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class ScoreImpl implements Score {

	private Map<String, ScoreVO> hMap = new HashMap<String,ScoreVO>();
	// �������� ����
	//private Map<String, ScoreVO> hMap = new TreeMap<String, ScoreVO>();

	Scanner sc = new Scanner(System.in);
	String hak;

	@Override
	public void input() {
		System.out.print("�й�?");
		hak = sc.next();

		if (searchHak(hak)) {
			System.out.println("�й��� �����մϴ�.!");
			return;
		}

		ScoreVO vo = new ScoreVO();

		System.out.print("�̸�?");
		vo.setName(sc.next());

		System.out.print("����?");
		vo.setKor(sc.nextInt());

		System.out.print("����?");
		vo.setEng(sc.nextInt());

		System.out.print("����?");
		vo.setMat(sc.nextInt());

		hMap.put(hak, vo);

		System.out.println("�߰�����.");

	}

	@Override
	public void print() {

		Iterator<String> it = hMap.keySet().iterator();
		ArrayList<String> al = new ArrayList<String>();
		
		while (it.hasNext()) {

			String key = it.next();
			ScoreVO vo = hMap.get(key);
			System.out.println(key + " " + vo.toString());
			al.add(key);
		}
		
		System.out.println("------------------------------------");
		
		Collections.sort(al);
		
		for(int i =0; i<al.size();i++){
			System.out.println(al.get(i)+hMap.get(al.get(i)));
		}

	}

	@Override
	// ����
	public void delete() {
		System.out.print("������ �й�?");
		String key = sc.next();
		if (!searchHak(key)) {
			System.out.println("�й��� �����ϴ�.");
			return;
		}
		hMap.remove(key);
		System.out.println("���� ����");

	}

	@Override
	// ���� �̸�����
	public void update() {

		System.out.print("������ �й�?");
		String key = sc.next();
		if (!searchHak(key)) {
			System.out.println("�й��� �����ϴ�.");
			return;
		}

		ScoreVO vo = new ScoreVO();

		vo = hMap.get(key);

		System.out.print("����?");
		vo.setKor(sc.nextInt());

		System.out.print("����?");
		vo.setEng(sc.nextInt());

		System.out.print("����?");
		vo.setMat(sc.nextInt());

		hMap.replace(key, vo);

		System.out.println("���� ����");

	}

	@Override
	public void findHak() {

		System.out.print("������ ����� �й�?");
		String key = sc.next();
		if (!searchHak(key)) {
			System.out.println("�й��� �����ϴ�.");
			return;
		}

		ScoreVO vo = new ScoreVO();

		vo = hMap.get(key);

		System.out.println(key + vo);
	}

	@Override
	public void findName() {

		System.out.print("������ ����� �̸�?");
		String name = sc.next();

		Iterator<String> it = hMap.keySet().iterator();
		ScoreVO vo = new ScoreVO();
		
		boolean flag = false;
		
		while (it.hasNext()) {

			String key = it.next();
			vo = hMap.get(key);

			if (vo.getName().equals(name)) {
				System.out.println(key + vo);
				flag =true;
			}
		}
		
		if(!flag)
			System.out.println("�̸��� �����ϴ�.");
			
	}

	@Override
	public boolean searchHak(String hak) {

		if (hMap.containsKey(hak)) {
			return true;
		}

		return false;

		// return hMap.containsKey(hak);
	}

}
