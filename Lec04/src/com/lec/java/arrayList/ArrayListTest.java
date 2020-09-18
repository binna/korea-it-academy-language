package com.lec.java.arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest {

	public static void main(String[] args) {
		// ArrayList는 주로 접미사에 List를 붙이거나 복수형으로 만듦.
		// 예) dataList 혹은 datas
		ArrayList<Integer> dataList = new ArrayList<>();
		
		System.out.println("dataList.size() : " + dataList.size());
		dataList.add(10);
		dataList.add(80);
		dataList.add(90);
		dataList.add(30);
		dataList.add(20);
		dataList.add(50);
		dataList.add(40);
		System.out.println("dataList.size() : " + dataList.size());
		
		// for문을 이용하여 출력하기
		for(int i = 0; i < dataList.size(); i++) {
			System.out.println(dataList.get(i));
		}
		// for문을 이용하여 출력해도 되나 
		// 컬렉션은 toString()을 재정의했기 때문에 
		// 위에 번거로운 for문 대신 toString()를 사용하면 편리하게 출력할 수 있다.
		System.out.println(dataList);
		
		// Collection : 인터페이스
		// Collections : 클래스
		Collections.sort(dataList);
		System.out.println(dataList);
		
		Collections.shuffle(dataList);
		System.out.println(dataList);
	}
	
}