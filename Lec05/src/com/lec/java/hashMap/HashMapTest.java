package com.lec.java.hashMap;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapTest {
	public static void main(String[] args) {
		HashMap<String, Integer> fruitMap = new HashMap<>();
		
		fruitMap.put("사과", 2000); 
		fruitMap.put("배", 2500); 
		fruitMap.put("자두", 1500); 
		fruitMap.put("수박", 8000); 
		System.out.println(fruitMap.get("사과"));
		System.out.println(fruitMap.get("사과") + 9);
		System.out.println(fruitMap);	// 전체적으로 리스트를 출력해보면 
										// HashMap도 순서가 없다는 것을 알 수 있다.
										// 순서가 있다고 오해할 수 있으나 입력한 순서로 출력이 되지 않았다.
		
		// Key만 필요할때 : keySet().iterator();
		//       리턴값 : Set<String>.Iterator<String> 
		Iterator<String> iter = fruitMap.keySet().iterator();
		while(iter.hasNext()) {
			System.out.println("과일 이름 : " + iter.next());
		}
		
		int total = 0;
		double avg = 0.0;
		// Value만 필요할때 : values();
		//         리턴값 : Collection<Integer>
		for(int price : fruitMap.values()) {
			System.out.println("과일 가격 : " + price + "원");
			total += price;
		}
		avg = Double.parseDouble(String.format("%.2f", (double)total / fruitMap.size()));
		System.out.println("과일 총 가격 : " + total + "원");
		System.out.println("과일 평균 가격 : " + avg + "원");
	}
}