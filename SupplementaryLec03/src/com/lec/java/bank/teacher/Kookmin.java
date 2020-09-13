package com.lec.java.bank.teacher;

public class Kookmin extends Bank {
	static int cnt;
	
	@Override
	public boolean withdraw(int money) {
		money *= 1.5;
		return super.withdraw(money);
	}
}