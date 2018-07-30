package com.jdbc;


import java.sql.Connection;
import java.sql.Statement;

import com.db.DBcon;

public class Test2 {

	public static void main(String[] args) {
		
		Connection conn = DBcon.getConnection();
		
		if(conn == null){
			
			System.out.println("데이터베이스 연결 실패!");
			System.exit(0);
			
		}
		
		// db연결
		//1. DriverManager가 Connection을 생성
		//2. Connection이 Statement를 생성
		//3. statement가 query를 실행
		
		try {
			
			//sql 구문을 실행하는 인터페이스
			Statement stmt = conn.createStatement();
			String sql;
			// sql 작성시 띄어쓰기 주의!
			
			//sql = "insert into score (hak,name,kor,eng,mat) ";
			//sql += "values ('112','김수지',90,50,60)";
			
			//sql = "update score set kor = 99, eng = 99, mat = 99 ";
			//sql += "where hak = 111";
			
			sql = "delete score where hak = 111";
			
			
			int result = stmt.executeUpdate(sql);// insert,update,delete는 excuteUpdate를 사용한다.
			// 성공시 1 리턴, 실패시 0리턴
			// jdbc를 이용한 insert,update,delete는 자동으로 commit된다.
			
			if(result == 1){
				
				System.out.println("성공");
				
			}
			
			
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		DBcon.close();
	}

}
