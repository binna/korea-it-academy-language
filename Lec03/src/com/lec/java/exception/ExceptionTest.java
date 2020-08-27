package com.lec.java.exception;

public class ExceptionTest {

	public static void main(String[] args) {

		// try catch문 : try로 감쌀 문장 블록 + Alt + Shift + Z
		try {
			System.out.println(10/0);
		} catch (Exception e) {
			System.out.println("0으로 나눌 수 없습니다.");
			
			// 객체를 출력할때 언제나 toString()이 생략된 것임
			System.out.println(e);
			System.out.println(e.toString());
		}
		
		System.out.println("반드시 출력되어야 하는 문장");
		
	} // end main()
	
} // end class