package com.lec.java.abstractClass;

public abstract class Shape {
	double area;
	
	// 1) �߻�޼ҵ� : �ݵ�� ��������...!
	abstract void getArea(double w, double h);
	
	// 2) �Ϲݸ޼ҵ� : ������ �ϰ������ �ϰ� �ϱ� ������ ������...!
	//              �ʰ� �ϰ� ������� ��..!!
	public void f() {
		System.out.println("�߻� Ŭ������ �Ϲ� �޼ҵ�");
	}
	
	// 2) final�� ������ �޼ҵ� : ������ ���� �ȵ�...!
	public final void intro() {
		System.out.println("�����Դϴ�.");
	}

}