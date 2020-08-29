package com.lec.java.forEach;

public class ForEachTest {

	public static void main(String[] args) {
		// 2���� �迭�� ���� for�� ���
		// ������ ����� ���ϱ�
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
			System.out.println("���� : " + total + "��");
			System.out.println("��� : " + avg + "��");
			System.out.println("===================");
		}
		
	} // main()
	
} // class