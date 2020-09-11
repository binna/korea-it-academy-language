package com.lec.java.farm.me;

public class Potato extends Tomato {
	int potato = 0;
	
	public void growPotato() {
		potato++;
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}