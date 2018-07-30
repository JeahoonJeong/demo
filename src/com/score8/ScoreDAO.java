package com.score8;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.db.DBcon;

public class ScoreDAO {//Data Access Object(sql)
	
	//1.입력
	//회사에서 사용하는 메소드명은 같은 이름으로 자주 사용된다.
	public int insertData(ScoreDTO dto){
		
		int result = 0;
		Connection conn = DBcon.getConnection();
		PreparedStatement pstmt = null;
		String sql;
		
		try {
			
			sql = "insert into score (hak,name,kor,eng,mat) ";
			sql +="values (?,?,?,?,?)";
			
			pstmt = conn.prepareStatement(sql);//미리 sql을 PrepareStatement 객체 생성시 준비한다.
			pstmt.setString(1, dto.getHak());
			pstmt.setString(2, dto.getName());
			pstmt.setInt(3, dto.getKor());
			pstmt.setInt(4, dto.getEng());
			pstmt.setInt(5, dto.getMat());
			
			result = pstmt.executeUpdate();
			
			pstmt.close();
			
		} catch (Exception e) {
			System.out.println();
		}
		
		return result;
		
	}
	
	
	//2.수정
	
		public int updateData(ScoreDTO dto){
			
			int result = 0;
			Connection conn = DBcon.getConnection();
			PreparedStatement pstmt = null;
			String sql;
			
			try {
				
				sql = "update score set kor=?, eng=?, mat=? ";
				sql += "where hak =?";
				
				pstmt = conn.prepareStatement(sql);
				
				pstmt.setInt(1, dto.getKor());
				pstmt.setInt(2, dto.getEng());
				pstmt.setInt(3, dto.getMat());
				pstmt.setString(4, dto.getHak());
				
				result = pstmt.executeUpdate();
				
				pstmt.close();
				
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
			PreparedStatement pstmt = null;
			
			try {
				
				sql = "delete from score where hak = ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, hak);
				result = pstmt.executeUpdate();
				
				pstmt.close();
				
			} catch (Exception e) {
				System.out.println(e.toString());
			}
			
			return result;
		}
		
	//4.  전체선택
		/*
		
		public ResultSet searchData(){
			
			Connection conn = DBcon.getConnection();
			PreparedStatement pstmt = null;
			String sql;
			ResultSet rs = null;
			
			try {
				
				sql = "select hak,name,kor,eng,mat,(kor+eng+mat) tot,(kor+eng+mat)/3 ave "
						+ "from score order by hak";
				
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				
				
			} catch (Exception e) {
				System.out.println(e.toString());
			}
			
			return rs;
			
		}
		*/
		
		public List<ScoreDTO> getLists(){
			
			List<ScoreDTO> lists = new ArrayList<ScoreDTO>();
			
			Connection conn = DBcon.getConnection();
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			String sql;
			
			try {
				
				sql = "select hak, name, kor, eng, mat, (kor+eng+mat) tot, (kor+eng+mat)/3 ave,";
				sql +="rank() over(order by(kor+eng+mat) desc) rank from score";
				
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				
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
				pstmt.close();
				
				
			} catch (Exception e) {
				System.out.println(e.toString());
			}
			
			return lists;
			
		}
		
		//5.학번검색
		
		public ScoreDTO getList(String hak){
			
			ScoreDTO dto = null;
			
			Connection conn = DBcon.getConnection();
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			String sql;
			
			
			try {
				
				
				sql = "select hak, name, kor, eng, mat, (kor+eng+mat) tot, (kor+eng+mat)/3 ave,";
				sql +="rank() over(order by(kor+eng+mat) desc) rank from score ";
				sql +="where hak = ?";
				
				pstmt = conn.prepareStatement(sql);
				
				pstmt.setString(1, hak);
				
				rs = pstmt.executeQuery();
				
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
				pstmt.close();
				
			} catch (Exception e) {
				System.out.println(e.toString());
			}
			
			return dto;
			
		}
		
		
	
}







































