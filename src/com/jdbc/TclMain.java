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
					
					System.out.print("1.입력 2.출력 3.종료:");
					ch = sc.nextInt();
					
				}while(ch<1 || 3 < ch);
				
				switch (ch) {
				
				case 1:
					conn.setAutoCommit(false);//외래키로 연결된 테이블인 test1,2,3 테이블에 한번에 넣으려 하기때문에.
					System.out.print("아이디(숫자)?");
					id = sc.nextInt();
					
					System.out.print("이름?");
					name = sc.next();
					
					System.out.print("생일(yyy-mm-dd)?");
					birth = sc.next();
					
					System.out.print("전화?");
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
					
					conn.commit();// 세개의 테이블에 한번에 넣고 커밋한다.
					
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
