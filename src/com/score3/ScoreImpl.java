package com.score3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ScoreImpl implements Score{
	
	private List<ScoreVO> lists = new ArrayList<ScoreVO>();//���� ��ĳ�����Ѵ�.

	@Override
	public int input() {
		
		int result = 0;//���߿� db �̿��Ҷ� ��� 1���� 0����
		
		Scanner sc = new Scanner(System.in);
		ScoreVO vo = new ScoreVO();
		
		System.out.print("�й�?");
		vo.setHak(sc.next());
		
		System.out.print("�̸�");
		vo.setName(sc.next());
		
		System.out.print("����?");
		vo.setKor(sc.nextInt());
		
		System.out.print("����?");
		vo.setEng(sc.nextInt());
		
		System.out.print("����?");
		vo.setMat(sc.nextInt());
		
		lists.add(vo);
				
		return 0;
	}

	
	@Override
	public void print() {
		
		Iterator<ScoreVO> it = lists.iterator();
		
		System.out.printf("%3s  %2s   %s %s %s %2s%s\n"
				,"�й�","�̸�","����","����","����","����","���");
		System.out.println("--------------------------------------");
		
		
		while(it.hasNext()){
			
			ScoreVO vo = it.next();
			/*
			System.out.printf("%5s %6s %4d %4d %4d %4d %4.1f"
					,vo.getHak(),vo.getName(),vo.getKor(),vo.getEng(),vo.getMat()
					,(vo.getKor()+vo.getEng()+vo.getMat())
					,(vo.getKor()+vo.getEng()+vo.getMat())/3.0);
			*///�ڵ尡 ����������.
			
			System.out.println(vo.toString());
			
		}
		
		
	}


	@Override
	public void searchHak() {
		
		Iterator<ScoreVO> it = lists.iterator();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		while(it.hasNext()){
			
			ScoreVO vo = it.next();
			if(vo.getHak().equals(str)){
				System.out.println(vo.toString());
				break;
			}	
		}
	}


	@Override
	public void searchNmae() {
		
		Iterator<ScoreVO> it = lists.iterator();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		while(it.hasNext()){
			
			ScoreVO vo = it.next();
			if(vo.getName().equals(str)){
				System.out.println(vo.toString());
			}
			
			
		}
		
	}


	@Override
	public void descSortTot() {
		
		Comparator<ScoreVO> comp = new Comparator<ScoreVO>() {

			@Override
			public int compare(ScoreVO vo1, ScoreVO vo2) {
				return vo1.getTot()<vo2.getTot()? 1:-1;
			}
		};
		
		Collections.sort(lists, comp);
		
		print();
		
	}


	@Override
	public void ascSortHak() {
		
		Comparator<ScoreVO> comp = new Comparator<ScoreVO>() {

			@Override
			public int compare(ScoreVO vo1, ScoreVO vo2) {
				//return Integer.parseInt(vo1.getHak())>Integer.parseInt(vo2.getHak())? 1:-1;
				return vo1.getHak().compareTo(vo2.getHak());
			}
		};
		
		Collections.sort(lists, comp);
		
		print();
		
		
	}

}


























