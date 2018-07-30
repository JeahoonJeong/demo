package com.simplegame;

import java.util.Scanner;

public class GameMain {

	public static void main(String[] args) {
		
		UserInterfaceImpl ui = new UserInterfaceImpl();
		System.out.print("�����Ϸ��� �ƹ�Ű�� �Է�..");
		Scanner sc = new Scanner(System.in);
		String key="";
		
		
		ui.print();	
		ui.set(10,24);
		while(true){
			
			key = sc.next();
			
			switch (key) {
			
			case "w":
				ui.up();
				break;
				
			case "s":
				ui.down();
				break;
				
			case "a":
				ui.left();
				break;
				
			case "d":
				ui.right();
				break;
			case "e":
				ui.exit();
				return;

			default:
				break;
			}
			ui.clear();
			ui.print();	
		}
		
		
	}

}
