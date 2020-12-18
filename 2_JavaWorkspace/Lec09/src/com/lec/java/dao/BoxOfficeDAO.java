package com.lec.java.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.lec.java.vo.BoxOfficeVO;

// Controller
public class BoxOfficeDAO {
	// 추가, 이 메소드를 뷰단에서 사용할 것임!
	/**
	 * 랭킹을 전달하면 해당 랭킹에 삽입<br>
	 * 랭킹을 전달하지 않으면 마지막 줄에 추가
	 * @return boolean
	 */
	public boolean insertOrAppend(BoxOfficeVO vo) throws IOException {
		if(vo.getRating() == 0) {
			// 외부에서 전달받은 순위가 없다면 마지막 줄에 추가
			if(append(vo)) {
				// 추가 성공시
				return true;
			}
			// 추가 실패시
			return false;
			
		} else {
			// 외부에서 전달받은 순위가 있다면 해당 랭킹에 삽입
			BufferedReader br = DBConnector.getReader();
			String line = null;
			int last_rating = 0;
			
			while(true) {
				line = br.readLine();
				if(line == null) {break;}
				last_rating = Integer.parseInt(line.split("\t")[0]);
			}
			// 사용자가 삽입할 랭킹이 마지막 순위보다 크면 삽입 실패
			if(vo.getRating() > last_rating) {return false;}
			
			// 사용자가 삽입할 랭킹이 마지막 순위보다 작으면 삽입 시도
			if(insert(vo)) {
				// 삽입 성공
				return true;
			}
			// 삽입 실패
			return false;
		}
	} // end insertOrAppend()
	
	// append()와 insert()를 사용자가 직접 사용하면 안되기 때문에 private로 보호해줬다!
	// 추가(마지막 줄에)
	private boolean append(BoxOfficeVO vo) throws IOException {
		// 외부에서 전달한 값이 없다면 false를 리턴
		if(vo == null) {return false;}
		
		BufferedReader br = DBConnector.getReader();
		String line = null;
		// 마지막 랭킹을 담을 변수
		int last_ranking = 0;
		
		while(true) {
			line = br.readLine();
			if(line == null) {break;}
			
			// "문자열".split("구분점");
			// 동일한 구분점을 기준으로 각각의 문자열 값을 분리한다.
			// 구분점이 있다는 뜻은 최소 2개 이상의 값이 나온다는 것이므로, 리턴 타입은 배열이다.
			last_ranking = Integer.parseInt(line.split("\t")[0]);
		}
		br.close();
		
		// 해당 경로의 파일 모든 내용을 전부 가져온다(줄바꿈 포함)
		String contents = new String(Files.readAllBytes(Paths.get("src/box_office.txt")));
		
		// 파일의 가장 마지막 문자열 값
		String last_str = contents.substring(contents.length() - 1);
		
		BufferedWriter bw = DBConnector.getAppender();
		
		// 가장 마지막 문자열이 /n이 아니면 줄바꿈 후 데이터 추가
		if(!last_str.equals("\n")) {
			bw.newLine();
		}
		
		// 가장 마지막 문자열의 \n이라면 줄바꿈 없이 데이터 추가
		bw.write((last_ranking + 1) + "\t");		
		bw.write(vo.getFilm_name() + "\t");		
		bw.write(vo.getRelease_date() + "\t");		
		bw.write(vo.getGeust_cnt() + "\t");		
		bw.write(vo.getIncome() + "\t");
		bw.write(vo.getScreen_cnt() + "");
		
		// write는 무조건 문자열이어야 정상적으로 추가된다
		// 만약 문자열이 아니라면 깨진다.

		bw.close();
		return true;
	} // end append()
	
	// 삽입(중간에)
	private boolean insert(BoxOfficeVO vo) throws IOException {
		if(vo == null) {return false;}
		
		BufferedReader br = DBConnector.getReader();
		String contents = "";
		String line = null;
		boolean check = false;
		int inserted_rating = vo.getRating();
		
		while(true) {
			line = br.readLine();
			if(line == null) {break;}
			
			// 사용자가 삽입할 랭킹이 현재 행의 랭킹과 같다면
			if(Integer.parseInt(line.split("\t")[0]) == vo.getRating()) {
				// 기존의 데이터 전, 전달받은 데이터를 삽입
				contents += vo.getRating() + "\t"
							+ vo.getFilm_name() + "\t"
							+ vo.getRelease_date() + "\t"
							+ vo.getGeust_cnt() + "\t"
							+ vo.getIncome() + "\t"
							+ vo.getScreen_cnt() + "\n";
				
				// 삽입을 했는지 안했는지 판단하는 flag
				// 삽입 성공시 true로 변경
				check = true;
			}
			
			// 삽입 성공시
			if(check) {
				// 기존 랭킹에 있던 영화 순위부터 마지막 영화 순위까지 모두 +1 처리
				// line.substring(line.indexOf("\t")) : 순위를 제외한 정보
				contents += ++inserted_rating + line.substring(line.indexOf("\t")) + "\n";
				continue;
			}
			// 삽입 전 혹은 삽입 실패시 기존 데이터를 글대로 누적
			contents += line + "\n";
		}
		br.close();
		
		// 변경된 내용으로 덮어쓰기
		BufferedWriter bw = DBConnector.getWriter();
		bw.write(contents);
		bw.close();
		return true;
		
	} // end insert()
	
	// 수정
	// 삭제
	// 검색
	// 목록
}