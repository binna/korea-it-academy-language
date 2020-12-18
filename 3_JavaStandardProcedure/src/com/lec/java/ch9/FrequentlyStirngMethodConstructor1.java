package com.lec.java.ch9;

public class FrequentlyStirngMethodConstructor1 {

	public static void main(String[] args) {
		// String(String s) : �־��� ���ڿ�(s)�� ���� String �ν��Ͻ��� �����Ѵ�.
		String s1 = new String("Hello1");
		System.out.println("String s1 = new String(\"Hello1\") : " + s1);
		
		System.out.println();
		// String(char[] value) : �־��� ���ڿ�(value)�� ���� String �ν��Ͻ��� �����Ѵ�.
		char[] c2 = {'H', 'e', 'l', 'l', 'o', '2'};
		String s2 = new String(c2);
		System.out.println("String s2 = new String(c2) : " + s2);
		
		System.out.println();
		// String(StringBuffer buf) : StringButter �ν��Ͻ��� ���� �ִ� ���ڿ��� ���� ������ String �ν��Ͻ��� �����Ѵ�.
		StringBuffer sb3 = new StringBuffer("Hello3");
		String s3 = new String(sb3);
		System.out.println("String s3 = new String(sb3) : " + s3);
		
		System.out.println();
		// char charAt(int index) : ������ ��ġ(index)�� �ִ� ���ڸ� �˷��ش�. index�� 0���� ����
		String s4 = "Hello4";
		char c4 = s4.charAt(1);
		System.out.println("char c4 = s4.charAt(1) : " + c4);
		
		System.out.println();
		// int compareTo(String str) : ���ڿ�(str)�� ���� ������ ���Ѵ�. ������ 0��, ���� ������ �����̸� ������, ���ĸ� ����� ��ȯ�Ѵ�.
		int i5_1 = "aaa".compareTo("aaa");
		int i5_2 = "aaa".compareTo("bbb");
		int i5_3 = "bbb".compareTo("aaa");
		System.out.println("i5_1 : " + i5_1 + ", i5_2 : " + i5_2 + ", i5_3 : " + i5_3);
		
		System.out.println();
		// String concat(String str) : ���ڿ�(str)�� �ڿ� �����δ�.
		String s6_1 = "Hello6";
		String s6_2 = s6_1.concat(" World6");
		System.out.println("String s6_2 = s6_1.concat(\" World6\") : " + s6_2);
		
		System.out.println();
		// boolean contains(CharSequence s) : ������ ���ڿ�(s)�� ���ԵǾ����� �˻��Ѵ�.
		String s7 = "abcdfg";
		boolean b7 = s7.contains("bc");
		System.out.println("boolean b7 = s7.contains(\"bc\") : " + b7);
		
		System.out.println();
		// boolean endsWith(String suffix) : ������ ���ڿ�(suffix)�� �������� �˻��Ѵ�.
		String file8 = "Hollo8.txt";
		boolean b8 = file8.endsWith("txt");
		System.out.println("boolean b8 = file8.endsWith(\"txt\") : " + b8);
		
		System.out.println();
		// boolean equals(Object obj) : �Ű������� ���� ���ڿ�(obj)�� String �ν��Ͻ��� ���ڿ��� ���Ѵ�. 
		//								obj�� String�� �ƴϰų� ���ڿ��� �ٸ��� false�� ��ȯ�Ѵ�.
		String s9 = "hello9";
		boolean b9_1 = s9.equals("hello9");
		boolean b9_2 = s9.equals("HELLO9");
		System.out.println("boolean b9_1 = s9.equals(\"hello9\") : " + b9_1);
		System.out.println("boolean b9_2 = s9.equals(\"HELLO9\") : " + b9_2);
		
		System.out.println();
		// boolean equalsIgnoreCase(String str) : ���ڿ��� String �ν��Ͻ��� ���ڿ��� ��ҹ��� ���� ���� ���Ѵ�.
		String s10 = "hello10";
		boolean b10_1 = s10.equalsIgnoreCase("hello10");
		boolean b10_2 = s10.equalsIgnoreCase("HELLO10");
		System.out.println("boolean b10_1 = s10.equalsIgnoreCase(\"hello10\") : " + b10_1);
		System.out.println("boolean b10_2 = s10.equalsIgnoreCase(\"HELLO10\") : " + b10_2);
		
		System.out.println();
		// int indexOf(int ch) : �־��� ����(ch)�� ���ڿ��� �����ϴ��� Ȯ���Ͽ� ��ġ(index)�� �˷��ش�. ��ã���� -1�� ��ȯ�Ѵ�.
		//						 index�� 0���� ����
		String s11 = "Hello11";
		int idx11_1 = s11.indexOf('o');
		int idx11_2 = s11.indexOf('k');
		System.out.println("int idx11_1 = s11.indexOf('o') : " + idx11_1);
		System.out.println("int idx11_2 = s11.indexOf('k') : " + idx11_2);
		
		System.out.println();
		// int indexOf(int ch, int pos) : �־��� ����(ch)�� ���ڿ��� �����ϴ��� ������ ��ġ(pos)���� Ȯ���Ͽ� ��ġ(index)�� �˷��ش�.
		//								    �� ã���� -1�� ��ȯ�Ѵ�. index�� 0���� ����
		String s12 = "Hello12";
		int idx12_1 = s12.indexOf('e', 0);
		int idx12_2 = s12.indexOf('e', 2);
		System.out.println("int idx12_1 = s12.indexOf('e', 0) : " + idx12_1);
		System.out.println("int idx12_2 = s12.indexOf('e', 2) : " + idx12_2);
		
		System.out.println();
		// int indexOf(String str) : �־��� ���ڿ��� �����ϴ��� Ȯ���ϸ� �� ��ġ(index)�� �˷��ش�. ������ -1�� ��ȯ�Ѵ�.
		//							 index�� 0���� ����
		String s13 = "abcdef";
		int idx13 = s13.indexOf("cd");
		System.out.println("int idx13 = s13.indexOf(\"cd\") : " + idx13);
		
		System.out.println();
		// String inter() : ���ڿ��� ���Ǯ(constant pool)�� ����Ѵ�. �̹� ���Ǯ�� ���� ������ ���ڿ��� ���� ��� �� ���ڿ��� �ּҰ��� ��ȯ�Ѵ�.
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