package com.lec.java.ch9;

public class FrequentlyStringBufferMethodConstructor {

	public static void main(String[] args) {
		// StringBuffer() : 16문자를 담을 수 있는 버퍼를 가진 StringBuffer 인스턴스를 생성한다.
		StringBuffer sb1 = new StringBuffer();
		System.out.println("sb1 : " + sb1);
		
		// StringBuffer(int length) : 지정된 개수의 문자를 담을 수 있는 버퍼를 가진 StringBuffer 인스턴스를 생성한다.
		StringBuffer sb2 = new StringBuffer(10);
		System.out.println("sb2 : " + sb2);
		
		// StringBuffer(String str) : 지정된 문자열 값(str)을 갖는 StringBuffer 인스턴스를 생성한다.
		StringBuffer sb3 = new StringBuffer("Hi");
		System.out.println("sb3 : " + sb3);
		
		// StringBuffer append(boolean b)
		// StringBuffer append(char c)
		// StringBuffer append(char[] str)
		// StringBuffer append(double d)
		// StringBuffer append(float f)
		// StringBuffer append(int i)
		// StringBuffer append(long l)
		// StringBuffer append(Object o)
		// StringBuffer append(String str)
		// : 매개변수로 입력된 값을 문자열로 변환하여 StringBuffer 인스턴스가 저장하고 있는 문자열의 뒤에 덧붙인다.
		StringBuffer sb4 = new StringBuffer("abc");
		StringBuffer sb4_boolean = sb4.append(true);
		sb4.append('d').append(10.0f);
		StringBuffer sb4_string = sb4.append("ABC").append(123);
		System.out.println("sb4 : " + sb4 + ", sb4_boolean : " + sb4_boolean + ", sb4_string : " + sb4_string);
		
		// int capacity() : StringBuffer 인스턴스의 버퍼 크기를 알려준다.
		//					length()는 버퍼에 담긴 문자열의 길이를 알려준다.
		StringBuffer sb5 = new StringBuffer(100);
		sb5.append("abcd");
		int bufferSize = sb5.capacity();
		int stringSize = sb5.length();	// sb에 담긴 문자열은 "abcd"이므로 4가 담긴다.
		System.out.println("sb5 : " + sb5 + ", bufferSize : " + bufferSize + ", stringSize : " + stringSize);
		
		// char charAt(int index) : 지정한 위치(index)에 있는 문자를 반환한다.
		StringBuffer sb6 = new StringBuffer("0123456789");
		char c6 = sb6.charAt(2);
		System.out.println("sb6 : " + sb6 + ", c6 : " + c6);
		
		// StringBuffer delete(int start, int end) : 시작위치(start)부터 끝 위치(end) 사이에 있는 문자를 제거한다.
		//											  단, 끝 위치의 문자는 제외
		StringBuffer sb7 = new StringBuffer("0123456");
		sb7.delete(3, 6);
		System.out.println("sb7 : " + sb7);
		
		// StringBuffer deleteCharAt(int index) : 지정된 위치(index)의 문자를 제거한다.
		StringBuffer sb8 = new StringBuffer("0123456");
		sb8.deleteCharAt(3);
		System.out.println("sb8 : " + sb8);
		
		// StringBuffer insert(int pos, boolean b)
		// StringBuffer insert(int pos, char c)
		// StringBuffer insert(int pos, char[] str)
		// StringBuffer insert(int pos, double d)
		// StringBuffer insert(int pos, float f)
		// StringBuffer insert(int pos, int i)
		// StringBuffer insert(int pos, long l)
		// StringBuffer insert(int pos, Object obj)
		// StringBuffer insert(int pos, String str)
		// : 두번째 매개변수로 받은 값을 문자열로 변환하여 지정된 위치에 추가한다. pos는 0부터 시작
		StringBuffer sb9 = new StringBuffer("0123456");
		sb9.insert(4, '.');
		System.out.println("sb9 : " + sb9);
		
		// int length() : StringBuffer 인스턴스에 저장되어 있는 문자열의 길이를 반환한다.
		StringBuffer sb10 = new StringBuffer("0123456");
		int length = sb10.length();
		System.out.println("sb10 : "+ sb10 + ", length : " + length);
		
		// StringBuffer replace(int start, int ene, String str)
		// : 지정된 범위(start ~ end)의 문자들을 주어진 문자열로 바꾼다.
		//   end 위치의 문자는 범위에 포함되지 않음(start <= x < end)
		StringBuffer sb11 = new StringBuffer("0123456");
		sb11.replace(3, 6, "Ab");	// "345"를 "AB"로 바뀜
		System.out.println("sb11 : " + sb11);
		
		// StringBuffer reverse() : StringBuffer 인스턴스에 저장되어 있는 문자열의 순서를 거꾸로 나열한다.
		StringBuffer sb12 = new StringBuffer("0123456");
		sb12.reverse();
		System.out.println("sb12 : " + sb12);
		
		// void setCharAt(int index, char ch) : 지정된 위치의 문자를 주어진 문자(ch)로 바꾼다.
		StringBuffer sb13 = new StringBuffer("0123456");
		sb13.setCharAt(5, '0');
		System.out.println("sb13 : " + sb13);
		
		// void setLength(int newLength) : 지정된 길이로 문자열의 길이를 변경한다.
		//								      길이를 늘리는 경우에 나머지 빈 공간을 널문자로 채운다.
		StringBuffer sb14_1 = new StringBuffer("0123456");
		sb14_1.setLength(5);
		StringBuffer sb14_2 = new StringBuffer("0123456");
		sb14_2.setLength(10);
		String str14 = sb14_2.toString().trim();
		System.out.println("sb14_1 : " + sb14_1 + ", sb14_2 : " + sb14_2 + ", str14 : " + str14);
		
		// String toString() : StringBuffer 인스턴스의 문자열을 String으로 반환
		StringBuffer sb15 = new StringBuffer("0123456");
		String str15 = sb15.toString();
		System.out.println("sbr15 : " + str15);
		
		// String substring(int start)
		// String substring(int start, int end)
		// : 지정된 범위 내의 문자열을 String으로 뽑아서 반환한다.
		//   시작위치(start)만 지정하면 시작위치부터 문자열 끝까지 뽑아서 반환한다.
		StringBuffer sb16 = new StringBuffer("0123456");
		String str16_1 = sb16.substring(3);
		String str16_2 = sb16.substring(3, 5);
		System.out.println("str16_1 : " + str16_1 + ", str16_2 : " + str16_2);
	} // end main()
	
} // end class