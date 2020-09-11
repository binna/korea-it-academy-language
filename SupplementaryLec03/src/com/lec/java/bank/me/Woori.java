package com.lec.java.bank.me;

public class Woori extends Bank{
	// 잔액 조회시 수수료 전재산 반토막
	@Override
	public int showBalance() {
		this.money -= (this.money * 0.5);
		return this.money;
	}
}