package com.lec.java.ch9;

public class FrequentlyStringBufferMethodConstructor {

	public static void main(String[] args) {
		// StringBuffer() : 16���ڸ� ���� �� �ִ� ���۸� ���� StringBuffer �ν��Ͻ��� �����Ѵ�.
		StringBuffer sb1 = new StringBuffer();
		System.out.println("sb1 : " + sb1);
		
		// StringBuffer(int length) : ������ ������ ���ڸ� ���� �� �ִ� ���۸� ���� StringBuffer �ν��Ͻ��� �����Ѵ�.
		StringBuffer sb2 = new StringBuffer(10);
		System.out.println("sb2 : " + sb2);
		
		// StringBuffer(String str) : ������ ���ڿ� ��(str)�� ���� StringBuffer �ν��Ͻ��� �����Ѵ�.
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
		// : �Ű������� �Էµ� ���� ���ڿ��� ��ȯ�Ͽ� StringBuffer �ν��Ͻ��� �����ϰ� �ִ� ���ڿ��� �ڿ� �����δ�.
		StringBuffer sb4 = new StringBuffer("abc");
		StringBuffer sb4_boolean = sb4.append(true);
		sb4.append('d').append(10.0f);
		StringBuffer sb4_string = sb4.append("ABC").append(123);
		System.out.println("sb4 : " + sb4 + ", sb4_boolean : " + sb4_boolean + ", sb4_string : " + sb4_string);
		
		// int capacity() : StringBuffer �ν��Ͻ��� ���� ũ�⸦ �˷��ش�.
		//					length()�� ���ۿ� ��� ���ڿ��� ���̸� �˷��ش�.
		StringBuffer sb5 = new StringBuffer(100);
		sb5.append("abcd");
		int bufferSize = sb5.capacity();
		int stringSize = sb5.length();	// sb�� ��� ���ڿ��� "abcd"�̹Ƿ� 4�� ����.
		System.out.println("sb5 : " + sb5 + ", bufferSize : " + bufferSize + ", stringSize : " + stringSize);
		
		// char charAt(int index) : ������ ��ġ(index)�� �ִ� ���ڸ� ��ȯ�Ѵ�.
		StringBuffer sb6 = new StringBuffer("0123456789");
		char c6 = sb6.charAt(2);
		System.out.println("sb6 : " + sb6 + ", c6 : " + c6);
		
		// StringBuffer delete(int start, int end) : ������ġ(start)���� �� ��ġ(end) ���̿� �ִ� ���ڸ� �����Ѵ�.
		//											  ��, �� ��ġ�� ���ڴ� ����
		StringBuffer sb7 = new StringBuffer("0123456");
		sb7.delete(3, 6);
		System.out.println("sb7 : " + sb7);
		
		// StringBuffer deleteCharAt(int index) : ������ ��ġ(index)�� ���ڸ� �����Ѵ�.
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
		// : �ι�° �Ű������� ���� ���� ���ڿ��� ��ȯ�Ͽ� ������ ��ġ�� �߰��Ѵ�. pos�� 0���� ����
		StringBuffer sb9 = new StringBuffer("0123456");
		sb9.insert(4, '.');
		System.out.println("sb9 : " + sb9);
		
		// int length() : StringBuffer �ν��Ͻ��� ����Ǿ� �ִ� ���ڿ��� ���̸� ��ȯ�Ѵ�.
		StringBuffer sb10 = new StringBuffer("0123456");
		int length = sb10.length();
		System.out.println("sb10 : "+ sb10 + ", length : " + length);
		
		// StringBuffer replace(int start, int ene, String str)
		// : ������ ����(start ~ end)�� ���ڵ��� �־��� ���ڿ��� �ٲ۴�.
		//   end ��ġ�� ���ڴ� ������ ���Ե��� ����(start <= x < end)
		StringBuffer sb11 = new StringBuffer("0123456");
		sb11.replace(3, 6, "Ab");	// "345"�� "AB"�� �ٲ�
		System.out.println("sb11 : " + sb11);
		
		// StringBuffer reverse() : StringBuffer �ν��Ͻ��� ����Ǿ� �ִ� ���ڿ��� ������ �Ųٷ� �����Ѵ�.
		StringBuffer sb12 = new StringBuffer("0123456");
		sb12.reverse();
		System.out.println("sb12 : " + sb12);
		
		// void setCharAt(int index, char ch) : ������ ��ġ�� ���ڸ� �־��� ����(ch)�� �ٲ۴�.
		StringBuffer sb13 = new StringBuffer("0123456");
		sb13.setCharAt(5, '0');
		System.out.println("sb13 : " + sb13);
		
		// void setLength(int newLength) : ������ ���̷� ���ڿ��� ���̸� �����Ѵ�.
		//								      ���̸� �ø��� ��쿡 ������ �� ������ �ι��ڷ� ä���.
		StringBuffer sb14_1 = new StringBuffer("0123456");
		sb14_1.setLength(5);
		StringBuffer sb14_2 = new StringBuffer("0123456");
		sb14_2.setLength(10);
		String str14 = sb14_2.toString().trim();
		System.out.println("sb14_1 : " + sb14_1 + ", sb14_2 : " + sb14_2 + ", str14 : " + str14);
		
		// String toString() : StringBuffer �ν��Ͻ��� ���ڿ��� String���� ��ȯ
		StringBuffer sb15 = new StringBuffer("0123456");
		String str15 = sb15.toString();
		System.out.println("sbr15 : " + str15);
		
		// String substring(int start)
		// String substring(int start, int end)
		// : ������ ���� ���� ���ڿ��� String���� �̾Ƽ� ��ȯ�Ѵ�.
		//   ������ġ(start)�� �����ϸ� ������ġ���� ���ڿ� ������ �̾Ƽ� ��ȯ�Ѵ�.
		StringBuffer sb16 = new StringBuffer("0123456");
		String str16_1 = sb16.substring(3);
		String str16_2 = sb16.substring(3, 5);
		System.out.println("str16_1 : " + str16_1 + ", str16_2 : " + str16_2);
	} // end main()
	
} // end class