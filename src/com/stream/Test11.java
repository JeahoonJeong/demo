package com.stream;

import java.io.File;
import java.io.IOException;
import java.util.Date;


//File Ŭ����
//���� �� ������ ������ �� �ֵ��� ����� ������ �ִ� Ŭ����
//������ ���� �Ǵ� �̸����� ���� ������ �� ��쿡 ���ɻ�
//������ ������ ����� �ϱ� ���� �޼ҵ�� �������� �ʴ´�.

public class Test11 {

	public static void main(String[] args) throws IOException {
		File f = new File("d:\\doc\\test.txt");
		
		System.out.println("���� ����.....");
		System.out.println("���ϸ�: "+f.getName());
		System.out.println("���� ����: "+f.length());
		System.out.println("���� ���: "+f.getAbsolutePath());
		System.out.println("ǥ�ذ��: "+f.getCanonicalPath());
		System.out.println("���糯: "+new Date(f.lastModified()));
		System.out.println("���ϻ����������: "+f.getParent());
		System.out.println("�б�Ӽ�: "+f.canRead());
		System.out.println("����Ӽ�: "+f.canWrite());
		
		//������
		String path = System.getProperty("user.dir");
		System.out.println("������: "+path);
		
	}

}
