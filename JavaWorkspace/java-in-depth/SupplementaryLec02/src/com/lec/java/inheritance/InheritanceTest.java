package com.lec.java.inheritance;
// 다형성(Polymorphism) : 메소드의 성질(메소드들의 이름은 한 개이지만 형태가 다양한 성질)
// 1. 오버로딩(overloading) : 매개변수의 개수 혹은 타입이 다르다면 같은 이름의 메소드로 선언할 수 있다.
// 2. 오버라이딩(overriding) : 부모에서 선언된 메소드를 수정해야 할 때에는 자식에서 똑같은 이름의 메소드로 선언하여 재정의한다.

// 상속(Inheritance)
// 1. 기존에 사용중인 클래스의 필드를 사용하고 싶을 때
// 2. 여러 클래스를 만들때 공통된 필드가 많이 나타난다면,
//    부모 클래스를 만들어 공통필드를 선언하고 각 클래스에 상속받아 사용한다.

// 자식클래스명 extends 부모클래스명 : 부모 필드를 마치 자신의 필드처럼 사용할 수 있게 된다.
// 부모 A
class A {
	public A() {
		System.out.println("부모생성자 호출됨");
	}
	
	int data_a = 100;
	
	public void printData_a() {
		System.out.println(data_a);
	}
}

// 자식 B
class B extends A {
	public B() {
		// 자식 생성자를 호출하면 부모 클래스의 생성자가 호출되네...!
		// super() : 자식생성자에서 부모 클래스의 생성자를 호출
		// 부모필드가 메모리에 모두 할당된 다음
		// 자식필드가 할당된다
		// 따라서 super() 위에는 어떠한 문장도 사용해서는 안된다.
		// 컴파일러가 자동 생성하기 때문에 super()는 생략 가능
		super();
		System.out.println("자식생성자 호출됨");
	}
	
	int data_b = 50;
	
	public void printData() {
		data_a = 10000;
		printData_a();
		System.out.println(data_b);
	}
	@Override
	public void printData_a() {
		super.printData_a();
	}
}
public class InheritanceTest {
	
	public static void main(String[] args) {
		// 잊지말자! 메소드는 저장공간이다.
		// 오버라이딩의 영어적인 뜻은 무시하다, 프로그래밍에서의 뜻은 재정의이다.
				
		// 상속에서의 핵심은 생성자
		B obj_b = new B();
		
		obj_b.data_a = 30;
		obj_b.printData_a();
	} // end main()

} // end class