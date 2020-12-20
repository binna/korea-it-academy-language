package com.lec.java.user;

import java.util.Scanner;

public class Form {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Field user_field = new Field();
		
		User user = null;
		
		int choice = 0;
		
		String id = null;
		String pw = null;
		
		while(true) {
			System.out.println("1.회원가입\n2.로그인\n3.종료");
			choice = sc.nextInt();
			
			if(choice == 3) {break;}
			
			switch(choice) {
			// 회원가입
			case 1:
				user = new User();
				
				// 사용자의 번거로움을 줄이기 위해 main에서 아이디 중복 검사를 한다.
				// 중복된 아이디가 없을때만 해당 반복문을 벗어 날 수 있다.
				while(true) {
					System.out.print("아이디 : ");
					id = sc.next();
					if(user_field.checkId(id) == null) {break;}
					else {System.out.println("중복된 아이디입니다.");}
				}
				user.setId(id);
				System.out.print("비밀번호 : ");
				user.setPw(sc.next());
				
				user_field.join(user);
				break;
			// 로그인
			case 2:
				System.out.print("아이디 : ");
				id = sc.next();
				System.out.print("비밀번호 : ");
				pw = sc.next();
				
				if(user_field.login(id, pw)) {System.out.println("로그인 성공!");}
				else {System.out.println("로그인 실패");}
				break;
			// 그 외
			default:
				System.out.println("다시");
			}
		}
	}
}