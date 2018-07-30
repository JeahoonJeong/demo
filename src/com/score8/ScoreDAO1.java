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
 
 suzi ������ procedure ������ �ְ� ���ν����� �����Ѵ�. 
 
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
(pResult Out sys_refcursor) --�ܺ���¿� Ŀ��

is
begin
	open pResult for
	select hak,name,kor,eng,mat,(kor+eng+mat) tot, (kor+eng+mat)/3 ave, rank() over(order by (kor+eng+mat) desc) rank
	from score order by hak;
	commit;
end;

 */






public class ScoreDAO1 {//Data Access Object(sql)
	
	//1.�Է�
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
	
	
	//2.����
	
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
		
	//3. ����
		
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
		
	//4.  ��ü����
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
				
				//out �Ķ���� �ڷ��� ����
				
				cstmt.registerOutParameter(1, OracleTypes.CURSOR);
				//��Ű�� build path ���� �ܺ� ���̺귯���� 
				//C:\app\itwill\product\11.2.0\dbhome_1\jdbc\lib\ojdbc6.jar�� �߰��Ѵ�.
				
				//���ν��� ����
				cstmt.executeUpdate();
				
				//out�Ķ������ ���� �������� �ٿ�ĳ����
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
		
		//5.�й��˻�
		
		public ScoreDTO getList(String hak){
			
			ScoreDTO dto = null;
			
			Connection conn = DBcon.getConnection();
			CallableStatement cstmt = null;
			ResultSet rs = null;
			String sql;
			
			
			try {
				
				
				sql = "{call selectHakScore(?,?)}";
				
				cstmt = conn.prepareCall(sql);
				
				//out�Ķ���� �ڷ��� ����
				cstmt.registerOutParameter(1, OracleTypes.CURSOR);
				//in �Ķ����
				cstmt.setString(2, hak);
				//���ν��� ����
				cstmt.executeUpdate();
				//out �Ķ���� ���� �ٿ�ĳ����
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







































