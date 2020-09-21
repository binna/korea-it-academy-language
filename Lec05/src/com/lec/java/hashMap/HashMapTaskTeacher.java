package com.lec.java.hashMap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapTaskTeacher {
	public static void main(String[] args) {
		// HashMap 사용
		// 중국집
		// 메뉴 5개
		// 메뉴판 출력(keySet(), values()사용)
		// 총 가격, 평균 가격
		ArrayList<Integer> prices = new ArrayList<>();
		HashMap<String, Integer> chinaFoodMap = new HashMap<>();
		
		chinaFoodMap.put("짜장면", 3500);
		chinaFoodMap.put("짬뽕", 4000);
		chinaFoodMap.put("탕수육", 8500);
		chinaFoodMap.put("양장피", 8500);
		chinaFoodMap.put("볶음밥", 4500);
		
		Iterator<String> iter1 = chinaFoodMap.keySet().iterator();
		Collection<Integer> col = chinaFoodMap.values();
		
		col.forEach(value -> prices.add(value));
		int cnt = 0;
		while(iter1.hasNext()) {
			String menu = iter1.next();
			System.out.print(menu + " - " + chinaFoodMap.get(menu) + "원" + "\t/\t");
			System.out.println(menu + " - " + prices.get(cnt++) + "원");
		}

		
		System.out.println("=====================================");
		// 한 쌍씩 모두 가져올 때에는 Entry타입으로 사용하고,
		// entrySet()을 사용해준다.
		Iterator<Entry<String, Integer>> iter2 = chinaFoodMap.entrySet().iterator();
		
		while(iter2.hasNext()) {
			// 각각의 next()는 Entry 타입이므로 Key, Value 모두 타입을 지정해주어야 한다.
			// Entry<K, V>
			Entry<String, Integer> entry = iter2.next();
			// getKey() : Key
			// getValue() : Value
			System.out.println(entry.getKey() + " - " + entry .getValue());
		}
	}
}