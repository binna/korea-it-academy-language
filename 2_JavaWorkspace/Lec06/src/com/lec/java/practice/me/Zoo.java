package com.lec.java.practice.me;

public class Zoo {
	public static void main(String[] args) {
		Runnable dog = new Animal("멍멍");
		Runnable cat = new Animal("야옹");
		Runnable tiger = new Animal("어흥");
		
		Thread threadDog = new Thread(dog);
		Thread threadCat = new Thread(cat);
		Thread threadTiger = new Thread(tiger);
		
		threadDog.start();
		threadCat.start();
		
		try {
			threadDog.join();
			threadCat.join();
		} catch (InterruptedException e) {;}
		
		threadTiger.start();
	}
}