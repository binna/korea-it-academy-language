package com.lec.java.bank.teacher;

public class Shinhan extends Bank {
	static int cnt;
	
	@Override
	public void deposit(int money) {
		//money /= 2;
		money *= 0.5;
		super.deposit(money);
	}
}