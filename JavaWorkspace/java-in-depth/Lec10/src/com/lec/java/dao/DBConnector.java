package com.lec.java.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// 외부 저장소와 연결할 수 있는 메소드를 선언해 놓는다.
public class DBConnector {
	// 왜 static으로 만들었을까?
	// 1. 쓰기 편하기 위해
	// 2. 객체간 공유가 필요하기 때문에
	
	// 덮어쓰기 위해 외부 저장소와 연결
	public static BufferedWriter getWriter() throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter("src/box_office.txt"));
		return bw;
	} // end getWriter()
	
	// 이어쓰기 위해 외부 저장소와 연결
	public static BufferedWriter getAppender() throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter("src/box_office.txt", true));
		return bw;
	} // end getAppender()
	
	// 읽어오기 위해 외부 저장소와 연결
	public static BufferedReader getReader() throws IOException {
		// BufferedReader를 사용할 때 조심해야한다.
		// 파일이 없으면 만들어서 읽어오는 것이 아니라 오류가 난다.
		// 그렇기 때문에 FileNotFoundException 예외 처리를 해줘야 한다!!
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("src/box_office.txt"));
		} catch (FileNotFoundException fnfe) {
			System.out.println("파일을 찾을 수 없습니다." + fnfe);
		}
		return br;
	} // end getReader()
} // end class