package com.naver;

public class NaverAuthen {
	
	public boolean checkPw(String pw1, String pw2){
		boolean check = false;
		
		if(!(pw1.equals(pw2))){
			System.out.println("��й�ȣ�� ����ġ�մϴ�.");
		}else if(pw1.equals(pw2)){
			check = true;
		}
		
		return check;
	}
	
	
	public boolean checkId(String id){
		boolean check = false;
		boolean engCh = false;
		boolean numCh = false;
		
		if(id.length()<8||id.length()>15){
			System.out.println("8-15�ڷ� �Է��ϼ���.");
			return check;
		}
		
		for(int i =0; i<id.length();i++){
			char ch = id.charAt(i);
			
			if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z')){
				engCh =true;
			}
			if((ch>='0'&&ch<='9')){
				numCh = true;
			}
			
		}
		
		if(engCh && numCh){
			check = true;
		}else{
			System.out.println("������ ���ڸ� ȥ���ϼ���.");
		}
		
		return check;
	}

}
