package com.lec.java.ch11;

import java.util.*;

public class ArrayListEx1 {
	
	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1: " + list1);
		System.out.println("list2: " + list2);
		System.out.println();
	} // end print()

	public static void main(String[] args) {
		// 크기가 10인 ArrayList를 생성
		ArrayList list1 = new ArrayList(10);
		
		// list1에 데이터 5, 4, 2, 0, 1, 3 추가
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		
		// subList를 이용, list1의 첫번째 방 ~ 네번째 방의 값(4, 2, 0)을 저장한 list2를 생성
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		print(list1, list2);
		
		// Collections.sort를 이용, list1과 list2를 정렬
		Collections.sort(list1);
		Collections.sort(list2);
		print(list1, list2);
		
		// containsAll를 이용, list2가 list1에 포함되어 있는지 확인
		// list1이 list2의 모든 요소를 포함하고 있을 때만 true
		System.out.println("list1.containsAll(list2) : " + list1.containsAll(list2)); 
		
		// list2에 B와 C, 세번째 방에 A를 추가
		list2.add("B");
		list2.add("C");
		list2.add(3, "A");
		print(list1, list2);
		
		// set을 이용, 두번째 방의 값을 "AA"로 변경
		list2.set(2, "AA");
		print(list1, list2);
		
		// list1에 저장된 객체 중에서 list2과 공통된 것들만 남기고 나머지는 삭제
		System.out.println("list1.retainAll(list2) : " + list1.retainAll(list2));
		print(list1, list2);
		
		// list2에서 list1에 포함된 객체들을 삭제
		for(int i = list2.size() - 1; i >= 0; i--) {
			if(list1.contains(list2.get(i))) {
				list2.remove(i);
			}
		}
		print(list1, list2);
	} // end main()
	
} // end class