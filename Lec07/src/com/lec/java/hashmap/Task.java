package com.lec.java.hashmap;

import java.util.HashMap;

public class Task {
	public static void main(String[] args) {
		Student shine = new Student(1, "샤인");
		HashMap<Student, Integer> stdMap = new HashMap<>();
		
		stdMap.put(shine, 88);
		
		System.out.println(stdMap.get(new Student(1, "샤인")));
	}
}