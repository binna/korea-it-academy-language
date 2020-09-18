package com.lec.java.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.UnaryOperator;

public class ArrayListTaskTeacher {

	public static void main(String[] args) {
		// ����
		// 1. 10 ������ 15�� �ִ´�.
		// 2. 60�� 600���� �����Ѵ�.
		// 3. 15�� �����.
		ArrayList<Integer> dataList = new ArrayList<>();
		
		dataList.add(10);
		dataList.add(80);
		dataList.add(90);
		dataList.add(30);
		dataList.add(20);
		dataList.add(50);
		dataList.add(60);
		dataList.add(40);
		
		Collections.shuffle(dataList);
		System.out.println(dataList);
		// 1. 10 ������ 15�� �ִ´�.
		if(dataList.contains(10)) {
			// ���� ���⿡�� �迭 ���� ���� ������ �濡�� +1 �ڿ� ���� �����Ϸ��� IndexOutOfBoundsException ������ �߻��Ѵ�.
			// ������, ArrayList�� add(index, element)�� ������ �濡�� +1 �ʰ��ص� ���� �߻� ���� �߰� �ȴ�.
			// ��� ������ �濡�� +2 �ʰ��ϸ� ���� �߻�!
			dataList.add(dataList.indexOf(10) + 1, 15);
			System.out.println(dataList);
		} else {
			System.out.println("ã���ô� ���� �����ϴ�.");
		}
		
		// 2. 60�� 600���� �����Ѵ�.
		if(dataList.contains(60)) {
			dataList.set(dataList.indexOf(60), 600);
			System.out.println(dataList);
		} else {
			System.out.println("ã���ô� ���� �����ϴ�.");
		}
		
		// 3. 15�� �����.
		if(dataList.contains(15)) {
			// 1) remove(int index)�� �̿��Ͽ� �����
			//dataList.remove(dataList.indexOf(15));
			// 2) remove(Object o)�� �̿��Ͽ� �����
			dataList.remove(new Integer(15));
			System.out.println(dataList);
		} else {
			System.out.println("ã���ô� ���� �����ϴ�.");
		}
		
		// ====================================================
		System.out.println("\nreplaceAll() �޼��� ����غ���");
		dataList.replaceAll(new UnaryOperator<Integer>() {

			@Override
			public Integer apply(Integer t) {
				return 5;
			}
			
		});
		System.out.println(dataList);
		
	}
}