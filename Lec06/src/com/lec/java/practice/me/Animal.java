package com.lec.java.practice.me;

public class Animal implements Runnable {
	private String crying;
	
	public Animal() {;}
	public Animal(String crying) {
		super();
		this.crying = crying;
	}

	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println(crying);
			try {Thread.sleep(1000);} catch (InterruptedException e) {;}
		}
	}
}