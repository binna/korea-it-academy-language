package com.lec.java.interfaceAdapter;

public class Dog implements Animal {

	@Override
	public void eat(String feed) {
		System.out.println(feed + "�ȳ�");
	}

	@Override
	public void sleep() {
		System.out.println("����");
	}

	@Override
	public void walk() {
		System.out.println("���� �ų�~");
	}

}