package com.lec.java.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import com.lec.java.dto.ProductDTO;

// MVC모델1이기 때문에 View단이 Controller와 함께 존재한다.
public class Controller {
	public Controller() {
		// 아래의 보이는 화면 View단 코드이다.
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		System.out.println("UMS 프로그램입니다.");
		
		// User에 관한 흐름을 제거하기 위한 DAO
		UserDAO udao = new UserDAO();
		// Product에 관한 흐름을 제어하기 위한 DAO
		// 로그인 성공시에만 생성되기 때문에 초기값을 null로 설정해 놓는다.
		ProductDAO pdao = null;
		
		while(true) {
			System.out.println("1.회원가입\n2.로그인\n3.나가기");
			choice = sc.nextInt();
			
			if(choice == 3) {break;}
			
			else if(choice == 1) {
				// 회원가입
				System.out.println("회원가입 창입니다.");
				System.out.print("아이디 : ");
				String userid = sc.next();
				System.out.print("비밀번호 : ");
				String userpw = sc.next();
				System.out.print("이름 : ");
				String name = sc.next();
				System.out.print("성별 : ");
				String gender = sc.next();
				
				// DAO에 있는 join 메소드 사용
				if(udao.join(userid, userpw, name, gender)) {
					// return값이 true이면 수행
					System.out.println(userid + "님 회원가입 성공!");
				}
			} else if(choice == 2) {
				// 로그인
				System.out.println("로그인 창입니다.");
				System.out.print("아이디 : ");
				String userid = sc.next();
				System.out.print("비밀번호 : ");
				String userpw = sc.next();
				
				// DAO에 있는 login 메소드 사용
				if(udao.login(userid, userpw)) {
					System.out.println(userid + "님 로그인 성공!");
					while(true) {
						pdao = new ProductDAO(udao.session);
						ArrayList<ProductDTO> myList = pdao.getList();
						int pNum = 0;

						System.out.println("1.상품 추가\n2.상품 검색\n3.상품 수정\n4.상품삭제\n"
								+ "5.내 상품 보기\n6.내 정보 수정\n7.로그아웃");
						choice = sc.nextInt();
						
						if(choice == 7) {
							// 로그아웃
							udao.logout();
							break;
						}
						
						switch(choice) {
						case 1:
							// 상품추가
							System.out.println("상품 추가 창입니다.");
							System.out.print("상품명 : ");
							String name = sc.next();
							System.out.print("상품개수 : ");
							int count = sc.nextInt();
							System.out.print("상품가격 : ");		
							int price = sc.nextInt();
							
							if(pdao.add(name, count, userid, price)) {
								System.out.println("상품 추가 성공!");
							}
							break;
						case 2:
							// 상품검색
							String keyword = "";
							System.out.print("검색하실 키워드를 입력하세요 : ");
							keyword = sc.next();
							
							Set<ProductDTO> rs = pdao.search(keyword);
							Iterator<ProductDTO> iter = rs.iterator();
							while(iter.hasNext()) {
								System.out.println(iter.next());
							}
							break;
						case 3:
							// 상품수정(가격만 가능)
							for(ProductDTO product : myList) {
								System.out.println(product);
							}
							
							System.out.println("수정할 상품 번호를 입력하세요 : ");
							pNum = sc.nextInt();
							System.out.println("새로운 가격을 입력하세요 : ");
							price = sc.nextInt();
							
							pdao.modify(pNum, price);
							break;
						case 4:
							//상품삭제
							for(ProductDTO product : myList) {
								System.out.println(product);
							}
							
							System.out.println("삭제할 상품 번호를 입력하세요 : ");
							pNum = sc.nextInt();
							
							if(pdao.remove(pNum)) {
								System.out.println(pNum + "번 상품이 삭제되었습니다.");
							}
							break;
						case 5:
							// 내 상품 보기
							for(ProductDTO product : myList) {
								System.out.println(product);
							}
							break;
						case 6:
							// 내 정보 수정
							System.out.print("비밀번호 확인 : ");
							String pw = sc.next();
							if(udao.session.getUserpw().equals(pw)) {
								System.out.print("새로운 비밀번호를 입력하세요 : ");
								String newPw = sc.next();
								udao.modify(newPw);
							}else {
								System.out.println("비밀번호 확인 실패");
							} 
							break;
						}
					}
				} else {
					System.out.println("아이디나 비밀번호를 다시 확인해주세요.");
				}
			} else {
				System.out.println("잘못 입력했습니다.");
			}
		}
	} // end Controller()
} // end class