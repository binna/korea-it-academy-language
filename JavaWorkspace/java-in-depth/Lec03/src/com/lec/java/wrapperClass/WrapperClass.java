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
		
		// 위의 같은 방식은 너무 너무 너무 번거롭다
		// 번거로움을 극복하기 위해 JDK 5 버전 이후부터는 오토(auto)를 지원한다.
		int data_auto= 20;
		
		// auto boxing
		Integer data_auto_I = data_auto;
		System.out.println(data_auto_I);
		
		// auto unboxing
		data_auto = data_auto_I;
		System.out.println(data_auto);
	} // end main()
	
} // end class