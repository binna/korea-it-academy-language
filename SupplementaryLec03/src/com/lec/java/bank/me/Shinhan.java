package com.lec.java.bank.me;

public class Shinhan extends Bank {
	// �Աݽ� ������ 50%
	@Override
	public void deposit(int money) {
		this.money += (money - money * 0.5);
	}
}