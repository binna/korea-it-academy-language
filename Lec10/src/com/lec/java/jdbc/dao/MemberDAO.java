package com.lec.java.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.lec.java.jdbc.vo.MemberVO;

public class MemberDAO {
	Connection conn;		// 연결해준다.
	PreparedStatement pstm;	// 쿼리문 날린다.
	ResultSet rs;			// 결과 담는다.
	
	// 아이디 중복검사
	public boolean checkId(String id) {
		String query = "SELECT COUNT(*) FROM TBL_MEMBER WHERE MEMBER_ID = ?";
		boolean check = false;
		
		try {
			conn = DBConnector.getConnection();
			pstm = conn.prepareStatement(query);
			pstm.setString(1, id);
			rs = pstm.executeQuery();
			
			// 행
			rs.next();
			
			// 열
			if(rs.getInt(1) == 1) {
				check = true;
			}
		} catch (SQLException e) {
			System.out.println("아이디 중복검사 오류(checkId(String id))" + e);
		} finally {
			try {
				if(rs != null) {rs.close();}
				if(pstm != null) {pstm.close();}
				if(conn != null) {conn.close();}
			} catch (SQLException e) {
				// 외부저장소를 닫을때, 오류가 발생하면 무조건 강제종료 시켜야함!
				// 그렇기 때문에 RuntimeException 발생시켜줘야함!
				throw new RuntimeException(e.getMessage());
			}
		}
		return check;
	} // end checkId()
	
	// 로그인
	public boolean login(String id, String pw) {
		String query = "SELECT COUNT(*) FROM TBL_MEMBER WHERE "
				+ "MEMBER_ID = ? AND MEMBER_PW = ?";
		boolean check = false;
		
		try {
			conn = DBConnector.getConnection();
			pstm = conn.prepareStatement(query);
			pstm.setString(1, id);
			pstm.setString(2, pw);
			rs = pstm.executeQuery();
			rs.next();
			
			if(rs.getInt(1) == 1) {
				check = true;
			}
		} catch (SQLException e) {
			System.out.println("로그인 실패(아이디 및 패스워드를 확인해주세요!)" + e);
		} finally {
			try {
				if(rs != null) {rs.close();}
				if(pstm != null) {pstm.close();}
				if(conn != null) {conn.close();}
			} catch (SQLException e) {
				// 외부저장소를 닫을때, 오류가 발생하면 무조건 강제종료 시켜야함!
				// 그렇기 때문에 RuntimeException 발생시켜줘야함!
				throw new RuntimeException(e.getMessage());
			}
		}
		return check;
	} // end login()
	
	// 회원가입
	public boolean join(MemberVO member) {
		String query = "INSERT INTO TBL_MEMBER (MEMBER_ID, MEMBER_PW) VALUES(?, ?)";
		boolean check = false;
		
		try {
			conn = DBConnector.getConnection();
			pstm = conn.prepareStatement(query);

			pstm.setString(1, member.getMember_id());
			pstm.setString(2, member.getMember_pw());
			
			if(pstm.executeUpdate() == 1) {
				check = true;
			}
			/*
			 * 여기에 왜 ResultSet을 쓰지 않은 이유??
			 * 결과값이 없기 때문에!!
			 * */
		} catch (SQLException e) {
			System.out.println("회원가입 실패 : " + e.getMessage());
		} finally {
			try {
				if(rs != null) {rs.close();}
				if(pstm != null) {pstm.close();}
				if(conn != null ) {conn.close();}
			} catch (SQLException e) {
				// 외부저장소를 닫을때, 오류가 발생하면 무조건 강제종료 시켜야함!
				// 그렇기 때문에 RuntimeException 발생시켜줘야함!
				throw new RuntimeException(e.getMessage());
			}
		}
		return check;
	} // end join()
}