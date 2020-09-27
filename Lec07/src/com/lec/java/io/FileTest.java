package com.lec.java.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {
	// throws : 예외 던지기
	// 메소드 안에서 같은 예외가 여러 번 발생할 때 매번 예외 처리를 하기 번거롭다.
	// 따라서 메소드 중괄호 앞에 Throws Exception으로 막아준다.
	public static void main(String[] args) throws IOException {
		// 작성
		//BufferedWriter bw = new BufferedWriter(new FileWriter("test.txt"));
		//bw.write("안녕");
		//bw.close();
		//System.out.println("작성 종료");
		
		// 줄바꿈 : \n, newLine()
		//bw.write("행복\n");
		//bw.write("기쁨");
		//bw.newLine();
		//bw.write("슬픔\n");
		//bw.close();
		
		// 수정
		//BufferedReader br = new BufferedReader(new FileReader("test.txt"));
		
		//String line = null;
		
		//String temp = "";	// 임시저장소
		
		//while(true) {
		//	line = br.readLine();
		//	
		//	if(line == null) {break;}
		//	
		//	if(line.equals("기쁨")) {
		//		// 한줄을 가져올때 \n까지 가져오지 못하기 때문에 따로 추가해줘야한다.
		//		temp += "사랑" + "\n";
		//		continue;
		//	}
		//	
		//	// 한줄을 가져올때 \n까지 가져오지 못하기 때문에 따로 추가해줘야한다.
		//	temp += line + "\n";
		//}
		
		//BufferedWriter bw = new BufferedWriter(new FileWriter("test.txt"));
		//bw.write(temp);
		//bw.close();
		
		// 삭제
		//BufferedReader br = new BufferedReader(new FileReader("test.txt"));
		
		//String line = null;
		//String temp = "";
		
		//while(true) {
		//	line = br.readLine();
		//	if(line == null) {break;}
		//	if(line.equals("슬픔" )) {continue;}
		//	temp +=line + "\n";
		//}
		
		//BufferedWriter bw = new BufferedWriter(new FileWriter("test.txt"));
		//bw.write(temp);
		//bw.close();
		
		// 검색
		BufferedReader br = new BufferedReader(new FileReader("test.txt"));
		
		String line = null;
		boolean check = false;
		
		while(true) {
			line = br.readLine();
			if(line == null) {break;}
			//if(line.equals("사랑")) {
			if(line.equals("슬픔")) {
				System.out.println("검색 성공");
				check = true;
			}
		}
		if(!check) {
			System.out.println("검색 실패");
		}
	}
}