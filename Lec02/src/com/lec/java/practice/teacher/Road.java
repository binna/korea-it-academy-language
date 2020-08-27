package com.lec.java.practice.teacher;

public class Road {
	
	public static void main(String[] args) {
		Nike gangnam = new Nike();
		Nike jamsil = new Nike();
		
		jamsil.regist(new MarketAdapter() {
			@Override
			public String[] getMenu() {
				String[] arMenu = {"운동화", "슬리퍼", "센들", "축구공"};
				
				return arMenu;
			}
		});
		
		gangnam.regist(new Market() {
			
			@Override
			public void sell(String choice) {
				String[] arMenu = getMenu();
				
				System.out.println("고객님이 구매한 상품----------------");
				for(int i = 0; i < arMenu.length; i++) {
					
					if(arMenu[i].equals(choice)) {
						System.out.println(choice + " 구매 완료");
					}
				}
			}
			
			@Override
			public String[] getMenu() {
				String[] arMenu = {"운동화", "슬리퍼", "센들", "축구공"};
				
				return arMenu;
			}
		});
		
	}
}