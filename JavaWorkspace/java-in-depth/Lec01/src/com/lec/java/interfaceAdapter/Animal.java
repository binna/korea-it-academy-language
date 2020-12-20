package com.lec.java.interfaceAdapter;

//인터페이스에서는 상수랑 추상메소드만 가능
public interface Animal {
	// 상수
	int leg = 4;			// 인터페이스에서는 final static 생략 가능
	final static int eye = 2;
	
	// 추상메소드
	void eat(String feed);	// 인터페이스에서는 abstract 생략 가능
	abstract void sleep();
	void walk();
}