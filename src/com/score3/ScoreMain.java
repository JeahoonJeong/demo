package com.score3;

import java.util.Scanner;

public class ScoreMain {

	public static void main(String[] args) {
		
		/*
		 * ScoreVO vo = new ScoreVO();
		
		
		vo.setHak("111");
		vo.setName("�����	");
		vo.setKor(90);
		
		System.out.println(vo.getHak()+" "+vo.getName()+" "+vo.getKor());
		*/
		Scanner sc = new Scanner(System.in);
		Score ob = new ScoreImpl();//���� ��ĳ�����ؼ� ��ü �����Ѵ�. interface
		
		int ch;
		
		while(true){
			
			do{
				System.out.print("1.�Է� 2.��� 3.�й��˻� 4.�̸��˻� 5.���������������� "
						+ "6.�й������������� 7.����: ");
				ch = sc.nextInt();
			}while(ch<1);
			
			
			switch (ch) {
			case 1:
				ob.input();//��ȯ���� �ʿ���� ��� ���� �ʾƵ� �������� �ʴ´�.
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
				 System.out.println("�����մϴ�.");
				 System.exit(0);
			}
			
		}
	}

}
