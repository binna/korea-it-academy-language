package com.lec.java.obj;

public class School {
	
	public static void main(String[] args) {
		Student std1 = new Student(1, "박빈나");
		Student std2 = new Student(1, "박빈나");
		
		// Object의 equals()는 주소 비교, ObjecthashCode()는 객체가 가지고 있는 주소값 
		// 여기서는 같은 학생인지 비교와 번호 비교가 필요함
		// 이럴때 필요한 것이 equals(), hashCode() 재정의 필요
		System.out.println("std1.hashCode() : " + std1.hashCode());
		System.out.println("std2.hashCode() : " + std2.hashCode());
		System.out.println("std1.equals(std2) : " + std1.equals(std2));
	} // end main()

} // end class