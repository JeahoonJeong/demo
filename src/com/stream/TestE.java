package com.stream;

import java.io.File;
import java.io.FileFilter;

class FileList {
	
	File f = new File("d:\\");

	public void result() {
		
		try {
			File[] lists = f.listFiles(new FileFilter() {

				@Override
				public boolean accept(File pathname) {
					return pathname.isFile() || pathname.isDirectory();
				}

			});
			
			
			if(f.isDirectory()){
				
				//accept메소드에서 FileFilter인터페이스로
				//리턴할 대상을 지정
				System.out.println("\n폴더의 내용...");
				for(int i=0;i<lists.length;i++){
					System.out.print(lists[i].getName());
					System.out.println("\t"+lists[i].length());
				}
			}
			
			System.out.println("\n디렉토리 구조...");
			File[] root = File.listRoots();
			for(int i =0; i<root.length;i++){
				System.out.println(root[i].getPath());
			}
			
			

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}

public class TestE {

	public static void main(String[] args) {
		FileList fl = new FileList();
		fl.result();
	}

}
