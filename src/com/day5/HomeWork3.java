package com.day5;

import java.util.Random;
import java.util.Scanner;

public class HomeWork3 {

	public static void main(String[] args) {
		Random com = new Random();
		int player, computer;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1: ����, 2:����, 3:�� ?");
		
		player = sc.nextInt();
		computer = com.nextInt(3)+1;
		
		String p,c;
		if(player==1){
			p = "����";
		}else if(player==2){
			p = "����";
		}else{
			p = "��";
		}
		
		if(computer==1){
			c = "����";
		}else if(computer==2){
			c = "����";
		}else{
			c = "��";
		}
		
		if(player == 1 && computer == 1){
			System.out.println("��ǻ�� :"+c+" ��� :"+p);
			System.out.println("�����ϴ�.");
		}
		
		if(player == 1 && computer == 2){
			System.out.println("��ǻ�� :"+c+" ��� :"+p);
			System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
		}
		
		if(player == 1 && computer == 3){
			System.out.println("��ǻ�� :"+c+" ��� :"+p);
			System.out.println("����� �̰���ϴ�.");
		}
		
		if(player == 2 && computer == 1){
			System.out.println("��ǻ�� :"+c+" ��� :"+p);
			System.out.println("����� �̰���ϴ�.");
		}
		
		if(player == 2 && computer == 2){
			System.out.println("��ǻ�� :"+c+" ��� :"+p);
			System.out.println("�����ϴ�.");
		}
		
		if(player == 2 && computer == 3){
			System.out.println("��ǻ�� :"+c+" ��� :"+p);
			System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
		}
		
		if(player == 3 && computer == 1){
			System.out.println("��ǻ�� :"+c+" ��� :"+p);
			System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
		}
		
		if(player == 3 && computer == 2){
			System.out.println("��ǻ�� :"+c+" ��� :"+p);
			System.out.println("����� �̰���ϴ�.");
		}
		
		if(player == 3 && computer == 3){
			System.out.println("��ǻ�� :"+c+" ��� :"+p);
			System.out.println("�����ϴ�.");
		}
		
	}

}
