package com.score8;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

//callableStatement(프로시저)

public class Score {
	
	Scanner sc = new Scanner(System.in);
	ScoreDAO1 dao = new ScoreDAO1();
	
	//1.추가
	public void insert(){
		
		ScoreDTO dto = new ScoreDTO();
		
		System.out.print("학번?");
		dto.setHak(sc.next());
		
		System.out.print("이름?");
		dto.setName(sc.next());
		
		System.out.print("국어?");
		dto.setKor(sc.nextInt());
		
		System.out.print("영어?");
		dto.setEng(sc.nextInt());
		
		System.out.print("수학?");
		dto.setMat(sc.nextInt());
		
		int result = dao.insertData(dto);
		
		if(result!=0){
			System.out.println("추가 성공!");
		}else{
			System.out.println("추가 실패!");
		}
		
	}
	
	public void update(){
		
		ScoreDTO dto = new ScoreDTO();
		
		System.out.print("수정할 학번?");
		dto.setHak(sc.next());
		
		System.out.print("국어?");
		dto.setKor(sc.nextInt());
		
		System.out.print("영어?");
		dto.setEng(sc.nextInt());
		
		System.out.print("수학?");
		dto.setMat(sc.nextInt());
		
		int result = dao.updateData(dto);
		
		if(result!=0){
			System.out.println("수정 성공!");
		}else{
			System.out.println("수정 실패!");
		}
		
	}
	
	public void delete(){
		
		String hak;
		System.out.print("삭제할 학번?");
		hak = sc.next();
		
		int result = dao.deleteData(hak);
		
		if(result!=0){
			System.out.println("삭제 성공!");
		}else{
			System.out.println("삭제 실패!");
		}
		
	}
	
	
	//4.전체선택
	public void selectAll(){
		
		List<ScoreDTO> list = dao.getLists();
		
		Iterator<ScoreDTO> it = list.iterator();
		
		while(it.hasNext()){
			
			ScoreDTO dto = it.next();
			
			System.out.println(dto.toString());
			
		}
		
	}
	
	/*
	public void search(){
		
		ResultSet rs = dao.searchData();
		
		ScoreDTO dto = new ScoreDTO();
		
		try {
			
			while(rs.next()){
				
				dto.setHak(rs.getString("hak"));
				dto.setName(rs.getString("name"));
				dto.setKor(rs.getInt("kor"));
				dto.setEng(rs.getInt("eng"));
				dto.setMat(rs.getInt("mat"));
				dto.setTot(rs.getInt("tot"));
				dto.setAve(rs.getInt("ave"));
					
				String str = String.format("%-10s %-10s %4d %4d %4d %4d %4d",
						dto.getHak(),dto.getName(),dto.getKor(),dto.getEng(),dto.getMat(),
						dto.getTot(),dto.getAve());
				
				System.out.println(str);
					
			}
			
			rs.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		if(rs!=null){
			System.out.println("출력 성공!");
		}else{
			System.out.println("출력 실패!");
		}
		
	}
	*/
	
	//5.학번검색
	
	public void searchHak(){
		
		System.out.print("학번?");
		String hak = sc.next();
		
		ScoreDTO dto = dao.getList(hak);
		
		if(dto != null)
			System.out.println(dto.toString());
		else
			System.out.println("검색 실패");
		
	}
	
	
}





























