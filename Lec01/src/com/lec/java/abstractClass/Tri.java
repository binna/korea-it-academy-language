package com.lec.java.abstractClass;

public class Tri extends Shape {

	@Override
	void getArea(double w, double h) {
		area = w * h / 2;
		//�� + ���� Ű : ���� ÷�� ���� ã��
		System.out.println(area + "cm��");
	}
	
	@Override
	public void f() {
		System.out.println("�����Դϴ�.");
	}

} // end class