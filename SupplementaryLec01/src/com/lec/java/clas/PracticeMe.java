package com.lec.java.clas;

class Car {
	/* 객체(인스턴스 변수) */
	// 인스턴스(=객체화), 인스턴스 변수(=객체)
	// 브랜드, 색상, 가격
	String brand = "";
	String color = "";
	int price = 0;
	boolean engine = false;
	String pwd = "1234";
	int police = 0;
	
	/* 생성자 */
	// 기본생성자, 초기화 생성자
	public Car() {}
	public Car(String brand, String color, int price) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	/* 메소드 */
	// 시동 켜기
	// 이미 시동이 켜져있다면 켜져있다고 체크하기
	// 맞는 비밀번호를 입력시에만 시동이 켜진다.
	// 비밀번호 3회 연속 오류시 경찰 출동
	void engineStart(String pwd) {
		if(engine) {
			System.out.println("이미 엔진이 켜져 있습니다.");
		} else {
			if(pwd.equals(this.pwd)) {
				System.out.println("시동 켜기");
				engine = true;
				police = 0;
			} else {
				if(police >= 3) {
					System.out.println("경찰 출동!");
				} else {
					police++;
				}
			}
		}
	} // end engineStart()
	
	// 시동 끄기
	// 이미 시동이 꺼져있다면 꺼져있다고 체크하기
	void enginStop() {
		if(engine) {
			System.out.println("시동 끄기");
			engine = false;
		} else {
			System.out.println("이미 시동이 꺼져 있습니다.");
		}
	} // end enginStop()
} // end Car class

public class PracticeMe {

	public static void main(String[] args) {
		Car car1 = new Car();
		//System.out.println(car1.engine);
		//System.out.println();
		
		//car1.engineStart("1234");
		//System.out.println();
		car1.engineStart("1");
		car1.engineStart("1");
		car1.engineStart("1");
		car1.engineStart("1");
	} // end main()
	
} // end class