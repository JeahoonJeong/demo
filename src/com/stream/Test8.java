package com.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class Test8 {
	
	public boolean fileCopy(String str1, String str2){
		
		File f = new File(str1);
		
		if(!f.exists()){//파일이 없는 경우
			return false;
		}
		
		try {
			
			FileInputStream fis = new FileInputStream(f);
			FileOutputStream fos = new FileOutputStream(str2);
			
			int data;
			byte[] buffer = new byte[1024];
			
			while((data = fis.read(buffer, 0, 1024))!=-1){
				
				fos.write(buffer, 0, data);
				
				
			}
			fos.close();
			fis.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return true;
		
	}
	
	public static void main(String[] args) {
		Test8 ob = new Test8();
		if(ob.fileCopy("d:\\doc\\test.txt", "d:\\doc\\out3.txt")){
			System.out.println("복사성공");
		}else{
			System.out.println("복사실패");
		}
		
		
	}

}
