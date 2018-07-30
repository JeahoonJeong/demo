package com.jdbc;

import java.sql.Statement;
import java.sql.Connection;
import java.util.Scanner;

import com.db.DBcon;



/*
create table test1
(id number primary key,
name varchar2(10) not null);

create table test2
(id number primary key,
birth date not null,
constraint fk_test2_id foreign key(id) references test1(id));

create table test3
(id number primary key,
tel varchar2(20) not null,
constraint fk_test3_id foreign key(id) references test1(id));
*/




public class TclMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Connection conn = DBcon.getConnection();
		Statement stmt = null;
		String sql;
		
		int ch, id;
		String name, birth, tel;
		
		
	
		
		try {
			
			while(true){
				
				do{
					
					System.out.print("1.�Է� 2.��� 3.����:");
					ch = sc.nextInt();
					
				}while(ch<1 || 3 < ch);
				
				switch (ch) {
				
				case 1:
					conn.setAutoCommit(false);//�ܷ�Ű�� ����� ���̺��� test1,2,3 ���̺� �ѹ��� ������ �ϱ⶧����.
					System.out.print("���̵�(����)?");
					id = sc.nextInt();
					
					System.out.print("�̸�?");
					name = sc.next();
					
					System.out.print("����(yyy-mm-dd)?");
					birth = sc.next();
					
					System.out.print("��ȭ?");
					tel = sc.next();
					//test1-------------------------------------------------------------------------
					sql = String.format("insert into test1(id,name) values(%d,'%s')", id,name);
					stmt = conn.createStatement();
					stmt.executeUpdate(sql);
					stmt.close();
					//test1-------------------------------------------------------------------------
					
					//test2-------------------------------------------------------------------------
					sql = String.format("insert into test2(id,birth) values(%d,'%s')", id,birth);
					stmt = conn.createStatement();
					stmt.executeUpdate(sql);
					stmt.close();
					//test2-------------------------------------------------------------------------
					
					
					//test3-------------------------------------------------------------------------
					sql = String.format("insert into test3(id,tel) values(%d,'%s')", id,tel);
					stmt = conn.createStatement();
					stmt.executeUpdate(sql);
					stmt.close();
					//test3-------------------------------------------------------------------------
					
					conn.commit();// ������ ���̺� �ѹ��� �ְ� Ŀ���Ѵ�.
					
					break;
				case 2:
					break;
				case 3:
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
