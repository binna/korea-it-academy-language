package com.lec.java.obj;

import java.util.Random;

public class Obj_test {
	
	public static void main(String[] args) {
		// new�� ���� String�� �����ϸ� Heap ������ �����ϰ� �ǰ�
		String str1 = new String("ABC");
		String str2 = new String("ABC");
		// �ּҴ� �ٸ���
		System.out.println("str1 == str2 : " + (str1 == str2));
		// ������ ����
		System.out.println("str1.equals(str2) : " + str1.equals(str2));
		
		// Heap ������ ������ ���Ӱ� �����ȴ�.
		
		// ���ͷ��� �̿��� ��� constant pool�̶�� ������ �����ϰ� �ȴ�.
		String str3 = "ABC";
		String str4 = "ABC";
		// �ּҵ� ����
		System.out.println("str3 == str4 : " + (str3 == str4));
		// ���뵵 ����
		System.out.println("str3.equals(str4) : " + str3.equals(str4));
		
		// constant pool ������ ��ġ�ϴ� ���� �ִٸ� �� ���� �ּҵ��� �����Ѵ�.
		// (��, ���� ����� ���� �ƴ϶� ������� ������ �ּҸ� �����Ѵ�.)
		
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