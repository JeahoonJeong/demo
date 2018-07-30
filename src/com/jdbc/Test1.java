package com.jdbc;

import java.sql.Connection;

import com.db.DBcon;

public class Test1 {

	public static void main(String[] args) {
		
		Connection conn = DBcon.getConnection();
		
		if(conn == null){
			
			System.out.println("데이터베이스 연결 실패!");
			System.exit(0);
			
		}
		System.out.println("conn: "+conn);
		System.out.println("데이터베이스 연결 성공");
		DBcon.close(); // 메소드로 닫아야한다.
	}

}
