package com.db;

import java.sql.Connection;
import java.sql.DriverManager;


/* 
-jdbc ����

1.C:\app\itwill\product\11.2.0\dbhome_1\jdbc\lib �� ojdbc6�� �ִ�.

2.C:\Program Files\Java\jdk1.8.0_171\jre\lib\ext  �� C:\Program Files\Java\jre1.8.0_171\lib\ext ��  ojdbc6 ����

 */
public class DBcon {
	
	private static Connection dbConn;
	
	public static Connection getConnection(){
		//�������� �����ͺ��̽��� ������ �ʿ��Ұ�� ���� ������ �޼ҵ带 ������ ����� �����Ѵ�.
		
		if(dbConn == null){
			
			try {
				
				String url = "jdbc:oracle:thin:@192.168.16.25:1521:TestDB"; 
				// ��Ÿ����
				// �װ��� ����߿� thin�� ����Ѵ� 
				// ����Ŭ �⺻��Ʈ: 1521  
				// �׽�Ʈ��  �������ּҸ� ���,  testdb ��ſ� xe�� ����Ѵ�.
				String user = "suzi";
				String pwd = "a123";
				
				Class.forName("oracle.jdbc.driver.OracleDriver");
				//Ŭ������ �޸𸮿� �ε���� �ʾҴٸ� �ε��Ѵ�.
				
				dbConn = DriverManager.getConnection(url, user, pwd);
				
				
			} catch (Exception e) {
				System.out.println(e.toString());
			}
			
		}
		
		return dbConn;
		
	}
	
	public static void close(){
		
		if(dbConn != null){
			
			try {
				 if(!dbConn.isClosed()){
					 
					 dbConn.close();
				
				 }
			} catch (Exception e) {
				System.out.println(e.toString());
			}
			
		}
		
		// close���� �� ���������ο� �����Ⱚ�� �����ִٸ� �ٽ� ����� ������ ���⶧���� �ʱ�ȭ�Ѵ�.
		
		dbConn = null;
		
		
	}
}

































