package com.lec.java.atm;

public class CU {
	public static void main(String[] args) {
		// 자원은 하나이고 여러 개에서 접근하려고 할 때,
		// 여러 개의 쓰레드(엄마, 아들)가 자원(ATM) 하나를 공유한다.
		// 즉, 자원이 하나에 여러 개의 쓰레드가 번갈아가면서 빠른 속도로 접근한다
		ATM atm = new ATM();
		
		// 생성자 Thread(Runnable target, String name)
		Thread mon_thread = new Thread(atm, "엄마");
		Thread son_thread = new Thread(atm, "아들");
		
		mon_thread.start();
		son_thread.start();
	}
}