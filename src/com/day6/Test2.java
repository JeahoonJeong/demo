package com.day6;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		//�ֹι�ȣ �˻�
		//index : 01234567890123
		//jumin : 941231-2053128
		//check : 234567 892345
		//sum = (9*2)+(4*3)+...+(2*5)
		//sum = 11-sum%11
		//sum = sum%10
		//sum�� 8�̶�� ����
		/*
		
		String str = "seoul korea";
		
		System.out.println(str.substring(0, 3));
		System.out.println(str.substring(6, 8));
		System.out.println(str.substring(6));
		
		 */
		
		Scanner sc = new Scanner(System.in);
		
		String str;
		int[] check = {2,3,4,5,6,7,8,9,2,3,4,5};
		
		System.out.print("�ֹι�ȣ�� �Է��Ͻÿ�. xxxxxx-xxxxxxx");
		str = sc.next();
		
		if(str.length()!=14){
			System.out.println("�Է¿���");
			return;//main�޼ҵ带 ��������
		}
		
		int tot =0;
		for(int i = 0;i<12; i++){
			
			if(i>=6){
				tot += check[i]*
						Integer.parseInt(str.substring(i+1, i+2));
			}else{
				tot += check[i]*
						Integer.parseInt(str.substring(i, i+1));
			}
			
		}
		
		tot = 11-tot%11;
		tot = tot%10;
		
		if(tot==Integer.parseInt(str.substring(13))){
			System.out.println("����");
		}else{
			System.out.println("������");
		}
				
		
		
	}

}
