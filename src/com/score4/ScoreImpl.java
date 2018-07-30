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
	// 오름차순 정렬
	//private Map<String, ScoreVO> hMap = new TreeMap<String, ScoreVO>();

	Scanner sc = new Scanner(System.in);
	String hak;

	@Override
	public void input() {
		System.out.print("학번?");
		hak = sc.next();

		if (searchHak(hak)) {
			System.out.println("학번이 존재합니다.!");
			return;
		}

		ScoreVO vo = new ScoreVO();

		System.out.print("이름?");
		vo.setName(sc.next());

		System.out.print("국어?");
		vo.setKor(sc.nextInt());

		System.out.print("영어?");
		vo.setEng(sc.nextInt());

		System.out.print("수학?");
		vo.setMat(sc.nextInt());

		hMap.put(hak, vo);

		System.out.println("추가성공.");

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
	// 삭제
	public void delete() {
		System.out.print("삭제할 학번?");
		String key = sc.next();
		if (!searchHak(key)) {
			System.out.println("학번이 없습니다.");
			return;
		}
		hMap.remove(key);
		System.out.println("삭제 성공");

	}

	@Override
	// 수정 이름제외
	public void update() {

		System.out.print("수정할 학번?");
		String key = sc.next();
		if (!searchHak(key)) {
			System.out.println("학번이 없습니다.");
			return;
		}

		ScoreVO vo = new ScoreVO();

		vo = hMap.get(key);

		System.out.print("국어?");
		vo.setKor(sc.nextInt());

		System.out.print("영어?");
		vo.setEng(sc.nextInt());

		System.out.print("수학?");
		vo.setMat(sc.nextInt());

		hMap.replace(key, vo);

		System.out.println("수정 성공");

	}

	@Override
	public void findHak() {

		System.out.print("정보를 출력할 학번?");
		String key = sc.next();
		if (!searchHak(key)) {
			System.out.println("학번이 없습니다.");
			return;
		}

		ScoreVO vo = new ScoreVO();

		vo = hMap.get(key);

		System.out.println(key + vo);
	}

	@Override
	public void findName() {

		System.out.print("정보를 출력할 이름?");
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
			System.out.println("이름이 없습니다.");
			
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
