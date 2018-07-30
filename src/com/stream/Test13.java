package com.stream;

import java.io.File;
import java.io.FileFilter;

//FileFilter �������̽�
//file Ŭ������  listFile �޼ҵ�� ���Ϲ��� �����
//������ �� �ִ� ���� �������̽��� ����� accept�� �����Ѵ�.


class MyFileList implements FileFilter{

	private File f;
	
	public MyFileList(String filePath) {//������ ����
		f = new File(filePath);
	}
	
	public void result(){
		
		try {
			
			if(!f.exists()){
				System.out.println("������ �������� �ʽ��ϴ�.");
				return;
			}
			System.out.println("������: "+f.getAbsolutePath());
			System.out.println("����ũ��: "+f.length());
			
			//�����ΰ��
			if(f.isDirectory()){
				
				//accept�޼ҵ忡�� FileFilter�������̽���
				//������ ����� ����
				File[] lists = f.listFiles(this);//this?
				System.out.println("\n������ ����...");
				for(int i=0;i<lists.length;i++){
					System.out.print(lists[i].getName());
					System.out.println("\t"+lists[i].length());
				}
			}
			
			System.out.println("\n���丮 ����...");
			File[] root = File.listRoots();
			for(int i =0; i<root.length;i++){
				System.out.println(root[i].getPath());
			}
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}
	
	@Override
	public boolean accept(File pathname) {
		return pathname.isFile() || pathname.isDirectory();
	}
	
	
	
}

public class Test13 {

	public static void main(String[] args) {
		MyFileList mf = new MyFileList("d:\\");
		mf.result();
	}

}