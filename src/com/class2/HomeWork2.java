package com.class2;

import java.util.Scanner;

class Score{
	private int inwon;
	private String[] name;
	private String[] sco = {"����","����","����"};
	private int[][] score; 
	private String[][] rank;
	private int[] tot,avg;
	
	Scanner sc = new Scanner(System.in);
	
	public void set(){
		
		System.out.print("�ο��� :");
		inwon = sc.nextInt();
		name = new String[inwon];
		score = new int[inwon][3];
		rank = new String[inwon][3];
		tot = new int[inwon];
		avg = new int[inwon];
				
		for(int i =0;i<inwon;i++){
			System.out.print("�̸� :");
			name[i] = sc.next();
			
			for(int j =0; j<3; j++){
				System.out.print(sco[j]+"? :");
				score[i][j] = sc.nextInt();
			}
		}
	}
	
	private void rank(){
		for(int i=0;i<inwon;i++){
			for(int j =0;j<3;j++){
				
				if(score[i][j]>=90){
					rank[i][j]="��";
				}else if(score[i][j]>=80){
					rank[i][j]="��";
				}else if(score[i][j]>=70){
					rank[i][j]="��";
				}else if(score[i][j]>=60){
					rank[i][j]="��";
				}else{
					rank[i][j]="��";
				}
				
				tot[i]+=score[i][j];
				avg[i]=tot[i]/3;
			}
		}
	}
	
	
	
	public void print(){
		
		rank();
		
		for(int i =0;i<inwon;i++){
			System.out.printf("%s\t",name[i]);
			for(int j =0;j<3;j++){
				System.out.printf("%d(%s)\t",score[i][j],rank[i][j]);
			}
			System.out.println(tot[i]+" "+avg[i]);
		}
		
		
		
	}
	
	
	
	
}
public class HomeWork2 {

	public static void main(String[] args) {
		
		Score sc = new Score();
		sc.set();
		sc.print();
	}

}
