package com.lec.java.farm.me;

// 인삼
public class Ginseng extends Potato {
	int ginseng = 0;
	
	public void growGinseng() {
		ginseng++;
		
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}