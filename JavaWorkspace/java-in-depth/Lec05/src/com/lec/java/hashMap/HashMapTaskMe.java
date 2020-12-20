package com.lec.java.hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class HashMapTaskMe {
	public static void main(String[] args) {
		// HashMap 사용
		// 중국집
		// 메뉴 5개
		// 메뉴판 출력(keySet(), values() 사용)
		// 총 가격, 평균 가격
		HashMap<String, Integer> menuMap = new HashMap<>();
		int choice = 0;
		
		while(true) {
			System.out.println("1.메뉴추가\n2.메뉴출력\n3.나가기");
			choice = new Scanner(System.in).nextInt();
			
			if(choice == 3) {break;}
			
			switch(choice) {
			// 메뉴 추가
			case 1:
				if(menuMap.size() < 5) {
					System.out.print("메뉴를 입력해주세요 : ");
					String menu = new Scanner(System.in).next();
					System.out.print("가격을 입력해주세요 : ");
					int price = new Scanner(System.in).nextInt();
					menuMap.put(menu, price);
				} else {
					System.out.println("메뉴가 꽉 차 있어서 더 추가 못합니다.");
				}
				break;
			// 메뉴판 출력
			case 2:
				Iterator<String> iter = menuMap.keySet().iterator();
				String[] menu = new String[menuMap.size()];
				int num = 0;
				while(iter.hasNext()) {
					menu[num] = iter.next();
					num++;
				}
				
				int total = 0;
				double avg = 0.0;
				int[] priceList = new int[menuMap.size()];
				num = 0;
				for(int price : menuMap.values()) {
					priceList[num] = price;
					total += price;
					num++;
				}
				
				avg = Double.parseDouble(String.format("%.2f", (double)total / menuMap.size()));
				
				// 메뉴판 출력
				for (int i = 0; i < menuMap.size(); i++) {
					System.out.println(menu[i] + " - " + priceList[i]);
				}
				// 총 가격, 평균 가격 출력
				System.out.println("메뉴 총 가격 : " + total + "원");
				System.out.println("메뉴 평균 가격 : " + avg + "원");
				break;
			default:
				System.out.println("잘못 입력하셨습니다~!");
			}
		}
	}
}