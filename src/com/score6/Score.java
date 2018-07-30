package com.score6;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import com.db.DBcon;

public class Score {
	
	String hak,name;
	int kor,eng,mat,tot,ave;
	Scanner sc = new Scanner(System.in);
	
	public int insertData(){
		
		int result = 0;
		
		Connection conn = DBcon.getConnection();
		Statement stmt = null;
		String sql;
		
		try {
			
			System.out.print("학번?");
			hak = sc.next();
			
			System.out.print("이름?");
			name = sc.next();
			
			System.out.print("국어?");
			kor = sc.nextInt();
			
			System.out.print("영어?");
			eng = sc.nextInt();
			
			System.out.print("수학?");
			mat = sc.nextInt();
			
			sql = "insert into score (hak,name,kor,eng,mat) ";
			sql +="values("+"'"+hak+"',";
			sql +="'"+name+"',";
			sql += kor +",";
			sql += eng +",";
			sql += mat +")";
			
			stmt = conn.createStatement();
			
			result = stmt.executeUpdate(sql);
			
			stmt.close();
			
			System.out.println("데이터 입력완료!");
			
			
		} catch (Exception e) {
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
			
			
			System.out.print("학번?");
			hak = sc.next();
			
			
			System.out.print("국어?");
			kor = sc.nextInt();
			
			System.out.print("영어?");
			eng = sc.nextInt();
			
			System.out.print("수학?");
			mat = sc.nextInt();
			
			sql = "update score set ";
			sql += "kor="+kor+",";
			sql += "eng="+eng+",";
			sql += "mat="+mat;
			sql += " where hak = '"+hak+"'";
			
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
			
			System.out.print("삭제할 학번?");
			hak = sc.next();
			
			sql = "delete from score where hak ='"+hak+"'";
			
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
		
		try {
			
			sql = "select hak,name,kor,eng,mat,";
			sql += "(kor+eng+mat) tot,";
			sql += "(kor+eng+mat)/3 ave ";
			sql += "from score order by hak";
			
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery(sql);
			
			while(rs.next()){
				
				hak = rs.getString(1);
				name = rs.getString("name");
				kor = rs.getInt(3);
				eng = rs.getInt("eng");
				mat = rs.getInt(5);
				tot = rs.getInt("tot");
				ave = rs.getInt("ave");
				
				str = String.format("%10s %10s %4d %4d %4d %4d %4d",hak,name,kor,eng,mat,tot,ave);
				
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
			
			System.out.print("이름?");
			name = sc.next();
			
			sql = "select hak,name,kor,eng,mat,";
			sql += "(kor+eng+mat) tot,";
			sql += "(kor+eng+mat)/3 ave ";
			sql += "from score where name like '%"+name+"%' order by hak";
			
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery(sql);
			
			while(rs.next()){
				
				hak = rs.getString(1);
				name = rs.getString("name");
				kor = rs.getInt(3);
				eng = rs.getInt("eng");
				mat = rs.getInt(5);
				tot = rs.getInt("tot");
				ave = rs.getInt("ave");
				
				str = String.format("%10s %10s %4d %4d %4d %4d %4d",hak,name,kor,eng,mat,tot,ave);
				
				System.out.println(str);
				
			}
			
			rs.close();
			stmt.close();
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}
	/*
	public void serchData(){
		
		Connection conn = DBcon.getConnection();
		Statement stmt = null;
		String sql;
		String str;
		ResultSet rs = null;
		
		try {
			
			System.out.print("이름?");
			name = sc.next();
			sql = "select hak,name,kor,eng,mat ";
			sql += "from score where name like ";//like...
			sql += "'%"+name+"%'";
			
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery(sql);
			
			
			str = String.format("%10s %10s %4d %4d %4d", hak,name,kor,eng,mat);
			
			System.out.println(str);
			
			rs.close();
			stmt.close();
			
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		
	}
	*/
	
}


































