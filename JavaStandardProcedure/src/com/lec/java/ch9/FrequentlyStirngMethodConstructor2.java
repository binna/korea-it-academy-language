package com.lec.java.ch9;

public class FrequentlyStirngMethodConstructor2 {

	public static void main(String[] args) {
		// int lastIndexOf(int ch) : ������ ���� �Ǵ� �����ڵ带 ���ڿ��� ������ ������ ã�Ƽ� ��ġ(index)�� �˷��ش�.
		//							  �� ã���� -1�� ��ȯ�Ѵ�.
		String s1 = "java.lang.Object";
		int idx1_1 = s1.lastIndexOf('.');
		int idx1_2 = s1.indexOf('.');
		System.out.println("int idx1_1 = s1.lastIndexOf('.') : " + idx1_1);
		System.out.println("int idx1_2 = s1.indexOf('.') : " + idx1_2);
		
		System.out.println();
		// int lastIndexof(int String str) : ������ ���ڿ��� �ν��Ͻ��� ���ڿ� ���������� ã�Ƽ� ��ġ(index)�� �˷��ش�.
		//									  �� ã���� -1�� ��ȯ�Ѵ�.
		String s2 = "java.lang.java";
		int idx2_1 = s2.lastIndexOf("java");
		int idx2_2 = s2.indexOf("java");
		System.out.println("int idx2_1 = s2.lastIndexOf(\"java\") : " + idx2_1);
		System.out.println("int idx2_2 = s2.indexOf(\"java\") : " + idx2_2);
		
		System.out.println();
		// int length() : ���ڿ��� ���̸� �˷��ش�.
		String s3 = "Hello3";
		int length3 = s3.length();
		System.out.println("int length3 = s3.length() : " + length3);
		
		System.out.println();
		// String replace(char old, char nw) : ���ڿ� ���� ����(old)�� ���ο� ����(nw)�� �ٲ� ���ڿ��� ��ȯ�Ѵ�.
		String s4_old = "Hello4";
		String s4_nw = s4_old.replace('H', 'C');
		System.out.println("String s4_nw = s4_old.replace('H', 'C') : " + s4_nw);
		
		System.out.println();
		// String replace(CharSequence old, CharSequence nw) : ���ڿ� ���� ���ڿ�(old)�� ���ο� ���ڿ�(nw)�� ��� �ٲ� ���ڿ��� ��ȯ�Ѵ�.
		String s5_old = "Hellollo5";
		String s5_nw = s5_old.replace("ll", "LL");
		System.out.println("String s5_nw = s5_old.replace(\"ll\", \"LL\") : " + s5_nw);
		
		System.out.println();
		// String replaceAll(String regex, String replacement) : ���ڿ� �߿��� ������ ���ڿ�(regex)�� ��ġ�ϴ� ���� 
		//														  ���ο� ���ڿ�(replacement)�� ��� �����Ѵ�.
		String s_reg6 = "AABBAABB";
		String s_replacement6 = s_reg6.replaceAll("BB", "bb");
		System.out.println("String s_replacement6 = s_reg6.replaceAll(\"BB\", \"bb\") : " + s_replacement6);

		System.out.println();
		// String replaceFirst(String regex, String replacement) : ���ڿ��� ������ �и���(regex)�� ������ ���ڿ� �迭�� ��� ��ȯ�Ѵ�.
		String s_reg7 = "AABBAABB";
		String s_replacement7 = s_reg7.replaceFirst("BB", "bb");
		System.out.println("String s_replacement7 = s_reg7.replaceFirst(\"BB\", \"bb\") : " + s_replacement7);
		
		System.out.println();
		// String[] split(String regex) : ���ڿ��� ������ �и���(regex)�� ������ ���ڿ� �迭�� ��� ��ȯ�Ѵ�.
		String animals8 = "dog,cat,bear";
		String[] arr8 = animals8.split(",");
		System.out.println("String[] arr8 = animals8.split(\",\")");
		for(int i = 0; i < arr8.length; i++) {
			System.out.println("arr8[" + i + "] : " + arr8[i]);
		}
		
		System.out.println();
		// String[] split(String regex, int limit) : ���ڿ��� ������ �и���(regex)�� ������ ���ڿ��迭�� ��� ��ȯ�Ѵ�.
		//											  ��, ���ڿ� ��ü�� ������ ��(limit)�� �ڸ���.
		String animals9 = "dog,cat,bear";
		String[] arr9 = animals9.split(",", 2);
		System.out.println("String[] arr9 = animals9.split(animals9, 2)");
		for(int i = 0; i < arr9.length; i++) {
			System.out.println("arr9[" + i + "] : " + arr9[i]);
		}
		
		System.out.println();
		// boolean startWith(String prefix) : �־��� ���ڿ�(prefix)�� �����ϴ��� �˻��Ѵ�.
		String s10 = "java.lang,Object";
		boolean b10_1 = s10.startsWith("java");
		boolean b10_2 = s10.startsWith("lang");
		System.out.println("boolean b10_1 = s10.startsWith(\"java\") : " + b10_1);
		System.out.println("boolean b10_2 = s10.startsWith(\"lang\") : " + b10_2);
		
		System.out.println();
		// boolean substring(int begin)
		// boolean substring(int begin, int end)
		// : �־��� ������ġ(begin)���� �� ��ġ(end) ������ ���Ե� ���ڿ��� ��´�.
		//   �� ��, ������ġ�� ���ڴ� ������ ���Ե�����, �� ��ġ�� ���ڴ� ���Ե��� �ʴ´�.(begin <= x < end)
		String s11 = "java.lang.Object";
		String c11 = s11.substring(10);
		String p11 = s11.substring(5, 9);
		System.out.println("String c11 = s11.substring(10) : " + c11);
		System.out.println("String p11 = s11.substring(5, 9) : " + p11);
		
		System.out.println();
		// String toLowerCase() : String �ν��Ͻ��� ����Ǿ� �ִ� ��� ���ڿ��� �ҹ��ڷ� ��ȯ�Ͽ� ��ȯ�Ѵ�.
		String s12_1 = "HELLO12";
		String s12_2 = s12_1.toLowerCase();
		System.out.println("String s12_2 = s12_1.toLowerCase() : " + s12_2);
		
		System.out.println();
		// String toString() : String �ν��Ͻ��� ����Ǿ� �ִ� ���ڿ��� ��ȯ�Ѵ�.
		String s13_1 = "Hollo13";
		String s13_2 = s13_1.toString();
		System.out.println("String s13_2 = s13_1.toString() : " + s13_2);

		System.out.println();
		// String toUpperCase() : String �ν��Ͻ��� ����Ǿ� �ִ� ��� ���ڿ��� �빮�ڷ� ��ȯ�Ͽ� ��ȯ�Ѵ�.
		String s14_1 = "hello14";
		String s14_2 = s14_1.toUpperCase();
		System.out.println("String s14_2 = s14_1.toUpperCase() : " + s14_2);
		
		System.out.println();
		// String trim() : ���ڿ��� ���� ���� ������ ���� �ִ� ������ ���� ����� ��ȯ�Ѵ�.
		// 				      �� ��, ���ڿ� �߰��� �ִ� ������ ���ŵ��� �ʴ´�.
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
		// : ������ ���� ���ڿ��� ��ȯ�Ѵ�. ���������� ���, toString()�� ȣ���� ����� ��ȯ�Ѵ�.
		System.out.println("String.valueOf(true) : " + String.valueOf(true));
		System.out.println("String.valueOf('a') : " + String.valueOf('a'));
		System.out.println("String.valueOf(100) : " + String.valueOf(100));
		System.out.println("String.valueOf(100L) : " + String.valueOf(100L));
		System.out.println("String.valueOf(100f) : " + String.valueOf(100f));
		System.out.println("String.valueOf(100.0) : " + String.valueOf(100.0));
		System.out.println("String.valueOf(new java.util.Date()) : " + String.valueOf(new java.util.Date()));
		
	} // end main()
	
} // end class