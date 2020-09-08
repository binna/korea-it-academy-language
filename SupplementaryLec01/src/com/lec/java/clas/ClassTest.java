package com.lec.java.clas;
// Ŭ������? ��(�����Ұ� ���ִ� ��)

// Ŭ������ ����ϴ� ����
// 1. �ݺ��Ǵ� ������ �޼ҵ带 ���� �����ϱ� ���ؼ�
// 2. ����� ������ �ۼ��� �ڵ�鿡 �̸��� �ٿ��� �������� ���̱� ����
class A {
	// �ʵ� = ���� + �޼ҵ�
	
	// ����
	int data_a = 10;
	
	// �޼ҵ�
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
		// RAM(�޸�)
		// �޸𸮿� �ø��� �۾��� ��üȭ ��� �Ѵ�.
		
		// new ������ : heap �޸𸮿� �Ҵ��϶�� ��ɾ�
		// ������ : Ŭ�����̸�()
		
		// new�� �� �� ����� ������ ���ο� �ʵ尡 �ϳ��� �Ҵ�ȴ�.
		System.out.println(new A().data_a);
		System.out.println(new A().data_a);
		System.out.println(new A().data_a);
		System.out.println(new A().data_a);
		System.out.println(new A().data_a);
		System.out.println(new A().data_a);
		System.out.println(new A().data_a);
		System.out.println(new A().data_a);

		// �ѹ��� ���Ÿ� ������ ���� �ʿ䰡 ����
		// ������ ������ ���� �ʹٸ� �ּҰ��� ����ϰ� �־�� �Ѵ�.
		// �� �ּҸ� obj_a, obj_b�� ����ϰ� �ִ�.
		System.out.println(new A());
		A obj_a = new A();
		A obj_a2 = new A();
		B obj_b = new B();
		
		System.out.println(obj_a);		// 100����
		System.out.println(obj_a2);		// 200����
		System.out.println(obj_b);
		
		// ������ ��ü�� ����
		// ���� : ���� ��� �������
		// ��ü : �ּҰ��� ��� �������
		// �ּҰ�. : �ش� �ּҿ� �����ض�!
		// . : ���� ������(=�ʵ� ���� ������, =��� ���� ������)
		
		// neme�� ��ħǥ�� �� ������ ������ �ּҰ� ��� �ְ� �ּҰ� ��� �ֱ� ������ ��ü�̴�.
		String name = "shine";		// name�� ��ü�̴�!!
		name.equals("shine");
		
		// ��ü : �߻����� ������ ��üȭ ��Ų ��
		// ����(Ŭ����)		����(��ü)
		
		obj_a.data_a = 100;						// 100������ �ִ� data_a�� 100�� ��Ҵ�.
		System.out.println(obj_a2.getData_a());	// 200������ �ִ� data_a�� ������ �´�.
	}
	
}