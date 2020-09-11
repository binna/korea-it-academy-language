package com.lec.java.farm.teacher;

import java.util.Scanner;

public class Farm {
	
	public static void main(String[] args) {
		Flower flower = new Flower(2, "���޷�", 3000);
		Tomato tomato = new Tomato(0, "�丶��", 5000);
		Potato potato = new Potato(0, "����", 10000);
		Ginseng ginseng = new Ginseng(0, "�λ�", 100000);
		
		// up casting
		// �� ��ü�� ��Ģ���� �ο��ϱ� ����
		Plant[] plants = {flower, tomato, potato, ginseng};
		int[] costs = {2, 5, 20};
		int choice = 0;
		
		while(true) {
			System.out.println("1.���޷�\n2.�丶��\n3.����\n4.�λ�");
			choice = new Scanner(System.in).nextInt();
			// ���϶�
			if(choice == 1) {
				System.out.println("�����...");
				try {Thread.sleep(plants[choice-1].time);} catch (InterruptedException e) {;}
				// ��� ���� 1 ����
				plants[choice-1].grow();
				System.out.println(plants[choice-1].name + " �ϼ�! "
						+ "���� " + plants[choice-1].name + " ���� : " + plants[choice-1].cnt);
				continue;
			}
			// �� ���� �۹��϶�
			for (int i = 1; i < plants.length; i++) {
				// ����ڰ� ������ �Ĺ� �� �� ��
				if(choice - 1 == i) {
					// ����� �� �ʿ��� ����۹��� ���� üũ
					if(plants[i].check(plants[i-1])) {
						System.out.println("�����...");
						try {Thread.sleep(plants[i].time);} catch (InterruptedException e) {;}
						// ����ڰ� ������ �۹��� �ʿ��� ��� ����
						//System.out.println(plants[i-1].name);
						//System.out.println(costs[i-1]);
						plants[i-1].cnt -= costs[i-1];
						// ��� ���� 1 ����
						plants[i].grow();
						System.out.println(plants[i].name + " �ϼ�! "
								+ "���� " + plants[i].name + " ���� : " + plants[i].cnt);
					}else {
						System.out.println(plants[i-1].name + "(��)�� �����ؿ� �Ф�");
					}
				}
			}
		}
	} // end main()
	
} // end class