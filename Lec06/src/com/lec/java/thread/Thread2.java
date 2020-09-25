package com.lec.java.thread;

public class Thread2 implements Runnable {
	private String data;
	
	public Thread2() {;}
	public Thread2(String data) {
		super();
		this.data = data;
	}

	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println(data);
			// [다시 한 번 명심!]
			// Thread.sleep()을 쓰는 이유는 육안으로 확인하기 위해서는
			// 속도를 늦춰줘야하기 때문에!
			try {Thread.sleep(1000);} catch (InterruptedException e) {;}
		}
	}
}