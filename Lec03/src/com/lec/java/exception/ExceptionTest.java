package com.lec.java.exception;

public class ExceptionTest {

	public static void main(String[] args) {

		// try catch�� : try�� ���� ���� ��� + Alt + Shift + Z
		try {
			System.out.println(10/0);
		} catch (Exception e) {
			System.out.println("0���� ���� �� �����ϴ�.");
			
			// ��ü�� ����Ҷ� ������ toString()�� ������ ����
			System.out.println(e);
			System.out.println(e.toString());
		}
		
		System.out.println("�ݵ�� ��µǾ�� �ϴ� ����");
		
	} // end main()
	
} // end class