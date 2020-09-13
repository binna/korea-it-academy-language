package com.lec.java.bank.teacher;

import java.util.Random;
import java.util.Scanner;

public class ATM {
	// 소스코드 간결화
	public void useAtm() {
		// 은행별 최대 100명의 고객 수용 가능
		Kookmin[] arKookmin = new Kookmin[100];
		Shinhan[] arShinhan = new Shinhan[100];
		Woori[] arWoori = new Woori[100];
		
		// 각 은행별 고객의 정보를 담을 수 있게 100개의 필드씩 메모리에 할당
		for(int i = 0; i < arKookmin.length; i++) {
			arKookmin[i] = new Kookmin();
			arShinhan[i] = new Shinhan();
			arWoori[i] = new Woori();
		}
		
		// 각 은행 배열을 담을 2차원 배열
		Bank[][] arrBank = {arKookmin, arShinhan, arWoori};
		
		String msg = "은행을 고르세요.\n1.국민은행\n2.신한은행\n3.우리은행\n4.나가기";
		String optionMsg = "1.계좌개설\n2.입금하기\n3.출금하기\n4.잔액조회\n5.돌아가기";
		String errMsg = "다시 시도해주세요.";
		
		String name = null;
		String account = null;
		String pw = null;
		String phone = null;
		
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		int choice = 0;
		int optionChoice = 0;
		
		// 은행별 회원 수
		int[] arUserCnt = {Kookmin.cnt, Shinhan.cnt, Woori.cnt};
		
		// 계좌번호 중복검사에 사용될 flag
		boolean check = false;
		
		while(true) {
			System.out.println(msg);
			// 은행번호(1부터 시작)
			choice = sc.nextInt();
			
			// 나가기
			if(choice == 4) {break;}
			
			while(true) {
				System.out.println(optionMsg);
				optionChoice = sc.nextInt();
				
				// 돌아가기
				if(optionChoice == 5) {break;}
				
				switch (optionChoice) {
				// 계좌 개설(예금주, 계좌번호, 비밀번호, 휴대폰번호)
				case 1:
					System.out.print("예금주 : ");
					name = sc.next();
					
					// 계좌번호는 6자리 중복없는 정수
					// 100000 ~ 999999
					// 0 ~ 899999 + 100000
					do {
						// 중복 여부 확인 flag
						check = false;
						account = (r.nextInt(900000) + 100000) + "";
						// 중복검사
						for(int i = 0; i < arrBank.length; i++) {
							// arUserCnt[i] : 해당 은행의 회원 수
							for(int j = 0; j < arUserCnt[i]; j++) {
								if(arrBank[i][j].account.equals(account)) {
									// 중복시 check는 true
									check = true;
								}
							}
						}
					// 중복되지 않을 때까지 무한반복
					} while(check);
					
					do {
						System.out.print("설정할 비밀번호 4자리 : ");
						pw = sc.next();
					} while(pw.length() != 4);	// 비밀번호가 4자리이면 탈출
					
					while(true) {
						System.out.print("휴대폰 번호(-제외) : ");
						phone = sc.next();
						try {
							// 휴대폰 번호를 정수로 형변환시 오류가 발생하지 않는다면 정상 입력
							Integer.parseInt(phone);
							// 정상입력시 break 발동
							break;
						} catch (NumberFormatException e) {
							// 정상 입력이 아닐시 예외가 발생하여 들어옴
							System.out.println("숫자만 입력할 수 있습니다.");
						}
					}
					
					// 신규 고객 필드의 주소를 temp에 담아둔다.
					// [행] choice - 1 : 사용자가 선택한 은행
					// [열] arUserCnt[choice - 1] : 사용자가 선택한 은행의 회원 수(6일때 6번째 인덱스가 신규 회원 자리)
					Bank temp = arrBank[choice - 1][arUserCnt[choice - 1]];

					temp.name = name;
					temp.account = account;
					temp.pw = pw;
					temp.phone = phone;

					System.out.println("★축하합니다☆");
					System.out.println(name + "님의 계좌번호 : " + account);
					System.out.println("이제부터 정상 이용 가능합니다^^");
					
					// 개설 완료시 해당 은행 회원 수 1증가
					arUserCnt[choice - 1]++;
					break;
					
				// 계좌번호와 비밀번호를 입력해야 입금과 출금, 잔액 서비스를 이용할 수 있다.
				// 입금하기
				case 2:
					System.out.print("계좌번호 : ");
					account = sc.next();
					
					System.out.print("비밀번호 : ");
					pw = sc.next();
					
					// arUserCnt[choice - 1] : 해당 은행의 회원만큼만 반복
					for(int i = 0; i < arUserCnt[choice - 1]; i++) {
						// 로그인 검사
						if(arrBank[choice - 1][i].account.equals(account)
								&& arrBank[choice - 1][i].pw.equals(pw)) {
							// 로그인 성공시 check는 true
							check = true; 
							System.out.print("입금액 : ");
							arrBank[choice - 1][i].deposit(sc.nextInt());
							// 입금 후 현재 잔액표시
							System.out.println("현재 잔액은 " + arrBank[choice - 1][i].money + "원");
							break;
						}
					}
					if(!check) {
						System.out.println("계좌번호 혹은 비밀번호를 확인해주세요");
					}
					break;
				// 출금하기
				case 3:
					System.out.print("계좌번호 : ");
					account = sc.next();
					
					System.out.print("비밀번호 : ");
					pw = sc.next();
					
					// arUserCnt[choice - 1] : 해당 은행의 회원만큼만 반복
					for(int i = 0; i < arUserCnt[choice - 1]; i++) {
						// 로그인 검사
						if(arrBank[choice - 1][i].account.equals(account)
								&& arrBank[choice - 1][i].pw.equals(pw)) {
							// 로그인 성공시 check는 true
							check = true; 
							System.out.print("출금액 : ");
							if(arrBank[choice - 1][i].withdraw(sc.nextInt())) {
								// 출금 후 현재 잔액표시
								System.out.println("현재 잔액은 " + arrBank[choice - 1][i].money + "원");
							} else {
								System.out.println("출금 실패 / 잔액 부족");
							}
							break;
						}
					}
					if(!check) {
						System.out.println("계좌번호 혹은 비밀번호를 확인해주세요");
					}
					break;
				// 잔액조회
				case 4:
					System.out.print("계좌번호 : ");
					account = sc.next();
					
					System.out.print("비밀번호 : ");
					pw = sc.next();
					
					// arUserCnt[choice - 1] : 해당 은행의 회원만큼만 반복
					for(int i = 0; i < arUserCnt[choice - 1]; i++) {
						// 로그인 검사
						if(arrBank[choice - 1][i].account.equals(account)
								&& arrBank[choice - 1][i].pw.equals(pw)) {
							// 로그인 성공시 check는 true
							check = true; 
							System.out.println("예금주 : " + arrBank[choice - 1][i].name);
							System.out.println("계좌번호 : " + arrBank[choice - 1][i].account);
							System.out.println("현재 잔액은 " + arrBank[choice - 1][i].showBalance() + "원");
							break;
						}
					}
					if(!check) {
						System.out.println("계좌번호 혹은 비밀번호를 확인해주세요");
					}
					break;
				default:
					System.out.println(errMsg);
				}
			}
		}
	} // end main()

} // end class