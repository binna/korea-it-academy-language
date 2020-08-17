package com.lec.java.interfaceAdapter;

public class Dog implements Animal {

	@Override
	public void eat(String feed) {
		System.out.println(feed + "³È³È");
	}

	@Override
	public void sleep() {
		System.out.println("ÄðÄð");
	}

	@Override
	public void walk() {
		System.out.println("¾ÆÀÌ ½Å³ª~");
	}

}