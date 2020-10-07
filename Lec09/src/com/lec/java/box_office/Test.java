package com.lec.java.box_office;

import java.io.IOException;

import com.lec.java.dao.BoxOfficeDAO;
import com.lec.java.vo.BoxOfficeVO;

// View
public class Test {
	public static void main(String[] args) throws IOException {
		BoxOfficeVO vo = new BoxOfficeVO();
		BoxOfficeDAO dao = new BoxOfficeDAO();
		
		vo.setRating(7);
		vo.setFilm_name("샤인3");
		
		if(dao.insertOrAppend(vo)) {
			System.out.println("추가 성공");
		} else {
			System.out.println("추가 실패");
		}
	} // end main()
} // end class