package com.students;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class StudentImpl implements Students{
	
	private ArrayList<StudentsVO> list =null;
	private String path = System.getProperty("user.dir");
	//private File f = new File(path);
	private File f = new File(path,"\\data\\score.txt");
	
	public StudentImpl(){
		
		try {
			
			
			if(!f.getParentFile().exists()){
				
				f.getParentFile().mkdirs();
				
			}
			
			if(f.exists()){
				
				FileInputStream fis = new FileInputStream(path+"\\data\\score.txt");
				ObjectInputStream ois = new ObjectInputStream(fis);
				list = (ArrayList<StudentsVO>)ois.readObject();
				
				fis.close();
				ois.close();
				
			}
			
			/*
			FileInputStream fis = new FileInputStream("d:\\doc\\hw.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			ArrayList<StudentsVO> temp = (ArrayList<StudentsVO>)ois.readObject();
			
			list = temp;
			
			
			Iterator<StudentsVO> it = temp.iterator();
			
			while(it.hasNext()){
				StudentsVO ob = it.next();
				list.add(ob);
			}
			
			
			fis.close();
			ois.close();
			*/
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
	
	
	@Override
	public void input() {
		
		
		StudentsVO ob = new StudentsVO();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름?");
		ob.setName(sc.next());
		
		System.out.print("생일?");
		ob.setBirth(sc.next());
		
		System.out.print("점수?");
		ob.setScore(sc.next());
		
		if(list == null)
			list = new ArrayList<StudentsVO>();

		list.add(ob);
		
	}

	@Override
	public void print() {
		
		
		Iterator<StudentsVO> it = list.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		/*
		for(int i =0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		System.out.println();
		*/
	}

	@Override
	public void exit() {
		
		try {
			
			if(list!=null){
				
				
				FileOutputStream fos = new FileOutputStream(path+"\\data\\score.txt");
				
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				
				oos.writeObject(list);
				
				fos.close();
				oos.close();
				
				System.out.println("파일 저장 성공");
				
			}
			
			
			/*
			FileOutputStream fos = new FileOutputStream("d:\\doc\\hw.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(list);
			
			fos.close();
			oos.close();
			*/
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		
	}

}


































