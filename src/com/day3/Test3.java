package com.day3;

import java.util.*;
import java.io.*;

class Test3{

	public static void main(String[] args) throws IOException{

		Scanner sc = new Scanner(System.in);
		String check;
		char ch;
		int su,sum=0;
		boolean exit = true;//boolean형 변수 exit

		while(true){//무한루프
			sum=0;
			do{
				System.out.printf("수입력?");
				su = sc.nextInt();
			}while(su<1||su>5000);

			for(int i=1; i<=su;i++){
				sum +=i;
			}

			System.out.printf("1~%d 까지의 합: %d\n",su,sum);

			
			do
			{	
				System.out.print("계속진행하시겠습니까?(y/n)");
				
				check = sc.next();
				ch = check.charAt(0);//String으로 받은 문자열중에 인덱스 0인 문자를 char형 변수인 ch에 넣는다.

				if(ch=='y' || ch =='Y'){
					exit = false;// exit가 false라면 while문의 조건이 거짓이기때문에 while문을 벗어난다.
				}else if(ch=='n' || ch =='N'){
					System.exit(1);//강제종료하는 명령어
				}else{
					System.out.printf("다시입력하시오.\n");
					exit =true;// exit가 true라면 while문의 조건이 참이기때문에 다시 while문의 첫번째 열로 돌아간다.
				}

			}
			while (exit);


		}//end..while
	}//end..main
}
