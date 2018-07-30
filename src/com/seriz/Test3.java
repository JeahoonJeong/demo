package com.seriz;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

//Externalizable
//Serializable �� �������̽��� ���� �������̽�
//Serializable�� ���� ����� �ϵ� ���� �Ϻ��� ��� �����ϴ�.
//writeExternal(), readExternal()�޼ҵ带 ���� 

class DataTest implements Externalizable{

	String name;
	int age;
	
	public DataTest(){}
	
	public DataTest(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	@Override//������ ȣ��
	public void readExternal(ObjectInput in) throws IOException,
			ClassNotFoundException {
		
		name = (String)in.readObject();
		age = in.readInt();

		System.out.println("externalize.....");
	}

	@Override//����ȭ�Ҷ� ȣ��
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(name);
		out.writeInt(age);
		
		System.out.println("externalize.....");
	}

	@Override
	public String toString() {
		return name+": "+age;
	}
	
	
	
}

public class Test3 {

	public static void main(String[] args) {
		
		try {
			
			DataTest ob = new DataTest("�����1",25);
			DataTest ob1 = new DataTest("�����2",25);
			DataTest ob2 = new DataTest("�����3",25);
			DataTest ob3 = new DataTest("�����4",25);
			DataTest ob4 = new DataTest("�����5",25);
			
			FileOutputStream fos = new FileOutputStream("d:\\doc\\a3.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(ob);
			oos.writeObject(ob1);
			oos.writeObject(ob2);
			oos.writeObject(ob3);
			oos.writeObject(ob4);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		try {
			
			FileInputStream fis = new FileInputStream("d:\\doc\\a3.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			DataTest ob = null;
			while(true){
				ob = (DataTest)ois.readObject();
				if(ob==null){
					break;
				}
				System.out.println(ob);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			//System.out.println(e);
		}
		
	}

}

























