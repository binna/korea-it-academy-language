package com.lec.java.exception;

import java.util.Scanner;

public class ExceptionTaskMe {
	public static void main(String[] args) {
		// 5���� ������ �Է� �ޱ�
		// �� 5�� �̻��� ������ �Է��� �����ϴ�
		Scanner sc = new Scanner(System.in);
		
		int index = 0;
		int[] arData = new int[5];
		
		while(true) {
			
			try {
				System.out.print("���ڸ� �Է����ּ���(��, 0�� �Է��ϸ� ���α׷��� ����˴ϴ�.) : ");
				arData[index] = sc.nextInt();
				
				if(arData[index] == 0) {break;}
			} catch (Exception e) {
				System.out.println("5���� �ʰ��� �� �����ϴ�.\n�� �̻� �Է��� �� �����ϴ�.");
				break;
			}
			
			index++;
			
		} // end while()
		
		System.out.println("���α׷� ����");
		
	} // end main()
	
} // end class