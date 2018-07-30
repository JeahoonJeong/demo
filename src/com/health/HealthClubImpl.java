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

		System.out.print("이름?");
		name = sc.next();
		
		if(searchName(name)){
			System.out.println("이름이 존재합니다.");
			return;
		}
		
		System.out.print("나이?");
		vo.setAge(sc.nextInt());

		System.out.print("성별?");
		vo.setGender(sc.next());
		
		System.out.print("우편번호?");
		vo.setZip(sc.next());
		
		System.out.print("주소");
		vo.setAddr(sc.next());
		
		System.out.print("몸무게?");
		vo.setWeight(sc.nextInt());
		
		System.out.print("키?");
		vo.setHeight(sc.nextInt());

		hMap.put(name, vo);

		System.out.println("추가성공.");
		
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
		
		System.out.print("삭제할 회원?");
		String key = sc.next();
		if (!searchName(key)) {
			System.out.println("회원이 없습니다.");
			return;
		}
		hMap.remove(key);
		System.out.println("삭제 성공");
		
	}

	@Override
	public void update() {
		
		System.out.print("수정할 회원?");
		String key = sc.next();
		if (!searchName(key)) {
			System.out.println("회원이 없습니다.");
			return;
		}

		MemberVO vo = hMap.get(key);

		
		System.out.print("우편번호?");
		vo.setZip(sc.next());
		
		System.out.print("주소");
		vo.setAddr(sc.next());
		
		System.out.print("몸무게?");
		vo.setWeight(sc.nextInt());
		
		System.out.print("키?");
		vo.setHeight(sc.nextInt());

		hMap.replace(key, vo);

		System.out.println("수정성공.");
		
	}

	@Override
	public void findZip() {
		
		
		System.out.print("정보를 출력할 우편번호?");
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
			System.out.println("회원이 없습니다.");
		
		
	}

	@Override
	public void findName() {
		
		System.out.print("정보를 출력할 회원?");
		String key = sc.next();
		if (!searchName(key)) {
			System.out.println("회원이 없습니다.");
			return;
		}

		MemberVO vo = new MemberVO();

		vo = hMap.get(key);

		System.out.println(key + vo);
		
	}

}
























