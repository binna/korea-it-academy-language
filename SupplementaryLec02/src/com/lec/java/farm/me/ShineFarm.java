package com.lec.java.farm.me;

import java.util.Scanner;

public class ShineFarm {
	
	public static void main(String[] args) {
		String mainMsg = "shineFarm 농장에 오신 것을 환영합니다.\n"
				+ "[작물을 재배해서 다양한 상품으로 교환하자!]";
		
		System.out.println(mainMsg);
		
		// 게임 시작하자마자 모든 작물의 클래스들을 만들어줘야 함
		// 현재 모든 클래스가 연쇄 상속중이라 최종 인삼만 상속하면 모든 클래스의 변수들이 생김
		Ginseng playItem = new Ginseng();
		
		while(true) {
			System.out.println("1.작물 선택\n2.내 작물 보기\n3.상점\n4.그만하기");
			String choice = new Scanner(System.in).next();
			
			// 그만하기
			if(choice.equals("4")) {
				System.out.println("그만두시면 지금까지 한 게임 저장 안됩니다.\n정말 그만두시겠습니까(원하면 yes 기입)?");
				if((new Scanner(System.in).next()).equals("yes"));
				break;
			}
			
			switch(choice) {
			// 작물 선택
			case "1":
				System.out.println("키우고 싶은 작물은 기입하세요.");
				System.out.println("1.꽃\n2.토마토\n3.감자\n4.인삼");
				choice = new Scanner(System.in).next();
				switch (choice) {
				case "1":
					playItem.growFlower();
					break;
				case "2":
					if(playItem.flower >= 2) {
						playItem.growTomato();
						playItem.flower -= 2;
					} else {
						System.out.println("꽃이 2개 이상일때만 토마토를 키울 수 있습니다!");
						System.out.println("현재 꽃의 개수 : " + playItem.flower);
					}
					break;
				case "3":
					if(playItem.tomato >= 5) {
						playItem.growPotato();
						playItem.tomato -= 5;
					} else {
						System.out.println("토마토가 5개 이상일때만 감자를 키울 수 있습니다!");
						System.out.println("현재 토마토의 개수 : " + playItem.tomato);
					}
					break;
				case "4":
					if(playItem.potato >= 20) {
						playItem.growGinseng();
						playItem.potato -= 20;
					} else {
						System.out.println("감자가 20개 이상일때만 인삼을 키울 수 있습니다!");
						System.out.println("현재 감자의 개수 : " + playItem.potato);
					}
					break;
				default:
					System.out.println("잘못된 값을 입력하여 작물을 키우지 못했습니다.");
					continue;
				}
				break;
			// 내 작물 보기
			case "2":
				System.out.println("꽃 : " + playItem.flower 
						+ "개, 토마토 : " + playItem.tomato 
						+  "개, 감자 : " + playItem.potato 
						+ "개, 인삼 : " + playItem.ginseng + "개");
				break;
			// 상점
			case "3":
				System.out.println("어떤 상품을 받고 싶으십니까?");
				System.out.println("1.문상 오천원(꽃 3개)\n2.문상 만원(토마토 3개)\n3.어여쁜 반지(감자 3개)\n4.값비싼 목걸이(인삼 3개)");
				switch (choice) {
				case "1":
					if(playItem.flower >= 3) {
						System.out.println("문상 오천원 득템! 등록된 주소로 배송해드리겠습니다~! 추카 추카 빰!!!");
						playItem.flower -= 3;
					} else {
						System.out.println("현재 가지고 계신 꽃의 개수는 " + playItem.flower + "개입니다!\n모울 수 있도록 좀 더 게임을 즐겨주세요!");
					}
					break;
				case "2":
					if(playItem.tomato >= 3) {
						System.out.println("문상 만원 득템! 등록된 주소로 배송해드리겠습니다~! 추카 추카 빰!!!");
						playItem.tomato -= 3;
					} else {
						System.out.println("현재 가지고 계신 토마토의 개수는 " + playItem.tomato + "개입니다!\n모울 수 있도록 좀 더 게임을 즐겨주세요!");
					}
					break;
				case "3":
					if(playItem.potato >= 3) {
						System.out.println("어여쁜 반지 득템! 등록된 주소로 배송해드리겠습니다~! 추카 추카 빰!!!");
						playItem.potato -= 3;
					} else {
						System.out.println("현재 가지고 계신 감자의 개수는 " + playItem.potato + "개입니다!\n모울 수 있도록 좀 더 게임을 즐겨주세요!");
					}
					break;
				case "4":
					if(playItem.ginseng >= 3) {
						System.out.println("값비싼 목걸이 득템! 등록된 주소로 배송해드리겠습니다~! 추카 추카 빰!!!");
						playItem.ginseng -= 3;
					} else {
						System.out.println("현재 가지고 계신 인삼의 개수는 " + playItem.ginseng + "개입니다!\n모울 수 있도록 좀 더 게임을 즐겨주세요!");
					}
					break;
				default:
					System.out.println("잘못 입력했습니다. 상점을 나갑니다~ 바이 바이~!");
					continue;
				}
				break;
			default:
				System.out.println("잘못된 값을 입력했습니다. 다시 입력해주세요.");
				continue;
			} // end switch()
			
		}
		System.out.println("게임종료");
		
	} // end main()

} // end class