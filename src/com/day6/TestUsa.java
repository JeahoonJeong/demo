package com.day6;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class TestUsa {

	public static void main(String[] args) throws IOException {
		TestCom tc = new TestCom();
		Scanner sc = new Scanner(System.in);

		System.out.print("가로?");
		int w = sc.nextInt();
		System.out.print("세로?");
		int h = sc.nextInt();

		tc.set(w, h);

		int area = tc.getArea();
		int length = tc.getLength();

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		bw.write(area+" "+length);
		
		bw.close();
	}

}
