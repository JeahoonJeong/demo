package com.score8;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import oracle.jdbc.OracleTypes;

import com.db.DBcon;


/*
 
 suzi 계정에 procedure 권한을 주고 프로시저를 생성한다. 
 
create or replace procedure insertScore
(pHak in score.hak%type,
pName in score.name%type,
pKor in score.kor%type,
pEng in score.eng%type,
pMat in score.Mat%type)

is
begin
	insert into score(hak,name,kor,eng,mat)
	values (pHak,pName, pKor, pEng, pMat);
	commit;
end;


exec insertScore('222','ccc',50,40,30);


create or replace procedure updateScore
(pHak in score.hak%type,
pKor in score.kor%type,
pEng in score.eng%type,
pMat in score.Mat%type)

is
begin
	update score set kor=pKor, Eng=pEng, Mat=pMat
	where hak=pHak; 
	commit;
end;

exec updateScore(222,11,11,11);


create or replace procedure deleteScore
(pHak in score.hak%type)

is
begin
	delete from score where hak = pHak;
	commit;
end;

exec deleteScore(222);


create or replace procedure selectAllScore
(pResult Out sys_refcursor) --외부출력용 커서

is
begin
	open pResult for
	select hak,name,kor,eng,mat,(kor+eng+mat) tot, (kor+eng+mat)/3 ave, rank() over(order by (kor+eng+mat) desc) rank
	from score order by hak;
	commit;
end;

 */






public class ScoreDAO1 {//Data Access Object(sql)
	
	//1.입력
	public int insertData(ScoreDTO dto){
		
		int result = 0;
		Connection conn = DBcon.getConnection();
		CallableStatement cstmt = null;
		String sql;
		
		try {
			
			sql = "{call insertScore(?,?,?,?,?)}";
			
			
			cstmt = conn.prepareCall(sql);
			cstmt.setString(1, dto.getHak());
			cstmt.setString(2, dto.getName());
			cstmt.setInt(3, dto.getKor());
			cstmt.setInt(4, dto.getEng());
			cstmt.setInt(5, dto.getMat());
			
			result = cstmt.executeUpdate();
			
			cstmt.close();
			
		} catch (Exception e) {
			System.out.println();
		}
		
		return result;
		
	}
	
	
	//2.수정
	
		public int updateData(ScoreDTO dto){
			
			int result = 0;
			Connection conn = DBcon.getConnection();
			CallableStatement cstmt = null;
			String sql;
			
			try {
				
				sql = "{call updateScore(?,?,?,?)}";
				
				cstmt = conn.prepareCall(sql);
				
				cstmt.setString(1, dto.getHak());
				cstmt.setInt(2, dto.getKor());
				cstmt.setInt(3, dto.getEng());
				cstmt.setInt(4, dto.getMat());
				
				
				result = cstmt.executeUpdate();
				
				cstmt.close();
				
			} catch (Exception e) {
				System.out.println(e.toString());
			}
			
			return result;
			
		}
		
	//3. 삭제
		
		public int deleteData(String hak){
			
			int result = 0;
			Connection conn = DBcon.getConnection();
			String sql;
			CallableStatement cstmt = null;
			
			try {
				
				sql = "{call deleteScore(?)}";
				cstmt = conn.prepareCall(sql);
				cstmt.setString(1, hak);
				result = cstmt.executeUpdate();
				
				cstmt.close();
				
			} catch (Exception e) {
				System.out.println(e.toString());
			}
			
			return result;
		}
		
	//4.  전체선택
		/*
		
		public ResultSet searchData(){
			
			Connection conn = DBcon.getConnection();
			PreparedStatement cstmt = null;
			String sql;
			ResultSet rs = null;
			
			try {
				
				sql = "select hak,name,kor,eng,mat,(kor+eng+mat) tot,(kor+eng+mat)/3 ave "
						+ "from score order by hak";
				
				cstmt = conn.prepareStatement(sql);
				rs = cstmt.executeQuery();
				
				
			} catch (Exception e) {
				System.out.println(e.toString());
			}
			
			return rs;
			
		}
		*/
		
		public List<ScoreDTO> getLists(){
			
			List<ScoreDTO> lists = new ArrayList<ScoreDTO>();
			
			Connection conn = DBcon.getConnection();
			CallableStatement cstmt = null;
			ResultSet rs = null;
			String sql;
			
			try {
				
				sql = "{call selectAllScore(?)}";
				
				cstmt = conn.prepareCall(sql);
				
				//out 파라미터 자료형 설정
				
				cstmt.registerOutParameter(1, OracleTypes.CURSOR);
				//패키지 build path 에서 외부 라이브러리로 
				//C:\app\itwill\product\11.2.0\dbhome_1\jdbc\lib\ojdbc6.jar를 추가한다.
				
				//프로시저 실행
				cstmt.executeUpdate();
				
				//out파라미터의 값을 돌려받음 다운캐스팅
				rs = (ResultSet)cstmt.getObject(1);
												
				while(rs.next()){
					
					ScoreDTO dto = new ScoreDTO();
					
					dto.setHak(rs.getString("hak"));
					dto.setName(rs.getString("name"));
					dto.setKor(rs.getInt("kor"));
					dto.setEng(rs.getInt("eng"));
					dto.setMat(rs.getInt("mat"));
					dto.setTot(rs.getInt("tot"));
					dto.setAve(rs.getInt("ave"));
					dto.setRank(rs.getInt("rank"));
					
					lists.add(dto);
				}
				
				rs.close();
				cstmt.close();
				
				
			} catch (Exception e) {
				System.out.println(e.toString());
			}
			
			return lists;
			
		}
		
		//5.학번검색
		
		public ScoreDTO getList(String hak){
			
			ScoreDTO dto = null;
			
			Connection conn = DBcon.getConnection();
			CallableStatement cstmt = null;
			ResultSet rs = null;
			String sql;
			
			
			try {
				
				
				sql = "{call selectHakScore(?,?)}";
				
				cstmt = conn.prepareCall(sql);
				
				//out파라미터 자료형 설정
				cstmt.registerOutParameter(1, OracleTypes.CURSOR);
				//in 파라미터
				cstmt.setString(2, hak);
				//프로시저 실행
				cstmt.executeUpdate();
				//out 파라미터 받음 다운캐스팅
				rs = (ResultSet)cstmt.getObject(1);
				
				if(rs.next()){
					
					dto = new ScoreDTO();
					
					dto.setHak(rs.getString("hak"));
					dto.setName(rs.getString("name"));
					dto.setKor(rs.getInt("kor"));
					dto.setEng(rs.getInt("eng"));
					dto.setMat(rs.getInt("mat"));
					dto.setTot(rs.getInt("tot"));
					dto.setAve(rs.getInt("ave"));
					
				}
				
				rs.close();
				cstmt.close();
				
			} catch (Exception e) {
				System.out.println(e.toString());
			}
			
			return dto;
			
		}
		
		
	
}







































