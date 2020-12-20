package com.lec.java.ch8;

public class ExceptionEx9 {
	public static void main(String[] args) {
		try {
			Exception e = new Exception("고의로 발생시켰음.");
			throw e;		// 예외 발생시킴
		} catch (Exception e) {
			System.out.println("에러메시지 : " + e.getMessage());
			e.printStackTrace();
		}

		System.out.println("---------------------------------------");
		try {
			throw new Exception("두줄을 한줄로 줄여서 고의로 에러 발생시킴.");
		} catch (Exception e) {
			System.out.println("에러메시지 : " + e.getMessage());
			e.printStackTrace();
		}
	} // end main
} // end class