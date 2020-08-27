package com.lec.java.exception;

import java.util.Scanner;

public class ExceptionTaskTeacher {
	
	public static void main(String[] args) {
		// 5���� ������ �Է¹ޱ�
		// ��, 5�� �̻��� ������ �Է��� �����ϴ�.
		int[] arData = new int[5];
		Scanner sc = new Scanner(System.in);
		String msg = "��° ���� �Է� : ";
		
		int idx = 0;
		String temp = null;
		
		System.out.println("������ : q");
		
		while(true) {
			System.out.print(++idx + msg);
			temp = sc.next();
			if(temp.equals("q")) {break;}
			
			try {
				arData[idx - 1] = Integer.parseInt(temp);
			} catch (NumberFormatException e) {
				System.out.println("������ �Է��ϼ���.");
				idx--;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("�� �̻� ������ �Է��� �� �����ϴ�.");
				break;
			}
		}
		
	}
	
}