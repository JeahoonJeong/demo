package com.day4;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num1,num2;
		char oper;
		
		System.out.print("ù��°�� �Է�");
		num1 = sc.nextInt();
		System.out.print("�ι�°�� �Է�");
		num2 = sc.nextInt();
		
		System.out.print("������ �Է�");
		oper = sc.next().charAt(0);
		
		switch(oper){
		case '+':
			System.out.printf("%d + %d = %d\n",num1,num2,num1+num2);
			break;
		case '-':
			System.out.printf("%d - %d = %d\n",num1,num2,num1-num2);
			break;
		case '*':
			System.out.printf("%d * %d = %d\n",num1,num2,num1*num2);
			break;
		case '/':
			System.out.printf("%d / %d = %d\n",num1,num2,num1/num2);
			break;
		default:
			System.out.println("������ �Է� ����");
			break;
		}
		
	}

}

/*
[�ڷ���]
boolean : true/false

byte	: -128~127
short	: -32768~32767
int		:4byte
long	:8byte

10���� : 10, 8����: 016, 16����:0x17

[�Ǽ�]
float : 4byte
double: 8byte
�������Ǽ�(float) : 3.14f
�������Ǽ�(double): 3.14

[����]
char : 2byte(UTF-16)

[������]
+-*,/,%++--

[������������]
<,<=,>,>=  ��� : true false

[�������]
==,!=

[��������]
&&(and) ||(or) !

[��Ʈ����]
&, |, ~, >>, <<, >>>

[���׿�����]
����? ���϶���: �����϶���

[���Կ�����]
=,+=,-=,*=

-------------------------------------------
int a = 10;
float b;
b=a; //�Ͻ�������ȯ
b=(float)a;//���������ȯ

a=b;
a=(int)b;//���������ȯ

------------------------------------------
[���]

if(����){
	�۾�1;
}

if(����){
	�۾�1;
}else{
	�۾�2;
}

if(����){
	�۾�1;
}else if{
	�۾�2;
}else{
	�۾�3;
}


while(����){
	�۾�;
}

do{
	�۾�;
}while(����)

while(true){
	�۾�;
}




*/
