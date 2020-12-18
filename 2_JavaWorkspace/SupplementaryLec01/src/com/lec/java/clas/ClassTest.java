package com.lec.java.clas;
// 클래스란? 반(공통요소가 모여있는 곳)

// 클래스를 사용하는 이유
// 1. 반복되는 변수와 메소드를 쉽게 관리하기 위해서
// 2. 공통된 주제로 작성된 코드들에 이름을 붙여서 가독성을 높이기 위해
class A {
	// 필드 = 변수 + 메소드
	
	// 변수
	int data_a = 10;
	
	// 메소드
	int getData_a() {
		return data_a;
	}
}

class B {
	int data_b = 40;
	
	int getData_b() {
		return data_b;
	}
}

public class ClassTest {

	public static void main(String[] args) {
		// RAM(메모리)
		// 메모리에 올리는 작업을 객체화 라고 한다.
		
		// new 연산자 : heap 메모리에 할당하라는 명령어
		// 생성자 : 클래스이름()
		
		// new를 한 번 사용할 때마다 새로운 필드가 하나씩 할당된다.
		System.out.println(new A().data_a);
		System.out.println(new A().data_a);
		System.out.println(new A().data_a);
		System.out.println(new A().data_a);
		System.out.println(new A().data_a);
		System.out.println(new A().data_a);
		System.out.println(new A().data_a);
		System.out.println(new A().data_a);

		// 한번만 쓸거면 변수에 담을 필요가 없다
		// 하지만 여러번 쓰고 싶다면 주소값을 기억하고 있어야 한다.
		// 그 주소를 obj_a, obj_b가 기억하고 있다.
		System.out.println(new A());
		A obj_a = new A();
		A obj_a2 = new A();
		B obj_b = new B();
		
		System.out.println(obj_a);		// 100번지
		System.out.println(obj_a2);		// 200번지
		System.out.println(obj_b);
		
		// 변수와 객체의 차이
		// 변수 : 값을 담는 저장공간
		// 객체 : 주소값을 담는 저장공간
		// 주소값. : 해당 주소에 접근해라!
		// . : 하위 연산자(=필드 접근 연산자, =멤버 접근 연산자)
		
		// neme에 마침표를 찍어서 나오기 때문에 주소가 들어 있고 주소가 들어 있기 때문에 객체이다.
		String name = "shine";		// name은 객체이다!!
		name.equals("shine");
		
		// 객체 : 추상적인 개념을 구체화 시킨 것
		// 도형(클래스)		세모(객체)
		
		obj_a.data_a = 100;						// 100번지에 있는 data_a에 100을 담았다.
		System.out.println(obj_a2.getData_a());	// 200번지에 있는 data_a를 가지고 온다.
	}
	
}