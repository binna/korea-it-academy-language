package com.lec.java.ch9;

public class FrequentlyStirngMethodConstructor {

	public static void main(String[] args) {
		// String(String s) : �־��� ���ڿ�(s)�� ���� String �ν��Ͻ��� �����Ѵ�.
		String s1 = new String("Hello1");
		System.out.println("String s1 = new String(\"Hello1\") : " + s1);
		
		// String(char[] value) : �־��� ���ڿ�(value)�� ���� String �ν��Ͻ��� �����Ѵ�.
		char[] c2 = {'H', 'e', 'l', 'l', 'o', '2'};
		String s2 = new String(c2);
		System.out.println("String s2 = new String(c2) : " + s2);
		
		// String(StringBuffer buf) : StringButter �ν��Ͻ��� ���� �ִ� ���ڿ��� ���� ������ String �ν��Ͻ��� �����Ѵ�.
		StringBuffer sb3 = new StringBuffer("Hello3");
		String s3 = new String(sb3);
		System.out.println("String s3 = new String(sb3) : " + s3);
		
		// char charAt(int index) : ������ ��ġ(index)�� �ִ� ���ڸ� �˷��ش�, index�� 0���� ����
		String s4 = "Hello4";
		char c4 = s4.charAt(1);
		System.out.println("char c4 = s4.charAt(1) : " + c4);
		
		// int compareTo(String str) : ���ڿ�(str)�� ���� ������ ���Ѵ�. ������ 0��, ���� ������ �����̸� ������, ���ĸ� ����� ��ȯ�Ѵ�.
		int i5_1 = "aaa".compareTo("aaa");
		int i5_2 = "aaa".compareTo("bbb");
		int i5_3 = "bbb".compareTo("aaa");
		System.out.println("i5_1 : " + i5_1 + ", i5_2 : " + i5_2 + ", i5_3 : " + i5_3);
		
		// String concat(String str) : ���ڿ�(str)�� �ڿ� �����δ�.
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
