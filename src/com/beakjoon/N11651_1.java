package com.beakjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class N11651_1 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		Location[] lo = new Location[num];
		
		for(int i = 0; i<num;i++){
			lo[i].x = sc.nextInt();
			lo[i].y = sc.nextInt();
		}
		/*
		Arrays.sort(lo, new Comparator<Location>() {

			@Override
			public int compare(Location o1, Location o2) {
				if(o1.y>o2.y){
					return 0;
				}
			}
			
		});
		*/
	}

}

class Location{
	
	public int x,y;
	
	
}
