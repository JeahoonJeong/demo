package com.seriz;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MyDataMain {

	public static void main(String[] args) {
		
		
		try {
			
			//����ȭ
			FileOutputStream fos = new FileOutputStream("d:\\doc\\a2.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(new MyData("ȫ�浿0",90));
			oos.writeObject(new MyData("ȫ�浿1",90));
			oos.writeObject(new MyData("ȫ�浿2",90));
			oos.writeObject(new MyData("ȫ�浿3",90));
			oos.writeObject(new MyData("ȫ�浿4",90));
			oos.writeObject(new MyData("ȫ�浿5",90));
			oos.writeObject(new MyData("ȫ�浿6",90));
			oos.writeObject(new MyData("ȫ�浿7",90));
			oos.writeObject(new MyData("ȫ�浿8",90));
			oos.writeObject(new MyData("ȫ�浿9",90));
			
			fos.close();
			oos.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		try {
			
			//������ȭ
			FileInputStream fis = new FileInputStream("d:\\doc\\a2.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			/*
			for(int i =0; i<10;i++){
				
				MyData md = (MyData)ois.readObject();
				
				System.out.println(md);
			}
			*/
			
			MyData md = null;
			
			while(true){
				 
				md = (MyData)ois.readObject();
				
				if(md == null){
					break;
				}
				
				
				
				System.out.println(md);
				
			}
			
			
			ois.close();
			fis.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		
	}

}
