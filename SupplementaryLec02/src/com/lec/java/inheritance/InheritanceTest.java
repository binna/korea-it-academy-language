package com.lec.java.inheritance;
// ������(Polymorphism) : �޼ҵ��� ����(�޼ҵ���� �̸��� �� �������� ���°� �پ��� ����)
// 1. �����ε�(overloading) : �Ű������� ���� Ȥ�� Ÿ���� �ٸ��ٸ� ���� �̸��� �޼ҵ�� ������ �� �ִ�.
// 2. �������̵�(overriding) : �θ𿡼� ����� �޼ҵ带 �����ؾ� �� ������ �ڽĿ��� �Ȱ��� �̸��� �޼ҵ�� �����Ͽ� �������Ѵ�.

// ���(Inheritance)
// 1. ������ ������� Ŭ������ �ʵ带 ����ϰ� ���� ��
// 2. ���� Ŭ������ ���鶧 ����� �ʵ尡 ���� ��Ÿ���ٸ�,
//    �θ� Ŭ������ ����� �����ʵ带 �����ϰ� �� Ŭ������ ��ӹ޾� ����Ѵ�.

// �ڽ�Ŭ������ extends �θ�Ŭ������ : �θ� �ʵ带 ��ġ �ڽ��� �ʵ�ó�� ����� �� �ְ� �ȴ�.

// �θ� A
class A {
	public A() {
		System.out.println("�θ������ ȣ���");
	}
	
	int data_a = 100;
	
	public void printData_a() {
		System.out.println(data_a);
	}
}

// �ڽ� B
class B extends A {
	public B() {
		// �ڽ� �����ڸ� ȣ���ϸ� �θ� Ŭ������ �����ڰ� ȣ��ǳ�...!
		// super() : �ڽĻ����ڿ��� �θ� Ŭ������ �����ڸ� ȣ��
		// �θ��ʵ尡 �޸𸮿� ��� �Ҵ�� ����
		// �ڽ��ʵ尡 �Ҵ�ȴ�
		// ���� super() ������ ��� ���嵵 ����ؼ��� �ȵȴ�.
		// �����Ϸ��� �ڵ� �����ϱ� ������ super()�� ���� ����
		super();
		System.out.println("�ڽĻ����� ȣ���");
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
		// ��������! �޼ҵ�� ��������̴�.
		// �������̵��� �������� ���� �����ϴ�, ���α׷��ֿ����� ���� �������̴�.
		
		// ��ӿ����� �ٽ��� ������
		B obj_b = new B();
		
		obj_b.data_a = 30;
		obj_b.printData_a();
	} // end main()

} // end class