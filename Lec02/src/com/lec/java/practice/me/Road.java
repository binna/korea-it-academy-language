package com.lec.java.practice.me;

public class Road {
	
	public static void main(String[] args) {
		// 강남점 매장 등록
		Nike gangnam = new Nike(); 
		gangnam.regist(new MarketAdapter(){
			
			@Override
			public String[] getMenu() {
				String[] arMenu = {"운동화", "슬리퍼", "센들"};
				
				return arMenu;
			}
			
			@Override
			public void sell(String choice) {
				String[] arMenu = getMenu();
				
				System.out.println("고객님이 구매한 상품----------------");
				for(int i = 0; i < arMenu.length; i++) {
					
					if(arMenu[i].equals(choice)) {
						System.out.println(choice + "구매 완료");
					}
				}
				
			};
			
		});
		
		// 무료 나눔 행사중인 매장
		Nike freeSharing = new Nike(); 
		freeSharing.regist(new MarketAdapter(){
			
			@Override
			public String[] getMenu() {
				String[] arMenu = {"운동화", "슬리퍼", "센들", "하이힐"};
				
				return arMenu;
			}
			
		});
		
	} // end main()

} // end class