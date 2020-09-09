package com.lec.java.clas;

import java.util.Scanner;

class CarTeacher {
	/* ��ü(=�ν��Ͻ� ����) */
	String brand;
	String color;
	int price;
	String pw = "0000";
	boolean check;		// boolean�� �ʱⰪ�� false
	int policeCnt;
	
	// �⺻ ������, �ʱ�ȭ ������
	public CarTeacher() {}
	public CarTeacher(String brand, String color, int price) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	public CarTeacher(String brand, String color, int price, String pw) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.pw = pw;
	}
	
	/* �޼ҵ� */
	// �õ� �ѱ�
	// �̹� �õ��� �����ִٸ� ���� �ִٰ� üũ�ϱ�
	// �´� ��й�ȣ �Է� �ÿ��� �õ��� ������.
	// ��й�ȣ 3ȸ ���� ������ ���� �⵿!
	public boolean engineStart() {
		if(!this.check) {
			return true;
		}
		return false;
	} // end engineStart()
	
	public void checkPw(String pw) {
		if(this.pw.equals(pw)) {
			this.check = true;
			policeCnt = 0;
		} else {
			// ��й�ȣ ����
			policeCnt++;
		}
	} // end check()
	
	// �õ� ����(�̹� �õ��� �����ִٸ� �����ִٰ� üũ�ϱ�)
	public boolean engineStop() {
		if(this.check) {
			this.check = false;
			return true;
		}
		return false;
	} // end engineStop()
} // end Car class

public class PracticeTeacher {
	
	public static void main(String[] args) {
		int choice = 0;
		CarTeacher myCar = new CarTeacher("Benz", "Black", 15000, "1234");
		
		while(true) {
			System.out.println("1.�õ��ѱ�\n2.�õ�����");
			choice = new Scanner(System.in).nextInt();
			
			// �õ� �ѱ�
			if(choice == 1) {
				if(myCar.engineStart()) {
					System.out.print("��й�ȣ �Է� : ");
					myCar.checkPw(new Scanner(System.in).next());
					
					if(myCar.check) {
						System.out.println("�õ� Ŵ!");
						continue;
					}
					
					if(myCar.policeCnt == 3) {
						System.out.println("���� �⵿!");
						break;
					}
					
					System.out.println("��й�ȣ ���� : " + myCar.policeCnt + "ȸ");
					continue;
				}
				System.out.println("�̹� �õ��� �����ֽ��ϴ�.");
			} else if(choice == 2) {
				if(myCar.engineStop()) {
					System.out.println("�õ� ��!");
				} else {
					System.out.println("�̹� �õ��� �����ֽ��ϴ�.");
				}
			} else {
				break;
			}
		} // end while()
	} // end main()

} // end PracticeTeacher class