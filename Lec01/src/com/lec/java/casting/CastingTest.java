package com.lec.java.casting;

class Car {
	String brand;
	String color;
	int price;
	
	// �⺻������ ����� ����Ű : Ctrl + SpaceBar
	public Car() {}

	// ������ ����� ����Ű : Alt + Shift + S + O
	public Car(String brand, String color, int price) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	public void engineStart() {
		System.out.println("����� �õ� Ŵ");
	}
	
	public void engineStop() {
		System.out.println("����� �õ� ��");
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
		super.engineStart();	// �θ� Ŭ������ �޼ҵ� ȣ�� 
		System.out.println("�������� �õ� Ŵ");
	}
	
	@Override
	public void engineStop() {
		// �θ� Ŭ������ �޼ҵ� ȣ����� ������
		System.out.println("�������� �õ� ��");
	}
	
	public void openRoof() {
		System.out.println("���� ����");
	}
	
} // end class SuperCar

public class CastingTest {
	
	public static void main(String[] args) {
		// Car(�θ�), SuperCar(�ڽ�)
		Car matiz = new Car();
		SuperCar ferrari = new SuperCar();
		
		// up casting
		Car noOptionFerrari = new SuperCar();
		
		// �ڽ� Ÿ�Կ� �θ� ���� �ִ� ���� ����(java.lang.ClassCastException)�̴�. 
		// �ݵ�� up casting�� ��ü�� �ڽ� Ÿ�Կ� �־��־�� �Ѵ�.
		// �̶�..! �����ϻ� ������ ���� �ʰ� ����ÿ� ���� �߻�
		//SuperCar brokenCar = (SuperCar) new Car();
		
		//down casting
		SuperCar fullOptionFerrari = (SuperCar) noOptionFerrari;
		
		//�ڡڡڡڡڸ�� �ڽ��� �θ� Ÿ���̴�.�ڡڡڡڡ�
		System.out.println(ferrari instanceof Car);
		System.out.println(ferrari instanceof SuperCar);
		System.out.println(ferrari instanceof Object);

		noOptionFerrari.engineStart();
		fullOptionFerrari.openRoof();
		
	} // end main()
	
} // end class CastingTest