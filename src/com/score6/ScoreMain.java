package com.score6;

import java.util.Scanner;

import com.db.DBcon;

public class ScoreMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Score ob = new Score();
		int ch;
		
		while(true){
			
			do{
				System.out.println("1.�Է� 2.���� 3.���� 4.��ü��� 5.�̸��˻� 6.����:");
				ch = sc.nextInt();
				
				switch (ch) {
				case 1:
					ob.insertData();
					break;
					
				case 2:
					ob.updateData();
					break;
					
				case 3:
					
					if(ob.deleteData() != 0){
						System.out.println("���� ����!");
					}else{
						System.out.println("���� ����!");
					}
					break;
					
				case 4:
					ob.selectAll();
					break;
					
				case 5:
					
					ob.searchData();
					break;
					
				case 6:
					DBcon.close();
					System.exit(0);
					break;

				default:
					break;
				}
				
				
			}while(ch<1||ch>6);
		}
		

	}

}
