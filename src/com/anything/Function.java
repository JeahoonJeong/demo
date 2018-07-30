package com.anything;

import java.util.Scanner;

public class Function {
	int dataNum, intArrayNum;
	Scanner sc = new Scanner(System.in);
	Data[] dt;

	
	public void set() {
		System.out.print("set dataNum");
		dataNum = sc.nextInt();
		dt = new Data[dataNum];

		System.out.print("set intArrayNum");
		intArrayNum = sc.nextInt();

	}

	public void input() {

		for (int i = 0; i < dataNum; i++) {

			dt[i] = new Data();
			dt[i].intArrayData = new int[intArrayNum];

			for (int j = 0; j < intArrayNum; j++) {
				System.out.print("input " + (j + 1) + "th" + " intArrayData");
				dt[i].intArrayData[j] = sc.nextInt();
			}

			System.out.print("intput intData");
			dt[i].intData = sc.nextInt();
		}

	}

	private void priMethod() {

		for (int i = 0; i < dataNum; i++) {
			for (int j = 0; j < dt[i].intArrayData.length; j++) {
				dt[i].doubleData += dt[i].intArrayData[j];
			}
		}

		for (int i = 0; i < dataNum; i++) {
			for (int j = 1; j <= dt[i].intData; j++) {
				dt[i].sum += j;
			}
		}
	}

	public void print() {

		priMethod();

		for (int i = 0; i < dataNum; i++) {
			System.out.println();
			System.out.println("Data[" + (i + 1) + "]" + " intData :"
					+ dt[i].intData + " doubleData :" + dt[i].doubleData
					+ " sum: " + dt[i].sum);
			for (int j = 0; j < intArrayNum; j++) {
				System.out.println("intArrayData[" + (j + 1) + "]: "
						+ dt[i].intArrayData[j]);
			}
		}

	}
}
