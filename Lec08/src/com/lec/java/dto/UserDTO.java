package com.lec.java.dto;

public class UserDTO {
	private static int seq;
	
	private int num;
	private String userid;
	private String userpw;
	private String name;
	private String gender;
	
	public UserDTO() {;}
	
	// 회원가입시 사용할 생성자
	public UserDTO(String userid, String userpw, String name, String gender) {
		this.num = ++seq;
		this.userid = userid;
		this.userpw = userpw;
		this.name = name;
		this.gender = gender;
	}

	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}

	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserpw() {
		return userpw;
	}
	public void setUserpw(String userpw) {
		this.userpw = userpw;
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
	
	// hashCode(), equals()를 재정의해줘야
	// 주소 비교가 아니라 num(회원번호)으로 비교를 한다.
	@Override
	public int hashCode() {
		return this.num;
	}
	@Override
	public boolean equals(Object obj) {
		UserDTO user = null;
		if(obj instanceof UserDTO) {
			user = (UserDTO)obj;
			if(this.num == user.num) {
				return true;
			}
		}
		return false;
	}
}