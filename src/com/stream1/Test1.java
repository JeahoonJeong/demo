package com.stream1;

import java.io.File;
import java.io.FileOutputStream;
//RandomAccessFile
//일반적인 파일은 순차적으로 data를 읽어온다.(카세트테입)
//RandomacessFile은 원하는 곳으로 이동해서 일기가 가능하다.(cd)
import java.io.IOException;
import java.io.RandomAccessFile;


public class Test1 {

	public static void main(String[] args) throws IOException {
		
		File f = File.createTempFile("imsi", ".tmp");
		f.deleteOnExit();
		
		FileOutputStream fos = new FileOutputStream(f);
		
		for(int i =1;i<=100;i++){
			fos.write(i);
		}
		fos.close();
		
		RandomAccessFile raf = new RandomAccessFile(f,"rw");
		
		raf.seek(30);
		System.out.println("seek(30): "+ raf.readByte());
		raf.seek(0);
		System.out.println("seek(0): "+ raf.readByte());
	}

}
