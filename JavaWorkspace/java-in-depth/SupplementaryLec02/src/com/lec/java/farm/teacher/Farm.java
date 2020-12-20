package com.lec.java.farm.teacher;

import java.util.Scanner;

public class Farm {
	
	public static void main(String[] args) {
		Flower flower = new Flower(0, "진달래", 3000);
		Tomato tomato = new Tomato(0, "토마토", 5000);
		Potato potato = new Potato(0, "감자", 10000);
		Ginseng ginseng = new Ginseng(0, "인삼", 15000);
		
		// up casting
		// 각 객체에 규칙성을 부여하기 위해서 사용한다.
		Plant[] plants = {flower, tomato, potato, ginseng};
		int[] costs = {2, 5, 20};
		int choice = 0;
		
		while(true) {
			System.out.println("1.진달래\n2.토마토\n3.감자\n4.인삼");
			choice = new Scanner(System.in).nextInt();
			// 꽃일때
			if(choice == 1) {
				System.out.println("재배중...");
				try {Thread.sleep(plants[choice-1].time);} catch (InterruptedException e) {;}
				// 재배 개수 1 증가
				plants[choice-1].grow();
				System.out.println(plants[choice-1].name + " 완성! "
						+ "현재 " + plants[choice-1].name + " 개수 : " + plants[choice-1].cnt);
				continue;
			}
			// 그 외의 작물일때
			for (int i = 1; i < plants.length; i++) {
				// 사용자가 선택한 식물 일 때 참
				if(choice - 1 == i) {
					// 재배할 때 필요한 재료작물의 개수 체크
					if(plants[i].check(plants[i-1])) {
						System.out.println("재배중...");
						try {Thread.sleep(plants[i].time);} catch (InterruptedException e) {;}
						// 사용자가 선택한 작물에 필요한 재료 감소
						//System.out.println(plants[i-1].name);
						//System.out.println(costs[i-1]);
						plants[i-1].cnt -= costs[i-1];
						// 재배 개수 1 증가
						plants[i].grow();
						System.out.println(plants[i].name + " 완성! "
								+ "현재 " + plants[i].name + " 개수 : " + plants[i].cnt);
					}else {
						System.out.println(plants[i-1].name + "(이)가 부족해요 ㅠㅠ");
					}
				}
			}
		}
	} // end main()
	
} // end class