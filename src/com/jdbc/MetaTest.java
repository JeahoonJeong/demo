package com.jdbc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import com.db.DBcon;

//�ش� �����Ϳ� ���� ������ �����ִ� ������
//DB���� �����Ϳ� ���� ������, ������ ũ�� ��
public class MetaTest {

	public static void main(String[] args) {
		
		Connection conn = DBcon.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		ResultSetMetaData rsmd = null;
		
		String sql;
		
		try {
			
			sql = "select hak, name, kor, eng, mat from score";
			
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			rsmd = rs.getMetaData();
			
			//�÷���
			int cols = rsmd.getColumnCount();
			
			for(int i=1; i<=cols; i++){
				
				System.out.println("�÷���: "+rsmd.getColumnName(i)
						+" �÷�Ÿ��: "+ rsmd.getColumnType(i)
						+" �÷�Ÿ�Ը�: "+rsmd.getColumnTypeName(i)
						+" �÷���: "+rsmd.getPrecision(i));
			}
			
			System.out.println();
			
			while(rs.next()){
				
				for(int i = 1; i<=cols; i++){
					
					System.out.print(rs.getString(i)+" ");					
				}
				
				System.out.println();
				
			}
			
			rs.close();
			stmt.close();
			DBcon.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString());
		}
		
	}

}
