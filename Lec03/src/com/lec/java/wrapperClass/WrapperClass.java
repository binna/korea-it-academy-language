package com.lec.java.wrapperClass;

public class WrapperClass {

	public static void main(String[] args) {
		int data = 10;
		
		// boxing
		Integer data_I = new Integer(data);
		System.out.println(data_I);
		
		// unboxing
		data = data_I.intValue();
		System.out.println(data);
		
		// ���� ���� ����� �ʹ� �ʹ� �ʹ� ���ŷӴ�
		// ���ŷο��� �غ��ϱ� ���� JDK 5 ���� ���ĺ��ʹ� ����(auto)�� �����Ѵ�.
		int data_auto= 20;
		
		// auto boxing
		Integer data_auto_I = data_auto;
		System.out.println(data_auto_I);
		
		// auto unboxing
		data_auto = data_auto_I;
		System.out.println(data_auto);
		
	} // end main()
	
} // end class