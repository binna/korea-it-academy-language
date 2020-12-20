package com.lec.java.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.UnaryOperator;

public class ArrayListTaskTeacher {

	public static void main(String[] args) {
		// 문제
		// 1. 10 다음에 15를 넣는다.
		// 2. 60을 600으로 변경한다.
		// 3. 15를 지운다.
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
		// 1. 10 다음에 15를 넣는다.
		if(dataList.contains(10)) {
			// 원래 여기에서 배열 같은 경우는 마지막 방에서 +1 뒤에 값을 대입하려면 IndexOutOfBoundsException 에러가 발생한다.
			// 하지만, ArrayList의 add(index, element)는 마지막 방에서 +1 초과해도 에러 발생 없이 추가 된다.
			// 대신 마지막 방에서 +2 초과하면 에러 발생!
			dataList.add(dataList.indexOf(10) + 1, 15);
			System.out.println(dataList);
		} else {
			System.out.println("찾으시는 값이 없습니다.");
		}
		
		// 2. 60을 600으로 변경한다.
		if(dataList.contains(60)) {
			dataList.set(dataList.indexOf(60), 600);
			System.out.println(dataList);
		} else {
			System.out.println("찾으시는 값이 없습니다.");
		}
		
		// 3. 15를 지운다.
		if(dataList.contains(15)) {
			// 1) remove(int index)를 이용하여 지우기
			//dataList.remove(dataList.indexOf(15));
			// 2) remove(Object o)를 이용하여 지우기
			dataList.remove(new Integer(15));
			System.out.println(dataList);
		} else {
			System.out.println("찾으시는 값이 없습니다.");
		}
		
		// ====================================================
		System.out.println("\nreplaceAll() 메서드 사용해보기");
		dataList.replaceAll(new UnaryOperator<Integer>() {

			@Override
			public Integer apply(Integer t) {
				return 5;
			}
			
		});
		System.out.println(dataList);
	}
	
}