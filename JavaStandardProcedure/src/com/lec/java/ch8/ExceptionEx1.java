package com.lec.java.ch8;

public class ExceptionEx1 {
	
	public static void main(String[] args) {
		
		try {
			try {} catch (Exception e) {}
		} catch (Exception e) {
			//try {} catch (Exception e) {}	// ���� : Duplicate parameter e
		} // end try-catch()
		
		try {
			
		} catch (Exception e) {
			
		} // end try-catch()
		
		System.out.println("���α׷� ����");
	} // end main()

} // end class