package com.lec.java.anonymous;

public class Road {
	
	public static void main(String[] args) {
		
		Starbucks gangnam = new Starbucks();
		gangnam.regist(new Cafe() {
			
			@Override
			public void sell(String choice) {
				String[] arMenu = getMenu();
				for (int i = 0; i < arMenu.length; i++) {
					if(arMenu[i].equals(choice)) {
						System.out.println(choice + "���� �Ϸ�");
					}
				}
				
			}
			
			@Override
			public String[] getMenu() {
				String[] arMenu = {"�Ƹ޸�ī��", "ī���", "�����ֽ�"};
				return arMenu;
			}
		});
		
	} // end main()

} // end class