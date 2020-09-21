package com.lec.java.casting;

class Car {
	String brand;
	String color;
	int price;
	
	// 기본생성자 만드는 단축키 : Ctrl + SpaceBar
	public Car() {}

	// 생성자 만드는 단축키 : Alt + Shift + S + O
	public Car(String brand, String color, int price) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	public void engineStart() {
		System.out.println("열쇠로 시동 킴");
	}
	
	public void engineStop() {
		System.out.println("열쇠로 시동 끔");
	}
} // end class Car

class SuperCar extends Car {
String mode;
	
	public SuperCar() {}

	public SuperCar(String mode) {
		super();
		this.mode = mode;
	}
	
	@Override
	public void engineStart() {
		super.engineStart();	// 부모 클래스의 메소드 호출 
		System.out.println("음성으로 시동 킴");
	}
	
	@Override
	public void engineStop() {
		// 부모 클래스의 메소드 호출없이 재정의
		System.out.println("음성으로 시동 끔");
	}
	
	public void openRoof() {
		System.out.println("지붕 열기");
	}
} // end class SuperCar

public class CastingTest {
	
	public static void main(String[] args) {
		// Car(부모), SuperCar(자식)
		Car matiz = new Car();
		SuperCar ferrari = new SuperCar();
		
		// up casting
		Car noOptionFerrari = new SuperCar();
		
		// 자식 타입에 부모 값을 넣는 것은 오류(java.lang.ClassCastException)이다. 
		// 반드시 up casting된 객체를 자식 타입에 넣어주어야 한다.
		// 이때..! 컴파일상 오류가 나지 않고 빌드시에 오류 발생
		//SuperCar brokenCar = (SuperCar) new Car();
		
		//down casting
		SuperCar fullOptionFerrari = (SuperCar) noOptionFerrari;
		
		//★★★★★모든 자식은 부모 타입이다.★★★★★
		System.out.println(ferrari instanceof Car);
		System.out.println(ferrari instanceof SuperCar);
		System.out.println(ferrari instanceof Object);

		noOptionFerrari.engineStart();
		fullOptionFerrari.openRoof();
	} // end main()
	
} // end class CastingTest