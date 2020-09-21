package com.lec.java.arrayList;

import java.util.ArrayList;

public class ArrayListTaskMe {
	
	public static void main(String[] args) {
		// 문제
		// 1. 10 다음에 15를 넣는다.
		// 2. 60을 600으로 변경한다.
		// 3. 15를 지운다.
		System.out.println("첫번째 문풀===========================================");
		ArrayList<Integer> dataList1 =  new ArrayList<>();
		dataList1.add(10);
		dataList1.add(80);
		dataList1.add(90);
		dataList1.add(30);
		dataList1.add(20);
		dataList1.add(50);
		dataList1.add(40);
		dataList1.add(60);
		System.out.println("dataList1 : " + dataList1);
		
		// 1. 10 다음에 15를 넣는다.
		int index = dataList1.indexOf(10);
		if(!(index == -1)) {
			dataList1.add((index + 1), 15);
		}
		System.out.println(dataList1);
		
		// 2. 60을 600으로 변경한다.
		index = dataList1.indexOf(60);
		if(!(index == -1)) {
			dataList1.set(index, 600); 
		}
		System.out.println(dataList1);
		
		// 3. 15를 지운다.
		index = dataList1.indexOf(15);
		if(!(index == -1)) {
			dataList1.remove(index);
		}
		System.out.println(dataList1);
		
		System.out.println("\n두번째 문풀(검색 결과가 여러 개일 때)==========================");
		ArrayList<Integer> dataList2 =  new ArrayList<>();
		dataList2.add(10);
		dataList2.add(80);
		dataList2.add(90);
		dataList2.add(60);
		dataList2.add(30);
		dataList2.add(10);
		dataList2.add(60);
		dataList2.add(20);
		dataList2.add(50);
		dataList2.add(40);
		dataList2.add(10);
		dataList2.add(60);
		System.out.println("dataList2 : " + dataList2);
		
		// 1. 10 다음에 15를 넣는다.
		for(int i = 0; i < dataList2.size(); i++) {
			if(dataList2.get(i) == 10) {
				dataList2.add((i + 1), 15);
			}
		}
		System.out.println(dataList2);
		
		// 2. 60을 600으로 변경한다.
		for(int i = 0; i < dataList2.size(); i++) {
			if(dataList2.get(i) == 60) {
				dataList2.set(i, 600);
			}
		}
		System.out.println(dataList2);
		
		// 3. 15를 지운다.
		for(int i = 0; i < dataList2.size(); i++) {
			if(dataList2.get(i) == 15) {
				dataList2.remove(i);
			}
		}
		System.out.println(dataList2);
		
		System.out.println("\nremove(int index)말고 remove(Object O) 메서드 이용하기===");
		dataList2.add(90);
		dataList2.add(90);
		dataList2.add(90);
		System.out.println(dataList2);
		while(dataList2.remove((Integer)90)) {;}
		System.out.println(dataList2);
		
		System.out.println("\n프로그램 종료");
	}

}