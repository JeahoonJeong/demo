package com.score1;

import java.util.Scanner;

public class Score {
	
	Record[] rec;
	int inwon;
	Scanner sc = new Scanner(System.in);//메소드 생성시마다 생성????
	
	public void set(){
		
		do{
			System.out.println("인원수?");
			inwon = sc.nextInt();
		}while(inwon<=1||inwon>10);
		//배열의 객체를 생성
		rec = new Record[inwon];
	}
	
	public void input(){
		
		String[] title = {"국어","영어","수학"};
		
		for(int i=0;i<inwon;i++){
			rec[i] = new Record();//배열객체 생성과 다름??? 18row
			
			System.out.print((i+1)+"번째 이름?");
			rec[i].name = sc.next();
			
			for(int j =0; j<3;j++){
				System.out.print(title[j]+"?");
				rec[i].score[j]=sc.nextInt();
				
				rec[i].tot+=rec[i].score[j];
			}
			
			rec[i].avg = rec[i].tot/3;
		}
	}
	
	private void ranking(){
		
		int i,j;
		
		for(i=0;i<inwon;i++){
			rec[i].rank = 1;
		}
		
		for(i=0;i<inwon-1;i++){
			for(j=i+1;j<inwon;j++){
				if(rec[i].tot>rec[j].tot){
					rec[j].rank++;
				}else{
					rec[i].rank++;
				}
			}
		}
	}
	
	public void print(){
		
		ranking();
		
		for(int i=0;i<inwon;i++){
			System.out.printf("%6s",rec[i].name);
			
			for(int j =0; j<3;j++){
				System.out.print(" "+rec[i].score[j]);				
			}
			
			System.out.printf("%4d",rec[i].tot);
			System.out.printf("%4d",rec[i].avg);
			System.out.printf("%4d",rec[i].rank);
			
			System.out.println();
			
		}
		
		
	}
	
}
