package com.health;

import java.util.Scanner;

public class HealthClubMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		HealthClub ob = new HealthClubImpl();
		
		int ch;
		
		while(true){
			
			do{
				System.out.print("1.입력 2.출력 3.삭제 4.수정 5.주소검색 "
						+ "6.이름검색 7.종료: ");
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
				ob.delete();
				break;
			case 4:
				ob.update();
				break;
			case 5:
				ob.findZip();
				break;
			case 6:
				ob.findName();
				break;
			default:
				 System.out.println("종료합니다.");
				 System.exit(0);
			}
			
		}

		
	}

}
