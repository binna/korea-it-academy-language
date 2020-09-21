package com.lec.java.abstractClass;

public abstract class Shape {
	double area;
	
	// 1) 추상메소드 : 반드시 재정의해...!
	abstract void getArea(double w, double h);
	
	// 2) 일반메소드 : 재정의 하고싶으면 하고 하기 싫으면 하지마...!
	//             너가 하고 싶은대로 해..!!
	public void f() {
		System.out.println("�߻� Ŭ������ �Ϲ� �޼ҵ�");
	}
	
	// 3) final로 지정된 메소드 : 재정의 절대 안돼...!
	public final void intro() {
		System.out.println("�����Դϴ�.");
	}

}