package com.stream1;

import java.io.File;
import java.io.FileOutputStream;
//RandomAccessFile
//�Ϲ����� ������ ���������� data�� �о�´�.(ī��Ʈ����)
//RandomacessFile�� ���ϴ� ������ �̵��ؼ� �ϱⰡ �����ϴ�.(cd)
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
