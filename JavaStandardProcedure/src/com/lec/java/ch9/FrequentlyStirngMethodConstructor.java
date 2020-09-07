package com.lec.java.ch9;

public class FrequentlyStirngMethodConstructor {

	public static void main(String[] args) {
		// String(String s) : 주어진 문자열(s)을 갖는 String 인스턴스를 생성한다.
		String s1 = new String("Hello1");
		System.out.println("String s1 = new String(\"Hello1\") : " + s1);
		
		// String(char[] value) : 주어진 문자열(value)을 갖는 String 인스턴스를 생성한다.
		char[] c2 = {'H', 'e', 'l', 'l', 'o', '2'};
		String s2 = new String(c2);
		System.out.println("String s2 = new String(c2) : " + s2);
		
		// String(StringBuffer buf) : StringButter 인스턴스가 갖고 있는 문자열과 같은 내용의 String 인스턴스를 생성한다.
		StringBuffer sb3 = new StringBuffer("Hello3");
		String s3 = new String(sb3);
		System.out.println("String s3 = new String(sb3) : " + s3);
		
		// char charAt(int index) : 지정된 위치(index)에 있는 문자를 알려준다, index는 0부터 시작
		String s4 = "Hello4";
		char c4 = s4.charAt(1);
		System.out.println("char c4 = s4.charAt(1) : " + c4);
		
		// int compareTo(String str) : 문자열(str)과 사전 순서로 비교한다. 같으면 0을, 사전 순으로 이전이면 음수를, 이후면 양수를 반환한다.
		int i5_1 = "aaa".compareTo("aaa");
		int i5_2 = "aaa".compareTo("bbb");
		int i5_3 = "bbb".compareTo("aaa");
		System.out.println("i5_1 : " + i5_1 + ", i5_2 : " + i5_2 + ", i5_3 : " + i5_3);
		
		// String concat(String str) : 문자열(str)을 뒤에 덧붙인다.
		String s6_1 = "Hello6";
		String s6_2 = s6_1.concat(" World6");
		System.out.println("String s6_2 = s6_1.concat(\" World6\") : " + s6_2);
		
		// boolean contains
		// boolean
		// boolean
		// boolean
		
		// int 
		// int 
		// int
		
		// String
		
	}
}
