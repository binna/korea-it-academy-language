package com.lec.java.dao;

import com.lec.java.dto.UserDTO;

// DAO(Data Access Object) - dao
// 데이터에 접근하기 위한 객체
// 데이터를 관리하는 여러 메소드들이 정의되어 있다.

// User에 관련된 메소드만 모아놓는 곳
public class UserDAO {
	UserDTO session = null;
	Connection conn = null;
	
	public UserDAO() {
		conn = new Connection();
	}
	
	// 회원가입
	boolean join(String userid, String userpw, String name, String gender) {
		boolean check = false;
		// 받아온 데이터들을 가지고 DTO 객체 생성(포장으로 생각하면 편함)
		UserDTO user = new UserDTO(userid, userpw, name, gender);
		// DB 가입된 그 DTO 데이터 추가하기
		check = conn.insert(user);
		// 추가 성공시 true 리턴
		return check;
	}
	
	// 로그인
	boolean login(String userid, String userpw) {
		UserDTO user = null;
		// 어떠한 UserDTO 객체가 반환이 되었다면,
		// 로그인 성공을 의미하고
		// null로 그대로 남아있다면 로그인 실패를 의미한다.
		user = conn.select(userid, userpw);
		
		if(user != null) {
			// 다른곳(회원정보 수정, 상품추가 등등)에서 
			// 쓰일 session 아이디를 로그인 성공한 그 유저로 설정해둔다.
			session = user;
			return true;
		}
		return false;
	}
	
	// 비밀번호 수정
	void modify(String newPw) {
		if(session != null) {
			session.setUserpw(newPw);
		}
	}
	
	// 로그아웃
	void logout() {
		session = null;
	}
}