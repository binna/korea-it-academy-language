package com.lec.java.ch8;

public class ExceptionEx9 {
	public static void main(String[] args) {
		try {
			Exception e = new Exception("���Ƿ� �߻�������.");
			throw e;		// ���� �߻���Ŵ
		} catch (Exception e) {
			System.out.println("�����޽��� : " + e.getMessage());
			e.printStackTrace();
		}

		System.out.println("---------------------------------------");
		try {
			throw new Exception("������ ���ٷ� �ٿ��� ���Ƿ� ���� �߻���Ŵ.");
		} catch (Exception e) {
			System.out.println("�����޽��� : " + e.getMessage());
			e.printStackTrace();
		}
	} // end main
} // end class