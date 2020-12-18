package com.lec.java.atm;

// 멀티 쓰레드를 이용하여 ATM을 만든다!
// 출금이란 기능이 쓰레드에서 접근하는 자원이 될 수 있다
public class ATM implements Runnable {
	int money = 10000;

	// synchronized 키워드를 잘못 붙이면 박살난다!
	// run()에 synchronized 키워드를 붙이게 된다면 단일 쓰레드가 된다!
	// 그렇기 때문에 synchronized 붙일때에는 절대 run()에다가 붙이는 것이 아니라
	// 해당 요소에만 붙이면 된다.
	@Override
	public void run() {
		for(int i = 0; i < 5; i++) {
			withdraw(1000);
			try {Thread.sleep(500);} catch (InterruptedException e) {;}
		}
	}
	
	// synchronized 키워드를 붙이게 되면 자원 전체에 동기화를 사용한다.
	//public synchronized void withdraw(int money) {
	public void withdraw(int money) {
		//this.money -= money;
		
		// 동기화 블럭은 원하는 부분만 동기화를 하기 위해 사용한다.
		// mutex에 run메소드가 재정의된 객체를 적어준다.
		synchronized(this) {
			this.money -= money;
		}
		
		// Thread.currentThread().getName() : 접근한 쓰레드의 이름을 가져온다.
		System.out.println(Thread.currentThread().getName() + "이(가) " + money + "원 출금");
		System.out.println("현재 잔액 : " + this.money + "원");
	}
}