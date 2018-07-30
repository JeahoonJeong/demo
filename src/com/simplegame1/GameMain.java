package com.simplegame1;

import java.util.Scanner;

public class GameMain {

	public static void main(String[] args) {

		UserInterImpl ui = new UserInterImpl();
		System.out.print("시작위치 x,y");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();

		ui.setGame(10, 50);
		ui.newStar(x, y);
		ui.setIndex(0);

		String key = "";

		while (true) {
			
			ui.clear();
			ui.print();

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
			case "o":
				x=sc.nextInt();
				y=sc.nextInt();
				ui.newStar(x, y);
				break;
			case "c":
				int c = sc.nextInt();
				ui.setIndex(c);
				break;
			case "e":
				ui.exit();
				return;

			default:
				break;
			}
			
		}

	}
}
