package com.lec.java.ch9;

public class FrequentlyStirngMethodConstructor1 {

	public static void main(String[] args) {
		// String(String s) : 주어진 문자열(s)을 갖는 String 인스턴스를 생성한다.
		String s1 = new String("Hello1");
		System.out.println("String s1 = new String(\"Hello1\") : " + s1);
		
		System.out.println();
		// String(char[] value) : 주어진 문자열(value)을 갖는 String 인스턴스를 생성한다.
		char[] c2 = {'H', 'e', 'l', 'l', 'o', '2'};
		String s2 = new String(c2);
		System.out.println("String s2 = new String(c2) : " + s2);
		
		System.out.println();
		// String(StringBuffer buf) : StringButter 인스턴스가 갖고 있는 문자열과 같은 내용의 String 인스턴스를 생성한다.
		StringBuffer sb3 = new StringBuffer("Hello3");
		String s3 = new String(sb3);
		System.out.println("String s3 = new String(sb3) : " + s3);
		
		System.out.println();
		// char charAt(int index) : 지정된 위치(index)에 있는 문자를 알려준다. index는 0부터 시작
		String s4 = "Hello4";
		char c4 = s4.charAt(1);
		System.out.println("char c4 = s4.charAt(1) : " + c4);
		
		System.out.println();
		// int compareTo(String str) : 문자열(str)과 사전 순서로 비교한다. 같으면 0을, 사전 순으로 이전이면 음수를, 이후면 양수를 반환한다.
		int i5_1 = "aaa".compareTo("aaa");
		int i5_2 = "aaa".compareTo("bbb");
		int i5_3 = "bbb".compareTo("aaa");
		System.out.println("i5_1 : " + i5_1 + ", i5_2 : " + i5_2 + ", i5_3 : " + i5_3);
		
		System.out.println();
		// String concat(String str) : 문자열(str)을 뒤에 덧붙인다.
		String s6_1 = "Hello6";
		String s6_2 = s6_1.concat(" World6");
		System.out.println("String s6_2 = s6_1.concat(\" World6\") : " + s6_2);
		
		System.out.println();
		// boolean contains(CharSequence s) : 지정된 문자열(s)이 포함되었는지 검사한다.
		String s7 = "abcdfg";
		boolean b7 = s7.contains("bc");
		System.out.println("boolean b7 = s7.contains(\"bc\") : " + b7);
		
		System.out.println();
		// boolean endsWith(String suffix) : 지정된 문자열(suffix)로 끝나는지 검사한다.
		String file8 = "Hollo8.txt";
		boolean b8 = file8.endsWith("txt");
		System.out.println("boolean b8 = file8.endsWith(\"txt\") : " + b8);
		
		System.out.println();
		// boolean equals(Object obj) : 매개변수로 받은 문자열(obj)과 String 인스턴스의 문자열을 비교한다. 
		//								obj가 String이 아니거나 문자열이 다르면 false를 반환한다.
		String s9 = "hello9";
		boolean b9_1 = s9.equals("hello9");
		boolean b9_2 = s9.equals("HELLO9");
		System.out.println("boolean b9_1 = s9.equals(\"hello9\") : " + b9_1);
		System.out.println("boolean b9_2 = s9.equals(\"HELLO9\") : " + b9_2);
		
		System.out.println();
		// boolean equalsIgnoreCase(String str) : 문자열과 String 인스턴스의 문자열을 대소문자 구분 없이 비교한다.
		String s10 = "hello10";
		boolean b10_1 = s10.equalsIgnoreCase("hello10");
		boolean b10_2 = s10.equalsIgnoreCase("HELLO10");
		System.out.println("boolean b10_1 = s10.equalsIgnoreCase(\"hello10\") : " + b10_1);
		System.out.println("boolean b10_2 = s10.equalsIgnoreCase(\"HELLO10\") : " + b10_2);
		
		System.out.println();
		// int indexOf(int ch) : 주어진 문자(ch)가 문자열에 존재하는지 확인하여 위치(index)를 알려준다. 못찾으면 -1을 반환한다.
		//						 index는 0부터 시작
		String s11 = "Hello11";
		int idx11_1 = s11.indexOf('o');
		int idx11_2 = s11.indexOf('k');
		System.out.println("int idx11_1 = s11.indexOf('o') : " + idx11_1);
		System.out.println("int idx11_2 = s11.indexOf('k') : " + idx11_2);
		
		System.out.println();
		// int indexOf(int ch, int pos) : 주어진 문자(ch)가 문자열에 존재하는지 지정된 위치(pos)부터 확인하여 위치(index)를 알려준다.
		//								    못 찾으면 -1을 반환한다. index는 0부터 시작
		String s12 = "Hello12";
		int idx12_1 = s12.indexOf('e', 0);
		int idx12_2 = s12.indexOf('e', 2);
		System.out.println("int idx12_1 = s12.indexOf('e', 0) : " + idx12_1);
		System.out.println("int idx12_2 = s12.indexOf('e', 2) : " + idx12_2);
		
		System.out.println();
		// int indexOf(String str) : 주어진 문자열이 존재하는지 확인하며 그 위치(index)를 알려준다. 없으면 -1을 반환한다.
		//							 index는 0부터 시작
		String s13 = "abcdef";
		int idx13 = s13.indexOf("cd");
		System.out.println("int idx13 = s13.indexOf(\"cd\") : " + idx13);
		
		System.out.println();
		// String inter() : 문자열을 상수풀(constant pool)에 등록한다. 이미 상수풀에 같은 내용의 문자열이 있을 경우 그 문자열의 주소값을 반환한다.
		String s14_1 = new String("abc");
		String s14_2 = new String("abc");
		boolean b14_1 = (s14_1 == s14_2);
		boolean b14_2 = s14_1.equals(s14_2);
		boolean b14_3 = (s14_1.intern() == s14_2.intern());
		System.out.println("boolean b14_1 = (s14_1 == s14_2) : " + b14_1);
		System.out.println("boolean b14_2 = s14_1.equals(s14_2) : " + b14_2);
		System.out.println("boolean b14_3 = (s14_1.intern() == s14_2.intern()) : " + b14_3);
	} // end main()
	
} // end class