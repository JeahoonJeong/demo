package com.score8;

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
					ob.insert();
					break;
					
				case 2:
					ob.update();
					break;
					
				case 3:
					ob.delete();
					break;
					
				case 4:
					ob.selectAll();
					break;
					
				case 5:
					ob.searchHak();
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
