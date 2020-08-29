package com.lec.java.obj;

import java.util.Random;

public class Obj_test {
	
	public static void main(String[] args) {
		// new를 통해 String을 생성하면 Heap 영역에 존재하게 되고
		String str1 = new String("ABC");
		String str2 = new String("ABC");
		// 주소는 다르나
		System.out.println("str1 == str2 : " + (str1 == str2));
		// 내용은 같음
		System.out.println("str1.equals(str2) : " + str1.equals(str2));
		
		// Heap 영역에 무조건 새롭게 생성된다.
		
		// 리터럴을 이용한 경우 constant pool이라는 영역에 존재하게 된다.
		String str3 = "ABC";
		String str4 = "ABC";
		// 주소도 같고
		System.out.println("str3 == str4 : " + (str3 == str4));
		// 내용도 같음
		System.out.println("str3.equals(str4) : " + str3.equals(str4));
		
		// constant pool 영역은 일치하는 값이 있다면 그 값의 주소들을 공유한다.
		// (즉, 새로 만드는 것이 아니라 만들어진 공간의 주소를 공유한다.)
		
		System.out.println("-----------------------------------------");
		System.out.println("str1 == str3 : " + (str1 == str3));
		System.out.println("str1 == str4 : " + (str1 == str4));
		System.out.println("str2 == str3 : " + (str2 == str3));
		System.out.println("str2 == str4 : " + (str2 == str4));
		System.out.println("-----------------------------------------");
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		
		Random r1 = new Random();
		Random r2 = new Random();
		
		System.out.println("-----------------------------------------");
		System.out.println("r1.hashCode() : " + r1.hashCode());
		System.out.println("r2.hashCode() : " + r2.hashCode());

		System.out.println("-----------------------------------------");
		System.out.println("r1.hashCode() : " + r1.toString());
		System.out.println("r2.hashCode() : " + r2.toString());
		
		Object obj = new Object();
		System.out.println("-----------------------------------------");
		System.out.println(obj.hashCode());
		System.out.println(obj.toString());
		
	} // end main()

} // end class