package com.lec.java.exception;

import java.util.Scanner;

public class ExceptionTaskTeacher {
	
	public static void main(String[] args) {
		// 5개의 정수만 입력받기
		// 단, 5개 이상의 정수도 입력은 가능하다.
		int[] arData = new int[5];
		Scanner sc = new Scanner(System.in);
		String msg = "번째 정수 입력 : ";
		
		int idx = 0;
		String temp = null;
		
		System.out.println("나가기 : q");
		
		while(true) {
			System.out.print(++idx + msg);
			temp = sc.next();
			if(temp.equals("q")) {break;}
			
			try {
				arData[idx - 1] = Integer.parseInt(temp);
			} catch (NumberFormatException e) {
				System.out.println("정수만 입력하세요.");
				idx--;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("더 이상 정수를 입력할 수 없습니다.");
				break;
			}
		}
		
	}
	
}