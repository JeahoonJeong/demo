package com.jdbc;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.db.DBcon;


//��ũ�� ������ Ŀ��
//������ ��ġ�� ������ �������� �̵� ������ Ŀ��

public class Text3 {

	public static void main(String[] args) {
		
		Connection conn = DBcon.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		
		String sql;
		char ch;
		
		try {
			
			sql = "select hak, name from score";
			
			//stmt = conn.createStatement();//���������θ� �����ϴ�.
			//stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			
			//TYPE_SCROLL_SENSITIVE  : ������� �ٷ� �ݿ� 
			//TYPE_SCROLL_INSENSITIVE: ������� �ٷ� �ݿ� �ȵ�
			//CONCUR_READ_ONLY : �б�����
			//CONCUR_UPDATABLE : ��������
			
			//��������, ������, ������ ����, �ٷ� �������� �ݿ�
			
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
					ResultSet.CONCUR_UPDATABLE);
			
			rs = stmt.executeQuery(sql);
			
			while(true){
				
				do{
					
					System.out.print("1.ó�� 2.���� 3.���� 4.������ 5.����:");
					ch = (char)System.in.read();
					System.in.skip(2);
					
				}while(ch<'1' || ch>'5');
				
				switch (ch) {
				case '1':
					if(rs.first())
						System.out.println("ó��: "+rs.getString(1)+" :"+rs.getString(2));
					break;
				case '2':
					if(rs.previous())
						System.out.println("����: "+rs.getString(1)+" :"+rs.getString(2));
					break;
				case '3':
					if(rs.next())
						System.out.println("����: "+rs.getString(1)+" :"+rs.getString(2));
					break;
				case '4':
					if(rs.last())
						System.out.println("������: "+rs.getString(1)+" :"+rs.getString(2));
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
