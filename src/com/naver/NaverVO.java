package com.naver;

public class NaverVO {
	private String id;
	private String pw1;
	private String pw2;
	private String name;
	private String gender;
	private String birth;
	private String email;
	private String tel;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw1() {
		return pw1;
	}
	public void setPw1(String pw1) {
		this.pw1 = pw1;
	}
	public String getPw2() {
		return pw2;
	}
	public void setPw2(String pw2) {
		this.pw2 = pw2;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	
	@Override
	public String toString() {
		
		
		return String.format("ID:%s PW%s NAME:%s GENDER:%s BIRTH%s "
				+ "EMAIL:%s TEL:%s",id,pw1,name,gender,birth,email,tel);
	}
	
	
	
	
}
