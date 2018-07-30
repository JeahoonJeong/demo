package com.class1;

import java.util.Scanner;

class Hap{
	int num,sum;//인스턴스변수 맴버변수 전역변수
	class Hap2{};
	public void input(){
		
		class Hap1{}
		Scanner sc = new Scanner(System.in);
		
		System.out.println("수를 입력하시오");
		
		num = sc.nextInt();
		
	}
	
	public int cnt(){
		
		for(int i=1;i<=num;i++){
			sum+=i;
		}
		return sum;
	}
	public void print(int sum){
		System.out.println(sum);
	}
}

public class Test3 {

	public static void main(String[] args) {
		
		Hap ob = new Hap();
		
		ob.input();
		
		int sum = ob.cnt();
		
		ob.print(sum);
		
		
	}

}
