package com.health;

import java.util.Scanner;

public class HealthClubMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		HealthClub ob = new HealthClubImpl();
		
		int ch;
		
		while(true){
			
			do{
				System.out.print("1.�Է� 2.��� 3.���� 4.���� 5.�ּҰ˻� "
						+ "6.�̸��˻� 7.����: ");
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
				 System.out.println("�����մϴ�.");
				 System.exit(0);
			}
			
		}

		
	}

}
