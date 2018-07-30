package com.db;

import java.sql.Connection;
import java.sql.DriverManager;


/* 
-jdbc 연결

1.C:\app\itwill\product\11.2.0\dbhome_1\jdbc\lib 에 ojdbc6가 있다.

2.C:\Program Files\Java\jdk1.8.0_171\jre\lib\ext  와 C:\Program Files\Java\jre1.8.0_171\lib\ext 에  ojdbc6 복붙

 */
public class DBcon {
	
	private static Connection dbConn;
	
	public static Connection getConnection(){
		//여러개의 데이터베이스에 연결이 필요할경우 같은 형식의 메소드를 여러개 만들어 연결한다.
		
		if(dbConn == null){
			
			try {
				
				String url = "jdbc:oracle:thin:@192.168.16.25:1521:TestDB"; 
				// 오타주의
				// 네가지 방법중에 thin을 사용한다 
				// 오라클 기본포트: 1521  
				// 테스트시  루프백주소를 사용,  testdb 대신에 xe를 사용한다.
				String user = "suzi";
				String pwd = "a123";
				
				Class.forName("oracle.jdbc.driver.OracleDriver");
				//클래스가 메모리에 로드되지 않았다면 로드한다.
				
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
		
		// close했을 때 파이프라인에 쓰레기값이 남아있다면 다시 연결시 에러가 나기때문에 초기화한다.
		
		dbConn = null;
		
		
	}
}

































