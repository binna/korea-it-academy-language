package com.lec.java.ch9;

public class FrequentlyMathMethodConstructor {
	
	public static void main(String[] args) {
		// static double abs(double a)
		// static float abs(float f)
		// static int abs(int f)
		// static long abs(long f)
		// : �־��� ���� ���밪�� ��ȯ�Ѵ�.
		int i1 = Math.abs(-10);
		double d1 = Math.abs(-10.0);
		System.out.println("i1 : " + i1 + ", d1 : " + d1);
		
		// static double ceil(double a) : �־��� ���� �ø��Ͽ� ��ȯ�Ѵ�.
		double d2_1 = Math.ceil(10.1);
		double d2_2 = Math.ceil(-10.1);
		double d2_3 = Math.ceil(10.000015);
		System.out.println("d2_1 : " + d2_1 + ", d2_2 : " + d2_2 + ", d2_3 : " + d2_3);
		
		// static double floor(double a) : �־��� ���� �����Ͽ� ��ȯ�Ѵ�.
		double d3_1 = Math.floor(10.8);
		double d3_2 = Math.floor(-10.8);
		System.out.println("d3_1 : " + d3_1 + ", d3_2 : "+ d3_2);
		
		// static double max(double a, double b)
		// static float max(float a, float b)
		// static int max(int a, int b)
		// static long max(long a, long b)
		// : �־��� �� ���� ���Ͽ� ū ���� ��ȯ�Ѵ�.
		double d4 = Math.max(9.5, 9.50001);
		int i4 = Math.max(0, -1);
		System.out.println("d4 : " + d4 + ", i4 : " + i4);
		
		// static double min(double a, double b)
		// static float min(float a, float b)
		// static int min(int a, int b)
		// static long min(long a, long b)
		// : �־��� �� ���� ���Ͽ� ���� ���� ��ȯ�Ѵ�.
		double d5 = Math.min(9.5, 9.50001);
		int i5 = Math.min(0, -1);
		System.out.println("d5 : " + d5 + ", i5 : " + i5);
		
		// static double random() : 0.0 ~ 1.0 ������ ������ double���� ��ȯ�Ѵ�.
		// 							(1.0�� ������ ���Ե��� �ʴ´�.)
		double d6 = Math.random();
		double i6 = (int)(Math.random() * 10) + 1;
		System.out.println("d6 : " + d6 + ", i6 : " + i6);
		
		// static double rint(double a) : �־��� double���� ���� ����� �������� double���� ��ȯ�Ѵ�.
		double d7_1 = Math.rint(5.5);
		double d7_2 = Math.rint(5.1);
		double d7_3 = Math.rint(-5.5);
		double d7_4 = Math.rint(-5.1);
		System.out.println("d7_1 : " + d7_1 + ", d7_2 : " + d7_2 
				+ ", d7_3 : " + d7_3 + ", d7_4 : " + d7_4);
		
		// static long round(double a)
		// static long round(float a)
		// : �Ҽ��� ù°�ڸ����� �ݿø��� ������(long)�� ��ȯ�Ѵ�.
		//   �Ű������� ���� ������ ���, round()�� rint()�� ����� �ٸ��ٴ� �ʹ� ��������!
		long l8_1 = Math.round(5.5);
		long l8_2 = Math.round(5.11);
		long l8_3 = Math.round(-5.5);
		long l8_4 = Math.round(-5.1);
		double d8_1 = 90.7552;
		double d8_2 = Math.round(d8_1*100)/100.0;
		System.out.println("l8_1 : " + l8_1 + ", l8_2 : " + l8_2 
				+ ", l8_3 : " + l8_3 + ", l8_4 : " + l8_4 + ", d8_2 : " + d8_2);
	} // end main()

} // end class