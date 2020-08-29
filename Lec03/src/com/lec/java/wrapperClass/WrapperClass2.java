package com.lec.java.wrapperClass;

public class WrapperClass2 {
	
	public static void main(String[] args) {
		// 다른 타입은 배열로 담을 수 없다.
		// 그러나 아래의 방법을 이용하면 담을 수 있다.
		Object[] datas = {3, 3.0, 'A', "ABC", true};
		
		// 위의 datas들에서 사용된 기술
		// 1. up-casting
		// 2. auto-boxing
		
		// auto-boxing 사용하지 않는다면...!!
		Object[] datasNoAuto = {new Integer(3), new Double(3.0),
				new Character('A'), new String("ABC"), new Boolean(true)};
		
		// 빠른 for문(forEach문, 향상된 for문)을 이용하여 저장된 데이터 출력하기
		System.out.println("빠른 for문 : datas");
		for(Object obj : datas) {
			System.out.print(obj + " ");
		}
		
		System.out.println();
		System.out.println();
		System.out.println("빠른 for문 : datasNoAuto");
		for(Object obj : datasNoAuto) {
			System.out.print(obj + " ");
		}
		
	} // end main()

} // end class