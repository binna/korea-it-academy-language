package com.lec.java.box_office;

import java.io.IOException;

import com.lec.java.dao.BoxOfficeDAO;
import com.lec.java.vo.BoxOfficeVO;

// View
public class Test {
	public static void main(String[] args) throws IOException {
		BoxOfficeDAO dao = new BoxOfficeDAO();
		
		// 수정 테스트
		//if(dao.update("극한직업", "극한강사" )) {
		//if(dao.update("샤인3", "샤인3수정성공" )) {
//		if(dao.update("없다!!", "수정실패나온다!" )) {
//			System.out.println("수정 성공");
//		} else {
//			System.out.println("수정 실패");
//		}
		
		// 삭제 테스트
//		if(dao.delete("극한강사" )) {
//			System.out.println("삭제성공");
//		} else {
//			System.out.println("삭제실패");
//		}
		
		// 검색 테스트
		//System.out.println(dao.select("1"));
		//System.out.println(dao.select("하트"));
		
		// 목록 테스트
		System.out.println(dao.selectAll());
	} // end main()
} // end class