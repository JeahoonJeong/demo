package com.jdbc;

import java.sql.Connection;

import com.db.DBcon;

public class Test1 {

	public static void main(String[] args) {
		
		Connection conn = DBcon.getConnection();
		
		if(conn == null){
			
			System.out.println("�����ͺ��̽� ���� ����!");
			System.exit(0);
			
		}
		System.out.println("conn: "+conn);
		System.out.println("�����ͺ��̽� ���� ����");
		DBcon.close(); // �޼ҵ�� �ݾƾ��Ѵ�.
	}

}
