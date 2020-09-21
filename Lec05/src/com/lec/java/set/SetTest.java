package com.lec.java.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {
	public static void main(String[] args) {
		// public interface Set<E> extends Collection<E>
		
		// 왜 Set으로 선언하고 생성은 HashSet으로 생성했을까?
		// Up Casting 이용, HashSet 말고도 다른 Set을 이용할 수 있기 때문에...!
		Set<String> bloodTypeSet = new HashSet<>();
		
		bloodTypeSet.add("A");
		bloodTypeSet.add("B");
		bloodTypeSet.add("O");
		bloodTypeSet.add("AB");
		bloodTypeSet.add("AB");
		bloodTypeSet.add("AB");
		bloodTypeSet.add("AB");
		bloodTypeSet.add("AB");
		bloodTypeSet.add("AB");
		bloodTypeSet.add("AB");
		bloodTypeSet.add("AB");
		bloodTypeSet.add("AB");
		
		System.out.println(bloodTypeSet);
		System.out.println(bloodTypeSet.size());
		bloodTypeSet.remove("AB");
		System.out.println(bloodTypeSet);
		
		System.out.println(bloodTypeSet.contains("A"));
		
		// set에 순서를 부여해야 꺼내올 수 있음, 순서를 부여하는 순간 더이상 set이 아니다!
		// set이 아니면 뭔데? Iterator<String>임.
		Iterator<String> iter = bloodTypeSet.iterator();
		
		System.out.println(bloodTypeSet.size() + "\n");
		//System.out.println(iter.next());
		//System.out.println(iter.next());
		//System.out.println(iter.next());
		//System.out.println(iter.next());	// 에러 : NoSuchElementException
		
		// 안에 얼마나 들어있는지 파악하기 어렵기 때문에 
		// 위의 코드 에러(NoSuchElementException)가 발생 가능성이 높음
		// 즉, 몇 번을 반복해야할지 모를때 아래의 코드를 이용하여 출력하면 
		// NoSuchElementException 에러를 예방 가능
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}