package com.lec.java.farm.teacher;

public class Farm {
	
	public static void main(String[] args) {
		Flower flower = new Flower(2, "���޷�", 3000);
		Tomato tomato = new Tomato(0, "�丶��", 5000);
		Potato potato = new Potato(0, "����", 10000);
		Ginseng ginseng = new Ginseng(0, "�λ�", 100000);
		
		Plant[] plants = {flower, tomato, potato, ginseng};
		int choice = 2;
		
		for (int i = 0; i < plants.length; i++) {
			//����ڰ� ������ �Ĺ� �� �� ��
			if(choice - 1 == i) {
				//����� �� �ʿ��� ����۹��� ���� üũ
				if(plants[i].check(plants[i-1])) {
					System.out.println("�����...");
					try {Thread.sleep(tomato.time);} catch (InterruptedException e) {;}
					//��� 2�� ����
					plants[i-1].cnt -= 2;
					//��� ���� 1 ����
					plants[i].grow();
					System.out.println(plants[i].name + " �ϼ�! "
							+ "���� "+plants[i].name+" ���� : " + tomato.cnt);
				}else {
					System.out.println(plants[i-1].name + "(��)�� �����ؿ� �Ф�");
				}
			}
		}
	} // end main()
	
} // end class