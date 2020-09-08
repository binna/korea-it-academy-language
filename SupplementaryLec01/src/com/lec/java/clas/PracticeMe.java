package com.lec.java.clas;

class Car {
	/* ��ü(�ν��Ͻ� ����) */
	// �ν��Ͻ�(=��üȭ), �ν��Ͻ� ����(=��ü)
	// �귣��, ����, ����
	String brand = "";
	String color = "";
	int price = 0;
	boolean engine = false;
	String pwd = "1234";
	int police = 0;
	
	/* ������ */
	// �⺻������, �ʱ�ȭ ������
	public Car() {}
	public Car(String brand, String color, int price) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	/* �޼ҵ� */
	// �õ� �ѱ�
	// �̹� �õ��� �����ִٸ� �����ִٰ� üũ�ϱ�
	// �´� ��й�ȣ�� �Է½ÿ��� �õ��� ������.
	// ��й�ȣ 3ȸ ���� ������ ���� �⵿
	void engineStart(String pwd) {
		if(engine) {
			System.out.println("�̹� ������ ���� �ֽ��ϴ�.");
		} else {
			if(pwd.equals(this.pwd)) {
				System.out.println("�õ� �ѱ�");
				engine = true;
				police = 0;
			} else {
				if(police >= 3) {
					System.out.println("���� �⵿!");
				} else {
					police++;
				}
			}
		}
	} // end engineStart()
	
	// �õ� ����
	// �̹� �õ��� �����ִٸ� �����ִٰ� üũ�ϱ�
	void enginStop() {
		if(engine) {
			System.out.println("�õ� ����");
			engine = false;
		} else {
			System.out.println("�̹� �õ��� ���� �ֽ��ϴ�.");
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