package com.lec.java.clas;

import java.util.Scanner;

class CarTeacher {
	/* 객체(=인스턴스 변수) */
	String brand;
	String color;
	int price;
	String pw = "0000";
	boolean check;		// boolean의 초기값은 false
	int policeCnt;
	
	// 기본 생성자, 초기화 생성자
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
	
	/* 메소드 */
	// 시동 켜기
	// 이미 시동이 켜져있다면 켜져 있다고 체크하기
	// 맞는 비밀번호 입력 시에만 시동이 켜진다.
	// 비밀번호 3회 연속 오류시 경찰 출동!
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
			// 비밀번호 오류
			policeCnt++;
		}
	} // end check()
	
	// 시동 끄기(이미 시동이 꺼져있다면 꺼져있다고 체크하기)
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
			System.out.println("1.시동켜기\n2.시동끄기");
			choice = new Scanner(System.in).nextInt();
			
			// 시동 켜기
			if(choice == 1) {
				if(myCar.engineStart()) {
					System.out.print("비밀번호 입력 : ");
					myCar.checkPw(new Scanner(System.in).next());
					
					if(myCar.check) {
						System.out.println("시동 킴!");
						continue;
					}
					
					if(myCar.policeCnt == 3) {
						System.out.println("경찰 출동!");
						break;
					}
					
					System.out.println("비밀번호 오류 : " + myCar.policeCnt + "회");
					continue;
				}
				System.out.println("이미 시동이 켜져있습니다.");
			} else if(choice == 2) {
				if(myCar.engineStop()) {
					System.out.println("시동 끔!");
				} else {
					System.out.println("이미 시동이 꺼져있습니다.");
				}
			} else {
				break;
			}
		} // end while()
	} // end main()

} // end PracticeTeacher class