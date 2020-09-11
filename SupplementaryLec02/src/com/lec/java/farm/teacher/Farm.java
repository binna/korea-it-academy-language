package com.lec.java.farm.teacher;

public class Farm {
	
	public static void main(String[] args) {
		Flower flower = new Flower(2, "진달래", 3000);
		Tomato tomato = new Tomato(0, "토마토", 5000);
		Potato potato = new Potato(0, "감자", 10000);
		Ginseng ginseng = new Ginseng(0, "인삼", 100000);
		
		Plant[] plants = {flower, tomato, potato, ginseng};
		int choice = 2;
		
		for (int i = 0; i < plants.length; i++) {
			//사용자가 선택한 식물 일 때 참
			if(choice - 1 == i) {
				//재배할 때 필요한 재료작물의 개수 체크
				if(plants[i].check(plants[i-1])) {
					System.out.println("재배중...");
					try {Thread.sleep(tomato.time);} catch (InterruptedException e) {;}
					//재료 2개 감소
					plants[i-1].cnt -= 2;
					//재배 개수 1 증가
					plants[i].grow();
					System.out.println(plants[i].name + " 완성! "
							+ "현재 "+plants[i].name+" 개수 : " + tomato.cnt);
				}else {
					System.out.println(plants[i-1].name + "(이)가 부족해요 ㅠㅠ");
				}
			}
		}
	} // end main()
	
} // end class