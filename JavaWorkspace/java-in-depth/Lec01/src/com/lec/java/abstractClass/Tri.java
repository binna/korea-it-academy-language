package com.lec.java.abstractClass;

public class Tri extends Shape {

	@Override
	void getArea(double w, double h) {
		area = w * h / 2;
		//ㅊ + 한자 키 : 제곱 첨자 문자 찾기
		System.out.println(area + "cm²");
	}
	
	@Override
	public void f() {
		System.out.println("세모입니다.");
	}

} // end class