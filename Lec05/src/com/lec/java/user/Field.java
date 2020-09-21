package com.lec.java.user;

import java.util.ArrayList;

public class Field {
	// 내부 DB
	ArrayList<User> users = new ArrayList<>();
	
	// 대칭키
	private final int KEY = 3;
	
	// 중복체크
	// 외부에서 전달받은 id와 저장소 users에 있는 각 회원별 아이디를
	// 반복해서 검사한다.
	public User checkId(String id) {
		User user = null;
		// 등록된 회원수만큼 반복한다.
		for (int i = 0; i < users.size(); i++) {
			// 각 회원별로 아이디를 가지고 온 후 전달 받은 id와 비교한다.
			if(users.get(i).getId().equals(id)) {
				// 만약 같은 아이디가 있다면 해당 객체를 user에 담아준다.
				user = users.get(i);
			}
		}
		// null 리턴시 중복 없음, null이 아닐 시 중복 있음.
		return user;
	}
	
	// 회원가입
	// 외부에서 회원가입시 작성한 정보들을 User 타입의 객체로 전달받는다.
	public void join(User user) {
		/*
		 * 여기서 아이디 중복 검사를 하게되면 사용자가 매우 불편해진다.
		 * 
		 * 왜냐하면...! 
		 * 정보 입력 후 아이디 중복 검사가 진행되고,
		 * 만약 아이디가 중복됬다면 다시 입력해야하는데 
		 * 이미 입력한 정보를 다시 입력해야 하는 것은 사용자 입장에서 매우 번거로운 일이다.
		 * 
		 * 이러한 번거로움을 해소하기 위해서는 main에서 아이디 입력할 때마다 아이디 중복 체크하고
		 * 중복이 없을때 join()을 통해 회원가입될 수 있도록 처리하면 된다.
		 */
		// 입력한 아이디가 중복이 없을 때 null
		//if(checkId(user.getId()) == null) {
		//	user.setPw(encrypt(user.getPw()));
		//	users.add(user);
		//}
		user.setPw(encrypt(user.getPw()));
		users.add(user);
	}
	
	// 로그인
	// 외부에서 사용자가 입력한 아이디와 비밀번호를 전달받는다.
	public boolean login(String id, String pw) {
		// 입력한 id가 저장소에 있는지 검사한다.
		User user = checkId(id);
		
		// user가 null이 아니라면 존재하는 아이디이다.
		if(user != null) {
			// 그 아이디를 갖고 잇는 회원과 비밀번호와 사용자가 입력한 비밀번호가 같으면 true
			if(decrypt(user.getPw()).equals(pw)) {
				return true;
			}
		}
		// 아이디 또는 비밀번호 오류시 false 리턴
		return false;
	}
	
	// 비밀번호는 대칭키 암호로 보안
	// 암호화
	public String encrypt(String pw) {
		String en_pw = "";
		
		for (int i = 0; i < pw.length(); i++) {
			en_pw += (char)(pw.charAt(i) * KEY);
		}
		return en_pw;
	}
	
	// 복호화
	public String decrypt(String en_pw) {
		String de_pw = "";
		
		for (int i = 0; i < en_pw.length(); i++) {
			de_pw += (char)(en_pw.charAt(i) / KEY);
		}
		return de_pw;
	}
}