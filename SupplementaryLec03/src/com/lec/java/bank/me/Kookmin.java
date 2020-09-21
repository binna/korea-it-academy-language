package com.lec.java.bank.me;

public class Kookmin extends Bank {
	// 출금시 수수료 50%
	@Override
	public boolean withdraw(int money) {
		if((money * 0.5 + money) - this.money <= 0) {
			this.money -= (int)(money * 0.5 + money);
			System.out.println(this.money);
			return true;
		}
		return false;
	}
}