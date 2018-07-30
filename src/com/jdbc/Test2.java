package com.jdbc;


import java.sql.Connection;
import java.sql.Statement;

import com.db.DBcon;

public class Test2 {

	public static void main(String[] args) {
		
		Connection conn = DBcon.getConnection();
		
		if(conn == null){
			
			System.out.println("�����ͺ��̽� ���� ����!");
			System.exit(0);
			
		}
		
		// db����
		//1. DriverManager�� Connection�� ����
		//2. Connection�� Statement�� ����
		//3. statement�� query�� ����
		
		try {
			
			//sql ������ �����ϴ� �������̽�
			Statement stmt = conn.createStatement();
			String sql;
			// sql �ۼ��� ���� ����!
			
			//sql = "insert into score (hak,name,kor,eng,mat) ";
			//sql += "values ('112','�����',90,50,60)";
			
			//sql = "update score set kor = 99, eng = 99, mat = 99 ";
			//sql += "where hak = 111";
			
			sql = "delete score where hak = 111";
			
			
			int result = stmt.executeUpdate(sql);// insert,update,delete�� excuteUpdate�� ����Ѵ�.
			// ������ 1 ����, ���н� 0����
			// jdbc�� �̿��� insert,update,delete�� �ڵ����� commit�ȴ�.
			
			if(result == 1){
				
				System.out.println("����");
				
			}
			
			
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		DBcon.close();
	}

}
