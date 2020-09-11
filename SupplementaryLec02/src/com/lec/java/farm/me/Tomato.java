package com.lec.java.farm.me;

public class Tomato extends Flower {
	int tomato = 0;
	
	public void growTomato() {
		tomato++;
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}