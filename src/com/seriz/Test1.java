package com.seriz;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Hashtable;

//��ü�� ����ȭ
//�޸𸮿� ������ Ŭ������ü�� ��������� ������¸�
//�״�� �����ؼ� ���Ͽ� �����ϰų� ��Ʈ��ũ�� ����
//�����Ҽ� �ִ� ���.
//������ ����Ʈ �����θ� �����͸� �ۼ��� �� �� �ִ�.

//������ ��ü��ü�� ������ ����� ���Ŀ� ���ֹ��� �ʰ�
//��ü�� ���Ͽ� ���� �����ν� ���Ӽ��� �����Ҽ� �ְ�
//��ü ��ü�� ��Ʈ��ũ�� ���� �ս��� ��ȯ�Ҽ� �ִ�.
//implements Serializable�� �����Ѵ�.(�� �޼ҵ�� ����.)


public class Test1 {	

	public static void main(String[] args) throws IOException {
		Hashtable<String, String> hMap = new Hashtable<String, String>();
		//serializable ������ �������̽�
		hMap.put("1", "��ȿ��");
		hMap.put("2", "������");
		hMap.put("3", "��ȿ��");//����ȭ
		
		FileOutputStream fos = new FileOutputStream("d:\\doc\\a1.txt");
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(hMap);
		oos.close();
		fos.close();//������ �ݴ�?
		
	}

}
