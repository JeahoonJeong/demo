package com.score7;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.Scanner;

import com.db.DBcon;

public class Signup {
	
	String id, pwd,name, tel, memo, birth;
	
	Scanner sc = new Scanner(System.in);
	
	
	public int insertData(){
		
		int result = 0;
		
		Connection conn = DBcon.getConnection();
		Statement stmt = null;
		String sql;
		
		try {
			
			System.out.print("id?");
			id = sc.next();
			
			System.out.print("pwd?");
			pwd = sc.next();
			
			System.out.print("name?");
			name = sc.next();
			
			System.out.print("birth?");
			birth = sc.next();
			
			System.out.print("tel?");
			tel = sc.next();
			
			System.out.print("memo?");
			memo = sc.next();
			
			sql = "insert into member (id,pwd,name,birth,tel,memo) ";
			sql +="values("+"'"+id+"',";
			sql +="'"+pwd+"',";
			sql +="'"+name+"',";
			sql +="to_date('"+birth+"','YYYY-MM-DD'),";
			sql +="'"+tel+"',";
			sql +="'"+memo+"')";
			
			//System.out.println(sql);
			//sql문 확인
			
			stmt = conn.createStatement();
			
			result = stmt.executeUpdate(sql);
			
			stmt.close();
			
			System.out.println("데이터 입력완료!");
			
			
		} catch(SQLIntegrityConstraintViolationException e1){
			
			System.out.println("중복된 아이디 입니다.");
			
		} 
		
		catch (Exception e) {
			System.out.println(e.toString());
		}
		
		return result;
	}
	
	
	
	
	public int updateData(){
		
		int result = 0;
		
		Connection conn = DBcon.getConnection();
		Statement stmt = null;
		String sql;
		
		try {
			
			
			System.out.print("id?");
			id = sc.next();
			
			System.out.print("tel?");
			tel = sc.next();
			
			System.out.print("memo?");
			memo = sc.next();
			
			sql = "update member set tel = ";
			sql +="'"+tel+"',";
			sql +="memo ='"+memo+"' where id = '"+id+"'";
			
			
			stmt = conn.createStatement();
			
			result =stmt.executeUpdate(sql);
			stmt.close();
			
			System.out.println("데이터 수정완료!");
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		return result;
	}
	
	
	public int deleteData(){
		
		int result = 0;
		
		Connection conn = DBcon.getConnection();
		Statement stmt = null;
		String sql;
		
		try {
			
			System.out.print("삭제할 id?");
			id = sc.next();
			
			sql = "delete from member where id ='"+id+"'";
			
			stmt = conn.createStatement();
			
			result =stmt.executeUpdate(sql);
			stmt.close();
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		return result;
		
	}
	
	
	
	public void selectAll(){
		
		Connection conn = DBcon.getConnection();
		Statement stmt = null;
		String sql;
		String str;
		
		ResultSet rs = null;
		//데이터베이스에 쿼리를 실행한 결과인 테이블에 대한 결과 데이터를 담고있다.
		
		try {
			
			sql = "select id,name,to_char(birth,'YYYY-MM-DD') birth,tel,memo ";
			sql += "from member order by id";
			
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery(sql);
			
			while(rs.next()){
				
				id = rs.getString("id");
				name = rs.getString("name");
				birth = rs.getString("birth");
				tel = rs.getString("tel");
				memo = rs.getString("memo");
				
				
				str = String.format("%-10s %-10s %10s %10s %10s",id, name, birth, tel, memo);
				
				System.out.println(str);
				
			}
			
			rs.close();
			stmt.close();
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}
	
	
	public void searchData(){
		
		Connection conn = DBcon.getConnection();
		Statement stmt = null;
		String sql;
		String str;
		
		ResultSet rs = null;
		
		try {
			
			System.out.println("이름?");
			name = sc.next();
			sql = "select id,name,to_char(birth,'YYYY-MM-DD') birth,tel,memo ";
			sql += "from member where name like"+"'%"+name+"%'"+"order by id";
			
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery(sql);
			
			while(rs.next()){
				
				id = rs.getString("id");
				name = rs.getString("name");
				birth = rs.getString("birth");
				tel = rs.getString("tel");
				memo = rs.getString("memo");
				
				str = String.format("%10s %10s %10s %10s %10s",id, name, birth, tel, memo);
				
				System.out.println(str);
				
			}
			
			rs.close();
			stmt.close();
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}
	
	
}
