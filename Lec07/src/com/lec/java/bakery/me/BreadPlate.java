package com.lec.java.bakery.me;

public class BreadPlate {
	
	int breadCnt;
	int eatCnt;
	
	// 빵 만들기
	public synchronized void makeBread() {
		if(breadCnt > 9) {
			System.out.println("빵이 가득 찼습니다.");
			try {wait();} catch (InterruptedException e) {;}
		}
		breadCnt++;
		System.out.println("빵을 1개 만들었습니다. 총 : " + breadCnt + "개");
	}
	
	// 빵 먹기
	public synchronized void eatBread() {
		if(eatCnt == 20) {
			System.out.println("빵이 다 떨어졌습니다.");
		} else if(breadCnt < 1) {
			System.out.println("빵이 없습니다. 만들 때까지 기다려주세요.");
		} else {
			breadCnt--;
			eatCnt++;
			System.out.println("빵을 1개 먹었습니다. 총 : " + breadCnt + "개");
			notify();
		}
	}
}