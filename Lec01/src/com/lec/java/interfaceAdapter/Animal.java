package com.lec.java.interfaceAdapter;

// �������̽������� ����� �߻�޼ҵ常 ����
public interface Animal {
	// ���
	int leg = 4;			// �������̽������� final static ���� ����
	final static int eye = 2;
	
	// �߻�޼ҵ�
	void eat(String feed);	// �������̽������� abstract ���� ����
	abstract void sleep();
	void walk();
}