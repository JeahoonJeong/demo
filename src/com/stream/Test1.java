package com.stream;

import java.io.IOException;

//����½�Ʈ��
//������ ����½� ��� �����͸� ���¿� �������
//�Ϸõ� �帧���� �����ϴ� ��

//1.����Ʈ��Ʈ��


public class Test1 {

	public static void main(String[] args) throws IOException {
		
		int data;
		System.out.print("���ڿ� �Է�: ");//abcd
		while((data=System.in.read())!=-1){
			
			char ch = (char)data;
			System.out.println(ch);
		
		}
		
		
	}

}
