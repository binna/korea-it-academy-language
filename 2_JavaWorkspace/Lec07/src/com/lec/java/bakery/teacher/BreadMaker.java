package com.lec.java.bakery.teacher;

public class BreadMaker implements Runnable {

	//BreadPlate bread = new BreadPlate();
	BreadPlate bread = null;
	
	public BreadMaker(BreadPlate bread) {
		this.bread = bread;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 20; i++) {
			bread.makeBread();
			try {Thread.sleep(1000);} catch (InterruptedException e) {;}
		}
		System.out.println("영업 종료 / 재료 소진");
	}
}