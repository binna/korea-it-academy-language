package com.lec.java.bank.teacher;

public class Woori extends Bank {
	static int cnt;
	
	@Override
	public int showBalance() {
		this.money *= 0.5;
		return super.showBalance();
	}
}