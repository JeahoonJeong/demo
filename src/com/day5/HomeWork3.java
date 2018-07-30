package com.day5;

import java.util.Random;
import java.util.Scanner;

public class HomeWork3 {

	public static void main(String[] args) {
		Random com = new Random();
		int player, computer;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1: 가위, 2:바위, 3:보 ?");
		
		player = sc.nextInt();
		computer = com.nextInt(3)+1;
		
		String p,c;
		if(player==1){
			p = "가위";
		}else if(player==2){
			p = "바위";
		}else{
			p = "보";
		}
		
		if(computer==1){
			c = "가위";
		}else if(computer==2){
			c = "바위";
		}else{
			c = "보";
		}
		
		if(player == 1 && computer == 1){
			System.out.println("컴퓨터 :"+c+" 사람 :"+p);
			System.out.println("비겼습니다.");
		}
		
		if(player == 1 && computer == 2){
			System.out.println("컴퓨터 :"+c+" 사람 :"+p);
			System.out.println("컴퓨터가 이겼습니다.");
		}
		
		if(player == 1 && computer == 3){
			System.out.println("컴퓨터 :"+c+" 사람 :"+p);
			System.out.println("당신이 이겼습니다.");
		}
		
		if(player == 2 && computer == 1){
			System.out.println("컴퓨터 :"+c+" 사람 :"+p);
			System.out.println("당신이 이겼습니다.");
		}
		
		if(player == 2 && computer == 2){
			System.out.println("컴퓨터 :"+c+" 사람 :"+p);
			System.out.println("비겼습니다.");
		}
		
		if(player == 2 && computer == 3){
			System.out.println("컴퓨터 :"+c+" 사람 :"+p);
			System.out.println("컴퓨터가 이겼습니다.");
		}
		
		if(player == 3 && computer == 1){
			System.out.println("컴퓨터 :"+c+" 사람 :"+p);
			System.out.println("컴퓨터가 이겼습니다.");
		}
		
		if(player == 3 && computer == 2){
			System.out.println("컴퓨터 :"+c+" 사람 :"+p);
			System.out.println("당신이 이겼습니다.");
		}
		
		if(player == 3 && computer == 3){
			System.out.println("컴퓨터 :"+c+" 사람 :"+p);
			System.out.println("비겼습니다.");
		}
		
	}

}
