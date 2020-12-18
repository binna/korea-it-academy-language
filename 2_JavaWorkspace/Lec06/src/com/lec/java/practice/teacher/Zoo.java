package com.lec.java.practice.teacher;

public class Zoo {
	public static void main(String[] args) {
		Animal tiger = new Animal("어흥");
		Animal lion = new Animal("크르릉");
		Runnable parrot = new Animal("안녕하세요.");
		
		Thread tiger_thread = new Thread(tiger);
		Thread lion_thread = new Thread(lion);
		Thread parrot_thread = new Thread(parrot);
		
		tiger_thread.start();
		lion_thread.start();
		
		try {
			tiger_thread.join();
			lion_thread.join();
		} catch (InterruptedException e) {;}
		
		parrot_thread.start();
	}
}