package com.lec.java.bank.me;

public class Woori extends Bank{
	// �ܾ� ��ȸ�� ������ ����� ���丷
	@Override
	public int showBalance() {
		this.money -= (this.money * 0.5);
		return this.money;
	}
}