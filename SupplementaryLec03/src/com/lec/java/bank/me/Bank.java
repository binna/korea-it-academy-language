package com.lec.java.bank.me;
/* ����
 * ��������	: ��ݽ� ������ 50%
 * ��������	: �Աݽ� ������ 50%
 * �츮����	: �ܾ� ��ȸ�� ������ ����� ���丷
 * 
 * �� ���ະ�� 100���� ����Ҹ� ������. > �� �κ��� �ذ����� ����
 */
public class Bank {
	int money;
	
	//�Ա�
	public void deposit(int money) {
		this.money += money;
	}
	//���
	public boolean withdraw(int money) {
		if(money - this.money <= 0) {
			this.money -= money;
			return true;
		}
		return false;
	}
	//�ܾ���ȸ
	public int showBalance() {
		return this.money;
	}
}