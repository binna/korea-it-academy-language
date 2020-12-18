package com.lec.java.thread;

public class Thread1 extends Thread {
	private String data;
	
	public Thread1() {;}
	public Thread1(String data) {
		super();
		this.data = data;
	}

	// 멀티 쓰레드에서는 run() 메소드 안에 구현되는 것을 자원이라고 한다.
	// 그리고 이러한 자원은 JVM이 할당해준다.
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println(data);
			
			// 멀티 쓰레드 구현했으나 너무 빨라서 우리 눈에 확인할 수 없음
			// 그래서 시간을 늦춰줌으로써 우리 눈으로 확인할 수 있게 된다!
			try {Thread.sleep(1000);} catch (InterruptedException e) {;}
		}
	}
}