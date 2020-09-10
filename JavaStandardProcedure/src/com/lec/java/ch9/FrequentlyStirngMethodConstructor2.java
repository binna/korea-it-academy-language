package com.lec.java.ch9;

public class FrequentlyStirngMethodConstructor2 {

	public static void main(String[] args) {
		// int lastIndexOf(int ch) : 지정된 문자 또는 문자코드를 문자열의 오른쪽 끝부터 찾아서 위치(index)를 알려준다.
		//							  못 찾으면 -1을 반환한다.
		String s1 = "java.lang.Object";
		int idx1_1 = s1.lastIndexOf('.');
		int idx1_2 = s1.indexOf('.');
		System.out.println("int idx1_1 = s1.lastIndexOf('.') : " + idx1_1);
		System.out.println("int idx1_2 = s1.indexOf('.') : " + idx1_2);
		
		System.out.println();
		// int lastIndexof(int String str) : 지정된 문자열을 인스턴스의 문자열 끝에서부터 찾아서 위치(index)를 알려준다.
		//									  못 찾으면 -1을 반환한다.
		String s2 = "java.lang.java";
		int idx2_1 = s2.lastIndexOf("java");
		int idx2_2 = s2.indexOf("java");
		System.out.println("int idx2_1 = s2.lastIndexOf(\"java\") : " + idx2_1);
		System.out.println("int idx2_2 = s2.indexOf(\"java\") : " + idx2_2);
		
		System.out.println();
		// int length() : 문자열의 길이를 알려준다.
		String s3 = "Hello3";
		int length3 = s3.length();
		System.out.println("int length3 = s3.length() : " + length3);
		
		System.out.println();
		// String replace(char old, char nw) : 문자열 중의 문자(old)를 새로운 문자(nw)로 바꾼 문자열을 반환한다.
		String s4_old = "Hello4";
		String s4_nw = s4_old.replace('H', 'C');
		System.out.println("String s4_nw = s4_old.replace('H', 'C') : " + s4_nw);
		
		System.out.println();
		// String replace(CharSequence old, CharSequence nw) : 문자열 중의 문자열(old)을 새로운 문자열(nw)로 모두 바뀐 문자열을 반환한다.
		String s5_old = "Hellollo5";
		String s5_nw = s5_old.replace("ll", "LL");
		System.out.println("String s5_nw = s5_old.replace(\"ll\", \"LL\") : " + s5_nw);
		
		System.out.println();
		// String replaceAll(String regex, String replacement) : 문자열 중에서 지정한 문자열(regex)과 일치하는 것을 
		//														  새로운 문자열(replacement)로 모두 변경한다.
		String s_reg6 = "AABBAABB";
		String s_replacement6 = s_reg6.replaceAll("BB", "bb");
		System.out.println("String s_replacement6 = s_reg6.replaceAll(\"BB\", \"bb\") : " + s_replacement6);

		System.out.println();
		// String replaceFirst(String regex, String replacement) : 문자열을 지정된 분리자(regex)로 나누어 문자열 배열에 담아 반환한다.
		String s_reg7 = "AABBAABB";
		String s_replacement7 = s_reg7.replaceFirst("BB", "bb");
		System.out.println("String s_replacement7 = s_reg7.replaceFirst(\"BB\", \"bb\") : " + s_replacement7);
		
		System.out.println();
		// String[] split(String regex) : 문자열을 지정된 분리자(regex)로 나누어 문자열 배열에 담아 반환한다.
		String animals8 = "dog,cat,bear";
		String[] arr8 = animals8.split(",");
		System.out.println("String[] arr8 = animals8.split(\",\")");
		for(int i = 0; i < arr8.length; i++) {
			System.out.println("arr8[" + i + "] : " + arr8[i]);
		}
		
		System.out.println();
		// String[] split(String regex, int limit) : 문자열을 지정된 분리자(regex)로 나누어 문자열배열에 담아 반환한다.
		//											  단, 문자열 전체를 지정된 수(limit)로 자른다.
		String animals9 = "dog,cat,bear";
		String[] arr9 = animals9.split(",", 2);
		System.out.println("String[] arr9 = animals9.split(animals9, 2)");
		for(int i = 0; i < arr9.length; i++) {
			System.out.println("arr9[" + i + "] : " + arr9[i]);
		}
		
		System.out.println();
		// boolean startWith(String prefix) : 주어진 문자열(prefix)로 시작하는지 검사한다.
		String s10 = "java.lang,Object";
		boolean b10_1 = s10.startsWith("java");
		boolean b10_2 = s10.startsWith("lang");
		System.out.println("boolean b10_1 = s10.startsWith(\"java\") : " + b10_1);
		System.out.println("boolean b10_2 = s10.startsWith(\"lang\") : " + b10_2);
		
		System.out.println();
		// boolean substring(int begin)
		// boolean substring(int begin, int end)
		// : 주어진 시작위치(begin)부터 끝 위치(end) 범위에 포함된 문자열을 얻는다.
		//   이 때, 시작위치의 문자는 범위에 포함되지만, 끝 위치의 문자는 포함되지 않는다.(begin <= x < end)
		String s11 = "java.lang.Object";
		String c11 = s11.substring(10);
		String p11 = s11.substring(5, 9);
		System.out.println("String c11 = s11.substring(10) : " + c11);
		System.out.println("String p11 = s11.substring(5, 9) : " + p11);
		
		System.out.println();
		// String toLowerCase() : String 인스턴스에 저장되어 있는 모든 문자열을 소문자로 변환하여 반환한다.
		String s12_1 = "HELLO12";
		String s12_2 = s12_1.toLowerCase();
		System.out.println("String s12_2 = s12_1.toLowerCase() : " + s12_2);
		
		System.out.println();
		// String toString() : String 인스턴스에 저장되어 있는 문자열을 반환한다.
		String s13_1 = "Hollo13";
		String s13_2 = s13_1.toString();
		System.out.println("String s13_2 = s13_1.toString() : " + s13_2);

		System.out.println();
		// String toUpperCase() : String 인스턴스에 저장되어 있는 모든 문자열을 대문자로 변환하여 반환한다.
		String s14_1 = "hello14";
		String s14_2 = s14_1.toUpperCase();
		System.out.println("String s14_2 = s14_1.toUpperCase() : " + s14_2);
		
		System.out.println();
		// String trim() : 문자열의 왼쪽 끝과 오늘쪽 끝에 있는 공백을 없앤 결과를 반환한다.
		// 				      이 때, 문자열 중간에 있는 공백은 제거되지 않는다.
		String s15_1 = "            Hello World15!            ";
		String s15_2 = s15_1.trim();
		System.out.println("String s15_2 = s15_1.trim() : " + s15_2);
		
		System.out.println();
		// static String valueOf(boolean b)
		// static String valueOf(char c)
		// static String valueOf(int i)
		// static String valueOf(long l)
		// static String valueOf(float f)
		// static String valueOf(double d)
		// static String valueOf(Object o)
		// : 지정된 값을 문자열로 반환한다. 참조변수의 경우, toString()을 호출한 결과를 반환한다.
		System.out.println("String.valueOf(true) : " + String.valueOf(true));
		System.out.println("String.valueOf('a') : " + String.valueOf('a'));
		System.out.println("String.valueOf(100) : " + String.valueOf(100));
		System.out.println("String.valueOf(100L) : " + String.valueOf(100L));
		System.out.println("String.valueOf(100f) : " + String.valueOf(100f));
		System.out.println("String.valueOf(100.0) : " + String.valueOf(100.0));
		System.out.println("String.valueOf(new java.util.Date()) : " + String.valueOf(new java.util.Date()));
		
	} // end main()
	
} // end class