package com.lec.java.thread;

public class ThreadTest {
	public static void main(String[] args) {
		// 1. Thread 클래스
		// Thread 클래스를 상속받고 run 매소드를 재정의하여 쓰레드를 구현한다.
		//Thread1 t1 = new Thread1("★");
		//Thread1 t2 = new Thread1("♥ ");
		
		// 아래의 방법은 단일 쓰레드이다.
		// run()이라는 메소드를 main 메서드에서 썼기 때문에 단일 쓰레드이다.
		// 그렇기 때문에 t1이 끝나고 t2가 시작된다.
		//t1.run();
		//t2.run();
		
		// 멀티 쓰레드를 구현할 때에는 운영체제에게 스케줄링을 해야한다.
		// 자바에서 멀티쓰레드를 스케줄링 해주는 메소드는 Thread클래스에 있는 start()라는 메소드이다.
		
		// 여기서 질문..?
		// 나는 run()을 재정의했는데 start()가 내가 재정의한  run()을 어떻게 알고 실행을 해줄까?
		
		// start()는 자식에서 재정의된 run()이라는 메소드를 알고 있고
		// 현재  Thread 타입이 아닌 그 자식인 t1에서 start()를 쓰게 된다.
		
		// 즉, 자식에서 start()를 쓰면 자식에서 재정의된 값이 반영이 되는 casting 개념을 생각하면 된다.
		//t1.start();
		//t2.start();
		
		// 그런데도 결과는 멀티 쓰레드의 결과가 나오지 않았다...!
		// 스케줄링도 등록도했는데 왜 그럴까?
		
		// 그 이유는 너무 빨라서 우리 눈에 적용이 안된 것 처럼 보인 것이다.
		// 그래서 Thread.sleep()을 이용하여 시간을 멈춰주면
		// 비로소 우리 눈에 보이게 된다!
		
		// 2. Runnable 인터페이스
		// Runnable 인터페이스를 지정받고 run메소드를 재정의하여 쓰레드를 구현한다.
		Runnable t1 = new Thread2("!");
		Thread2 t2 = new Thread2("?");
		
		// start() 메소드를 사용하기 위해 생성자 Thread(Runnable target) 해주기!
		// Thread2 implements Runnable
		// up-casting 개념 이용...!
		Thread thread1 = new Thread(t1);
		Thread thread2 = new Thread(t2);
		
		thread1.start();
		thread2.start();
		
		// 멀티 쓰레드일때는 우선순위에 따라 출력되기 때문에 뭐가 먼저 나올지 알 수 없다.
		
		// 또한 잘못된 우선순위로 짠 로직은 큰 오류를 발생시키기 때문에
		// 쓰레드마다 우선 순위를 결정할 수 있으나 이번 수업에서 배우지 않을 예정!
		
		// join()을 사용한 쓰레드가 모두 끝날 때까지 다른 쓰레드는 대기한다.
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {;}
		
		System.out.println("메인 쓰레드 종료");
	}
}