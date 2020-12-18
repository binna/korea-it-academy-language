package com.lec.java.interfaceAdapter;

public class Dog implements Animal {

	@Override
	public void eat(String feed) {
		System.out.println(feed + "냠냠");
	}

	@Override
	public void sleep() {
		System.out.println("쿨쿨");
	}

	@Override
	public void walk() {
		System.out.println("아이 신나~");
	}

}