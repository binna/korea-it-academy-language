package com.lec.java.exception;

public class ExceptionTest {
	
	public static void main(String[] args) {
		
		try {
			System.out.println(10/0);
		} catch (ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�.");
		}
		
	} // end main()

} // end class