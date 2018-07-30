package com.naver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class NaverImpl implements Naver{
	
	List<NaverVO> li = new ArrayList<NaverVO>();
	Scanner sc = new Scanner(System.in);
	
	@Override
	public void signUp() {
		
		NaverVO vo = new NaverVO();
		NaverAuthen na = new NaverAuthen();
		boolean pwCheck = false;
		boolean idCheck = false;
		
		
		while(!idCheck){
			
			System.out.print("아이디를 입력하세요");
			vo.setId(sc.next());
			
			idCheck = na.checkId(vo.getId());
			
		}
		
		//아이디 8-15 영문자 숫자 혼용  중복아이디 검사
		
		
		while(!pwCheck){
			
			System.out.print("비밀번호를 입력하세요");
			vo.setPw1(sc.next());
			System.out.print("비밀번호를 한번더 입력하세요");
			vo.setPw2(sc.next());
			
			pwCheck = na.checkPw(vo.getPw1(), vo.getPw2());
			
		}
		
		
		
		System.out.print("이름을 입력하세요.");
		vo.setName(sc.next());
		
		System.out.print("성별을 입력하세요.");
		vo.setGender(sc.next());
		
		System.out.print("생년월일을 입력하세요");
		vo.setBirth(sc.next());
		
		System.out.print("이메일을 입력하세요");
		vo.setEmail(sc.next());
		
		System.out.print("전화번호를 입력하세요");
		vo.setTel(sc.next());
		
		li.add(vo);
		
		System.out.println("회원가입에 성공하였습니다.");
		
	}

	@Override
	public void print() {
		
		Iterator<NaverVO> it = li.iterator();
		
		while(it.hasNext()){
			NaverVO ob = it.next();
			System.out.println(ob);
		}
		
	}

	@Override
	public boolean searchId(String id) {
		
		Iterator<NaverVO> it = li.iterator();
		
		while(it.hasNext()){
			NaverVO vo = it.next();
			if(vo.getId().equals(id)){
				return true;
			}
		}
		
		return false;
	}

	@Override
	public void delete() {
		
		System.out.println("삭제할 아이디를 입력하세요");
		String id = sc.next();
		if(!searchId(id)){
			System.out.println("아이디가 없습니다.");
			return;
		}
		int i = 0;
		Iterator<NaverVO> it = li.iterator();
		while(it.hasNext()){
			NaverVO ob = it.next();
			if(ob.getId().equals(id)){
				break;
			}
			i++;
		}
		
		li.remove(i);
		System.out.println("삭제완료");
		
	}

	@Override
	public void update() {
		
		System.out.println("아이디을 입력하세요");
		String id = sc.next();
		
		if(!searchId(id)){
			System.out.println("아이디가 없습니다.");
			return;
		}
		
		System.out.println("수정할 이름을 입력하세요");
		String name = sc.next();
		
		Iterator<NaverVO> it = li.iterator();
		NaverVO ob = null;
		int i = 0;
		while(it.hasNext()){
			ob = it.next();
			if(ob.getId().equals(id)){
				ob.setName(name);
				break;
			}
			i++;
		}
		li.set(i, ob);
		System.out.println("수정완료");
		
	}

	@Override
	public void findId() {
		
		System.out.println("찾을 아이디를 입력하세요");
		String id = sc.next();
		if(!searchId(id)){
			System.out.println("아이디가 없습니다.");
			return;
		}
		
		Iterator<NaverVO> it = li.iterator();
		
		while(it.hasNext()){
			NaverVO ob = it.next();
			if(ob.getId().equals(id)){
				System.out.println(ob);
			}
		}
		
	}

}






























