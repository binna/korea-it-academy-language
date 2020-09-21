package com.lec.java.forEach;

public class ForEachTest {

	public static void main(String[] args) {
		// 2차원 배열을 빠른 for문 사용
		// 총점과 평균을 구하기
		int[][] arrScore = {
				{10, 20, 30},
				{11, 25, 39},
				{12, 26, 38},
				{13, 27, 37},
				{14, 28, 36}
		};
		
		double avg = 0.0;
		
		for(int[] arScore : arrScore) {
			int total = 0;
			for(int score : arScore) {
				total += score;
			}
			avg = (double)total / arScore.length;
			System.out.println("총점 : " + total + "점");
			System.out.println("평균 : " + avg + "점");
			System.out.println("===================");
		}
	} // end main()
	
} // end class