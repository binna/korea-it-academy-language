package com.lec.java.jdbc.index;

import com.lec.java.jdbc.vo.MemberVO;
import com.lec.java.jdbc.dao.MemberDAO;

public class Member {
	public static void main(String[] args) {
		MemberDAO dao = new MemberDAO();
		MemberVO vo = new MemberVO();
		
		// 회원가입 예제
		//vo.setMember_id("shine94");
		//vo.setMember_pw("1234");
		
		//if(dao.join(vo)) {
		//	System.out.println("회원가입 성공");
		//} else {
		//	System.out.println("회원가입 실패");
		//}
		
		// 로그인 예제
		// 1. 아이디와 비밀번호가 일치할때
		//if(dao.login("shine94", "1234")) {
		//	System.out.println("로그인 성공");
		//} else {
		//	System.out.println("로그인 실패");
		//}
		// 2. 아이디와 비밀번호가 일치하지 않을때
		//if(dao.login("shine", "12")) {
		//	System.out.println("로그인 성공");
		//} else {
		//	System.out.println("로그인 실패");
		//}
		
		// 아이디 중복검사
		// 1. 일치한 아이디가 있을때
		//if(dao.checkId("shine94")) {
		//	System.out.println("일치한 아이디가 있습니다.");
		//} else {
		//	System.out.println("일치한 아이디가 없습니다.");
		//}
		// 2. 일치한 아이디가 없을때
		if(dao.checkId("shine")) {
			System.out.println("일치한 아이디가 있습니다.");
		} else {
			System.out.println("일치한 아이디가 없습니다.");
		}
	} // end main()
} // end class