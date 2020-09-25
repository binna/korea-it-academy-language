package com.lec.java.practice.teacher;

public class Animal implements Runnable {
	private String sound;
	
	public Animal() {;}
	public Animal(String sound) {
		super();
		this.sound = sound;
	}

	public void makeSound() {
		for(int i = 0; i < 10; i++) {
			System.out.println(this.sound);
			try {Thread.sleep(1000);} catch (InterruptedException e) {;}
		}
	}
	
	@Override
	public void run() {
		makeSound();
	}
}