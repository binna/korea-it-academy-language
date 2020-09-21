package com.lec.java.user;

import java.util.ArrayList;

public class Field {
	// 내부 DB
	ArrayList<User> users = new ArrayList<>();
	// vs 외부 DB : oracle DB, MariaDB, MySQL 등
	
	// 중복체크
	public User checkId(String id) {
		User user = null;
		for (int i = 0; i < users.size(); i++) {
			if(users.get(i).getId().equals(id)) {
				user = users.get(i);
			}
		}
		return user;
	}
	
	// 회원가입
	public void join(User user) {
		if(checkId(user.getId()) == null) {
			users.add(user);
		}
	}
	
	// 로그인
	
	// 암호화
	
	// 복호화

}