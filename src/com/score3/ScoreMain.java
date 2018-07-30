package com.score3;

import java.util.Scanner;

public class ScoreMain {

	public static void main(String[] args) {
		
		/*
		 * ScoreVO vo = new ScoreVO();
		
		
		vo.setHak("111");
		vo.setName("배수지	");
		vo.setKor(90);
		
		System.out.println(vo.getHak()+" "+vo.getName()+" "+vo.getKor());
		*/
		Scanner sc = new Scanner(System.in);
		Score ob = new ScoreImpl();//보통 업캐스팅해서 객체 생성한다. interface
		
		int ch;
		
		while(true){
			
			do{
				System.out.print("1.입력 2.출력 3.학번검색 4.이름검색 5.총점내림차순정렬 "
						+ "6.학번오름차순정렬 7.종료: ");
				ch = sc.nextInt();
			}while(ch<1);
			
			
			switch (ch) {
			case 1:
				ob.input();//반환값이 필요없을 경우 받지 않아도 에러나지 않는다.
				break;
			case 2:
				ob.print();
				break;
			case 3:
				ob.searchHak();;
				break;
			case 4:
				ob.searchNmae();;
				break;
			case 5:
				ob.descSortTot();
				break;
			case 6:
				ob.ascSortHak();
				break;
			default:
				 System.out.println("종료합니다.");
				 System.exit(0);
			}
			
		}
	}

}
