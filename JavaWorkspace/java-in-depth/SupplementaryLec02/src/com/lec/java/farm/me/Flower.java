package com.lec.java.farm.me;

public class Flower {
	int flower = 0;
	
	public void growFlower() {
		flower++;
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}