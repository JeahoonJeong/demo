package com.jdbc;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.db.DBcon;


//스크롤 가능한 커서
//임의의 위치나 임의의 방향으로 이동 가능한 커서

public class Text3 {

	public static void main(String[] args) {
		
		Connection conn = DBcon.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		
		String sql;
		char ch;
		
		try {
			
			sql = "select hak, name from score";
			
			//stmt = conn.createStatement();//순방향으로만 가능하다.
			//stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			
			//TYPE_SCROLL_SENSITIVE  : 수정결과 바로 반영 
			//TYPE_SCROLL_INSENSITIVE: 수정결과 바로 반영 안됨
			//CONCUR_READ_ONLY : 읽기전용
			//CONCUR_UPDATABLE : 수정가능
			
			//수정가능, 순방향, 역방향 가능, 바로 수정내용 반영
			
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
					ResultSet.CONCUR_UPDATABLE);
			
			rs = stmt.executeQuery(sql);
			
			while(true){
				
				do{
					
					System.out.print("1.처음 2.이전 3.다음 4.마지막 5.종료:");
					ch = (char)System.in.read();
					System.in.skip(2);
					
				}while(ch<'1' || ch>'5');
				
				switch (ch) {
				case '1':
					if(rs.first())
						System.out.println("처음: "+rs.getString(1)+" :"+rs.getString(2));
					break;
				case '2':
					if(rs.previous())
						System.out.println("이전: "+rs.getString(1)+" :"+rs.getString(2));
					break;
				case '3':
					if(rs.next())
						System.out.println("다음: "+rs.getString(1)+" :"+rs.getString(2));
					break;
				case '4':
					if(rs.last())
						System.out.println("마지막: "+rs.getString(1)+" :"+rs.getString(2));
					break;
				case '5':
					rs.close();
					stmt.close();
					DBcon.close();
					System.exit(0);
					break;

				default:
					break;
				}
				
				
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString());
		}
		
		
	}

}
