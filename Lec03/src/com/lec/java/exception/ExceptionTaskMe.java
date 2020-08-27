package com.lec.java.exception;

import java.util.Scanner;

public class ExceptionTaskMe {
	public static void main(String[] args) {
		// 5개의 정수만 입력 받기
		// 단 5개 이상의 정수도 입력은 가능하다
		Scanner sc = new Scanner(System.in);
		
		int index = 0;
		int[] arData = new int[5];
		
		while(true) {
			
			try {
				System.out.print("숫자를 입력해주세요(단, 0을 입력하면 프로그램이 종료됩니다.) : ");
				arData[index] = sc.nextInt();
				
				if(arData[index] == 0) {break;}
			} catch (Exception e) {
				System.out.println("5개를 초과할 수 없습니다.\n더 이상 입력할 수 없습니다.");
				break;
			}
			
			index++;
			
		} // end while()
		
		System.out.println("프로그램 종료");
		
	} // end main()
	
} // end class