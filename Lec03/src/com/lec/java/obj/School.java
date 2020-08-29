package com.lec.java.obj;

public class School {
	
	public static void main(String[] args) {
		Student std1 = new Student(1, "�ں�");
		Student std2 = new Student(1, "�ں�");
		
		// Object�� equals()�� �ּ� ��, ObjecthashCode()�� ��ü�� ������ �ִ� �ּҰ� 
		// ���⼭�� ���� �л����� �񱳿� ��ȣ �񱳰� �ʿ���
		// �̷��� �ʿ��� ���� equals(), hashCode() ������ �ʿ�
		System.out.println("std1.hashCode() : " + std1.hashCode());
		System.out.println("std2.hashCode() : " + std2.hashCode());
		System.out.println("std1.equals(std2) : " + std1.equals(std2));
	} // end main()

} // end class