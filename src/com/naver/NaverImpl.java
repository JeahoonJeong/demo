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
			
			System.out.print("���̵� �Է��ϼ���");
			vo.setId(sc.next());
			
			idCheck = na.checkId(vo.getId());
			
		}
		
		//���̵� 8-15 ������ ���� ȥ��  �ߺ����̵� �˻�
		
		
		while(!pwCheck){
			
			System.out.print("��й�ȣ�� �Է��ϼ���");
			vo.setPw1(sc.next());
			System.out.print("��й�ȣ�� �ѹ��� �Է��ϼ���");
			vo.setPw2(sc.next());
			
			pwCheck = na.checkPw(vo.getPw1(), vo.getPw2());
			
		}
		
		
		
		System.out.print("�̸��� �Է��ϼ���.");
		vo.setName(sc.next());
		
		System.out.print("������ �Է��ϼ���.");
		vo.setGender(sc.next());
		
		System.out.print("��������� �Է��ϼ���");
		vo.setBirth(sc.next());
		
		System.out.print("�̸����� �Է��ϼ���");
		vo.setEmail(sc.next());
		
		System.out.print("��ȭ��ȣ�� �Է��ϼ���");
		vo.setTel(sc.next());
		
		li.add(vo);
		
		System.out.println("ȸ�����Կ� �����Ͽ����ϴ�.");
		
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
		
		System.out.println("������ ���̵� �Է��ϼ���");
		String id = sc.next();
		if(!searchId(id)){
			System.out.println("���̵� �����ϴ�.");
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
		System.out.println("�����Ϸ�");
		
	}

	@Override
	public void update() {
		
		System.out.println("���̵��� �Է��ϼ���");
		String id = sc.next();
		
		if(!searchId(id)){
			System.out.println("���̵� �����ϴ�.");
			return;
		}
		
		System.out.println("������ �̸��� �Է��ϼ���");
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
		System.out.println("�����Ϸ�");
		
	}

	@Override
	public void findId() {
		
		System.out.println("ã�� ���̵� �Է��ϼ���");
		String id = sc.next();
		if(!searchId(id)){
			System.out.println("���̵� �����ϴ�.");
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






























