package com.lec.java.innerClass;

class Out {
	int outData;
	
	public Out() {
		System.out.println("외부 클래스 생성자 호출됨.");
	}
	
	public void intro_out() {
		System.out.println("외부 클래스 메소드 호출됨.");
	}
	
	// 내부클래스, 캡슐화
	// 내부클래스는 외부클래스의 같은 필드 안에만 있을 뿐 자식이 아니다.
	// 자식은 반드시 extends로 받는다는 점 꼭 기억하기!
	class In {
		int inData;
		
		public In() {
			System.out.println("내부 클래스 생성자 호출됨.");
		}
		
		public void intro_in() {
			outData = 100;
			System.out.println(outData);
			intro_out();
			System.out.println("내부 클래스 메소드 호출됨.");
		}
		
	} // end In class
	
} // end Out class

public class InnerTest {
	
	public static void main(String[] args) {
		Out out = new Out();
		
		// 일단 외부클래스가 인스턴스 되어야 내부 클래스도 인스턴스 된다..!!
		Out.In in = out.new In();
		
		in.intro_in();
		
	} // end main()

} // end InnerTest class